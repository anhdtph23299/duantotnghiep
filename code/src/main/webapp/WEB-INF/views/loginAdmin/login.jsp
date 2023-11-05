<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 10/22/2023
  Time: 3:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>

</head>
<body>
<div class="main-parent">
    <div class="form-wrap">
        <form action="">
            <h1><span>Login</span>Form</h1>

            <div class="single-input">
                <input
                        required
                        type="email"
                        id="email"
                        placeholder="Email address"
                />
            </div>
            <div class="single-input">
                <input required type="password" id="pass" placeholder="Password" />
            </div>

            <div class="Sumbit-button">
                <button class="button login">Login</button>
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