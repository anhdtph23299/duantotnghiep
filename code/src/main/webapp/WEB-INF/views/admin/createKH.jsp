<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 9/26/2023
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm khách hàng</title>
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
                Tạo mới khách hàng
            </h4>
            <form>
                <div class="row">
                    <div class="col">
                        <label>Mã khách hàng:</label>
                        <input type="text" class="form-control" >
                    </div>
                    <div class="col">
                        <label>Họ và tên:</label>
                        <input type="text" class="form-control" >
                    </div>
                </div>

                <div class="row mt-3">
                    <div class="col">
                        <label>Số CCCD:</label>
                        <input type="text" class="form-control" >
                    </div>
                    <div class="col">
                        <label>Số điện thoại:</label>
                        <input type="text" class="form-control" >
                    </div>
                </div>

                <div class="row mt-3">
                    <div class="col">
                        <label>Địa chỉ email:</label>
                        <input type="email" class="form-control" >
                    </div>
                    <div class="col">
                        <label>Địa chỉ:</label>
                        <input type="text" class="form-control" >
                    </div>
                </div>

                <div class="row mt-3">
                    <div class="col">
                        <label for="datepicker" class="form-label">Ngày sinh:</label>
                        <input type="date" class="form-control" id="datepicker">
                    </div>
                    <div class="col">
                        <label>Giới tính:</label>
                        <select class="form-select">
                            <option value="Nam" selected>Nam</option>
                            <option value="Nữ">Nữ</option>
                        </select>
                    </div>

                    <div class="row mt-3">
                        <div class="col">
                            <div class="form-floating">
                                <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea"></textarea>
                                <label for="floatingTextarea">Mô tả</label>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row mt-3">
                    <div class="col">
                        <button class="btn" style="background-color: #A6edab; color: #00852d">Add</button>
                        <button class="btn ms-2" style="background-color: #FFc5c4; color: #be2329">Cancel</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
