<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<title>Account Summarye</title>
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
        <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-red" href="javascript:void(0);" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
        <a href="CusHome.jsp" class="w3-bar-item w3-button w3-padding-large w3-white">Account Summary</a>
        <a href="Transfer.jsp" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Transfers</a>
        <a href="#" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Bill Payment</a>
    </div>
</div>
<!-- First Grid -->
<div class="w3-row-padding w3-padding-64 w3-container">
    <div class="w3-content">
        <div class="w3-twothird">
            <h1>Account Summary</h1>
            <h5 class="w3-padding-32">Hello ${name}</h5>
            <p class="w3-text-grey">Username:${username}</p>
            <p class="w3-text-grey">Mobile.No:${phone_no}</p>
            <p class="w3-text-grey">Email:${email}</p>
            <p class="w3-text-grey">Date Of Birth:${dob}</p>
            <p class="w3-text-grey">Savings account balance:${savings}</p>
            <p class="w3-text-grey">Checking account balance:${checking}</p>
            <h5><a href="CusEdit">Edit</a></h5>
            <h5 ><a href="CustomerLogin.html">Sign Out</a></h5>
        </div>
    </div>
</div>

</body>
</html>