<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/4
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--<script src="${ctx}/static/plugins/JQuery/jquery-3.3.1.js"></script>--%>
    <link rel="stylesheet" href="${ctx}/static/plugins/layui/css/layui.css">

    <style>
        form>div{
            width:300px;
            margin:auto;
        }
    </style>
</head>
<body>
<%--前端页面--%>
<form action="${ctx}/user/register" mehtod="post" class="layui-form">

    <div class="layui-form-item" id="x">
        <label class="layui-form-label">输入框</label>
        <div class="layui-input-block">
            <input type="text" name="name" required  lay-verify="required" placeholder="请输入name" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">输入框</label>
        <div class="layui-input-block">
            <input type="text" name="age" required  lay-verify="required" placeholder="请输入age" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>

</form>

<script src="${ctx}/static/plugins/layui/layui.js"></script>

<%--接受前端数据，实时传输给后端--%>
<script>

    layui.use(['element', 'jquery', 'layer'], function () {
        var element = layui.element;
        // 引进jquery的一种方法在layui框架力
        var jquery,$= layui.jquery;
        var layer = layui.layer;

        $(function () {
            $('input[name=name]').blur(function () {
                // get name
                var name = $('input[name=name]').val();
                var obj = {
                    name: name
                }
                $.ajax({
                    url: '${ctx}/user/checkname',
                    type: 'post',
                    contentType: 'application/json',
                    data: JSON.stringify(obj),
                    success: function (data) {
                        if (data.code == 400) {
                            // $('#msg').html('no problem');
                            // layer.msg('no problem');
                            layer.tips('no problem','#x');
                        } else {
                            // $('#msg').html('have exist');
                            // layer.msg('have exist', {icon: 6});
                            layer.tips('have exist','#x');
                        }
                    }
                })
            })
        })
    });


</script>
</body>
</html>
