<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Spring MVC 7 + JSP</title>
</head>
<body>
<h1>Welcome to Spring MVC 7!</h1>

<!-- Render the value passed from the controller -->
<p>Hello, <strong><c:out value="${username}"/></strong>!</p>
</body>
</html>