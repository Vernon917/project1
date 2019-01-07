<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/2
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<!--登陆界面-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>log in</h1>
<form action="/login" method="post">
    username:<input name="name">
    password:<input name="pwd" type="password">
    <input type="submit" value="submit">
</form>
</body>
</html>
