package org.example.request1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//可以让请求从服务端跳转到客户端,服务端行为

@WebServlet("/s03")
public class Servlet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        System.out.println("S03_uname: " + uname);

//        请求转发到Servlet04
        req.getRequestDispatcher("s04").forward(req,resp);

    }
}
