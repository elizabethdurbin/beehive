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
  width: 250px;
  top: 43px;
  bottom: 0;
  height: inherit;
}

.banner {
  opacity: 1;
  transition: opacity 200ms ease-in-out 0s;
  height: 125px;
  width: 100%;
  background-position: 50% center;
  background-size: cover;
  padding: 20px;
}

.form{
    width: 100px;
    height: auto;
    background-position: 25%;
}

.profile{
	width: 200px;
    height: auto;
    background-position: 35%;
}

.compensation{
    width: 100px;
    height: auto;
    background-position: 45%;
}



</style>

</head>
<body>

<!-- Banner -->
<div class="banner">
		<img src="images/hr.jpg" class="banner">
	
</div>

<!-- Navbar -->
<div class="w3-top">
  <div class="w3-bar w3-theme w3-top w3-left-align w3-large">
  	<img src="images/logo.png" class="w3-top" style="width:60px;height:auto;">
    <div class="w3-bar-item w3-theme-l1">HR System</div>
    <a class="w3-bar-item w3-button w3-left w3-hide-large w3-hover-white w3-large w3-theme-l1" href="javascript:void(0)" onclick="w3_open()"><i class="fa fa-bars"></i></a>
    <a href="#" class="w3-bar-item w3-button w3-theme-l1">Home</a>
	
  </div>
</div>

<!-- Sidebar -->
<nav class="w3-sidebar w3-bar-block w3-collapse w3-large w3-theme-l5 w3-animate-left" id="mySidebar">
  <a href="javascript:void(0)" onclick="w3_close()" class="w3-left w3-xlarge w3-padding-large w3-hover-black w3-hide-large" title="Close Menu">
    <i class="fa fa-remove"></i>
  </a>
  
 
  
  <h4 class="w3-bar-item"><b>Menu</b></h4>
  <a href="register" class="w3-bar-item w3-button w3-hide-small w3-hover-black">Add Employee</a>
  <a class="w3-bar-item w3-button w3-hover-black" href="#">Employee Profile</a>
  <a href="#" class="w3-bar-item w3-button w3-hide-small w3-hover-black">Compensation</a>
  
 
</nav>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->
<div class="w3-main" style="margin-left:250px">
  <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-blue">Welcome</h1>
      <img src="images/form.png" class="form" alt="Forms">
      <img src="images/profile.png" class="profile" alt="Profiles">
      <img src="images/compensation.png" class="compensation" alt="Compensation">
    </div>
    <div class="w3-third w3-container">
    </div>
  </div>

  <footer id="myFooter">
    <div class="w3-container w3-theme-l2 w3-padding-30">
      <h3>Contact Us</h3> 
      <h4>Phone: 888-456-HELP</h4>
      <h4>Email: support@hrsystem.com</h4>
    </div>
  </footer>

<!-- END MAIN -->
</div>

<script>
// Get the Sidebar
var mySidebar = document.getElementById("mySidebar");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidebar, and add overlay effect
function w3_open() {
  if (mySidebar.style.display === 'block') {
    mySidebar.style.display = 'none';
    overlayBg.style.display = "none";
  } else {
    mySidebar.style.display = 'block';
    overlayBg.style.display = "block";
  }
}

// Close the sidebar with the close button
function w3_close() {
  mySidebar.style.display = "none";
  overlayBg.style.display = "none";
}
</script>

</body>
</html>
