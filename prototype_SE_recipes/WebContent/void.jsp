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

                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </nav>

</div>

<form method="POST" action="Servlet" target="title-list" onsubmit="return checkForm(this)">
    <div class="search">
        <input type="search" name="query" style="width:500px;"  placeholder="enter ingredients here" />
        <input class="w3-btn w3-hover-red w3-round-large" type="submit" value="search" id = "findID">
    </div>
</form>
<br>
<div class="container">
    <h2 data-th-inline="text" style = "color: #9187cd">Oops! </h2>
    <br>

    <b>We didn't find the search term that you were looking for.  <br/>
        <b>Please enter valid ingredients or cooking methods.  <br/>
            <b>You can enter:  <br/>

<div class="container">
    <br />
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <p></p>
        <p></p>
        <div class="carousel-inner" role="listbox">
            <p></p>
            <p></p>
            <div class="item active">
                <h3>Ingredients:</h3>
                <br>
                <h5> <b>Vegetables:</b> potato, nappa, parsley</h5>
                <h5> <b>Mushrooms:</b> shiitake, agaric</h5>
                <h5> <b>Flavour:</b> blackpepper, rosemary, BBQ sause </h5>
                <h5> <b>Meat:</b> beef, chicken, fish, pork</h5>
                <h5> <b>Fruits:</b> strawberry, banana, watermelon</h5>
            </div>

            <div class="item">
                <h3>Cooking Methods:</h3>
                <br>
                <h5> Toast</h5>
                <h5> Fry</h5>
                <h5> Steam</h5>
                <h5> Boil</h5>
                <h5> Bake</h5>
            </div>

            <div class="item">
                <h3>Tools:</h3>
                <br>
                <h5> Microwave Oven</h5>
                <h5> Pressure Cooker</h5>
                <h5> Oven</h5>
                <h5> Frier</h5>
                <h5> Peeler</h5>
            </div>

            <br>
            <br>
            <footer id="myFooter">
                <p>Instructions</p>
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