<!DOCTYPE html>
<html lang="en">
<head>
<title>HR System</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>

html,body,h1,h2,h3,h4,h5,h6 {
font-family: "Roboto", sans-serif;
}
.w3-sidebar {
  z-index: 3;
  width:200px;
  top: 43px;
  bottom: 0;
  height: inherit;
}

.banner {
  opacity: 1;
  transition: opacity 200ms ease-in-out 0s;
  background-position: 50% center;
  background-size: cover;
}

article {
  float: left;
  padding: 20px;
  width: 33%;
  background-color: #f1f1f1;
  height: auto;
  text-align: center;
  border-width: 2px;
  border-style: solid;
  border-color: #777;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
}

article:hover {
  box-shadow: 0 0 2px 1px rgba(0, 140, 186, 0.5);
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

<!-- Banner -->
<div class="banner">
	<img src="images/hr.png" class="banner" style="width:100%;height:auto;">
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
	  <h1 class="w3-text-blue">Welcome to the HR System</h1>
	  
	<article> 
	  <h3 class="w3-text-blue">Shortcuts</h3>
	  <a href="http://localhost:8080/Java-Case-Study/register">
	  	<img src="images/form.png" alt="form" style="max-width:20%;height:auto;">
	  </a>
	  <a href="#">
	  	<img src="images/profile.png" alt="profile" style="max-width:25%;height:auto;">
	  </a>
      <a href="#">
	  	<img src="images/compensation.png" alt="compensation" style="max-width:20%;height:auto;">
	  </a>
    </article>  
    
    <article>
    	<h3 class="w3-text-blue">Inbox</h3>
    	<p>You're all caught up on your inbox items.</p>
    </article> 
    
    <article>
    	<h3 class="w3-text-blue">Previously viewed</h3>
    	  <p>No recent views</p>
    </article>
     
    <footer id="myFooter">
   		<div class="w3-container w3-theme-l2">
      		<h3>Contact Us</h3> 
      		<h4>Phone: 888-456-HELP</h4>
      		<h4>Email: support@hrsystem.com</h4>
    	</div>
    </footer>
</div>

      
  

<!-- END MAIN -->

<script>
// Get the Sidebar
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
