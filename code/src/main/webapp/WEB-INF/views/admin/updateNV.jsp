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
            <input type="hidden"  id="id" >
            <div class="row">
                <div class="col">
                    <label>Mã nhân viên:</label>
                    <input type="text" id="manv" class="form-control" disabled >
                </div>
                <div class="col">
                    <label>Họ và tên:</label>
                    <input type="text" id="tennv" class="form-control" >
                </div>
                <div class="col">
                    <label>Địa chỉ email:</label>
                    <input type="email" id="email" class="form-control" >
                </div>
            </div>

            <div class="row mt-3">
                <div class="col">
                    <label>Địa chỉ thường chú:</label>
                    <input type="text" id="diachi" class="form-control" >
                </div>
                <div class="col">
                    <label>Số điện thoại:</label>
                    <input type="text" id="sdt" class="form-control" >
                </div>
                <div class="col">
                    <label  class="form-label">Ngày sinh:</label>
                    <input type="date" class="form-control" id="ngaysinh" >
                </div>
            </div>

            <div class="row mt-3">
                <div class="col">
                    <label>Số CCCD:</label>
                    <input type="text" id="cccd" class="form-control" >
                </div>
                <div class="col">
                    <label class="form-label">Ngày cấp:</label>
                    <input type="date" class="form-control" id="ngaycap">
                </div>
                <div class="col">
                    <label>Nơi cấp:</label>
                    <input type="text" id="noicap" class="form-control" >
                </div>
            </div>

            <div class="row mt-3">
                <div class="col">
                    <label>Chức vụ:</label>
                    <select class="form-select" id="selectChucVu">
                    </select>

                </div>
                <div class="col">
                    <label>Giới tính:</label>
                    <select class="form-select" id="gioitinh">
                        <option value="true" selected>Nam</option>
                        <option value="false">Nữ</option>
                    </select>
                </div>
                <div class="col">
                    <label>Trạng thái:</label>
                    <select class="form-select" id="trangthai">
                        <option value="1" selected>Hoạt động</option>
                        <option value="0">Vô hiệu hóa</option>
                    </select>
                </div>
            </div>

            <div class="row mt-3">
                <div class="form-group col-md-12">
                    <label class="control-label">Ảnh nhân viên</label>
                    <div id="myfileupload">
                        <input type="file" id="uploadfile" id="hinhanh" name="ImageUpload" onchange="readURL(this);">
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
                    <button class="btn" id="updateButton" style="background-color: #A6edab; color: #00852d">Update</button>
                    <a href="/admin/nhanvien" class="btn ms-2" style="background-color: #FFc5c4; color: #be2329">Cancel</a>
                </div>
            </div>


        </div>
    </div>
</div>

<script >
    $("#updateButton").click(function() {
        var id = $("#id").val();

        var maNV = $("#manv").val();
        var tenNV = $("#tennv").val();
        var sdt = $("#sdt").val();
        var email = $("#email").val();
        var gioiTinh = $("#gioitinh").val();
        var ngaySinh = $("#ngaysinh").val();
        var hinhAnh = $("#hinhanh").val();
        var trangThai = $("#trangthai").val();
        var diaChi = $("#diachi").val();
        var cccd = $("#cccd").val();
        var ngayCap = $("#ngaycap").val();
        var noiCap = $("#noicap").val();
        var chucVu = $("#selectChucVu").val();

        var nhanVien = {
            "id": id,
            "maNV": maNV,
            "tenNV": tenNV,
            "sdt": sdt,
            "email": email,
            "gioiTinh": gioiTinh,
            "ngaySinh": ngaySinh,
            "hinhAnh": hinhAnh,
            "trangThai": trangThai,
            "diaChi": diaChi,
            "cccd": cccd,
            "ngayCap": ngayCap,
            "noiCap": noiCap,
            "chucVu":  {id: chucVu}
        };
        var url = window.location.pathname.split("/");
        var id = url[url.length-1];
        $.ajax({
            url: '/api/admin/nhanvien/update/'+id,
            method: 'PUT',
            contentType: 'application/json',
            data: JSON.stringify(nhanVien),
            success: function(response) {
                window.location.href = '/admin/nhanvien';
            },
            error: function(xhr, status, error) {
                showError("Update Fail")
            }
        });
    });


    function getNhanVienDetail() {
        var url = window.location.pathname.split("/");
        var id = url[url.length - 1];
        $.ajax({
            url: '/api/admin/nhanvien/detail/' + id,
            method: 'GET',
            success: function (req) {
                var data = req.data;
                $("#id").val(data.id);
                $("#manv").val(data.maNV);
                $("#tennv").val(data.tenNV);
                $("#sdt").val(data.sdt);
                $("#email").val(data.email);
                $("#gioitinh").val(data.gioiTinh.toString());
                $("#trangthai").val(data.trangThai.toString());
                $("#hinhanh").val(data.hinhAnh);
                $("#ngaysinh").val(formatDateInput(data.ngaySinh));
                $("#diachi").val(data.diaChi);
                $("#cccd").val(data.cccd);
                $("#ngaycap").val(formatDateInput(data.ngayCap));
                $("#noicap").val(data.noiCap);
                $("#selectChucVu").val(data.chucVu.tenCV).trigger('change');

                updateChucVuSelect()
            },
            error: function (xhr, status, error) {
                console.log(error);
                alert('Có lỗi xảy ra: ' + error);
            }
        });
    }

    getNhanVienDetail();

    function updateChucVuSelect() {
        $.ajax({
            url: '/api/admin/chucvu',
            method: 'GET',
            success: function (req) {
                var select = $("#selectChucVu");
                select.empty();
                req.data.forEach(function (chucvu) {
                    select.append($('<option>', {
                        value: chucvu.id,
                        text: chucvu.tenCV
                    }));
                });
            },
            error: function (xhr, status, error) {
                showError("Lỗi khi cập nhật select chức vụ");
            }
        });
    }
</script>
</body>
</html>
