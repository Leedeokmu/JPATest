<%--
  Created by IntelliJ IDEA.
  User: sire
  Date: 2018-09-17
  Time: 오전 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common.jsp" %>
<html>
<head>
    <title>write post</title>
</head>
<body class="container">
    <form action="/post/write" method="post">
        <div class="row">
            <div class="col-md-2">
                <label>author</label>
            </div>
            <div class="col-md-4">
                <input type="text" name="author" class="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-md-2">
                <label>title</label>
            </div>
            <div class="col-md-4">
                <input type="text" name="title" class="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-md-2">
                <label>content</label>
            </div>
            <div class="col-md-4">
                <textarea name="content"  cols="10" rows="3" class="form-control"></textarea>
            </div>
        </div>
        <input type="submit" value="SUBMIT">
    </form>
</body>
</html>
