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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">

<!-- Add Google Icons -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

<!-- Add Font Awesome -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">

<!-- Add Google Icons -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

<!-- Add Font Awesome -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">

<!-- Add Google Icons -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<frame src="test.jsp" name="side" framborder="0"/>
</head>

<style>
    html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif}
    .w3-sidenav a,.w3-sidenav h4 {padding: 12px;}
    .w3-navbar li a {
        padding-top: 12px;
        padding-bottom: 12px;
    }
    body{
        text-align: center;
        background-size:100% 100%;
        background-image: url(http://file06.16sucai.com/2016/0813/2caa72ba8bb7c0cba84a13bb52289252.jpg);

    }
</style>

<head>
    <script type="text/javascript">
        function checkForm(form) {
            for (var i = 0; i < form.elements.length; i++) {
                if (form.elements[i].type == "text" && form.elements[i].value == "") {
                    document.write("Fill out ALL fields.");

                    return false;
                }
            }
            return true;
        }
    </script>
</head>
<body>
<div>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Search the Best Recipe</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="./xx.html">Home</a></li>
                <li class="active"><a href="./Search.html">Search</a></li>
                <form method="POST" action="Servlet" target="title-list" onsubmit="return checkForm(this)">
                    <div class="search">
                        <input type="search" name="query" style="width:500px;"  placeholder="enter ingredients here" />
                        <input class="w3-btn w3-hover-red w3-round-large" type="submit" value="search" id = "findID">
                    </div>
                </form>

            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

</div>

<form method="POST" action="Servlet" target="title-list">
    <div class="search">
        <input type="search" name="query" style="width:1000px;"  placeholder="enter ingredients here" />
        <input class="w3-btn w3-hover-red w3-round-large" type="submit" value="search" id = "findID">
    </div>
</form>
<form method="POST" action="Servlet" target="title-list">
    <div class="search">
        <input type="search" name="query" style="width:500px;"  placeholder="enter ingredients here" />
        <input class="w3-btn w3-hover-red w3-round-large" type="submit" value="search" id = "findID">
    </div>
</form>

<div class="w3-main">
    <div class="w3-row w3-padding-12">
        <div class="w3-twothird w3-container">
            <!--<div class="w3-main w3-padding-64 w3-container">-->
            <p> </p>
            <p> </p>
            <h1  align="center" style = "color:#616163;">Search Results</h1>
            <table class="w3-table-all"  text-align = center; style="width:1000px;">
                <tr class="w3-table-all tr">
                    <th style="width:200px;vertical-align:center;color:#666666;">Title of the Dish</th>
                    <th style="width:100px;vertical-align:center;color:#666666;">Cooking Directions</th>

                </tr>





<!-- 显示区 -->
                    <%
    ArrayList<Recipe> results = new ArrayList<>();
    if (request.getAttribute("titles")!=null){
       results = (ArrayList<Recipe>) request.getAttribute("titles");

    //    for (Recipe title : results) {


             ArrayList<String> titles = new ArrayList<>();


        if (request.getAttribute("title")!=null){
            //    for (Recipe title : results) {
            ArrayList<String> result =(ArrayList<String>) request.getAttribute("title");
            int i = 0;
            for (String s : result) {

              Recipe r2 =  results.get(i);
              i++;
                // titles.add(r.getTitle());



    %>
                <table align=”center“ class="w3-table-all" style="width:1000px;">
                    <tr class="w3-table-all tr">
                        <th style="width:200px;  vertical-align:middle;color:#666666;"><%= s%></th>
                            <th style="width:200px;vertical-align:middle;color:#666666;"><%= r2%></th>
                                <%}%>




                    <%}}%>



<p> </p>


</table>

</body>
</html>