<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All customers</title>
</head>
<body>
<h1> Show All Customerrs</h1>
<table border="1">
		<thead>
			<tr>
				<th>Customer id</th>
				<th>Customer Name</th>
				<th>Balance</th>
				<th>Address</th>
				<th>Phone</th>
				<th>email</th>
				<th>customerAccountNumber</th>
				
				<th>accountStatement</th>
				<th>upddate Statement</th>
			</tr>
		</thead>
		<tbody>
		
			<c:forEach var="customer" items="${customers}">
				<tr>
					<td>${customer.id}</td>
					<td>${customer.name}</td>
					<td>${customer.account.accountBalance}</td>
					<td>${customer.address}</td>
					<td>${customer.phone}</td>
					<td>${customer.email}</td>
						<td>${customer.account.accountId}</td>
					<td><a href="/bankapp/transaction/accountStatement?id=<c:out value="${customer.account.accountId}"/>">statement</a></td>
					<td><a href="updateCustomer?id=<c:out value="${customer.id}"/>">update</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<!-- <a href="addCustomer">add new Customer</a></br>
	<a href="depositMoney">Deposit Money</a></br>
	<a href="transferMoney">Transfer Money</a>	</br>
	 -->
	<!-- <ul>
		<li>
			<a href="addCustomer">Add new Customer</a>
		</li>
		<li>
			<a href="showAllTransactions">View all Transactions</a>	
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