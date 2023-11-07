<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 11/2/2023
  Time: 4:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Forgot Password</title>
</head>
<body>
<div class="main-parent">
    <div class="form-wrap">
            <h1><span>Forgot</span>Password</h1>
            <div class="single-input">
                <input
                        required
                        type="email"
                        id="email"
                        name="email"
                        placeholder="Enter your email address"
                />
            </div>
            <div class="Sumbit-button">
                <button class="button login"  onclick="quenMatKhau()">Submit</button>
            </div>
            <div class="account-have">
                <a class="btn btn-link" style="text-decoration: none" href="/admin/login">
                    < Back to Sign in
                </a>
                <a href="/admin/changePassword">ChangePass</a>
            </div>
    </div>
</div>

<script>
    function quenMatKhau() {
        var email = $("#email").val();
        $.ajax({
            type: "POST",
            url: "/api/quenmatkhau",
            data: { email: email },
            success: function(response) {
                showSuccess("Mật khẩu tạm thời đã được gửi đến email của bạn.")
            },
            error: function(xhr) {
                showError("Không tìm thấy nhân viên với địa chỉ email này.");
            }
        });
    }
</script>
</body>
</html>
