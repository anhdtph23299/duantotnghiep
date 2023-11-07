<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 11/3/2023
  Time: 9:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reset Password</title>
</head>
<body>
<div class="main-parent">
    <div class="form-wrap">
            <h1><span>Change</span>Password</h1>
            <div class="single-input">
                <input
                        required
                        type="text"
                        id="resetToken"
                        placeholder="Mã code"
                />
            </div>
            <div class="single-input">
                <input required type="password" id="matkhau" placeholder="Mật khẩu mới"/>
            </div>

            <div class="Sumbit-button">
                <button onclick="resetPassword()">Đặt lại mật khẩu</button>
            </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
    function resetPassword() {
        var resetToken = $("#resetToken").val();
        var matkhau = $("#matkhau").val();

        $.ajax({
            type: "POST",
            url: "/api/resetPasswordByToken",
            data: {
                resetToken: resetToken,
                matkhau: matkhau
            },
            success: function(response) {
                showSuccess("Đổi mật khẩu thành công")
            },
            error: function(xhr, textStatus, error) {
              showError("Đổi mật khẩu thất bại")
            }
        });
    }
</script>

</body>
</html>
