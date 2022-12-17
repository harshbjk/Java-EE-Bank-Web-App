<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<title>Edit Personal Information</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif}
        .w3-bar,h1,button {font-family: "Montserrat", sans-serif}
        .fa-anchor,.fa-coffee {font-size:200px}
    </style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="w3-top">
    <div class="w3-bar w3-red w3-card w3-left-align w3-large">
        <a href="CusHome.jsp" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Account Summary</a>
        <a href="Transfer.jsp" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Transfers</a>
        <a href="#" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Bill Payment</a>
    </div>
</div>
<!-- First Grid -->
<div class="w3-row-padding w3-padding-64 w3-container">
    <div class="w3-content">
        <div class="w3-twothird">
      	<form action="CusEdit" method="post">
      		<input type="hidden" name="FORM_SUBMITTED" value="REGISTER_FORM">
	        <h3>Edit Personal Information</h3>
	        
	        <label for="username">UserName</label>
			<input type="text" placeholder="username" id="username" name="username" value="${username}"><br><br>

	        <label for="fname">First Name</label>
	        <input type="text" placeholder="fname" id="fname" name="fname" value="${fname}"><br><br>
	
			<label for="lname">Last Name</label>
	        <input type="text" placeholder="lname" id="lname" name="lname" value="${lname}"><br><br>
	
			<label for="phone_no">Phone Number</label>
			<input type="text" placeholder="phone_no" id="phone_no" name="phone_no" value="${phone_no}"><br><br>
			
			<label for="email">Email</label>
			<input type="text" placeholder="email" id="email" name="email" value="${email}"><br><br>
			
			<label for="dob">Date of Birth</label>
			<input type="text" placeholder="dob" id="dob" name="dob" value="${dob}"><br><br>
			
			<label for="address">Address</label>
			<input type="text" placeholder="address" id="address" name="address" value="${address}"><br><br>
		        
		     <h5><a href="ChangeCusPass.jsp">Change Password</a></h5>
        <button>Submit</button>
        
    </form>
        </div>
    </div>
</div>
<footer class="w3-container w3-padding-64 w3-center w3-opacity">
    <div class="w3-xlarge w3-padding-32">
        <i class="fa fa-facebook-official w3-hover-opacity"></i>
        <i class="fa fa-instagram w3-hover-opacity"></i>
        <i class="fa fa-snapchat w3-hover-opacity"></i>
        <i class="fa fa-pinterest-p w3-hover-opacity"></i>
        <i class="fa fa-twitter w3-hover-opacity"></i>
        <i class="fa fa-linkedin w3-hover-opacity"></i>
    </div>
    <p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank">w3.css</a></p>
</footer>
</body>
</html>