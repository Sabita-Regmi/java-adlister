<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: sabita--%>
  <%--Date: 2019-04-16--%>
  <%--Time: 10:12--%>
  <%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>



<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%! int counter = 0; %>
<% counter += 1; %>
<%--<%String name; %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="partials/navbar.jsp"></jsp:include>
<%@ include file="partials/bootstrap.jsp" %>

<h1 class="text-danger">The current count is <%= counter %>.</h1>
<h2 class="text-danger">Hello ${param.name}!</h2>

View the page source!

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->
<% boolean first=true;
    boolean second=false; %>
<c:choose>
    <c:when test="${boolean_expression_1}">
        <p>boolean_expression_1 was true</p>
    </c:when>
    <c:when test="${boolean_expression_2}">
        <p>boolean_expression_1 was false, and boolean_expression_2 was true</p>
    </c:when>
    <c:otherwise>
        <p>none of the above tests were true</p>
    </c:otherwise>
</c:choose>

<% List <String> list=new ArrayList<String>();
list.add("hello");
list.add("hola");
list.add("Namaste");
%>
<% for (String hello:list){%>
Hello in some language:<%=hello%><br>
<%}%>

<c:forEach var="i" begin="1" end="30">
    <c:choose>
    <c:when test="${i%15==0}">
        Fizzbuzz<br>
    </c:when>
    </c:choose>
</c:forEach>

</body>
</html>
