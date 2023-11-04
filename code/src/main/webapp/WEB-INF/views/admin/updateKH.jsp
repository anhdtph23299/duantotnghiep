<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 9/26/2023
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="content-body">
    <div class="container-fluid">
        <div class="card card-body">
            <h4 style="margin-top: 0;
    margin-bottom: 30px;
    border-bottom: 2px solid #FFD43B;
    padding-bottom: 10px;
    padding-left: 5px;
    color: black;">
                Cập nhật khách hàng
            </h4>
            <input type="hidden"  id="id" >
            <div class="row">
                <div class="col">
                    <label>Mã khách hàng:</label>
                    <input type="text" id="makh" class="form-control" disabled >
                </div>
                <div class="col">
                    <label>Họ và tên:</label>
                    <input type="text" id="tenkh" class="form-control" >
                </div>
                <div class="col">
                    <label>Số điện thoại:</label>
                    <input type="text" id="sdt" class="form-control" >
                </div>
            </div>

            <div class="row mt-3">
                <div class="col">
                    <label>Địa chỉ email:</label>
                    <input type="email" id="email" class="form-control" >
                </div>
                <div class="col">
                    <label>Số CCCD:</label>
                    <input type="text" id="cccd" class="form-control" >
                </div>
                <div class="col">
                    <label>Địa chỉ:</label>
                    <input type="text" id="diachi" class="form-control" >
                </div>
            </div>

            <div class="row mt-3">
                <div class="col">
                    <label class="form-label">Ngày sinh:</label>
                    <input type="date" id="ngaysinh" class="form-control" >
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
                        <option value="0">Ngừng hoạt động</option>
                    </select>
                </div>

                <div class="row mt-3">
                    <div class="col">
                        <div class="form-floating">
                            <textarea class="form-control" id="mota" placeholder="Leave a comment here" ></textarea>
                            <label >Mô tả</label>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row mt-3">
                <div class="col">
                    <button class="btn" id="updateButton" style="background-color: #A6edab; color: #00852d">Update</button>
                    <a href="/admin/khachhang" class="btn ms-2" style="background-color: #FFc5c4; color: #be2329">Cancel</a>
                </div>
            </div>
        </div>
    </div>
</div>

<script >

    $("#updateButton").click(function() {
        var id = $("#id").val();

        // Lấy dữ liệu từ các trường input
        var maKH = $("#makh").val();
        var tenKH = $("#tenkh").val();
        var sdt = $("#sdt").val();
        var email = $("#email").val();
        var gioiTinh = $("#gioitinh").val();
        var ngaySinh = $("#ngaysinh").val();
        var trangThai = $("#trangthai").val();
        var diaChi = $("#diachi").val();
        var cccd = $("#cccd").val();
        var moTa = $("#mota").val();

        // Tạo đối tượng KhachHang từ dữ liệu form
        var khachHang = {
            "id": id,
            "maKH": maKH,
            "tenKH": tenKH,
            "sdt": sdt,
            "email": email,
            "gioiTinh": gioiTinh,
            "ngaySinh": ngaySinh,
            "trangThai": trangThai,
            "diaChi": diaChi,
            "cccd": cccd,
            "moTa": moTa
        };
        var url = window.location.pathname.split("/");
        var id = url[url.length-1];
        $.ajax({
            url: '/api/admin/khachhang/update/'+id,
            method: 'PUT',
            contentType: 'application/json',
            data: JSON.stringify(khachHang),
            success: function(response) {
                window.location.href = '/admin/khachhang';
            },
            error: function(xhr, status, error) {
                showError("Update Fail")
            }
        });
    });


    var url = window.location.pathname.split("/");
    var id = url[url.length-1];
    $.ajax({
        url: '/api/admin/khachhang/detail/'+id,
        method: 'GET',
        success: function(req) {
            var data = req.data;
            $("#id").val(data.id);
            $("#makh").val(data.maKH);
            $("#tenkh").val(data.tenKH);
            $("#sdt").val(data.sdt);
            $("#email").val(data.email);
            $("#gioitinh").val(data.gioiTinh.toString()).change();
            $("#ngaysinh").val(formatDateInput(data.ngaySinh));
            $("#trangthai").val(data.trangThai.toString()).change();
            $("#diachi").val(data.diaChi);
            $("#cccd").val(data.cccd);
            $("#mota").val(data.moTa);
        },
        error: function(xhr, status, error) {
            console.log(error)
            alert('Có lỗi xảy ra: ' + error);
        }
    });
</script>