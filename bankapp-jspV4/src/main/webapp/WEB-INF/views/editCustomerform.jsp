<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
      <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="addCustomer" modelAttribute="customer">
	<form:hidden path="id"/><br/>
	Enter Customer Name: <form:input path="name"/><br/>
	Enter Address: <form:input path="address"/><br/>
		Enter Phone: <form:input path="phone"/><br/>
			Enter email: <form:input path="email"/><br/>
			
	<input type="submit">
</form:form>
</body>
</html>