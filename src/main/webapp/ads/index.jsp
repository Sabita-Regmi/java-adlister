

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ADS list</title>
</head>
<body>


<table>
    <thead>
    <th>ID</th>
    <th>User Id</th>
    <th>Title</th>
    <th>Description</th>
    </thead>
    <c:forEach var="ad" items= "${adds}">
        <tr>
            <td>${ad.id}</td>
            <td>${ad.userId}</td>
            <td>${ad.title}</td>
            <td>${ad.description}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
