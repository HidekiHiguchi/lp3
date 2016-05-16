<!DOCTYPE HTML>
<html>
<head>
<title>%TITLE%</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="key word" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(
hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link rel="shortcut icon" href="images/bitcoin.svg">
<link href='https://fonts.googleapis.com/css?family=Open+Sans:300' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
<link href="style/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="style/style2.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/JavaScript" src="scripts/sha512.js"></script>
<!-- start plugins -->
<script type="text/javascript" src="scripts/jquery.min.js"></script>
<script src="scripts/footer-reveal.js"></script>
<script src="scripts/footer-reveal.min.js"></script>
<link rel="stylesheet" href="css/normalize.css">
<link rel="stylesheet" href="css/main.css">
	<script>
		$(function() {
			var pull 		= $('#pull');
				menu 		= $('nav ul');
				menuHeight	= menu.height();
			$(pull).on('click', function(e) {
				e.preventDefault();
				menu.slideToggle();
			});
			$(window).resize(function(){
        		var w = $(window).width();
        		if(w > 320 && menu.is(':hidden')) {
        			menu.removeAttr('style');
        		}
    		});
		});
	</script>

</head>
<body>

<div class="header_bg" id="home"><!-- start header -->
<div class="container">
	<div class="row header text-center specials">

		<nav class="top-nav">
			<ul class="top-nav nav_list">
                             <%@ include file="mainMenu.jsp" %> 
			</ul>


			<a href="#" id="pull"	style="-moz-user-select: none; -webkit-user-select: none; -ms-user-select:none; user-select:none;-o-user-select:none;"
 unselectable="on"
 onselectstart="return false;"
 onmousedown="return false;"></a>
		</nav>
		<div class="clear"></div>
	</div>
</div>
</div>

<div class="page">
