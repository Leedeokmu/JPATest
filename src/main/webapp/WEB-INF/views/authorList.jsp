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
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="/vendor/nano-scroller/nanoscroller.css" >
    <script src="/vendor/nano-scroller/jquery.nanoscroller.js"></script>
</head>
    <body class="container">
        <div class="nano">
            <div class="nano-content">
                <table >
                    <thead>
                        <th>id</th>
                        <th>email</th>
                        <th>name</th>
                        <th>phone</th>
                    </thead>
                    <tbody>
                        <c:forEach items="${authorList}" var="author">
                            <tr>
                                <td>${author.id}</td>
                                <td>${author.email}</td>
                                <td>${author.name}</td>
                                <td>${author.person.phone}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
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
        location.href=''
    }
</script>