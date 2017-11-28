<!DOCTYPE html>
<?php
session_start();
//current URL of the Page. cart_update.php redirects back to this URL
//$current_url = urlencode($url="http://".$_SERVER['HTTP_HOST'].$_SERVER['REQUEST_URI']);
?>
<html>
<meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>



<style type="text/css">
		.carousel-inner > .item > img,
		.carousel-inner > .item > a > img {
				height: 450px;
				width: 800px;
				margin: auto;
		}
		body,h1{
				font-family: "Verdana",sans-serif
				color："red"
		}

		body{
				text-align: center;
				background-image: url(http://megaluxphotobooth.com/files/2016/10/minimal4.jpg);
		}
</style>
</head>

<body>

<div class="container">
		<h1 data-th-inline="text" style = "color: #CD5C5C">Welcome to the Cooking World. </h1>
		<b><u>Use the Search Box to Get Your Meal!</b></u><br/>
</div>
<div class="w3-row w3-padding-12">

				<li>Put in your ingredients or cooking method in the search box and submit.</li>
					<li>Use the filters on the left side to narrow down your search result.</li>
					<li>Use the topic recommendation to refine your result</li>
					<li>Choose your final result.</li>
					<li>Enjoy our healthy food recommendations!!!</li>


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

		<!-- Wrapper for slides -->
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

		<!-- Left and right controls -->
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



<!--
<img src="http://mexcalcuisine.com/wp-content/uploads/2014/05/gourmet-tacos-mexcal.jpg" style="width:400px;height:240px;"/>
<img src="http://www.thechameleonbham.co.uk/website/wp-content/uploads/2016/07/cocktail.jpg" style="width:400px;height:240px;"/>
<img src="http://www.30poundsofapples.com/wp-content/uploads/2012/07/Pretty-dessert.jpg" style="width:400px;height:240px;"/>
<img src="http://inout-home.hu/wp-content/uploads/2016/11/steak.jpg" style="width:400px;height:240px;"/>
<img src="https://www.gordonramsayrestaurants.com/assets/Carousels/_resampled/CroppedFocusedImage121578650-50-Tablet-0017-rgr-homepage-carousel-4.jpg" style="width:400px;height:240px;"/>
<img src="http://manhattanpizzaplacehga.com/wp-content/uploads/2016/03/wafswectpmbr0zmug9ly.jpg" style="width:400px;height:240px;"/>

<hr />
<div class="container">
		Find more wonderful recipes <a data-th-href="@{/recipe}">here</a> !

		<!-- Trigger the modal with a button

-->
</body>
</html>
