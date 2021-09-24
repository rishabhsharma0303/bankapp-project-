<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="depositMoney" method="post" modelAttribute="transactionObject">
		<table>
			<tr>
				<td>Enter customer accountNumber</td>
				<td>
					<form:input path="toAccountNumber" />
				 	<form:errors path="toAccountNumber" class="error" />
				</td>
			</tr>
			<tr>
				<td>Enter deposit amount</td>
				<td>
					<form:input path="amount" />
				 	<form:errors path="amount" class="error" />
				</td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form:form>		
</body>
</html>