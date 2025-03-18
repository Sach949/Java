<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hospital</title>
</head>


<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" 
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
<body>

<nav class="navbar navbar-light " style = "background-color: #dc3545;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Medical_Symbol.svg/1024px-Medical_Symbol.svg.png" alt="" width="30" height="24" class="d-inline-block align-text-top">
      Hospital
    </a>
  </div>
</nav>
<div align = "center">
<h3>Welcome to Hospital</h3>
</div>

<div align="center">
<form action="test" method="post">
 <div class="mb-3" style="width:300px">
    <label class="form-label">Username</label>
    <input type="text" name ="user" class="form-control" aria-describedby="name">
  </div>
  <div class="mb-3" style="width:300px">
    <label class="form-label">Password</label>
    <input type="password" class="form-control" name="pass">
  </div>
   <input type="submit" value ="Click"  class="btn btn-primary"></input>

</form>

</div>


<div align = "center">
<h5>Copyright@2025</h5>
Created By Sachin
</div>
</body>
</html>