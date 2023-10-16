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
               Thông tin chi tiết khách hàng
            </h4>
            <div class="row">
                <div class="col">
                    <label>Mã khách hàng:</label>
                    <input type="text" id="makh" value="detailData.maKH"  class="form-control"  >
                </div>
                <div class="col">
                    <label>Họ và tên:</label>
                    <input type="text" id="tenkh" class="form-control"  >
                </div>
                <div class="col">
                    <label>Số điện thoại:</label>
                    <input type="text" id="sdt" class="form-control"  >
                </div>
            </div>

            <div class="row mt-3">
                <div class="col">
                    <label>Địa chỉ email:</label>
                    <input type="email" id="email" class="form-control"  >
                </div>
                <div class="col">
                    <label>Số CCCD:</label>
                    <input type="text" id="cccd" class="form-control"  >
                </div>
                <div class="col">
                    <label>Địa chỉ:</label>
                    <input type="text" id="diachi" class="form-control" >
                </div>
            </div>

            <div class="row mt-3">
                <div class="col">
                    <label class="form-label">Ngày sinh:</label>
                    <input type="date" id="ngaysinh" class="form-control"  >
                </div>
                <div class="col">
                    <label>Giới tính:</label>
                    <select class="form-select" id="gioitinh" >
                        <option value="true" selected>Nam</option>
                        <option value="false">Nữ</option>
                    </select>
                </div>
                <div class="col">
                    <label>Trạng thái:</label>
                    <select class="form-select" id="trangthai" >
                        <option value="1" selected>Hoạt động</option>
                        <option value="2">Ngừng hoạt động</option>
                    </select>
                </div>

                <div class="row mt-3">
                    <div class="col">
                        <div class="form-floating" >
                            <textarea class="form-control" id="mota"   ></textarea>
                            <label >Mô tả</label>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row mt-3">
                <div class="col">
                    <a href="/admin/khachhang" class="btn ms-2" style="background-color: #FFc5c4; color: #be2329">Cancel</a>
                </div>
            </div>
        </div>
    </div>
</div>

<script >
    function getDetail(id) {
        $.ajax({
            url: '/api/admin/khachhang/detail/' + id,
            method: 'GET',
            success: function (data) {
                var detailData = data;

                $("#makh").val(detailData.maKH);
                $("#tenkh").val(detailData.tenKH);
                $("#sdt").val(detailData.sdt);
                $("#email").val(detailData.email);
                $("#gioitinh").val(detailData.gioiTinh.toString()).change();
                $("#ngaysinh").val(formatDateInput(detailData.ngaySinh));
                $("#trangthai").val(detailData.trangThai.toString()).change();
                $("#diachi").val(detailData.diaChi);
                $("#cccd").val(detailData.cccd);
                $("#mota").val(detailData.moTa);
            },
            error: function (xhr, status, error) {
                console.log(error);
                alert('Có lỗi xảy ra: ' + error);
            }
        });
    }
</script>