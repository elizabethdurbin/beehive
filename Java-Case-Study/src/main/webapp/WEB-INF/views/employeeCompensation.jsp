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

	<div class="w3-top">
	  <div class="w3-bar w3-theme w3-top w3-left-align w3-large">
	    <div class="w3-bar-item w3-theme-l1">HR System</div>
	    <a class="w3-bar-item w3-button w3-right w3-hide-large w3-hover-white w3-large w3-theme-l1" href="javascript:void(0)" onclick="w3_open()"><i class="fa fa-bars"></i></a>
	    <a href="#" class="w3-bar-item w3-button w3-theme-l1">Home</a>
		
		<form class="example" action="example.jsp">
  			<input type="text" placeholder="Search.." name="search">
  			<button type="submit"><i class="fa fa-search"></i></button>
		</form>
	
	  </div>
	</div>

	<div class="w3-main">
		<div class="w3-twothird w3-container">
			<h1>Add Compensation</h1>
			<form action="<%= request.getContextPath() %>/compensation" method="post">
		      <p><input class="w3-input w3-padding-16" type="text" placeholder="text" required name="type"></p>
		      <p><input class="w3-input w3-padding-16" type="text" placeholder="text" required name="amount"></p>
		      <p><input class="w3-input w3-padding-16" type="text" placeholder="text" required name="description"></p>
		      <p><input class="w3-input w3-padding-16" type="text" placeholder="text" required name="date"></p>
		    
		      <p><button class="w3-button w3-light-grey w3-section" type="submit">Submit</button></p>
		    </form>
	    </div>
    </div>
</body>
</html>