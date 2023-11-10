<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div class="main-parent">
    <div class="form-wrap">
        <c:if test="${param.incorrectAccount != null}">
            <script>
                showError("Tài khoản không hợp lệ. Xin kiểm tra lại")
            </script>
        </c:if>
        <form action="" method="POST">
            <h1><span>Login</span>Form</h1>

            <div class="single-input">
                <input
                        required
                        type="text"
                        id="userName"
                        name="userName"
                />
            </div>
            <div class="single-input">
                <input required type="password" id="password" name="password" placeholder="Password"/>
            </div>

            <div class="Sumbit-button">
                <button type="submit" class="button login" id="login-admin">Login</button>
            </div>
            <div class="account-have">
                <a href="/admin/forgotpassword">Forget password</a>
                <a href="#">Create an account</a>
            </div>
        </form>
    </div>
</div>
<script src="<c:url value='/assets/api/profile.js'/>"></script>
<script src="<c:url value='/assets/api/login/login.js'/> "></script>
</body>
</html>