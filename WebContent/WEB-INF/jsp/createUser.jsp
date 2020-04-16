<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>  
	<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>  
	   <%@ taglib prefix="format" uri="http://java.sun.com/jsp/jstl/fmt" %>

<format:message key="UnmachedPasswords.user.password" />
<format:message key="MatchedPasswords.user.passwords" />
<P>Register YourSelf</P>
<!-- modelAttribute="userPojo" -->

<sf:form action="${pageContext.request.contextPath}/createUser " method="post" modelAttribute="userpojo">
<table>
<tr><td>First Name: </td> <td> <sf:input type="text" name="firstname" path="firstname" /><sf:errors path="firstname" cssClass="error"></sf:errors> </td></tr>
<tr><td>Middle Name: </td> <td> <sf:input type="text" name="middlename" path="middlename" /><sf:errors path="middlename" cssClass="error"></sf:errors> </td></tr>
<tr><td>Last Name: </td> <td> <sf:input type="text" name="lastname" path="lastname" /><sf:errors path="lastname" cssClass="error"></sf:errors> </td></tr>

<tr><td>Username: </td> <td> <sf:input type="text" name="username" path="username" /><sf:errors path="username" cssClass="error"></sf:errors> </td></tr>
<tr><td>Password: </td> <td> <sf:input type="password" name="pasword" path="pasword" /><sf:errors path="pasword" cssClass="error"></sf:errors> </td></tr>

<tr><td>Email: </td> <td> <sf:input type="text" name="email" path="email" /><sf:errors path="email" cssClass="error"></sf:errors> </td></tr>
<tr><td>Phone: </td> <td> <sf:input type="text" name="phone" path="phone" /><sf:errors path="phone" cssClass="error"></sf:errors> </td></tr>

<tr><td>State: </td> <td> <sf:input type="text" name="state" path="state" /><sf:errors path="state" cssClass="error"></sf:errors> </td></tr>
<tr><td>District: </td> <td> <sf:input type="text" name="district" path="district" /><sf:errors path="district" cssClass="error"></sf:errors> </td></tr>
<tr><td>City: </td> <td> <sf:input type="text" name="city" path="city" /><sf:errors path="city" cssClass="error"></sf:errors> </td></tr>
<tr><td>Address: </td> <td> <sf:input type="text" name="address" path="address" /><sf:errors path="address" cssClass="error"></sf:errors> </td></tr>

<tr><td>Role Name: </td> <td> <sf:input type="text" name="rol_name" path="rol_name" /><sf:errors path="rol_name" cssClass="rol_name"></sf:errors> </td></tr>
<tr><td>Role Description: </td> <td> <sf:input type="text" name="role_description" path="role_description" /><sf:errors path="role_description" cssClass="error"></sf:errors> </td></tr>



<tr><td colspan="2"> <input type="submit" value="Create User" /> </td></tr>
</table>
</sf:form>

