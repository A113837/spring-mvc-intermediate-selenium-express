<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Please Register Here</h1>

	<form:form modelAttribute="userReg">
	<label>User: </label>
	<form:input path="name"/>
	
	
	</form:form>
</body>
</html>