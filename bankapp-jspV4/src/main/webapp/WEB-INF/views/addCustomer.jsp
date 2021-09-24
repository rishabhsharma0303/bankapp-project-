<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
<style >
.error{
color: red;}
</style>

</head>
<body>
<form:form action="addCustomer" modelAttribute="customer" >
	<form:hidden path="id" value="0"/><br/>
	Enter Name: <form:input path="name"/>
	<form:errors path="name" class="error" /><br/>
	Enter Balance: <form:input  path="initialBalance" />
	<form:errors path="initialBalance" class="error" /><br/>
	Enter Phone: <form:input path="phone"/>
	<form:errors path="phone" class="error" /><br/>
	Enter Address: <form:input path="address"/>
	<form:errors path="address" class="error" /><br/>
		Enter email: <form:input path="email"/>
		<form:errors path="email" class="error" /><br/>
			Enter Aadhar: <form:input path="aadhar"/>
			<form:errors path="aadhar" class="error" /><br/>
	<input type="submit">
</form:form>
</body>
</html>