<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>Add New Employee</h1>
		<form action="<%= request.getContextPath() %>/register" method="post">
	      <p><input class="w3-input w3-padding-16" type="text" placeholder="First Name" required name="firstName"></p>
	      <p><input class="w3-input w3-padding-16" type="text" placeholder="Middle Name" required name="middleName"></p>
	      <p><input class="w3-input w3-padding-16" type="text" placeholder="Last Name" required name="lastName"></p>
	      <p><input class="w3-input w3-padding-16" type="text" placeholder="Birthday" required name="birthday"></p>
	      <p><input class="w3-input w3-padding-16" type="text" placeholder="Position" required name="position"></p>
	    
	      <p><button class="w3-button w3-light-grey w3-section" type="submit">Submit</button></p>
	    </form>
    </div>
</body>
</html>