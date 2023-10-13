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
        <div class="row">
            <div class="col-12">
                <ul class="nav nav-tabs">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="/admin/profile">Profile</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/admin/setting_profile">Setting</a>
                    </li>
                </ul>
            </div>
        </div>

        <div class="card card-body">
            <div class="row my-5">
                <div class="col-12 col-sm-4">
                    <div class="row">
                        <div class="col-12 d-flex justify-content-center mb-3">
                            <img src="/template/admin/images/logos.png" width="300px" height="350px" alt="Avatar" />
                        </div>
                    </div>
                </div>
                <div class="col-12 col-sm-8" style="border-left: 2px solid #c17a74">
                    <div class="row mb-3">
                        <div class="col-12 col-sm-3 text-start text-sm-end">
                            <label>
                                <span>Username:</span>
                            </label>
                        </div>
                        <div class="col-12 col-sm-8">
                            <input class="form-control" placeholder="Username:" disabled />
                        </div>
                    </div>

                    <div class="row mb-3">
                        <div class="col-12 col-sm-3 text-start text-sm-end">
                            <label>
                                <span>Name:</span>
                            </label>
                        </div>
                        <div class="col-12 col-sm-8">
                            <input class="form-control"  placeholder="Name:" disabled/>
                        </div>
                    </div>

                    <div class="row mb-3">
                        <div class="col-12 col-sm-3 text-start text-sm-end">
                            <label>
                                <span>Email:</span>
                            </label>
                        </div>
                        <div class="col-12 col-sm-8">
                            <input class="form-control"  placeholder="Email:" disabled/>
                        </div>
                    </div>

                    <div class="row mb-3">
                        <div class="col-12 col-sm-3 text-start text-sm-end">
                            <label>
                                <span>Phone number:</span>
                            </label>
                        </div>
                        <div class="col-12 col-sm-8">
                            <input class="form-control"  placeholder="Phone number:" disabled/>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <p>
            <button class="btn btn-primary" type="button" data-bs-toggle="collapse" data-bs-target="#collapseWidthExample" aria-expanded="false" aria-controls="collapseWidthExample">
                Language
            </button>
        </p>
        <div style="min-height: 120px;">
            <div class="collapse collapse-horizontal" id="collapseWidthExample">
                <div class="card card-body" style="width: 300px;">
                    This is some placeholder content for a horizontal collapse. It's hidden by default and shown when triggered.
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
