<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>  
<!DOCTYPE html>
<html>

<body>

<c:if test="${param.error != null}">
<p>Login Failed</p>
</c:if>


	<form class="form-signin" method="post"  action="${pageContext.request.contextPath}/login">
		<h2 class="form-signin-heading">Please sign in</h2>
		<p>
			<label for="username" class="sr-only">Username</label> <input
				type="text" id="username" name="username" class="form-control"
				placeholder="Username" required autofocus>
		</p>
		<p>
			<label for="password" class="sr-only">Password</label> <input
				type="password" id="password" name="password" class="form-control"
				placeholder="Password" required>
		</p>
		<input type="hidden"
    name="${_csrf.parameterName}"
    value="${_csrf.token}"/>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
			in</button>
	</form>
</body>
</html>