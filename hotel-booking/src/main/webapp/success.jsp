<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hotel-success</title>
</head>


<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" 
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
<body>

<nav class="navbar navbar-light " style = "background-color: #3CB371;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="hotel-sign-logo.png" alt="" width="30" height="24" class="d-inline-block align-text-top">
      Hotel Booking
    </a>
  </div>
</nav>


<div align="center">
<p>Booking has been success</p>
<p>${dto.name}</p>
<p>${dto.email}</p>
<p>${dto.mobile}</p>
<p>${dto.idCard}</p>
</div>




<div align = "center">
<h5>Copyright@2025</h5>
Created By Sachin
</div>
</body>
</html>