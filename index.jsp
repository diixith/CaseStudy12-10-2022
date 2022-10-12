<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
<h1 style="color: green">
<u> <i>Company Share List</i> </u>
		</h1>
		<br> <br>
		<h3> <a href="shareEntry" style="color:Fuchsia">Enlist a new Company</a> </h3>
		<br> <br>
		<table border="2">
		<tr >
<th>COMPANY ID</th>
<th>COMPANY NAME</th>
<th>SHARE PRICE</th>
<th>ACTIONS</th>
</tr>
<c:forEach items="${shareList}" var="share">
<tr>
<td>${share.companyId}</td>
<td>${share.companyName}</td>
<td>${share.sharePrice}</td>
<td>
<a href="editShare/${share.companyId}">Edit share price</a>
&nbsp; &nbsp;
<a href="deleteShare/${share.companyId}">Delete company</a>
</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>