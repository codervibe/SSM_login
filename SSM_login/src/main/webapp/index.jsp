<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%--
  Created by Administrator on 2020/7/18  0018by IntelliJ IDEA.
  User: Administrator Date: 2020/7/18  0018 Time: 20:51
  DateTime:2020/07/18 20:51
  Description:
  Others:
  To change this template use File | Settings | File Templates.
--%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
</head>
<body>

<div class="zhuti">Customer Management Solution</div>
<div class="zhuti2">用户管理系统</div>
<div class="outline">
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        <div class="username_text">用户名:<input type="text" name="username"></div>
        <div class="password_text">密  码:<input type="password" class="password" name="password"></div>

        <input class="button" type="submit" value="登录">

    </form>
</div>
<a href="${pageContext.request.contextPath}/user/show">测试</a>
</body>
</html>