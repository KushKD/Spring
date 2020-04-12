<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kush Kumar dhawan</title>
</head>
<body>
<P>Kush Kumar dhawan inside JSP Folder</P>

<%-- Session:- <%= session.getAttribute("name") %> --%>

Session:- <%= request.getAttribute("name") %>

<c:out value="${name}"></c:out>


</body>
</html>