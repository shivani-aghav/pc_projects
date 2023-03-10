<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
String errMsg = (String) request.getAttribute("errMsg");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if (errMsg != null && !errMsg.isEmpty()) {
	%>
	<%=errMsg%>
	<%
	}
	%>
	<fieldset>

		<legend>LOGIN HERE</legend>

		<form action="./login" method="post">
			<table>
				<tr>
					<td><label>Enter Your EmpId</label></td>
					<td><input type="text" name="empId"></td>
				</tr>
				<tr>
					<td><label>Enter Your Password</label></td>
					<td><input type="password" name="empPassword"></td>
				</tr>
			</table>

			<input type="submit" value="Login">
		</form>

	</fieldset>

	<a href="./register">Don't have an Account?Register Here!!!</a>

</body>
</html>