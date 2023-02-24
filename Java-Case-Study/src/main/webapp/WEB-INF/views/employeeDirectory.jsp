<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<title>Directory</title>

<style>
html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif;}
.w3-sidebar {
  z-index: 3;
  width: 250px;
  top: 43px;
  bottom: 0;
  height: inherit;
}

article {
  float: left;
  padding: 20px;
  width: 100%;
  background-color: #f1f1f1;
  height: auto;
  text-align: center;
  border-width: 2px;
  border-style: solid;
  border-color: #777;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
}


footer{
  background-color: #777;
  padding: 10px;
  text-align: center;
  color: white;
}

</style>

</head>
<body>

<div class="w3-top">
	  <div class="w3-bar w3-theme w3-top w3-left-align w3-large">
	    <div class="w3-bar-item w3-theme-l1">HR System</div>
	    <a class="w3-bar-item w3-button w3-right w3-hide-large w3-hover-white w3-large w3-theme-l1" href="javascript:void(0)" onclick="w3_open()"><i class="fa fa-bars"></i></a>
	    <a href="http://localhost:8080/Java-Case-Study/" class="w3-bar-item w3-button w3-theme-l1">Home</a>
		
		
	
	  </div>
</div>

<!-- Navbar -->
<div class="w3-top">
  <div class="w3-bar w3-theme w3-top w3-left-align w3-large">
    <button id="openNav" class="w3-button w3-black w3-xlarge w3-bar-item" onclick="w3_open()">&#9776;</button>
  	<img src="images/logo.png" class="w3-top" style="width:60px;height:auto;">
    <a class="w3-bar-item w3-button w3-left w3-hide-large w3-hover-white w3-large w3-theme-l1" href="javascript:void(0)" onclick="w3_open()"><i class="fa fa-bars"></i></a>
    <a href="http://localhost:8080/Java-Case-Study/" class="w3-bar-item w3-button w3-theme-l1">Home</a>
	
  </div>
</div>

<!-- Sidebar -->
<div class="w3-sidebar w3-bar-block w3-card w3-animate-left" style="display:none" id="mySidebar">
  <button class="w3-bar-item w3-button w3-large"
  onclick="w3_close()">Close &times;</button>
  
  <h4 class="w3-bar-item"><b>Menu</b></h4>
  <a href="register" class="w3-bar-item w3-button w3-hover-black">Register Employee</a>
  <a href="viewEmployees" class="w3-bar-item w3-button w3-hover-black">Employee Directory</a>
  <a href="#" class="w3-bar-item w3-button w3-hover-black">Compensation</a>
  
</div>

<!-- Main content -->
<div class="w3-container">
	<h1 class="w3-text-blue w3-padding-64">Employee Directory</h1>
	  
	<form class="example" action="example.jsp">
  			<input type="text" placeholder="Search Employee Directory" name="search">
  			<button type="submit"><i class="fa fa-search"></i></button>
	</form>
	
	
    
</div>

<script>
function myFunction() {
	alert("text here");
}

var mySidebar = document.getElementById("mySidebar");


// Toggle between showing and hiding the sidebar
function w3_open() {
  document.getElementById("mySidebar").style.display = "block";
}

// Close the sidebar with the close button
function w3_close() {
  document.getElementById("mySidebar").style.display = "none";
}
</script>     

</body>
</html>