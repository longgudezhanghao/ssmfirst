<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${ctx}/static/plugins/JQuery/jquery-3.3.1.js"></script>
</head>
<body>

    <button id="x">user</button>
    <button id="y">map</button>
    <button id="z">group</button>
    <button id="more">more</button>


    <div>

    </div>

    <script>
        $(function () {

            // 使按钮可见，不添加会使得在添加jquery后按钮不显示
            $('.selector').css({ "display": "inline" });

            // 禁用按钮
            // $("#x").attr("disabled","true");
            // $("#x").attr("disabled",true);
            // $("#x").attr("disabled","disabled");

            $('#x').click(function () {
                $.ajax({
                    url:'${ctx}/json/m1',
                    type:'post',
                    success:function (data) {
                        alert(data.name+" "+data.age);
                    }
                })
            })

            $('#y').click(function () {
                $.ajax({
                    url:'${ctx}/json/m2',
                    type:'post',
                    success:function (data) {
                        alert(data.name+" "+data.born);
                    }
                })
            })

            $('#z').click(function () {
                $.ajax({
                    url:'${ctx}/json/m3',
                    type:'post',
                    success:function (data) {
                        for(var i = 0;i < data.length;i++){
                            alert(data[i].name+" "+data[i].age)
                        }
                    }
                })
            })

            $('#more').click(function () {
                $.ajax({
                    url:'${ctx}/json/m4',
                    type:'post',
                    success:function (data) {
                        for(var i = 0;i < data.length;i++){
                            alert(data[i].first.name+" "+data[i].first.age)
                        }
                    }
                })
            })
        })
    </script>
</body>
</html>
