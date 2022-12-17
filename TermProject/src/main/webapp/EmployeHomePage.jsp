<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<title>Home</title>
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
            
            <form action="EmpHome" method="post">
	      		<input type="hidden" name="FORM_SUBMITTEDSearch" value="Search_FORM">
		        <h3>Edit Personal Information</h3>
		        
		        <label for="username">Enter Username of the Customer to be searched </label>
				<input type="text" placeholder="username" id="username" name="username" value="${username}"><br><br>
	        	<button>Submit</button>
	        </form>
	        <br><br>
	        <form action="EmpHome" method="post">
	      		<input type="hidden" name="FORM_SUBMITTEDAdd" value="Add_FORM">
	        	<button>Add New Customers</button>
	        </form>
	        
            <br><br>
        </div>
    </div>
</div>

</body>
</html>