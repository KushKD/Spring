<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css" >
<title>Kush Kumar dhawan</title>
</head>
<body>
<P>Offer will be created here</P>


<form action="${pageContext.request.contextPath}/createOffer " method="post">
<table>
<tr><td>Name: </td> <td> <input type="text" name="name" /> </td></tr>
<tr><td>Email: </td> <td> <input type="text" name="email" /> </td></tr>
<tr><td>Location: </td> <td> <input type="text" name="location" /> </td></tr>
<tr><td colspan="2"> <input type="submit" value="Create Advert" /> </td></tr>
</table>
</form>





</body>
</html>