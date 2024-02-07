<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 周舟
  Date: 2/7/2024
  Time: 10:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index2</title>
</head>
<body>
<h2>Index2 WebSite</h2>
<%--  要在JSP中写JAVA需要使用-%  --%>
<%
    String name = (String) request.getAttribute("name");
    System.out.println(name);
    Integer age = (Integer) request.getAttribute("age");
    System.out.println(age+"");
    List<String> list = (List<String>) request.getAttribute("list");
    System.out.println(list.get(0));

%>
</body>
</html>
