<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 5px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>transactionId</th>
				<th>fromAccountNumber</th>
				<th>toAccountNumber</th>
				<th>amount</th>
				<th>transactionType</th>
				<th>status</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${transactions}" var="transaction">
				<tr>
					<td>${transaction.transactionId}</td>
					<td>
						<c:if test="${transaction.fromAccNo==null}" >
							self
						</c:if>
						<c:if test="${transaction.fromAccNo!=null}" >
							${transaction.fromAccNo}
						</c:if>
					</td>
					<td>
						<c:if test="${transaction.toAccNo==null}" >
							self
						</c:if>
						<c:if test="${transaction.toAccNo!=null}" >
							${transaction.toAccNo}
						</c:if>
					</td>
					<td>${transaction.amount}</td>
					<td>${transaction.transactionType}</td>
					<td>${transaction.status}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<ul>
	
<li>
			<a href="/bankapp/home">Home Page</a>
		</li>

	</ul>
	<!-- <ul>
		<li>
			<a href="allCustomers">Show all Customer</a>
		</li>
		<li>
			<a href="addCustomer">Add new Customer</a>
		</li>
		<li>
			<a href="withdrawMoney">Withdraw Money</a>	
		</li>
		<li>
			<a href="depositMoney">Deposit Money</a>
		</li>
		<li>
			<a href="transferMoney">Transfer Money</a>	
		</li>
	</ul> -->
</body>
</html>