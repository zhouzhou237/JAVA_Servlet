package org.example.request1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/s05")
public class Servlet05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("S05 in");

        req.setAttribute("name","zz");
        req.setAttribute("age",18);
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        req.setAttribute("list",list);

//        req.getRequestDispatcher("s06").forward(req,resp);
        req.getRequestDispatcher("index2.jsp").forward(req,resp);
    }
}
