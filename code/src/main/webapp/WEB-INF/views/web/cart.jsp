<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>

<div class="container-fluid bg-secondary mb-5">
    <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 300px">
        <h1 class="font-weight-semi-bold text-uppercase mb-3">Shopping Cart</h1>
        <div class="d-inline-flex">
            <p class="m-0"><a href="">Home</a></p>
            <p class="m-0 px-2">-</p>
            <p class="m-0">Shopping Cart</p>
        </div>
    </div>
</div>
<div class="container-fluid pt-5">
    <div class="px-xl-5">
        <div class="khung mb-3">
            <div class="row">
                <div class="col-5">
                    <div class="form-check mb-3">
                        <input class="form-check-input" type="checkbox" id="allchecked">
                        <label class="form-check-label">
                            Sản phẩm
                        </label>
                    </div>
                </div>
                <div class="col-2">
                    <span>Đơn giá</span>
                </div>
                <div class="col-2">
                    <span>Số lượng</span>
                </div>
                <div class="col-2">
                    <span>Tổng tiền</span>
                </div>
                <div class="col-1">
                    <span>Thao tác</span>
                </div>
            </div>
        </div>
        <div class="khung mb-3">
            <div id="cart">
                <div class="row mt-2" style="border-bottom: 1px solid #dedede">
                    <div class="col-5">
                        <div class="form-check mb-3">
                                <input class="form-check-input" type="checkbox" value="">
                            <label class="form-check-label" >
                                <div class="mb-3" style="max-width: 540px;">
                                    <div class="row g-0">
                                        <div class="col-lg-3">
                                            <img src="/template/web/img/anh2.png" class="img-fluid rounded-start" alt="...">
                                        </div>
                                        <div class="col-lg-9">
                                            <div class="card-body">
                                                <h5 class="card-title">Áo polo nam </h5>
                                                <span>Trắng, Size M</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </label>
                        </div>
                    </div>
                    <div class="col-2">
                        <span>99.000₫</span>
                    </div>
                    <div class="col-2">
                    <span>
                        <div class="input-group quantity" style="width: 100px;">
                                    <div class="input-group-btn">
                                        <button class="btn btn-sm btn-primary btn-minus" >
                                            <i class="fa fa-minus"></i>
                                        </button>
                                    </div>
                                    <input type="text" class="form-control form-control-sm bg-secondary text-center" value="1">
                                    <div class="input-group-btn">
                                        <button class="btn btn-sm btn-primary btn-plus">
                                            <i class="fa fa-plus"></i>
                                        </button>
                                    </div>
                                </div>
                    </span>
                    </div>
                    <div class="col-2">
                        <span>99.000₫</span>
                    </div>
                    <div class="col-1">
                        <a>Xóa</a>
                    </div>
                </div>
                <div class="row mt-2" style="border-bottom: 1px solid #dedede">
                    <div class="col-5">
                        <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                            <input type="checkbox" class="custom-control-input" checked id="price-2">
                            <label class="custom-control-label" for="price-2">
                                <div class="mb-3" style="max-width: 540px;">
                                    <div class="row g-0">
                                        <div class="col-lg-3">
                                            <img src="/template/web/img/anh3.png" class="img-fluid rounded-start" alt="...">
                                        </div>
                                        <div class="col-lg-9">
                                            <div class="card-body">
                                                <h5 class="card-title">Áo polo nam </h5>
                                                <div class="btn-group">
                                                    <span class="dropdown-toggle"  data-bs-toggle="dropdown" data-bs-auto-close="false" aria-expanded="false" >
                                                        Phân loại hàng
                                                    </span>
                                                    <ul class="dropdown-menu p-3">
                                                        <li>
                                                            <div class="color-selector">
                                                                <label>Color:</label>
                                                                <div class="color-buttons">
                                                                    <button class="color-button" data-color="black">Black</button>
                                                                    <button class="color-button" data-color="red">Red</button>
                                                                    <button class="color-button" data-color="blue">BLue</button>
                                                                </div>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <div class="color-selector">
                                                                <label>Size:</label>
                                                                <div class="color-buttons">
                                                                    <button class="size-button" data-color="s">Size S</button>
                                                                    <button class="size-button" data-color="m">Size M</button>
                                                                    <button class="size-button" data-color="l">Size L</button>
                                                                    <button class="size-button" data-color="xl">Size XL</button>
                                                                    <button class="size-button" data-color="xxl">Size XXL</button>
                                                                </div>
                                                            </div>
                                                        </li>
                                                        <li class="text-right ">
                                                            <button type="button" class="btn btn-light" id="cancelButton" >Cancel</button>
                                                            <button type="button" class="btn text-light" style="background-color: #C3817B" >Submit</button>
                                                        </li>
                                                    </ul>

                                                </div>
                                                <p id="selectedItems"></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </label>
                        </div>
                    </div>
                    <div class="col-2">
                        <span>99.000₫</span>
                    </div>
                    <div class="col-2">
                    <span>
                        <div class="input-group quantity" style="width: 100px;">
                                    <div class="input-group-btn">
