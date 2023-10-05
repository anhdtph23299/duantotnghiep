<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 9/26/2023
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sửa nhân viên</title>
</head>
<body>
<div class="content-body">
    <div class="container-fluid">
        <div class="card card-body">
            <h4 style="margin-top: 0;
    margin-bottom: 30px;
    border-bottom: 2px solid #FFD43B;
    padding-bottom: 10px;
    padding-left: 5px;
    color: black;">
               Sửa thông tin nhân viên
            </h4>

            <form>
                <div class="row">
                    <div class="col">
                        <label>Mã nhân viên:</label>
                        <input type="text" class="form-control" >
                    </div>
                    <div class="col">
                        <label>Họ và tên:</label>
                        <input type="text" class="form-control" >
                    </div>
                    <div class="col">
                        <label>Địa chỉ email:</label>
                        <input type="email" class="form-control" >
                    </div>
                </div>

                <div class="row mt-3">
                    <div class="col">
                        <label>Địa chỉ thường chú:</label>
                        <input type="text" class="form-control" >
                    </div>
                    <div class="col">
                        <label>Số điện thoại:</label>
                        <input type="text" class="form-control" >
                    </div>
                    <div class="col">
                        <label for="datepicker" class="form-label">Ngày sinh:</label>
                        <input type="date" class="form-control" id="datepicker">
                    </div>
                </div>

                <div class="row mt-3">
                    <div class="col">
                        <label>Số CCCD:</label>
                        <input type="text" class="form-control" >
                    </div>
                    <div class="col">
                        <label for="datepicker" class="form-label">Ngày cấp:</label>
                        <input type="date" class="form-control" id="datepicker">
                    </div>
                    <div class="col">
                        <label>Nơi cấp:</label>
                        <input type="text" class="form-control" >
                    </div>
                </div>

                <div class="row mt-3">
                    <div class="col">
                        <label>Chức vụ:</label>
                        <select class="form-select">
                            <option value="Bán hàng" selected>Bán hàng</option>
                            <option value="Dịch vụ" >Dịch vụ</option>
                            <option value="Tư vấn" >Tư vấn</option>
                            <option value="Thu ngân" >Thu ngân</option>
                            <option value="Kiểm hàng" >Kiểm hàng</option>
                        </select>
                    </div>
                    <div class="col">
                        <label>Giới tính:</label>
                        <select class="form-select">
                            <option value="Nam" selected>Nam</option>
                            <option value="Nữ">Nữ</option>
                        </select>
                    </div>
                </div>

                <div class="row mt-3">
                    <div class="form-group col-md-12">
                        <label class="control-label">Ảnh 3x4 nhân viên</label>
                        <div id="myfileupload">
                            <input type="file" id="uploadfile" name="ImageUpload" onchange="readURL(this);">
                        </div>
                        <div id="thumbbox">
                            <img height="300" width="300" alt="Thumb image" id="thumbimage" style="display: none" />
                            <a class="removeimg" href="javascript:"></a>
                        </div>
                        <div id="boxchoice">
                            <a href="javascript:" class="Choicefile">
                                <svg xmlns="http://www.w3.org/2000/svg" height="1em" viewBox="0 0 512 512">
                                    <style>svg{fill:#ffffff}</style>
                                    <path d="M288 109.3V352c0 17.7-14.3 32-32 32s-32-14.3-32-32V109.3l-73.4 73.4c-12.5 12.5-32.8 12.5-45.3 0s-12.5-32.8 0-45.3l128-128c12.5-12.5 32.8-12.5 45.3 0l128 128c12.5 12.5 12.5 32.8 0 45.3s-32.8 12.5-45.3 0L288 109.3zM64 352H192c0 35.3 28.7 64 64 64s64-28.7 64-64H448c35.3 0 64 28.7 64 64v32c0 35.3-28.7 64-64 64H64c-35.3 0-64-28.7-64-64V416c0-35.3 28.7-64 64-64zM432 456a24 24 0 1 0 0-48 24 24 0 1 0 0 48z"/>
                                </svg> Chọn ảnh
                            </a>
                            <p style="clear:both"></p>
                        </div>
                    </div>
                </div>

                <div class="row mt-3">
                    <div class="col">
                        <button class="btn" style="background-color: #A6edab; color: #00852d">Update</button>
                        <button class="btn ms-2" style="background-color: #FFc5c4; color: #be2329">Cancel</button>
                    </div>
                </div>
            </form>


        </div>
    </div>
</div>
</body>
</html>
