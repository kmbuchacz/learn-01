<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page session="false" %>
<html>
<head>

	<title>Logging page</title>
</head>
<body>
<h1>
	To log in please give your username and password.
	
</h1>

<form:form  commandName="user" method="POST">

Username: <form:input path="username"/>
Password: <form:input path="password"/>

<input type="submit" value="Submint"> <!-- Uwazaj na przycik submit bo jesli masz do niego dopisany JavaScript który wykonuje walidacje dany to den guzik tak czy siak wykona przekazanie tworrego formularza - lepiej zmaienic go na button w javascripcie wpisac ze jesli pasuja to wtedy robic submit -->
${result}
</form:form>
</body>
</html>
