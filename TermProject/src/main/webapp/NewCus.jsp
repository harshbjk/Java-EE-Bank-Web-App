<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<title>W3.CSS Template</title>
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
        <a href="EmployeHomePage.jsp" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Home</a>
    </div>
</div>
<!-- First Grid -->
<div class="w3-row-padding w3-padding-64 w3-container">
    <div class="w3-content">
        <div class="w3-twothird">
            <h1>Home</h1>
            <p>Username: ${username}</p>
            <form action="EmpHome" method="post">
      		<input type="hidden" name="FORM_SUBMITTEDcreate" value="create_FORM">
	        <h3>Edit Personal Information</h3>
	        
	        <label for="username">UserName</label>
			<input type="text" placeholder="username" id="username" name="username" ><br><br>
			
			 <label for="password">UserName</label>
			<input type="text" placeholder="password" id="password" name="password" ><br><br>

	        <label for="fname">First Name</label>
	        <input type="text" placeholder="fname" id="fname" name="fname" ><br><br>
	
			<label for="lname">Last Name</label>
	        <input type="text" placeholder="lname" id="lname" name="lname" ><br><br>
	
			<label for="phone_no">Phone Number</label>
			<input type="text" placeholder="phone_no" id="phone_no" name="phone_no" ><br><br>
			
			<label for="email">Email</label>
			<input type="text" placeholder="email" id="email" name="email" ><br><br>
			
			<label for="dob">Date of Birth</label>
			<input type="text" placeholder="dob" id="dob" name="dob" ><br><br>
			
			<label for="sin_no">SIN Number</label>
			<input type="text" placeholder="sin_no" id="sin_no" name="sin_no" ><br><br>
			
			<label for="address">Address</label>
			<input type="text" placeholder="address" id="address" name="address" ><br><br>
			
			<label for="savings">Savings Account</label>
			<input type="text" placeholder="savings" id="savings" name="savings" ><br><br>
			
			<label for="checking">Savings Account</label>
			<input type="text" placeholder="savings" id="checking" name="checking" ><br><br>
		        

        <button>Submit</button>
        
    </form>
            
        </div>
    </div>
</div>

</body>
</html>