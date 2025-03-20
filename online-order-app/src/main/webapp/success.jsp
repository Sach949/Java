<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" 
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
<body>

<nav class="navbar navbar-light " style = "background-color: #FFD700;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://tse2.mm.bing.net/th?id=OIP.uKOncZrs0IdRK5edzyewSQHaD4&pid=Api" alt="" width="30" height="24" class="d-inline-block align-text-top">
      Online Order App
    </a>
  </div>
</nav>
<br>


<div align="center">
<p>Order has been placed successfully</p>
<p>${dto.id}</p>
<p>${dto.name}</p>
<p>${dto.email}</p>
<p>${dto.mobile}</p>
<p>${dto.prodName}</p>
<p>${dto.qty}</p>
<p>${dto.price}</p>
<p>${dto.addr}</p>
</div>

<br>
<div align = "center">
<h5>Copyright@2025</h5>
Created By Sachin
</div>
</body>
</html>