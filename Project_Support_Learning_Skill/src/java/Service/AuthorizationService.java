/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DAL.AuthorizeDAO;
import DAL.ReportDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.HashMap;
import model.User;

/**
 *
 * @author admin
 */
public class AuthorizationService {
static AuthorizationService instance;
    
    HashMap<String, String> AuthorizeMap = new HashMap();
    
    public AuthorizationService() {
    }
    
    public static AuthorizationService gI() {
        if(instance == null) {
            instance = new AuthorizationService();
            try {
                AuthorizeDAO.loadAuthorizeMap();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        return instance;
    }
    
    public HashMap<String, String> getMap() {
        return AuthorizeMap;
    }
    public String sendReport(int uid, String content) throws Exception {
        if (content.replaceAll(" ", "").isEmpty()) {
            return "Bạn cần nhập vào một chuỗi ký tự!";
        } else {
            ReportDAO.sendReport(uid, content);
            return "Send Report Successfully!";
        }
    }

    public boolean Authorization(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String path = request.getServletPath();
        if (AuthorizeMap.containsKey(path)) {
            if (AuthorizeMap.get(path.toLowerCase()).equalsIgnoreCase("guest")) {
                if (request.getMethod().equalsIgnoreCase("POST") && request.getParameter("type") != null && request.getParameter("type").equalsIgnoreCase("report")) {
                    try {
                        String sid = request.getParameter("id");
                        int id = Integer.parseInt(sid);
                        String content = request.getParameter("reason");
                        request.setAttribute("alert", sendReport(id, content));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return true;
            }
            User u = (User) request.getSession().getAttribute("User");
            if (u == null) {
                request.getRequestDispatcher("/404.jsp").forward(request, response);
                return false;
            } else if (!AuthorizeMap.get(path.toLowerCase()).contains(u.getRole().toLowerCase()) && !AuthorizeMap.get(path.toLowerCase()).contains("all user")) {
                request.getRequestDispatcher("/404.jsp").forward(request, response);
                return false;
            }
        }
        if (request.getMethod().equalsIgnoreCase("POST") && request.getParameter("type") != null && request.getParameter("type").equalsIgnoreCase("report")) {
            try {
                String sid = request.getParameter("id");
                int id = Integer.parseInt(sid);
                String content = request.getParameter("reason");
                request.setAttribute("alert", sendReport(id, content));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
