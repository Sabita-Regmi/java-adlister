
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Zion Cats</title>
</head>
<body>
<table>
    <thead>
    <tr>Name</tr>
    <tr>Age</tr>
    <tr>Picture</tr>
    </thead>
    <tbody>
        <c:forEach var="cat" items="${cats}">
            <tr>
                <%--<td>${cat.id}</td>--%>
                <td>${cat.name}</td>
                <td>${cat.age}</td>
                <td><img src="${cat.picture}" width="200px"></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
