<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Create Product</h1>
	<div class="jumbotron">
	
	<form:form  method="POST" action="/product" modelAttribute="product">
	  <div class="form-row">
	  <div class="form-group col-md-6">
	      <form:label path="productName" for="inputEmail4">Name</form:label>
	      <form:input  path="productName" class="form-control" id="inputEmail4"/>
	    </div>
	    <div class="form-group col-md-6">
	       <form:label path="quantity" for="inputEmail4">Quantity</form:label>
	      <form:input  path="quantity" class="form-control" id="inputEmail4"/>
	    </div>
	  </div>
	</div>
	  <button type="submit" class="btn btn-primary">Submit</button>
	  
	</form:form>  
</div>	  
	
</body>
</html>