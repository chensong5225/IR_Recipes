<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2016/2/24
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<head>
  <title>index</title>
  <style type="text/css">
    .carousel-inner > .item > img,
    .carousel-inner > .item > a > img {
      height: 450px;
      width: 800px;
      margin: auto;
    }
    body,h1{
      font-family: "Verdana",sans-serif

    }

    body{
      text-align: center;
      background-image: url(http://megaluxphotobooth.com/files/2016/10/minimal4.jpg);
    }
  </style>
</head>
<body>

<div class="container">
  <h1 data-th-inline="text" style = "color: #cd4d78">Welcome to the Cooking World. </h1>
  <b>Use the Search Box to Get Your Meal!<br/>
</div>
<div class="w3-row w3-padding-12">

  <li>Put in your ingredients or cooking method in the search box.</li>
  <li>If you want to search more than one term, welcome to use blank to split them.</li>
  <li>Be sure to enter something in the search box.</li>
  <li>Submit!</li>
  <li>And enjoy our healthy food recommendations!!!</li>
</div>
<div class="container">
  <br />
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
    <li data-target="#myCarousel" data-slide-to="4"></li>
    <li data-target="#myCarousel" data-slide-to="5"></li>
  </ol>
<div class="carousel-inner" role="listbox">
  <div class="item active">
    <img src="image4.jpg" alt="bin" width="900" height="300" />
  </div>

  <div class="item">
    <img src="https://www.gordonramsayrestaurants.com/assets/Carousels/_resampled/CroppedFocusedImage121578650-50-Tablet-0017-rgr-homepage-carousel-4.jpg" alt="Cocktail" width="800" height="300" />
  </div>

  <div class="item">
    <img src="image3.jpg" alt="Pastry" width="800" height="300" />
  </div>

  <div class="item">
    <img src="image2.jpg" alt="juice" width="800" height="300" />
  </div>

  <div class="item">
    <img src="main1.jpg" alt="sandwich" width="800" height="300" />
  </div>

  <div class="item">
    <img src="image1.jpg" alt="Healthy" width="800" height="300" />
  </div>
  <p></p>
  <footer id="myFooter">
    <div class="w3-container w3-theme-l1">
      <p><strong>INFSCI 2140 2017 Fall</strong></p>
    </div>
  </footer>
</div>

    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
</div>

</body>
</html>