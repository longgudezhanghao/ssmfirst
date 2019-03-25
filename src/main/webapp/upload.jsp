<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/5
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--添加一个enctype="multipart/form-data--%>

<form action="${ctx}/file/upload" method="post" enctype="multipart/form-data">

    file:<input type="file" name="file"><br>
    file2:<input type="file" name="file"><br>
    file3:<input type="file" name="file"><br>
    file4:<input type="file" name="file"><br>
    <input type="submit" value="submit">

</form>

</body>
</html>
