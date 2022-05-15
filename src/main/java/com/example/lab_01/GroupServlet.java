package com.example.lab_01;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GroupServlet", value = "/GroupServlet")
public class GroupServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        try(PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h1><a href=\"title.html\" class=\"btn\">На головну</a></h1>");
            out.println("<h1>Захар Захарчук, Вадим Заславський, Катерина Падусенко</h1>");
            out.println("</body></html>");
        }
    }
}
