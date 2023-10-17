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
                Tạo mới khách hàng
            </h4>
            <div class="row">
                <div class="col">
                    <label>Mã khách hàng:</label>
                    <input type="text" id="makh" class="form-control" >
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
                        <option value="2">Ngừng hoạt động</option>
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
                    <button class="btn" id="them" style="background-color: #A6edab; color: #00852d">Add</button>
                        <button class="btn ms-2" style="background-color: #FFc5c4; color: #be2329">Cancel</button>
                </div>
            </div>
        </div>
    </div>
</div>

<script >

    // $("#them").click(function (){
    //     var maKH = $("#makh").val();
    //     var tenKH = $("#tenkh").val();
    //     var sdt = $("#sdt").val();
    //     var email = $("#email").val();
    //     var gioiTinh = $("#gioitinh").val();
    //     var ngaySinh = $("#ngaysinh").val();
    //     var trangThai = $("#trangthai").val();
    //     var diaChi = $("#diachi").val();
    //     var cccd = $("#cccd").val();
    //     var moTa = $("#mota").val();
    //
    //     var kh = {
    //         maKH: maKH,
    //         tenKH: tenKH,
    //         sdt: sdt,
    //         email: email,
    //         gioiTinh:  gioiTinh,
    //         ngaySinh: ngaySinh,
    //         trangThai: trangThai,
    //         diaChi: diaChi,
    //         cccd: cccd,
    //         moTa: moTa
    //     }
    //     $.ajax({
    //         url: '/api/admin/khachhang/insert',
    //         method: 'POST',
    //         contentType: 'application/json',
    //         data: JSON.stringify(kh),
    //         success: function(response) {
    //         },
    //         error: function(xhr, status, error) {
    //             alert('Có lỗi xảy ra: ' + error);
    //         }
    //     });
    // })

    var url = window.location.pathname.split("/");
    var id = url[url.length-1];
    $.ajax({
        url: '/api/admin/khachhang/detail/'+id,
        method: 'GET',
        success: function(req) {
            var data = req.data;
            $("#makh").val(data.maKH);
            $("#tenkh").val(data.tenKH);
            $("#sdt").val(data.sdt);
            $("#email").val(data.email);
            $("#gioitinh").val(data.gioiTinh.toString()).change();
            $("#ngaysinh").val(formatDateInput(data.ngaySinh));
            // $("#trangthai").val();
            $("#diachi").val(data.diaChi);
            $("#cccd").val(data.cccd);
       //     $("#mota").val();
        },
        error: function(xhr, status, error) {
            console.log(error)
            alert('Có lỗi xảy ra: ' + error);
        }
    });
</script>