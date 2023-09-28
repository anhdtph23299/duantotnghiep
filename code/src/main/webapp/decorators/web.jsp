<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title><dec:title>Trang chủ</dec:title></title>
    <link href="img/favicon.icon" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">

    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="<c:url value='/template/web/lib/owlcarousel/assets/owl.carousel.min.css'/>" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="<c:url value='/template/web/css/style.css'/>" rel="stylesheet">
</head>
<body>
    <%@ include file="/common/web/topbar.jsp" %>
    <%@ include file="/common/web/navbar.jsp" %>

    <dec:body/>
    <%@ include file="/common/web/footer.jsp" %>

    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
    <script src="<c:url value='/template/web/lib/easing/easing.min.js'/>"></script>
    <script src="<c:url value='/template/web/lib/owlcarousel/owl.carousel.min.js'/>"></script>

    <!-- Contact Javascript File -->
    <script src="<c:url value='/template/web/mail/jqBootstrapValidation.min.js'/>"></script>
    <script src="<c:url value='/template/web/mail/contact.js'/>"></script>

    <!-- Template Javascript -->
    <script src="<c:url value='/template/web/js/main.js'/>"></script>
</body>
</html>