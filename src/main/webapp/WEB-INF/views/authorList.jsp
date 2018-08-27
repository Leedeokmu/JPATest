<%--
  Created by IntelliJ IDEA.
  User: sire
  Date: 2018-08-28
  Time: 오전 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common.jsp" %>
<html>
<head>
</head>
    <body>
        <table>
            <thead>
                <th>id</th>
                <th>email</th>
                <th>name</th>
                <th>phone</th>
            </thead>
            <tbody>
                <c:forEach items="${authorList}" var="author">
                    <tr>
                        <td>${id}</td>
                        <td>${email}</td>
                        <td>${name}</td>
                        <td>${person.phone}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
