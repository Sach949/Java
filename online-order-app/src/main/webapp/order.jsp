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
<form action = "order" method = "post" >
  <div class="mb-3" style="width:300px">
    <label class="form-label">Order ID</label>
    <input type="text" name ="id" class="form-control" aria-describedby="name">
  </div>
  <div class="mb-3" style="width:300px">
    <label class="form-label">Customer Name</label>
    <input type="text" class="form-control" name="name">
  </div>
  <div class="mb-3" style="width:300px">
    <label class="form-label">Email</label>
    <input type="email" class="form-control" name="email">
  </div>
  <div class="mb-3" style="width:300px">   
    <label class="form-label">Contact</label>
    <input type="tel" class="form-control" name="mob">
  </div>
  <div class="mb-3" style="width:300px">   
    <label class="form-label">Product Name</label>
    <input type="text" class="form-control" name="prod">
  </div>
  <div class="mb-3" style="width:300px">   
    <label class="form-label">Quantity</label>
    <input type="number" class="form-control" name="qty">
  </div>
  <div class="mb-3" style="width:300px">   
    <label class="form-label">Price</label>
    <input type="number" class="form-control" name="price">
  </div>
  <div class="mb-3" style="width:300px">   
    <label class="form-label">Delivery Address</label>
    <input type="text" class="form-control" name="del">
  </div>
  
  <input type="submit" class="btn btn-primary" value="Order">
  <a type="button" class="btn btn-danger"  href="index.jsp ">Cancel</a>
</form>
</div>
<br>
<div align = "center">
<h5>Copyright@2025</h5>
Created By Sachin
</div>

</body>
</html>