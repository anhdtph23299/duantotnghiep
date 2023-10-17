<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14-10-2023
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<title>Cập nhật khuyến mại</title>
<section>
    <div class="content-body">
        <div class="container-fluid">

            <!-- row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="card">
                        <div class="card-header">
                            <h4 class="card-title">Thông tin cơ bản</h4>
                        </div>
                        <div class="card-body">
                            <div class="form-validation">
                                <form class="form-valide" action="#" method="post">
                                    <div class="row">
                                        <div class="col-xl-12">
                                            <div class="form-group row">
                                                <label class="col-lg-2 col-form-label" for="">Loại khuyến mãi
                                                    <span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <div class="basic-form">
                                                        <form >
                                                            <div class="form-group mb-0" id="form"    >
                                                                <label class="radio-inline mr-3"><input type="radio" name="optradio" value="1" > Mã giảm giá hóa đơn</label>
                                                                <label class="radio-inline mr-3"><input type="radio" name="optradio" value="0"> Mã giảm giá sản phẩm</label>
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-2 col-form-label" for="">Tên khuyến mãi
                                                    <span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="text" class="form-control" id="tenKM" name="val-text" placeholder="Nhập vào">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-2 col-form-label" for="">Mã khuyến mãi <span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="text" class="form-control" id="maKM" name="val-text" placeholder="Nhập vào">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-2 col-form-label" for="">Thời gian sử dụng mã
                                                    <span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-3">
                                                    <input type="datetime-local" class="form-control" id="ngayBatDau" name="val-datetime-local" >
                                                </div>
                                                <div class="col-lg-3">
                                                    <input type="datetime-local" class="form-control" id="ngayKetThuc" name="val-datetime-local">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-2 col-form-label" >Mô tả thêm <span class="text-danger"></span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <textarea class="form-control" id="moTa" name="val-text" rows="2" placeholder="..."></textarea>
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </form>
                            </div>
                        </div>
                        <div class="card-header">
                            <h4 class="card-title">Thiết lập giảm giá</h4>
                        </div>
                        <div class="card-body">
                            <div class="form-validation">
                                <form class="form-valide" action="#" method="post">
                                    <div class="row">
                                        <div class="col-xl-12">
                                            <div class="form-group row">
                                                <label class="col-lg-2 col-form-label" for="val-username">Loại giảm giá | Mức giảm
                                                </label>
                                                <div class="col-lg-6">
                                                    <form action="#">
                                                        <div class="input-group mb-3">
                                                            <div class="input-group-prepend">
                                                                <!-- <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Theo phần trăm</button>
                                                                <div class="dropdown-menu">
                                                                    <a class="dropdown-item">Theo mức tiền</a>
                                                                </div> -->
                                                                <select  class="form-control default-select" id="loaiGiamGia" name="loaiGiamGia">
                                                                    <option selected="">Chọn loại</option>
                                                                    <option value="1">Theo phần trăm</option>
                                                                    <option value="0">Theo mức tiền</option>
                                                                </select>
                                                            </div>
                                                            <input type="text" class="form-control" id="giaTriGiam" name="val-text" placeholder="Nhập giá trị">
                                                        </div>


                                                    </form>
                                                </div>
                                                <!-- <div class="col-lg-3">
                                                    <input type="text" class="form-control" id="val-username" name="val-username" placeholder="Nhập giá trị">
                                                </div> -->
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-2 col-form-label" for="">Mức giảm tối đa <span class="text-danger"></span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="text" class="form-control" id="giaTriGiamToiDa" name="val-text" placeholder="Nhập vào">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-2 col-form-label" for="">Giá trị đơn hàng tối thiểu <span class="text-danger"></span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="text" class="form-control" id="giaTriDonToiThieu" name="val-text" placeholder="Nhập vào">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-2 col-form-label" for="">Tổng số lượng sử dụng <span class="text-danger"></span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="text" class="form-control" id="soLuong" name="val-text" placeholder="Nhập vào">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-2 col-form-label" for="">Sản phẩm áp dụng <span class="text-danger"></span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <div class="col-lg-12 ml-auto">
                                                        <button type="button" class="btn btn-primary light mb-2" data-toggle="modal" data-target=".bd-example-modal-lg">Thêm sản phẩm</button>
                                                        <div class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-hidden="true">
                                                            <div class="modal-dialog modal-lg">
                                                                <div class="modal-content">
                                                                    <div class="modal-header">
                                                                        <h5 class="modal-title">Thêm sản phẩm</h5>
                                                                        <button type="button" class="close" data-dismiss="modal"><span>&times;</span>
                                                                        </button>
                                                                    </div>
                                                                    <div class="modal-body">
                                                                        <table id="example5" class="display" style="min-width: 845px">
                                                                            <thead>
                                                                            <tr>
                                                                                <th>
                                                                                    <div class="custom-control custom-checkbox ml-2">
                                                                                        <input type="checkbox" class="custom-control-input" id="checkAll" required="">
                                                                                        <label class="custom-control-label" for="checkAll"></label>
                                                                                    </div>
                                                                                </th>
                                                                                <th>Tên sản phẩm</th>
                                                                                <th>Mã SP</th>
                                                                                <th>Số lượng</th>
                                                                                <th>Giá tiền</th>
                                                                            </tr>
                                                                            </thead>
                                                                            <tbody>
                                                                            <tr>
                                                                                <td>
                                                                                    <div class="custom-control custom-checkbox ml-2">
                                                                                        <input type="checkbox" class="custom-control-input" id="customCheckBox2" required="">
                                                                                        <label class="custom-control-label" for="customCheckBox2"></label>
                                                                                    </div>
                                                                                </td>
                                                                                <td>Áo khoác coolmate</td>
                                                                                <td>Cool999</td>
                                                                                <td>99</td>
                                                                                <td>200.000VNĐ</td>
                                                                            </tr>
                                                                            </tbody>
                                                                        </table>
                                                                    </div>
                                                                    <div class="modal-footer">
                                                                        <button type="button" class="btn btn-danger light" data-dismiss="modal">Đóng</button>
                                                                        <button type="button" class="btn btn-primary">Xác nhận</button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <div class="col-lg-4 ml-auto">
                                                    <a href="#" class="btn btn-success" id="update">Xác nhận</a>
                                                    <a href="/admin/khuyen-mai" class="btn btn-danger">Hủy</a>
                                                    <!-- <button type="button" class="btn btn-primary">Xác nhận</button> -->
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>

                </div>

            </div>
        </div>
    </div>
