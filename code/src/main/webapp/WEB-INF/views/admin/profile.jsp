<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 10/5/2023
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<div class="content-body">
    <div class="container-fluid">
        <h4 style="margin-top: 0;
    margin-bottom: 30px;
    border-bottom: 2px solid #FFD43B;
    padding-bottom: 10px;
    padding-left: 5px;
    color: black;">
            Profile
        </h4>
        <div class="row mb-3">
            <div class="col-12 col-sm-4">
                <div class="row">
                    <div class="col-12 d-flex justify-content-center mb-3">
                        <img src="/template/admin/images/anh.png" width="300px" height="350px" alt="Avatar" />
                    </div>

                    <div class="col-12 d-flex justify-content-center">
                        <button class="btn btn-primary">
                            <svg xmlns="http://www.w3.org/2000/svg" height="1em" viewBox="0 0 512 512">
                                <style>svg{fill:#ffffff}</style>
                                <path d="M288 109.3V352c0 17.7-14.3 32-32 32s-32-14.3-32-32V109.3l-73.4 73.4c-12.5 12.5-32.8 12.5-45.3 0s-12.5-32.8 0-45.3l128-128c12.5-12.5 32.8-12.5 45.3 0l128 128c12.5 12.5 12.5 32.8 0 45.3s-32.8 12.5-45.3 0L288 109.3zM64 352H192c0 35.3 28.7 64 64 64s64-28.7 64-64H448c35.3 0 64 28.7 64 64v32c0 35.3-28.7 64-64 64H64c-35.3 0-64-28.7-64-64V416c0-35.3 28.7-64 64-64zM432 456a24 24 0 1 0 0-48 24 24 0 1 0 0 48z"/>
                            </svg> Edit
                        </button>
                    </div>
                </div>
            </div>
            <div class="col-12 col-sm-8">
                <div class="row mb-3">
                    <div class="col-12 col-sm-3 text-start text-sm-end">
                        <label>
                            <span class="text-danger me-1">*</span>
                            <span>Username:</span>
                        </label>
                    </div>
                    <div class="col-12 col-sm-8">
                        <input class="form-control" placeholder="Username:" />
                    </div>
                </div>

                <div class="row mb-3">
                    <div class="col-12 col-sm-3 text-start text-sm-end">
                        <label>
                            <span class="text-danger me-1">*</span>
                            <span>Name:
                </span>
                        </label>
                    </div>
                    <div class="col-12 col-sm-8">
                        <input class="form-control"  placeholder="Name:"/>

                    </div>
                </div>

                <div class="row mb-3">
                    <div class="col-12 col-sm-3 text-start text-sm-end">
                        <label>
                            <span class="text-danger me-1">*</span>
                            <span>Email:
                </span>
                        </label>
                    </div>
                    <div class="col-12 col-sm-8">
                        <input class="form-control"  placeholder="Email:"/>
                    </div>
                </div>

                <div class="row mb-3">
                    <div class="col-12 col-sm-3 text-start text-sm-end"></div>
                    <div class="col-12 col-sm-8">
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" id="changePasswordCheckbox">
                            <label class="form-check-label" for="changePasswordCheckbox">
                                Change Password
                            </label>
                        </div>
                    </div>
                </div>
                <div id="passwordFields" style="display: none;">
                <div class="row mb-3" >
                    <div class="col-12 col-sm-3 text-start text-sm-end">
                        <label>
                            <span class="text-danger me-1">*</span>
                            <span>Password:</span>
                        </label>
                    </div>
                    <div class="col-12 col-sm-8">
                        <input type="password" class="form-control" id="password" name="password"  placeholder="Password:"/>
                    </div>
                </div>
                <div class="row mb-3" >
                    <div class="col-12 col-sm-3 text-start text-sm-end">
                        <label>
                            <span class="text-danger me-1">*</span>
                            <span>Confirm Password: </span>
                        </label>
                    </div>
                    <div class="col-12 col-sm-8">
                        <input  type="password" class="form-control" id="confirmPassword" name="confirmPassword"  placeholder="Confirm Password:"/>
                    </div>
                </div>
                </div>
                <div class="row mt-4">
                    <div class="col">
                        <button class="btn float-right" style="background-color: #A6edab; color: #00852d">Submit</button>
                    </div>
                </div>
            </div>
        </div>



    </div>
</div>
<script >
    //checkbox change password
    const changePasswordCheckbox = document.getElementById("changePasswordCheckbox");
    const passwordFields = document.getElementById("passwordFields");

    changePasswordCheckbox.addEventListener("change", function () {
        if (changePasswordCheckbox.checked) {
            passwordFields.style.display = "block";
        } else {
            passwordFields.style.display = "none";
        }
    });

</script>

</body>
</html>
