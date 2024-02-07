package org.example.request1;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/req01")
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求时的完整路径
        String url = req.getRequestURL() + "";
        System.out.println(url);

        //获取请求时的部分路径
        String uri = req.getRequestURI();
        System.out.println(uri);

        //获取请求时的参数字符串
        String queryString = req.getQueryString();
        System.out.println(queryString);

        //获取请求方式(GET AND POST)
        String method = req.getMethod();
        System.out.println(method);

        //获取当前协议版本
        String protocol = req.getProtocol();
        System.out.println(protocol);

        //获取项目站点名
        String webapp = req.getContextPath();
        System.out.println(webapp);

        /* 获取请求的参数 永久返回字符串*/
        String uname = req.getParameter("uname");
        String upd = req.getParameter("upd");
        System.out.println("uname: " + uname + "upd: " + upd);

        /* 获取请求的参数 永久返回字符串数组*/
        String[] hobbys = req.getParameterValues("hobby");
        if(hobbys != null && hobbys.length > 0) {
            for(String hobby : hobbys) {
                System.out.println("hobby: " + hobby);
            }

        }
    }

}