</section>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script>

    var url = window.location.pathname.split("/");
    var id = url[url.length-1];
    var ngayBatDau, ngayKetThuc;
    $.ajax({
        url: '/api/admin/khuyen-mai/detail/'+id,
        method: 'GET',
        success: function(response) {
            var data = response.data;
            console.log(data);
            // $("#maKM").attr("maKM", data.maKM);
            $("#maKM").val(data.maKM);
            $("#tenKM").val(data.tenKM);
            // var ngayBatDauFMT = formatMicrosoftJSONDate(data.ngayBatDau);
            // var ngayKetThucFMT = formatMicrosoftJSONDate(data.ngayKetThuc);
            $("#ngayBatDauFMT").val(data.ngayBatDau);
            ngayBatDau = data.ngayBatDau;
            ngayKetThuc = data.ngayKetThuc;
            $("#ngayketThucFMT").val(data.ngayKetThuc);
            $("#giaTriGiam").val(data.giaTriGiam);
            $("#giaTriDonToiThieu").val(data.giaTriDonToiThieu);
            $("#giaTriGiamToiDa").val(data.giaTriGiamToiDa);
            $("#soLuong").val(data.soLuong);
            $("#moTa").text(data.moTa);
            $("#loaiGiamGia").val(data.loaiGiamGia).change();
            const selectedValue = data.loaiKM;
            $("input[name=optradio][value=" + selectedValue + "]").attr('checked', 'checked');
        },
        error: function(xhr, status, error) {
            alert('Có lỗi xảy ra: ' + error);
        }
    });


    $("#update").click(function (){
        var maKM = $("#maKM").val();
        var tenKM = $("#tenKM").val();
        var loaiGiamGia = $('#loaiGiamGia option:selected').val();
        // var ngayBatDau = $("#ngayBatDau").val();
        // var ngayKetThuc = $("#ngayKetThuc").val();
        var loaiKM = $('form input[type=radio]:checked').val();
        var soLuong = $("#soLuong").val();
        var giaTriGiam = $("#giaTriGiam").val();
        var giaTriDonToiThieu = $("#giaTriDonToiThieu").val();
        var giaTriGiamToiDa = $("#giaTriGiamToiDa").val();
        var moTa = $("#moTa").val();


        var ngayBatDauFMT = convertDateFormat(ngayBatDau);
        var ngayKetThucFMT = convertDateFormat(ngayKetThuc);
        // var ngayTao = getDateNow();

        var km = {
            id:id,
            maKM: maKM,
            tenKM: tenKM,
            loaiKM: loaiKM,
            loaiGiamGia : loaiGiamGia,
            soLuong: soLuong,
            giaTriGiam: giaTriGiam,
            giaTriDonToiThieu: giaTriDonToiThieu,
            giaTriGiamToiDa: giaTriGiamToiDa,
            ngayBatDau: ngayBatDau,
            ngayKetThuc:  ngayKetThuc,
            trangThai: 1,
            moTa: moTa,
            // ngayTao: ngayTao,
            nguoiSua: 1,
            nguoiTao: 1


        }
        console.log(km)
        $.ajax({
            url: '/api/admin/khuyen-mai/insert',
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(km),
            success: function(response) {
                window.location.href = "/admin/khuyen-mai";
            },
            error: function(xhr, status, error) {
                alert('Có lỗi xảy ra: ' + error);
            }
        });
    })

    function convertDateFormat(inputDate) {
        var date = new Date(inputDate);
        var year = date.getFullYear();
        var month = (date.getMonth() + 1).toString().padStart(2, '0');
        var day = date.getDate().toString().padStart(2, '0');
        var hours = date.getHours().toString().padStart(2, '0');
        var minutes = date.getMinutes().toString().padStart(2, '0');
        var seconds = date.getSeconds().toString().padStart(2, '0');
        var formattedDate = year + '-' + month + '-' + day + ' ' + hours + ':' + minutes + ':' + seconds;
        return formattedDate;
    }

    function formatMicrosoftJSONDate(jsonDate) {
        // Create a Date object from the timestamp
        var date = new Date(jsonDate);
        var day = date.getDate().toString().padStart(2, '0');
        var month = (date.getMonth() + 1).toString().padStart(2, '0');
        var year = date.getFullYear();
        var hours = date.getHours().toString().padStart(2, '0');
        var minutes = date.getMinutes().toString().padStart(2, '0');
        // Format the date into "HH:MM dd-MM-yyyy" format
        var formattedDate = hours + ':' + minutes + ' ' + day + '/' + month + '/' + year;
        return formattedDate;
    }

</script>