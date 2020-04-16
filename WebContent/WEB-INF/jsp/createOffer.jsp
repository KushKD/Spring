<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>  
	<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>  

<P>Offer will be created here</P>


<sf:form action="${pageContext.request.contextPath}/createOffer " method="post" modelAttribute="offer">
<table>
<tr><td>Name: </td> <td> <sf:input type="text" name="name" path="name" /><sf:errors path="name" cssClass="error"></sf:errors> </td></tr>
<tr><td>Email: </td> <td> <sf:input type="text" name="email" path="email" /><sf:errors path="email" cssClass="error"></sf:errors> </td></tr>
<tr><td>Location: </td> <td> <sf:input type="text" name="location" path="location" /><sf:errors path="location" cssClass="error"></sf:errors> </td></tr>
<tr><td colspan="2"> <input type="submit" value="Create Advert" /> </td></tr>
</table>
</sf:form>

