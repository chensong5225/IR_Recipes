<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2016/2/24
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/w3.css">
<link rel="stylesheet" href="css/w3-theme-black.css">
<link rel="stylesheet" href="css/Roboto.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<head>
    <title>side</title>
</head>
<style>
    html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif}
    .w3-sidenav a,.w3-sidenav h4 {padding: 15px;}
    body{
        text-align: center;
    }
</style>

<body>
<div class="w3-theme-l5 w3-container" style="z-index:3;">
    <hr></hr>
    <h4 data-th-inline="text" style = "color: #E67E22"> <b> Find a Recipe. </b></h4>
    <p></p>
    <!--
    <form name="searchBox"  action="Servlet"  target="main" method="POST">
        <div class="Servlet">
            <input type="Servlet" name="keywords" placeholder="Search whatever you want to know about" />
        <input class="w3-btn w3-hover-red w3-round-large" type="submit" value="search">
        <input type="hidden" name="newTitle" value="newTitle">
        </div>
         -->
    </form>
    <form method="POST" action="Servlet" target="title-list">
        <div class="search">
            <input type="search" name="query" style="width:200px;" placeholder="enter query here" />
            <input class="w3-btn w3-hover-red w3-round-large" type="submit" value="search">

        </div>
    </form>


    <!--<a href="adSearch.php" class="w3-small" target="main">Advanced Search</a>-->
    <p></p>
</div>

<!-- Sidenav -->
<nav class="w3-sidenav w3-theme-l5 w3-animate-left" style="z-index:3;width:250px;" id="side">
    <p></p>
    <p></p>
    <h4><b>Remarkable Articles</b></h4>
    <a href=" http://www.fitvivo.com/22-healthy-dinners-under-500-calories/" style = "color: #34495E" target="_blank">Healthy Dinner Recipes : 22 Meal Recipes Under 500 Calories</a >
    <a href=" https://www.foxandbriar.com/31-healthy-dinner-recipes-take-30-minutes-less/" style = "color: #34495E" target="_blank">31 Healthy Dinner Recipes That Take 30 Minutes or Less</a >
    <a href=" https://celebratingsweets.com/healthy-lunch-ideas-for-adults-and-kids/" style = "color: #34495E" target="_blank">Healthy Lunch Ideas For Adults And Kids</a >
    <a href=" http://popculture.com/healthy-living/2016/09/19/want-to-lose-weight-this-month-make-these-30-recipes/" style = "color: #34495E" target="_blank">Want To Lose Weight This Month? Make These 30 Recipes</a >
    <a href=" http://smilesandwich.com/2017/04/05/chicken-meal-prep-bowls-5-ways/" style = "color: #34495E" target="_blank">Easy Chicken Meal Prep Bowls: 5 Ways</a >
    <a href=" https://damndelicious.net/2016/08/24/weekly-meal-prep/" style = "color: #34495E" target="_blank">Weekly Meal Prep</a >

    <hr />

</nav>


</body>
</html>

