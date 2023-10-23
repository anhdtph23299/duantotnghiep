<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 9/26/2023
  Time: 1:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm ca làm việc</title>
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
                Tạo mới ca làm việc
            </h4>

            <div class="row">
                <div class="col">
                    <label>Mã ca:</label>
                    <input type="text" id="macalv" class="form-control" >
                </div>
                <div class="col">
                    <label class="form-label">Ngày làm việc:</label>
                    <input type="date" class="form-control" id="ngaylamviec">
                </div>
            </div>

            <div class="row mt-3">
                <div class="col">
                    <label>Nhân viên:</label>
                    <select class="form-select" id="selectNhanVien">
                    </select>
                </div>
                <div class="col">
                    <label>Trạng thái:</label>
                    <select class="form-select" id="trangthai">
                        <option value="1" selected>Hoạt động</option>
                        <option value="0">Ngừng hoạt động</option>
                    </select>
                </div>
            </div>

            <div class="row mt-3">
                <div class="col">
                    <label>Giờ bắt đầu: </label>
                    <select class="form-select" id="giobatdau">
                        <option value="07:30">07:30</option>
                        <option value="08:00">08:00</option>
                        <option value="08:30">08:30</option>
                        <option value="09:00">09:00</option>
                        <option value="09:30">09:30</option>
                        <option value="10:00">10:00</option>
                        <option value="10:30">10:30</option>
                        <option value="11:00">11:00</option>
                        <option value="11:30">11:30</option>
                        <option value="12:00">12:00</option>
                        <option value="12:30">12:30</option>
                        <option value="13:00">13:00</option>
                        <option value="13:30">13:30</option>
                        <option value="14:00">14:00</option>
                        <option value="14:30">14:30</option>
                        <option value="15:00">15:00</option>
                    </select>
                </div>
                <div class="col">
                    <label>Giờ kết thúc: </label>
                    <select class="form-select" id="gioketthuc">
                        <option value="09:30">09:30</option>
                        <option value="10:00">10:00</option>
                        <option value="10:30">10:30</option>
                        <option value="11:00">11:00</option>
                        <option value="11:30">11:30</option>
                        <option value="12:00">12:00</option>
                        <option value="12:30">12:30</option>
                        <option value="13:00">13:00</option>
                        <option value="13:30">13:30</option>
                        <option value="14:00">14:00</option>
                        <option value="14:30">14:30</option>
                        <option value="15:00">15:00</option>
                        <option value="15:30">15:30</option>
                        <option value="16:00">16:00</option>
                        <option value="16:30">16:30</option>
                        <option value="17:00">17:00</option>
                        <option value="17:30">17:30</option>
                    </select>
                </div>
            </div>

            <div class="row mt-3">
                <div class="col">
                    <button class="btn" id="them" style="background-color: #A6edab; color: #00852d">Add</button>
                    <a href="/admin/giaoca/calamviec" class="btn ms-2" style="background-color: #FFc5c4; color: #be2329">Cancel</a>
                </div>
            </div>
        </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <script >

        $("#them").click(function () {
            var maCaLV = $("#macalv").val();
            var ngayLamViec = $("#ngaylamviec").val();
            var trangThai = $("#trangthai").val();
            var nhanVien = $("#selectNhanVien").val();
            var gioBatDau = $("#giobatdau").val();
            var gioKetThuc = $("#gioketthuc").val();

            var gioBatDauTime = gioBatDau + ":00";
            var gioKetThucTime = gioKetThuc + ":00";

            var ca = {
                maCaLV: maCaLV,
                gioBatDau: gioBatDauTime,
                gioKetThuc: gioKetThucTime,
                ngayLamViec: ngayLamViec,
                trangThai: trangThai,
                nhanVien: {id: nhanVien}
            };

            $.ajax({
                url: '/api/admin/calamviec/insert',
                method: 'POST',
                contentType: 'application/json',
                data: JSON.stringify(ca),
                success: function (response) {
                    window.location.href = '/admin/giaoca/calamviec';
                },
                error: function (xhr, status, error) {
                    showError("Thêm ca thất bại");
                }
            });
        });

        function getListNhanVien() {
            $.ajax({
                url: '/api/admin/nhanvien',
                method: 'GET',
                success: function (req) {
                    var select = $("#selectNhanVien");
                    select.empty();
                    req.data.forEach(function (nhanvien) {
                        select.append($('<option>', {
                            value: nhanvien.id,
                            text: nhanvien.tenNV
                        }));
                    });
                },
                error: function (xhr, status, error) {
                    showError("Lỗi khi cập nhật select nhân viên");
                }
            });
        }
        getListNhanVien();
    </script>
</div>
</body>
</html>
