<%@ page import="java.util.ArrayList" %>
<%@ page import="Classes.Recipe" %><%--
  Created by IntelliJ IDEA.
  User: Joel
  Date: 12/9/17
  Time: 5:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/w3.css">
<link rel="stylesheet" href="css/w3-theme-black.css">
<link rel="stylesheet" href="css/Roboto.css">
<link rel="stylesheet" href="css/font-awesome.min.css">

<style>
    html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif}
    .w3-sidenav a,.w3-sidenav h4 {padding: 12px;}
    .w3-navbar li a {
        padding-top: 12px;
        padding-bottom: 12px;
    }
    body{
        text-align: center;
    }
</style>


<body>
<form method="POST" action="Servlet" target="title-list">
    <div class="search">
        <input type="search" name="query" style="width:500px;" placeholder="enter query here" />
        <input class="w3-btn w3-hover-red w3-round-large" type="submit" value="search" id = "findID">
    </div>
</form>
<script type="text/javascript" src="js/common/jquery-1.5.1.min.js"></script>
<script type="text/javascript">
    function check(){
        var query=$("#findID").val();
        alert(query);
        if(query==""){
            $("#findID").html("<font color='red'>搜索不能为空！</font>");
            return false;
        }
        return true;
    }
</script>

<!--引入js文件 jquery-->

<div class="w3-main">
    <div class="w3-row w3-padding-12">
        <div class="w3-twothird w3-container">
            <!--<div class="w3-main w3-padding-64 w3-container">-->
            <h1 class="w3-text-teal">Search Result</h1>
            <table class="w3-table-all" style="width:800px;">
                <tr class="w3-table-all tr">
                    <th style="width:20px;vertical-align:middle;color:#666666;">#</th>
                    <th style="width:200px;vertical-align:middle;color:#666666;">title</th>
                    <th style="width:100px;vertical-align:middle;color:#666666;">ingrediants</th>

                </tr>





                <!-- 显示区 -->
                    <%
    if (request.getAttribute("titles")!=null){
        ArrayList<Recipe> results = (ArrayList<Recipe>) request.getAttribute("titles");
    //    for (Recipe title : results) {
             ArrayList<String> titles = new ArrayList<>();
                for (Recipe r : results) {

         // titles.add(r.getTitle());



%>

                <table class="w3-table-all" style="width:800px;">
                    <tr class="w3-table-all tr">
                       <th style="width:200px;vertical-align:middle;color:#666666;"><%= r%></th>/a>

                </table>

                    <%}}%>



                <div class="w3-main">
                    <div class="w3-row w3-padding-12">
                        <div class="w3-twothird w3-container">
                            <!--<div class="w3-main w3-padding-64 w3-container">-->
                            <table class="w3-table-all" style="width:800px;">
                                <tr class="w3-table-all tr">
                                    <th style="width:20px;vertical-align:middle;color:#666666;">#</th>
                                    <th style="width:200px;vertical-align:middle;color:#666666;">title</th>
                                    <th style="width:100px;vertical-align:middle;color:#666666;">ingrediants</th>
                                    <p><%%></p>


                                </tr>
                        </div>
                    </div>
                </div>

                <p> </p>


                    <%%>

                <table id="dg"></table>
                <script type="text/javascript">
                    $("#dg").datagrid({
                        url : "${pageContext.request.contextPath}/Servlet/Servlet? time="+new Date().getTime(),
                        columns :  [[
                            {field:'id',title:'编号',width:100},
                            {field:'title',title:'标题',width:100},
                            {field:'content',title:'内容',width:100}
                        ]],
                        fitColumns : true,
                        singleSelect : true,
                        pagination : true,
                        pageSize : 2,
                        pageList : [2]
                    });
                </script>


</body>
</html>