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
        <th>rdate</th>
        </thead>
        <tbody>
            <c:forEach items="${postList}" var="post">
            <tr>
                <td>${post.id}</td>
                <td>${post.title}</td>
                <td>${post.authorDetail.name}</td>
                <td>${post.regDate}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
    <div>
        <button class='btn btn-default' onclick="addPost()">ADD POST</button>
    </div>
</body>
</html>
<script>
    function movePage(pageNo) {
        var url = '/gameCharacter/list?';
        if (pageNo > 0) {
            url += '&pageNo=' + pageNo;
        }
        console.log(url);
        location.href = url;
    }

    function addPost(){
        location.href='/post/write';
    }
</script>
