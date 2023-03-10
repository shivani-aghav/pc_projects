<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%
String msg = (String) request.getAttribute("msg");
String errmsg = (String) request.getAttribute("errmsg");
%>

<%if(msg!=null) {%>
<%=msg %>
<%} %>

<%if(errmsg!=null){ %>
<%=errmsg %>
<%} %>




<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>

		<legend>Employee Registration Form</legend>

		<form action="./register" method="post">
			<table>
				<tr>
					<td><label>Enter Your EmpID</label></td>
					<td><input type="text" name="empId"></td>
				</tr>
				<tr>
					<td><label>Enter Your EmpName</label></td>
					<td><input type="text" name="empName"></td>
				</tr>
				<tr>
					<td><label>Enter Your EmpEmail</label></td>
					<td><input type="email" name="empEmail"></td>
				</tr>
				<tr>
					<td><label>Enter Your Password</label></td>
					<td><input type="password" name="empPassword"></td>
				</tr>
			</table>

			<input type="Submit" value="Register"> <input type="Submit"
				value="Login">
		</form>

	</fieldset>

	<a href="./login">Already have an Account?Login Here!!!</a>
</body>
</html>