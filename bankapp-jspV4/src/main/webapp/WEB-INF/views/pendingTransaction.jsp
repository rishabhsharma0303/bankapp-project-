<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pending Transaction</title>
</head>
<body>
<h3>Showing the Pending Transaction here</h3>
<br>
<table border="1">
<thead>
<tr>
<th> Transaction Id </th>
<th> Transaction from Account Number </th>
<th> Transaction to Account Number </th>
<th> Transaction Amount </th>
<th> Transaction Type </th>
<th> Transaction Status </th>
<c:if test="${profile == 'ROLE_MGR'}">
<th> Transaction Approve </th>
</c:if>
<c:if test="${profile == 'ROLE_MGR'}">
<th> Transaction Reject </th>
</c:if>
</tr>
</thead>
<tbody>
<c:forEach items="${transactions}" var="transaction">
<tr>
<td>${transaction.transactionId}</td>
<td>
<c:if test="${transaction.fromAccNo == null}" > From Self Account </c:if>
<c:if test="${transaction.fromAccNo != null}" > ${transaction.fromAccNo} </c:if>
</td>
<td>
<c:if test="${transaction.toAccNo == null}" > To Self Account </c:if>
<c:if test="${transaction.toAccNo != null}" > ${transaction.toAccNo} </c:if>
</td>
<td>${transaction.amount}</td>
<td>${transaction.transactionType}</td>
<td>${transaction.status}</td>
<c:if test="${profile == 'ROLE_MGR'}">
<td><a href="approveTransaction?id=<c:out value="${transaction.transactionId}"/>">Approve</a></td>
</c:if>
<c:if test="${profile == 'ROLE_MGR'}">
<td><a href="rejectTransaction?id=<c:out value="${transaction.transactionId}"/>">Reject</a></td>
</c:if>
</tr>
</c:forEach>
</tbody>
</table>
<br><br>
<a href="showAllTransactions">Want to view all the Transactions of the account</a> <br><br>
<a href="/bankapp/home">Home Page</a> <br>
</body>
</html>