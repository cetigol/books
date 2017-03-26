<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- start: Main Menu -->
<div id="sidebar" class="sidebar                  responsive">
    <script type="text/javascript">
        try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
    </script>
    <ul class="nav nav-list">
        <li class="<c:if test="${param.activeMenu == 'index'}">active</c:if>">
            <a href="<c:url value="/"/>">
                <i class="menu-icon fa fa-tachometer"></i>
                <span class="menu-text"> Dashboard </span>
            </a>

            <b class="arrow"></b>
        </li>

        <li class="<c:if test="${param.activeMenu == 'import-book'}">open</c:if>">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text"> Administration </span>
                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>
            <ul class="submenu">
                <li class="<c:if test="${param.activeMenu == 'import-book'}">active</c:if>">
                    <a href="<c:url value="/import/book/"/>">
                        <i class="menu-icon fa fa-caret-right"></i>
                        Import book
                    </a>

                    <b class="arrow"></b>
                </li>
            </ul>
        </li>
    </ul><!-- /.nav-list -->

    <!-- #section:basics/sidebar.layout.minimize -->
    <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
        <i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
    </div>

    <!-- /section:basics/sidebar.layout.minimize -->
    <script type="text/javascript">
        try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
    </script>
</div>
<!-- end: Main Menu -->