<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <form action="">
            <span>新闻标题</span><input type="text" style="font-size: 24px" name="text"><input type="submit" name="查询">
        </form>
    </div>
    <div>
        <table>
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
</body>
</html>
