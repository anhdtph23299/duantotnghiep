<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title><dec:title>Dashboard</dec:title></title>
    <link rel="icon" type="image/png" sizes="16x16" href="<c:url value='/template/admin/images/favicon.png'/>">
    <link rel="stylesheet" href="<c:url value='/template/admin/vendor/chartist/css/chartist.min.css'/>">
    <link href="<c:url value='/template/admin/vendor/bootstrap-select/dist/css/bootstrap-select.min.css'/>" rel="stylesheet">
    <link href="<c:url value='/template/admin/vendor/owl-carousel/owl.carousel.css'/>" rel="stylesheet">
    <link href="<c:url value='/template/admin/css/style.css'/>" rel="stylesheet">
</head>
<body>
    <!--*******************
       Preloader start
    ********************-->
    <div id="preloader">
        <div class="sk-three-bounce">
            <div class="sk-child sk-bounce1"></div>
            <div class="sk-child sk-bounce2"></div>
            <div class="sk-child sk-bounce3"></div>
        </div>
    </div>
    <!--*******************
        Preloader end
    ********************-->

    <div id="main-wrapper">
        <%@ include file="/common/admin/header.jsp" %>
        <%@ include file="/common/admin/sidebar.jsp" %>
        <dec:body/>
        <%@ include file="/common/admin/footer.jsp" %>
    </div>

    <script data-cfasync="false" src="../cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script>
    <script src="<c:url value='/template/admin/vendor/global/global.min.js'/>"></script>
    <script src="<c:url value='/template/admin/vendor/bootstrap-select/dist/js/bootstrap-select.min.js'/>"></script>
    <script src="<c:url value='/template/admin/vendor/chart.js/Chart.bundle.min.js'/>"></script>

    <!-- Chart piety plugin files -->
    <script src="<c:url value='/template/admin/vendor/peity/jquery.peity.min.js'/>"></script>

    <!-- Apex Chart -->
    <script src="<c:url value='/template/admin/vendor/apexchart/apexchart.js'/>"></script>

    <!-- Dashboard 1 -->
    <script src="<c:url value='/template/admin/js/dashboard/dashboard-1.js'/>"></script>

    <script src="<c:url value='/template/admin/vendor/owl-carousel/owl.carousel.js'/>"></script>
    <script src="<c:url value='/template/admin/js/custom.min.js'/>"></script>
    <script src="<c:url value='/template/admin/js/deznav-init.js'/>"></script>
    <script src="<c:url value='/template/admin/js/demo.js'/>"></script>
    <script src="<c:url value='/template/admin/js/styleSwitcher.js'/>"></script>
</body>
</html>