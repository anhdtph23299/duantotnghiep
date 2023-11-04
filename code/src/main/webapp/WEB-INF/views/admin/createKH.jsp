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
                <div class="col d-none" >
                    <label class="form-label">Ngày đăng ký:</label>
                    <input type="text" id="ngaydangky" class="form-control"  disabled>
                </div>
            </div>
            <div class="row mt-3">
                <div class="col">
                    <div class="form-floating">
                        <textarea class="form-control" id="mota" placeholder="Leave a comment here" ></textarea>
                        <label >Mô tả</label>
                    </div>
                </div>
            </div>

            <div class="row mt-3">
                <div class="col">
                    <button class="btn" id="them" style="background-color: #A6edab; color: #00852d" onclick="kiemTraDuLieu()">Add</button>
                    <a href="/admin/khachhang" class="btn ms-2" style="background-color: #FFc5c4; color: #be2329">Cancel</a>
                </div>
            </div>
        </div>
    </div>
</div>

<script >

    function kiemTraDuLieu() {
        var maKH = $("#makh").val();
        var tenKH = $("#tenkh").val();
        var sdt = $("#sdt").val();
        var email = $("#email").val();
        var gioiTinh = $("#gioitinh").val();
        var ngaySinh = $("#ngaysinh").val();
        var trangThai = $("#trangthai").val();
        var diaChi = $("#diachi").val();
        var ngayDangKy = new Date();
        var cccd = $("#cccd").val();
        var moTa = $("#mota").val();

        // Thực hiện kiểm tra dữ liệu ở đây (ví dụ: kiểm tra xem các trường có bị để trống không)
        if (tenKH === "" || sdt === "" || email === "" || diaChi === "" || cccd === "" || ngaySinh === "" || moTa === "") {
            showError("Vui lòng điền đầy đủ thông tin.");
            return false;
        }else {
            if (!checkEmail(email)) {
                showError("Email không đúng định dạng.");
                return false;
            } else if (!checkSDT(sdt)) {
                showError("Số điện thoại không đúng định dạng.");
                return false;
            } else if (!checkCCCD(cccd)) {
                showError("Số CCCD không đúng định dạng.");
                return false;
            }
        }

        function checkEmail(email) {
            var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
            return emailPattern.test(email);
        }
        function checkSDT(sdt) {
            var phonePattern = /^0\d{9}$/;
            return phonePattern.test(sdt);
        }

        function checkCCCD(cccd) {
            var cccdPattern = /^0\d{11}$/;
            return cccdPattern.test(cccd);
        }

        var kh = {
            maKH: maKH,
            tenKH: tenKH,
            sdt: sdt,
            email: email,
            gioiTinh: gioiTinh,
            ngaySinh: ngaySinh,
            trangThai: trangThai,
            diaChi: diaChi,
            ngayDangKy: ngayDangKy,
            cccd: cccd,
            moTa: moTa
        };

        $.ajax({
            url: '/api/admin/khachhang/insert',
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(kh),
            success: function (response) {
                window.location.href = '/admin/khachhang';
            },
            error: function (xhr, status, error) {
                showError("Thêm thất bại");
            }
        });
    }

    // js ngày đăng ký
    const currentDate = new Date();

    const year = currentDate.getFullYear();
    const month = currentDate.getMonth() + 1; // Months are zero-based, so we add 1
    const day = currentDate.getDate();
    const hours = currentDate.getHours();
    const minutes = currentDate.getMinutes();
    const seconds = currentDate.getSeconds();

    const formattedDateTime = currentDate.toLocaleString("en-US", { year: "numeric", month: "2-digit", day: "2-digit", hour: "2-digit", minute: "2-digit" });
    document.getElementById("ngaydangky").value = formattedDateTime;
    console.log(formattedDateTime);
</script>
</body>
</html>