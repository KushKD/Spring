<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>  
	<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>


<%-- Session:- <%= session.getAttribute("name") %> --%>

Session:- <%= request.getAttribute("name") %>

<c:out value="${name}"></c:out>
<br>
<a href="${pageContext.request.contextPath}/show">SHOW Offers</a>

<br>
<a href="${pageContext.request.contextPath}/create">Create Offer</a>

<br>
<a href="${pageContext.request.contextPath}/register">Register Yourself </a>

<br>

<security:authorize access="hasAuthority('Admin')">
<br>
<a href="${pageContext.request.contextPath}/admin">Admin Page </a>

<br>
</security:authorize>
<security:authorize access="hasAuthority('Root')">
<br>
<a href="${pageContext.request.contextPath}/root">Root Page </a>

<br>
</security:authorize>



</body>
</html>