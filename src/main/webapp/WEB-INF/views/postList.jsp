<%--
  Created by IntelliJ IDEA.
  User: sire
  Date: 2018-09-17
  Time: 오전 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common.jsp" %>
<html>
<head>
    <title>post list</title>
</head>
<body>
<table>
    <thead>
    <th>id</th>
    <th>title</th>
    <th>author</th>
    <th>reg_date</th>
    </thead>
    <tbody>
    <c:forEach items="${postList}" var="post">
        <tr>
            <td>${post.id}</td>
            <td>${post.email}</td>
            <td>${post.name}</td>
            <td>${post.person.phone}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>
