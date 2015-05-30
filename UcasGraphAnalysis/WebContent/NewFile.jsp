<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
    <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
    function getData(){
      //  $("#list").html("");//清空列表中的数据
        //发送ajax请求
        $.getJSON(
            "./ServletJson",//产生JSON数据的服务端页面
           // {name:"胡阳",age:23},//向服务器发出的查询字符串（此参数可选）
             //对返回的JSON数据进行处理，本例以列表的形式呈现
            function(json){
                //循环取json中的数据,并呈现在列表中
                $.each(json,function(i){
                    $("#list").append("<li>name:"+json[i].name+"&nbsp; Age:"+json[i].age+"</li>")
                })
            }
        )
        }
    //getData();
    </script>
</head>
<body>
    <input id="Button1" type="button" value="获取数据" onclick="getData()" />
        <ul id="list"></ul>
    </body>
</html>