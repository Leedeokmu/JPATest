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
            <c:forEach items="${postList.content}" var="post">
            <tr>
                <td><a href="/post/write/${post.id}">${post.id}</a></td>
                <td>${post.title}</td>
                <td>${post.authorDetail.name}</td>
                <td>${post.regDate}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
    <div>
        <c:import url="paging.jsp">
            <c:param name="functionName" value="movePage"/>
            <c:param name="page" value="postList.pageable.page"/>
        </c:import>
    </div>
    <div>
        <button class='btn btn-default' onclick="addPost()">ADD POST</button>
    </div>
</body>
</html>
<script>
    const movePage = (pageNo) => {
        let url = '/post/list?';
        if (pageNo > 0) {
            url += '&page=' + pageNo;
        }
        console.log(url);
        location.href = url;
    }

    const addPost = () => {
        location.href='/post/write';
    }
</script>
