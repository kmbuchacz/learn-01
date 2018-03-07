<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page session="false" %>
<html>
<head>

	<title>Register page</title>
</head>
<body bgcolor="gray">
<h1>
	Register
	
	<c:forEach items="${messages}" var="message">
	
	${message.content} </br>
	
	</c:forEach>
	
	
</h1>

</body>
</html>