<button class="btn btn-sm btn-primary btn-minus" >
                                            <i class="fa fa-minus"></i>
                                        </button>
                                    </div>
                                    <input type="text" class="form-control form-control-sm bg-secondary text-center" value="1">
                                    <div class="input-group-btn">
                                        <button class="btn btn-sm btn-primary btn-plus">
                                            <i class="fa fa-plus"></i>
                                        </button>
                                    </div>
                                </div>
                    </span>
                    </div>
                    <div class="col-2">
                        <span>99.000₫</span>
                    </div>
                    <div class="col-1">
                        <a>Xóa</a>
                    </div>
                </div>
                <%--    Tổng tiền    --%>
            </div>

<%--           Thành tiền --%>
            <div>
                <div class="row mt-2" style="border-bottom: 1px solid #dedede;height: 75px">
                    <div class="col-5">
                    </div>
                    <div class="col-2">
                    </div>
                    <div class="col-2 mt-3" >
                        <strong>Thành tiền : </strong>
                    </div>
                    <div class="col-2 mt-3" >
                        <span><strong id="thanhtien">0 ₫</strong></span>
                    </div>
                    <div class="col-1">
                    </div>
                </div>
            </div>

        </div>

        <div class="khung mb-3" >
            <div class="row" style="border-bottom: 1px solid #dedede; padding-bottom: 10px">
                <div class="col-7"></div>
                <div class="col-5">
                    <div class="row">
                        <div class="col-6">
                            <span><i class='bx bxs-coupon bx-tada bx-flip-vertical' style='color:#b29898' ></i> Voucher</span>
                        </div>
                        <div class="col-6 text-right">
                            <span class=" text-cyan">Chọn hoặc nhập mã</span>

                        </div>
                    </div>
                </div>
            </div>
            <div class="row mt-4">
                <div class="col-2 mt-2">
                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                        <input type="checkbox" class="custom-control-input" checked id="price-all1">
                        <label class="custom-control-label" for="price-all1">Chọn tất cả (3)</label>
                    </div>
                </div>
                <div class="col-1 mt-2">
                    <a>Xóa</a>
                </div>
                <div class="col-4 mt-2" >
                    <span>Lưu vào mục đã thích</span>
                </div>
                <div class="col-5">
                    <div class="row">
                        <div class="col-6">
                            Tổng thanh toán (<span id="totalproduct">0</span> sản phẩm): <span class="text-danger" style="font-size: 25px" id="tongthanhtoan">0₫</span>
                        </div>
                        <div class="col-6 text-right">
                            <button class="btn text-light w-75" onclick=" muahang()" style="background-color: #C3817B">Mua hàng</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>



    </div>
</div>


<script>
    $(document).ready(function () {
        var selectedColor = null;
        var selectedSize = null;

        $(".color-button").on("click", function () {
            // Xóa lớp 'active' từ tất cả các nút
            $(".color-button").removeClass("active");
            // Thêm lớp 'active' vào nút đang được chọn
            $(this).addClass("active");

            selectedColor = $(this).data("color");
            updateSelectedItems();
        });

        $(".size-button").on("click", function () {
            $(".size-button").removeClass("active");
            $(this).addClass("active");

            selectedSize = $(this).data("color");
            updateSelectedItems();
        });

        $('#cancelButton').on('click', function () {
            // Ẩn dropdown khi nhấn nút "Cancel"
            $('.dropdown-menu').removeClass('show');
        });

        function updateSelectedItems() {
            // Cập nhật nội dung thẻ <span> với màu sắc và kích thước đã chọn
            var selectedItems = "Color: " + (selectedColor ? selectedColor : "Chưa chọn");
            selectedItems += " - Size: " + (selectedSize ? selectedSize : "Chưa chọn");
            $("#selectedItems").text(selectedItems);
        }
    });
