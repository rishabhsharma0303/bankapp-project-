<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous"/> -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Home Page</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav">
        <a class="nav-link active" aria-current="page" href="/bankapp/home">Home</a>
        <a class="nav-link" href="#">Features</a>
        <a class="nav-link" href="#">Pricing</a>
        <a class="nav-link disabled">Disabled</a>
      </div>
    </div>
  </div>
</nav>
<h1 class="text-center">Home Page</h1>

<ul  class="list-group">
		<li class="list-group-item list-group-item-success">
			<h5>
				<a href="user/showAllEmployees">Show all employees</a>
			</h5>
		</li>
		
		<li class="list-group-item list-group-item-success">
			<h5>
				<a href="user/addEmployee">Add employee</a>
			</h5>
		</li>
		
		<li class="list-group-item list-group-item-success">
			<h5>
				<a href="customer/allCustomers">Show all customer</a>
			</h5>
		</li>
		
		<li class="list-group-item list-group-item-success">
			<h5>
				<a href="customer/addCustomer">Add new Customer</a>
			</h5>
		</li>
		
		<li class="list-group-item list-group-item-danger">
			<h5>
				<a href="transaction/showAllTransactions">View all Transactions</a>
			</h5>	
		</li>
		
		<li class="list-group-item list-group-item-danger">
			<h5>
				<a href="transaction/pendingTransaction">View pending Transactions</a>
			</h5>	
		</li>
		
		<li class="list-group-item list-group-item-danger">
			<h5>
				<a href="transaction/withdrawMoney">Withdraw Money</a>
			</h5>
		</li>
		
		<li class="list-group-item list-group-item-danger">
			<h5>
				<a href="transaction/depositMoney">Deposit Money</a>
			</h5>
		</li>
		
		<li class="list-group-item list-group-item-danger">
			<h5>
				<a href="transaction/transferMoney">Transfer Money</a>
			</h5>
		</li>
		<li class="list-group-item list-group-item-warning">
			<h5> <a href="/bankapp/logout">Logout</a> </h5>
		</li>
	</ul>
</body>
</html>