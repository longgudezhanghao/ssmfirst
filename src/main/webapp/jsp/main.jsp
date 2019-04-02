<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table tbody tr:nth-of-type(n+1){
            background-color: #00F7DE;
        }

        #main{
            margin: auto;
            width: 1190px;
        }
        table{
            width: 1190px;
        }
    </style>
</head>
<body>
<div id="main">
    <div>
        <form action="${ctx}/news/query/title">
            <%--这里的这个name是有传递参数的作用的--%>
            <%--与/query/title中title有关--%>
             <%--这里的value与输入框的记忆提示有关--%>
            <span>新闻标题</span><input type="text" value="${title}" name="title"><input type="submit" name="查询">
        </form>
    </div>
    <div>
        <table border="1">
            <thead>
            <tr>
                <th colspan="6">
                    <h1>新闻标题</h1>
                </th>
            <tr>
                <th>新闻编号</th>
                <th>新闻标题</th>
                <th>新闻摘要</th>
                <th>作者</th>
                <th>创建时间</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${newsDetailList}" var="obj">
                <tr>
                    <th>${obj.id}</th>
                    <th>${obj.title}</th>
                    <th>${obj.summary}</th>
                    <th>${obj.author}</th>
                    <th>${obj.createdate}</th>
                    <th>
                        <a href="">查看评论</a>
                        <a href="">评论</a>
                        <a href="">删除</a>
                    </th>
                </tr>
            </c:forEach>
            </tbody>
            <tfoot>

            </tfoot>
        </table>
    </div>
</div>
</body>
</html>