</script>

<%--<script>--%>
<%--    var idkh = 1;--%>
<%--    var dsCheckbox = [];--%>

<%--    $("#allchecked").click(function (){--%>
<%--        var isChecked = $(this).is(":checked");--%>
<%--        if (isChecked){--%>
<%--            $("input[name='idghct']").prop('checked',true)--%>
<%--        }else{--%>
<%--            $("input[name='idghct']").prop('checked',false)--%>
<%--        }--%>
<%--        loadDataCheckbox();--%>

<%--    })--%>
<%--   async function ghct(){--%>
<%--      await  $.ajax({--%>
<%--            url: '/api/user/ghct/dsspttchiatheosp/'+idkh,--%>
<%--            method: 'GET',--%>
<%--            success: function(req) {--%>
<%--                var data = req.data;--%>
<%--                var tbody =$("#cart");--%>
<%--                tbody.empty();--%>
<%--                data.forEach(function (item){--%>
<%--                    item.forEach(function (sp){--%>
<%--                        var html =--%>
<%--                            `--%>
<%--                                        <div class="row mt-2" style="border-bottom: 1px solid #dedede">--%>
<%--                <div class="col-5">--%>
<%--                    <div class="form-check align-items-center justify-content-between mb-3 datacart">--%>
<%--                        <input class="form-check-input" type="checkbox" name="idghct" value="\${sp.idGhct}">--%>
<%--                        <label class="form-check-label">--%>
<%--                            <div class="mb-3" style="max-width: 540px;">--%>
<%--                                <div class="row g-0">--%>
<%--                                    <div class="col-lg-3">--%>
<%--                                        <img src="/template/web/img/anh2.png" class="img-fluid rounded-start" alt="...">--%>
<%--                                    </div>--%>
<%--                                    <div class="col-lg-9">--%>
<%--                                        <div class="card-body">--%>
<%--                                            <h5 class="card-title">\${sp.tenSanPham}</h5>--%>
<%--                                            <span>\${sp.tenBienThe}</span>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </label>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-2">--%>
<%--                    <span>\${sp.giaTien}₫</span>--%>
<%--                </div>--%>
<%--                <div class="col-2">--%>
<%--                    <span>--%>
<%--                        <div class="input-group quantity" style="width: 100px;">--%>
<%--                                    <div class="input-group-btn">--%>
<%--                                        <button class="btn btn-sm btn-primary btn-minus" onclick="thayDoiSoLuong(\${sp.idGhct},-1)">--%>
<%--                                            <i class="fa fa-minus"></i>--%>
<%--                                        </button>--%>
<%--                                    </div>--%>
<%--                                    <input type="text" class="form-control form-control-sm bg-secondary text-center" value="\${sp.soLuong}" id="soluong-\${sp.idGhct}">--%>
<%--                                    <div class="input-group-btn">--%>
<%--                                        <button class="btn btn-sm btn-primary btn-plus" onclick="thayDoiSoLuong(\${sp.idGhct},1)">--%>
<%--                                            <i class="fa fa-plus"></i>--%>
<%--                                        </button>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                    </span>--%>
<%--                </div>--%>
<%--                <div class="col-2">--%>
<%--                    <span id="tongtien-\${sp.idGhct}">\${sp.tongTien}</span>--%>
<%--                </div>--%>
<%--                <div class="col-1">--%>
<%--                    <a>Xóa</a>--%>
<%--                </div>--%>
<%--            </div>--%>

<%--                            `;--%>
<%--                        tbody.append(html);--%>
<%--                    })--%>
<%--                })--%>
<%--                setCheckBox();--%>
<%--            },--%>
<%--            error: function(xhr, status, error) {--%>
<%--                console.log('Có lỗi xảy ra: ' + error);--%>
<%--            }--%>
<%--        });--%>
<%--    }--%>

<%--        function tongTien(){--%>
<%--            $.ajax({--%>
<%--                url: '/api/user/ghct/subtotal/'+idkh,--%>
<%--                method: 'GET',--%>
<%--                success: function(req) {--%>
<%--                    var data = req.data;--%>
<%--                    $("#thanhtien").html(data+"₫");--%>
<%--                    $("#tongthanhtoan").html(data+"₫");--%>

<%--                },--%>
<%--                error: function(xhr, status, error) {--%>
<%--                    console.log('Có lỗi xảy ra: ' + error);--%>
<%--                }--%>
<%--            });--%>

<%--        }--%>

