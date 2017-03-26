<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jawr.net/tags" prefix="jwr" %>
<html>
<head>
    <jwr:style src="/bundles/defaultCSS.css" />
</head>
<body class="no-skin">
<jsp:include page="base/before.jsp" />
<div class="main-container" id="main-container">
    <script type="text/javascript">
        try{ace.settings.check('main-container' , 'fixed')}catch(e){}
    </script>
    <jsp:include page="base/menu.jsp" />
    <div class="main-content">
        <div class="main-content-inner">
            <div class="page-content">
                <div class="row">
                    <c:forEach var="item" items="${books}">
                        <div class="book-preview">
                            <div class="book-preview-image"><img src="/images/${item.image}" onerror="this.src='/resources/img/no_availabale.png'"></div>
                            <div class="book-preview-title">${item.name}</div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="base/after.jsp" />
</body>
</html>
