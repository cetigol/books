<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- start: CSS -->
    <link id="bootstrap-style" href="resources/css/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/bootstrap/bootstrap-responsive.min.css" rel="stylesheet">
    <link id="base-style" href="resources/css/style/style.css" rel="stylesheet">
    <link id="base-style-responsive" href="resources/css/style/style-responsive.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
    <!-- end: CSS -->
</head>
<body>
<jsp:include page="base/before.jsp" />
    <div class="container-fluid-full">
        <jsp:include page="base/menu.jsp" />
        <div class="row-fluid">
            <!-- start: Content -->
            <div id="content" class="span10">
                <div class="row-fluid">
                    <c:forEach var="item" items="${books}">
                        <div class="span2 book-display" ontablet="span4" ondesktop="span2">
                            <a href="<c:url value="/book/${item.id}"/>" title="${item.name}">
                                <img src="${item.image}" onerror="this.src='resources/img/fallback.png'">
                            </a>
                            <br/>
                            <a href="<c:url value="/book/${item.id}"/>">
                                ${item.name}
                            </a>
                            <br/>
                            ${item.author}
                        </div>
                    </c:forEach>
                </div>
            </div>
            <!-- end: Content -->
        </div>
    </div>
<jsp:include page="base/after.jsp" />
</body>
</html>
