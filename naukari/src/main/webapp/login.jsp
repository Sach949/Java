<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>naukari-login</title>
</head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" 
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
<body>

<nav class="navbar navbar-light " style = "background-color: #4169E1;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://tse2.mm.bing.net/th?id=OIP.uKOncZrs0IdRK5edzyewSQHaD4&pid=Api" alt="" width="30" height="24" class="d-inline-block align-text-top">
      Naukari
    </a>
  </div>
</nav>


<div align="center">
<form action="login" method="post">
  <div class="mb-3" style="width:300px">
    <label class="form-label">Username: </label>
    <input type="email" name="user" class="form-control" aria-describedby="emailHelp">
  </div>
  <br>
  <div class="mb-3" style="width:300px">
    <label class="form-label">Password:</label>
    <input type="password" name="pass" class="form-control">
  </div>
   <br>
  <a type="submit" class="btn btn-primary" href="loginSuccess.jsp">Login</a>
  <a type="button" class="btn btn-danger"  href="index.jsp ">Cancel</a>
  
</form>
</div>

<div align = "center">
<h5>Copyright@2025</h5>
Created By Sachin
</div>

</body>
</html>