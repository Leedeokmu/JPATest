<nav>
    <ul class="pagination pull-right" <c:if test="${not empty param.id}">id="${param.id}"</c:if>>
        <c:if test="${paging.pageSize > 0}">
            <li class="prev <c:if test="${paging.nowFirst}">disabled</c:if>"><a <c:if test="${not paging.nowFirst}">onclick="javascript:${param.functionName}('${paging.prevPageNo}');"</c:if>><i class="fa fa-angle-left"></i> Previous</a></li>
            <c:forEach var="pageNo" begin="${paging.startPage}" end="${paging.endPage}" step="1">
                <li <c:if test="${paging.pageNo eq pageNo}">class="active"</c:if>><a href="#" onclick="javascript:${param.functionName}('${pageNo}');">${pageNo}</a></li>
            </c:forEach>
            <li class="next <c:if test="${paging.nowFinal}">disabled</c:if>"><a href="#" <c:if test="${not paging.nowFinal}">onclick="javascript:${param.functionName}('${paging.nextPageNo}');"</c:if>>Next <i class="fa fa-angle-right"></i></a></li>
        </c:if>
    </ul>
</nav>