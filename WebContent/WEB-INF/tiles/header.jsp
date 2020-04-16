<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>  
	<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>


<a href="${pageContext.request.contextPath}/"> Offers Website </a>

<security:authorize access="isAuthenticated()">
<p>
<a href="${pageContext.request.contextPath}/logout"> Logout </a>
</p>
</security:authorize> 

<security:authorize access="!isAuthenticated()">
<p>
<a href="${pageContext.request.contextPath}/login"> Login </a>
</p>
</security:authorize> 