<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table,th,td{
border: 1px solid blue;
border-collapse:collapse;
}
</style>
</head>
<body>
<jsp:include page="header.html"></jsp:include>
<br>
<div style="color:green;">${msg}</div>
<br>
<table>
<tr>
<th>Book Code</th>
<th>Book Title</th>
<th>Book Author</th>
<th>Book Price</th>
<th>Action</th>
</tr>
<c:forEach items="${requestScope.list}" var="data">
<tr>
<td>${data.bookCode}</td>
<td>${data.bookTitle}</td>
<td>${data.bookAuthor}</td>
<td>${data.bookPrice}</td>
<td>
<a

href="UpdateBookServlet?code=${data.bookCode}">Update</a>|

<a

href="DeleteBookServlet?code=${data.bookCode}">Delete</a>

</td>
</tr>
</c:forEach>
</table>
</body>
</html>