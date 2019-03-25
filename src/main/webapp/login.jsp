<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/12
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${ctx}/people/login" method="post">
    name:<input type="text" name="name">
    password:<input type="password" name="password">
    <input type="submit" name="submit">
</form>

</body>
</html>
