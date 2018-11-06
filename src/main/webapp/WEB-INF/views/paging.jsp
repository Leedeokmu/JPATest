<%--
  Created by IntelliJ IDEA.
  User: hiake21c
  Date: 2016-07-19
  Time: 오후 2:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common.jsp" %>
<nav>
    <ul class="pagination pull-right" <c:if test="${not empty param.id}">id="${param.id}"</c:if>>
        <c:if test="${paging.pageSize > 0}">
            <li class="prev <c:if test="${paging.nowFirst}">disabled</c:if>"><a <c:if test="${not paging.nowFirst}">onclick="javascript:${param.functionName}('${paging.prevPageNo}', '${contentType}');"</c:if>><i class="fa fa-angle-left"></i> Previous</a></li>
            <c:forEach var="pageNo" begin="${paging.startPage}" end="${paging.endPage}" step="1">
                <li <c:if test="${paging.pageNo eq pageNo}">class="active"</c:if>><a href="#" onclick="javascript:${param.functionName}('${pageNo}', '${contentType}');">${pageNo}</a></li>
            </c:forEach>
            <li class="next <c:if test="${paging.nowFinal}">disabled</c:if>"><a href="#" <c:if test="${not paging.nowFinal}">onclick="javascript:${param.functionName}('${paging.nextPageNo}', '${contentType}');"</c:if>>Next <i class="fa fa-angle-right"></i></a></li>
        </c:if>
    </ul>
</nav>