<%--   function thayDoiSoLuong(idghct,sl){--%>
<%--            $.ajax({--%>
<%--                url: '/api/user/ghct/thaydoisoluong',--%>
<%--                method: 'POST',--%>
<%--                contentType: 'application/json',--%>
<%--                data: JSON.stringify({--%>
<%--                    idGhct:idghct,--%>
<%--                    soLuong:sl--%>
<%--                }),--%>
<%--                success: async function (req) {--%>
<%--            //        await ghct();--%>
<%--                    var data = req.data;--%>
<%--                    $("#soluong-"+data.idGhct).val(data.soLuong);--%>
<%--                    $("#tongtien-"+data.idGhct).html(data.tongTien);--%>
<%--                    tongTienTheoGhct(dsCheckbox);--%>
<%--                },--%>
<%--                error: function(xhr, status, error) {--%>
<%--                    console.log('Có lỗi xảy ra: ' + error);--%>
<%--                }--%>
<%--            });--%>
<%--        }--%>
<%--     function muahang() {--%>
<%--         var listsp = getValByCheckbox();--%>
<%--         var listspAsNumbers = listsp.map(str => parseInt(str, 10));--%>
<%--         if (listsp.length == 0) {--%>
<%--             showError("Bạn chưa chọn sản phẩm để mua")--%>
<%--         }--%>
<%--         var data = JSON.stringify({--%>
<%--             dsghct: listspAsNumbers,--%>
<%--         });--%>
<%--          $.ajax({--%>
<%--             url: '/api/user/dathang/' + idkh,--%>
<%--             method: 'POST',--%>
<%--             contentType: 'application/json',--%>
<%--             data: data,--%>
<%--             success: function (req) {--%>
<%--                 window.location.href = "/checkout"--%>
<%--             },--%>
<%--             error: function (xhr, status, error) {--%>
<%--                 showError("Có lỗi xảy ra");--%>
<%--             }--%>
<%--         });--%>
<%--    }--%>
<%--  async function  init(){--%>
<%--       await ghct();--%>
<%--       //tongTien()--%>
<%--   }--%>
<%--   // Đặt sự kiện delegating cho phần tử body để bắt sự kiện click của checkbox--%>

<%--   function setCheckBox(){--%>
<%--       $('input[name="idghct"]').click(function() {--%>
<%--           loadDataCheckbox();--%>
<%--       });--%>
<%--   }--%>
<%--   function loadDataCheckbox(){--%>
<%--       var listCheckbox = getValByCheckbox();--%>

<%--       dsCheckbox = listCheckbox;--%>
<%--       tongTienTheoGhct(dsCheckbox)--%>
<%--   }--%>
<%--   function getValByCheckbox(){--%>
<%--        return $("input[name='idghct']:checked").map(function () {--%>
<%--            return this.value;--%>
<%--        }).get();--%>
<%--   }--%>
<%--function tongTienTheoGhct(listCheckbox){--%>
<%--    if (listCheckbox.length==0){--%>
<%--        $("#thanhtien").html(0+"₫");--%>
<%--        $("#tongthanhtoan").html(0+"₫");--%>
<%--        $("#totalproduct").html(0);--%>
<%--        return;--%>
<%--    }--%>
<%--       var data = JSON.stringify({--%>
<%--           collection:listCheckbox--%>
<%--       });--%>
<%--    $.ajax({--%>
<%--        url: '/api/user/ghct/subtotaltheoghct/'+idkh,--%>
<%--        method: 'POST',--%>
<%--        contentType: 'application/json',--%>
<%--        data:data ,--%>
<%--        success: function (req) {--%>
<%--            var data = req.data;--%>
<%--            $("#thanhtien").html(data+"₫");--%>
<%--            $("#tongthanhtoan").html(data+"₫");--%>
<%--            $("#totalproduct").html(listCheckbox.length);--%>
<%--        },--%>
<%--        error: function(xhr, status, error) {--%>
<%--            console.log('Có lỗi xảy ra: ' + error);--%>
<%--        }--%>
<%--    });--%>
<%--}--%>
<%--   init();--%>
<%--</script>--%>