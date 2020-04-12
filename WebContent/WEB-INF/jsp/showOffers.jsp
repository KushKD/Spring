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
<P>Showing all Offers</P>

<c:forEach items="${offers}" var="offer">
<br><hr>
    <tr>
        <td>Offer ID: <c:out value="${offer.id}"/></td>
        <td>Offer Name: <c:out value="${offer.name}"/></td>  
          <td>Offer email: <c:out value="${offer.email}"/></td>  
            <td>Offer Location: <c:out value="${offer.location}"/></td>  
    </tr>
</c:forEach>


</body>
</html>