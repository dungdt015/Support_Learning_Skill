/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAL.UserDAO;
import Service.AuthorizationService;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author admin
 */
@WebServlet(name = "Login", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            if (!AuthorizationService.gI().Authorization(request, response)) {
                return;
            }
        } catch (Exception e) {
        }
        Cookie[] cs = request.getCookies();
        for (int i = 0; i < cs.length; i++) {
            if (cs[i].getName().equals("user")) {
                String[] atr = cs[i].getValue().split("_");
                request.setAttribute("username", atr[0].replace("User|", ""));
                request.setAttribute("password", atr[0].replace("Pass|", ""));
                break;
            }
        }

        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            if (!AuthorizationService.gI().Authorization(request, response)) {
                return;
            }

        } catch (Exception e) {
        }
        Cookie[] cs = request.getCookies();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        try {
            User u = UserDAO.getUser(username, password);
            if (u != null) {
                if (!u.isIsActive()) {
                    throw new Exception("Tài khoản của bạn đã bị khóa bởi admin!");
                }
                request.getSession().setAttribute("User", u);
                if (remember != null) {
                    Cookie c = new Cookie("user", "User|" + username + "_Pass|" + password);
                    c.setMaxAge(60 * 24 * 7);
                    response.addCookie(c);

                } else {
                    for (int i = 0; i < cs.length; i++) {
                        cs[i].setMaxAge(0);
                        response.addCookie(cs[i]);
                        break;
                    }
                }

                if (u.getRole().equalsIgnoreCase("admin") || u.getRole().equalsIgnoreCase("manager")) {
                    response.sendRedirect("admin/manager");
                } else {
                    response.sendRedirect("index");
                }
                return;
            } else {
                request.getSession().setAttribute("error", "Don't have account");
            }

        } catch (Exception ex) {
            request.getSession().setAttribute("error", ex.getMessage());
        }
        for (int i = 0; i < cs.length; i++) {
            if (cs[i].getName().equals("user")) {
                String[] atr = cs[i].getValue().split("_");
                request.setAttribute("username", atr[0].replace("User|", ""));
                request.setAttribute("password", atr[0].replace("Pass|", ""));
                break;
            }

        }
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
