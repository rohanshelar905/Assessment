<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>find Employee by department number</h1>
<center>
	<form action="/findEmpBydeptNo" method=post>
	Enter the employee designation<input type=text name="deptNo">
	<br><input type=submit name="submit" value="find">
	</form>
	Click <a href="home">Home</a>To Go Back
	</center>
</body>
</html>