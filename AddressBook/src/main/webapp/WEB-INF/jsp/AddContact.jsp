<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add New Contact</title>
</head>
<body>
<sform:form commandName="contact">
<table>
<tr>
<td>First Name : </td>
<td><sform:input path="fname" /></td>
</tr>
<tr>
<td>Last Name : </td>
<td><sform:input path="lname" /></td>
</tr>
<tr>
<td>Mobile No : </td>
<td><sform:input path="mobno" /></td>
</tr>
<tr>
<td>Email : </td>
<td><sform:input path="email" /></td>
</tr>
<tr>
<td><input type="submit" value="Submit Values"></td>
</tr>
</table>
</sform:form>
</body>
</html>