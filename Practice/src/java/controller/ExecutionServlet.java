package controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExecutionServlet extends HttpServlet {

    private final List<String[]> executions = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String str = request.getParameter("string");
        String nStr = request.getParameter("number");

        // Kiểm tra nếu đầu vào không hợp lệ
        if (str == null || nStr == null || str.isEmpty() || nStr.isEmpty()) {
            request.setAttribute("error", "Invalid input!");
            request.getRequestDispatcher("MyExecution.jsp").forward(request, response);
            return;
        }

        int n;
        try {
            n = Integer.parseInt(nStr);
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Index n must be a number!");
            request.getRequestDispatcher("MyExecution.jsp").forward(request, response);
            return;
        }

        if (n <= 0 || n > str.length()) {
            request.setAttribute("error", "Index n must be between 1 and the length of the string!");
            request.getRequestDispatcher("MyExecution.jsp").forward(request, response);
            return;
        }

        // Kiểm tra nếu str và n đã tồn tại
        for (String[] exec : executions) {
            if (exec[0].equals(str) && exec[1].equals(String.valueOf(n))) {
                request.setAttribute("error", "Execution existed!");
                request.setAttribute("executions", executions);
                request.getRequestDispatcher("MyExecution.jsp").forward(request, response);
                return;
            }
        }

        // Cắt chuỗi
        String result = str.substring(0, n);

        // Thêm vào danh sách thực thi
        executions.add(new String[]{str, String.valueOf(n), result});

        // Gửi dữ liệu về JSP
        request.setAttribute("result", result);
        request.setAttribute("executions", executions);
        request.getRequestDispatcher("MyExecution.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("MyExecution.jsp").forward(request, response);
    }
}
