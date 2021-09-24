<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>My App login page!</h5>

<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION }">
<font color="red">
	<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message }"></c:out>
</font>
</c:if>

<c:if test="${not empty param.logout}">
        <font color="green"> <c:out value="Logged Out Successfully"></c:out>
        </font>
 </c:if>

<c:url value="/myloginprocessor" var="login"/>
<form:form action="${login}" method="post">
			<label>email:</label> <input type="text" name=username />
			<label>Password:</label> <input type="text" name="password" />
			<input type="submit"/>
</form:form>




</body>
</html>
