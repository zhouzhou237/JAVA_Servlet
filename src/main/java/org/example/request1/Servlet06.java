package org.example.request1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/s06")
public class Servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("S06 in");

        String name = (String) req.getAttribute("name");
        System.out.println(name);
        Integer age = (Integer) req.getAttribute("age");
        System.out.println(age+"");
        List<String> list = (List<String>) req.getAttribute("list");
        System.out.println(list.get(0));




    }
}
