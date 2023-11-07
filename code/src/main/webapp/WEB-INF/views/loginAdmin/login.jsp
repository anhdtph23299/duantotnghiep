<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>

</head>
<body>
<div class="main-parent">
    <div class="form-wrap">
        <c:if test="${param.isNotOpenShift != null}">
            <div class="alert alert-danger">
                Tài khoản không hợp lệ. Xin kiểm tra lại
            </div>
        </c:if>
        <c:if test="${param.sessionTimeout != null}">
            <div class="alert alert-danger">
                Phiên làm việc hết hạn, yêu cầu đăng nhập lại!
            </div>
        </c:if>
        <form action="j_spring_security_check" method="POST">
            <h1><span>Login</span>Form</h1>

            <div class="single-input">
                <input
                        required
                        type="text"
                        id="email"
                        name="j_username"
                />
            </div>
            <div class="single-input">
                <input required type="password" id="pass" name="j_password" placeholder="Password" />
            </div>

            <div class="Sumbit-button">
                <button type="submit" class="button login">Login</button>
            </div>
            <div class="account-have">
                <a href="/admin/forgotpassword">Forget password</a>
                <a href="#">Create an account</a>
            </div>
        </form>
    </div>
</div>
</body>
</html>