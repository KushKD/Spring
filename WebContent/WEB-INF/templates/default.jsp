<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><tiles:getAsString name="title" /></title>
<tiles:insertAttribute name="header"></tiles:insertAttribute>
</head>
<tiles:insertAttribute name="body"></tiles:insertAttribute>  </body>

	<tiles:insertAttribute name="footer"></tiles:insertAttribute>
</html>