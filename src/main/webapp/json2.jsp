<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/4
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${ctx}/static/plugins/JQuery/jquery-3.3.1.js"></script>
</head>
<body>

<button id="fuck">发送一个user对象到后台，并且是以ajax形式发送</button>
<button id="shit">发送一组user对象到后台，并且是以ajax形式发送</button>

<script>

    $(function () {
        $('#fuck').click(function () {

            var obj = {
                'name': 'fuck',
                'age': '18',
            };
// ajax：无刷新技术
            $.ajax({
                url: '${ctx}/json2/add',
                type: 'post',
                // 不能是中文，前后端数据中文解析有问题
                contentType: 'application/json',
                data: JSON.stringify(obj),
                success: function (data) {

                }
            })
        })

        $('#shit').click(function () {

            var obj = {
                'name': 'fuck',
                'age': '18',
            };

            var obj2 = {
                'name': 'shit',
                'age': '20',
            };

            var arry = new Array();
            arry.push(obj);
            arry.push(obj2);

// ajax：无刷新技术
            $.ajax({
                url: '${ctx}/json2/addList',
                type: 'post',
                // 不能是中文，前后端数据中文解析有问题
                contentType: 'application/json',
                data: JSON.stringify(arry),
                success: function (data) {
                    if (data.code == 123456)
                        alert("get")
                }
            })
        })
    })
</script>
</body>
</html>
