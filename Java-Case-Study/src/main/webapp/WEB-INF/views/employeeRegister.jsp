<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>HR System</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif;}

.w3-sidebar {
  z-index: 3;
  width: 250px;
  top: 43px;
  bottom: 0;
  height: inherit;
}

</style>
</head>


<body>

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

<!-- Form -->
<div class="w3-main">
	<div class="w3-row w3-padding-64">
	<div class="w3-twothird w3-container">
		<h1 class="w3-text-blue">Add New Employee</h1>
		<form action="<%= request.getContextPath() %>/register" method="post">
		      <p><input class="w3-input w3-padding-16" type="text" placeholder="First Name" required name="firstName"></p>
		      <p><input class="w3-input w3-padding-16" type="text" placeholder="Middle Name" required name="middleName"></p>
		      <p><input class="w3-input w3-padding-16" type="text" placeholder="Last Name" required name="lastName"></p>
		      <p><input class="w3-input w3-padding-16" type="text" placeholder="Birthday" required name="birthday"></p>
		      <p><input class="w3-input w3-padding-16" type="text" placeholder="Position" required name="position"></p>
		    
		      <p><button onclick="myFunction()" class="w3-button w3-light-grey w3-section" type="submit">Submit</button></p>
		      		
		 </form>
	 </div>
	 </div>
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