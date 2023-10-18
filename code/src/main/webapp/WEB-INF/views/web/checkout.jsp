<%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <!-- Page Header Start -->
    <div class="container-fluid bg-secondary mb-5">
        <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 300px">
            <h1 class="font-weight-semi-bold text-uppercase mb-3">Checkout</h1>
            <div class="d-inline-flex">
                <p class="m-0"><a href="">Home</a></p>
                <p class="m-0 px-2">-</p>
                <p class="m-0">Checkout</p>
            </div>
        </div>
    </div>

    <!-- Page Header End -->
<div class="container-fluid row pl-5" >
    <div class="col-12 mb-2"><h3 >Thông tin mua hàng</h3></div>
    <div class="col-3"><strong id="tennguoinhan"></strong></div>
    <div class="col-2"><p id="sdt"></p></div>
    <div class="col-4"><p id="diachi"></p></div>
    <div class="col-1"><p id="df">Mặc định</p></div>
    <div class="col-1"><button class="btn btn-outline-primary">Thay đổi</button></div>
</div>
    <!-- Checkout Start -->
    <div class="container-fluid pt-5 pl-4">

        <div class="table-responsive">
            <table class="table" id="tblcheckout">
                <thead>
                <tr>
                    <th scope="col" class="border-0 bg-light">
                        <div class="p-2 px-2 text-uppercase">Product</div>
                    </th>
                    <th scope="col" class="border-0 bg-light">
                        <div class="py-2 text-uppercase">Loại sản phẩm</div>
                    </th>
                    <th scope="col" class="border-0 bg-light">
                        <div class="py-2 text-uppercase">Price</div>
                    </th>
                    <th scope="col" class="border-0 bg-light">
                        <div class="py-2 text-uppercase">Quantity</div>
                    </th>
<%--                    <th scope="col" class="border-0 bg-light">--%>
<%--                        <div class="py-2 text-uppercase">Remove</div>--%>
<%--                    </th>--%>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th class="border-0">
                        <div class="p-2">
                            <img src="https://product.hstatic.net/200000323177/product/momo_shirt__3__8e0d45a718ee4d5ea9dbc036db3185e6_large.jpg" alt="" width="70" class="img-fluid rounded shadow-sm">
                            <div class="ml-3 d-inline-block align-middle">
                                <h5 class="mb-0"> <a href="#" class="text-dark d-inline-block align-middle">Timex Unisex Originals</a></h5><span class="text-muted font-weight-normal font-italic d-block">Category: Watches</span>
                            </div>
                        </div>
                    </th>
                    <td class="border-0 align-middle"><strong>Loại sản phẩm</strong></td>
                    <td class="border-0 align-middle"><strong>$79.00</strong></td>
                    <td class="border-0 align-middle"><strong>3</strong></td>
                    <td class="border-0 align-middle"><a href="#" class="text-dark"><i class="fa fa-trash"></i></a></td>
                </tr>
                <tr>
                    <th scope="row">
                        <div class="p-2">
                            <img src="https://product.hstatic.net/1000341630/product/kmsh220633_75cb0c2945474917b2528e802806fb39_master.jpg" alt="" width="70" class="img-fluid rounded shadow-sm">
                            <div class="ml-3 d-inline-block align-middle">
                                <h5 class="mb-0"><a href="#" class="text-dark d-inline-block">Lumix camera lense</a></h5><span class="text-muted font-weight-normal font-italic">Category: Electronics</span>
                            </div>
                        </div>
                    </th>
                    <td class="border-0 align-middle"><strong>Loại sản phẩm</strong></td>
                    <td class="align-middle"><strong>$79.00</strong></td>
                    <td class="align-middle"><strong>3</strong></td>
                    <td class="align-middle"><a href="#" class="text-dark"><i class="fa fa-trash"></i></a>
                    </td>
                </tr>
                <tr>
                    <th scope="row">
                        <div class="p-2">
                            <img src="https://media.coolmate.me/cdn-cgi/image/quality=80,format=auto/uploads/January2022/3recyw2_3.jpg" alt="" width="70" class="img-fluid rounded shadow-sm">
                            <div class="ml-3 d-inline-block align-middle">
                                <h5 class="mb-0"> <a href="#" class="text-dark d-inline-block">Gray Nike running shoe</a></h5><span class="text-muted font-weight-normal font-italic">Category: Fashion</span>
                            </div>
                        </div>
                    </th>
                    <td class="border-0 align-middle"><strong>Loại sản phẩm</strong></td>
                    <td class="align-middle"><strong>$79.00</strong></td>
                    <td class="align-middle"><strong>3</strong></td>
                    <td class="align-middle"><a href="#" class="text-dark"><i class="fa fa-trash"></i></a>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
<div class="container text-center">
    <h2>Tổng tiền</h2>
    <p id="total"></p>
    <p id="totaldola"></p>
    <form action="${pageContext.request.contextPath}/pay" method="post">
        <input type="hidden" name="method" value="paypal">
        <input type="hidden" name="intent" value="sale">
        <input type="hidden" name="currency" value="USD">
        <input type="hidden" name="description" value="Product Description">
        <input type="hidden" name="price" id="pricethanhtoan" value="10.00">
        <button type="submit">Thanh toán</button>
    </form>
</div>
    <!-- Checkout End -->
<input type="text" id="idttmuahang" style="display: none;">
<script>
    const formatter = new Intl.NumberFormat('en-US', {
        style: 'currency',
        currency: 'USD',
    });
    $.ajax({
        url: '/api/user/ttgh/'+1,
        method: 'GET',
        success: function(req) {
            var data = req.data;
            $("#idttmuahang").html(data.id);
            $("#tennguoinhan").html(data.tenNguoiNhan);
            $("#sdt").html(data.soDienThoai);
            $("#diachi").html(data.diaChi);
        },
        error: function(xhr, status, error) {
            alert('Có lỗi xảy ra: ' + error);
        }
    });
    function ghct(){
        $.ajax({
            url: '/api/user/ghct/'+1,
            method: 'GET',
            success: function(req) {
                var data = req.data;

                var tbody =$("#tblcheckout tbody");
                tbody.empty();
                data.forEach(function (custom){
                    var idgh = custom.gioHangChiTietId.idGioHang;
                    var sp = custom.sanPham;
                    var html = `
                                  <tr>
                    <th class="border-0">
                        <div class="p-2">
                            <img src="https://product.hstatic.net/200000323177/product/momo_shirt__3__8e0d45a718ee4d5ea9dbc036db3185e6_large.jpg" alt="" width="70" class="img-fluid rounded shadow-sm">
                            <div class="ml-3 d-inline-block align-middle">
                                <h5 class="mb-0"> <a href="#" class="text-dark d-inline-block align-middle">\${sp.tenSanPham}</a></h5><span class="text-muted font-weight-normal font-italic d-block">Category: Watches</span>
                            </div>
                        </div>
                    </th>
                    <td class="border-0 align-middle"><strong>Loại sản phẩm</strong></td>
                    <td class="border-0 align-middle"><strong>\${convertVND(custom.tongTien)}</strong></td>
                    <td class="border-0 align-middle"><strong>\${custom.soLuong}</strong></td>
                    <td class="border-0 align-middle"><a href="#" class="text-dark"><i class="fa fa-trash"></i></a></td>
                </tr>
                    `;
                    tbody.append(html);
                })

            },
            error: function(xhr, status, error) {
                alert('Có lỗi xảy ra: ' + error);
            }
        });
    }

        $.ajax({
            url: '/api/user/ghct/subtotal/'+1,
            method: 'GET',
            success: function(req) {
                var data = req.data;
              //  $("#subtotal").html(convertVND(data));
                $("#total").html(convertVND(data))
                $("#totaldola").html(formatter.format(data/24570));
                $("#pricethanhtoan").val(data/24570);
            },
            error: function(xhr, status, error) {
                alert('Có lỗi xảy ra: ' + error);
            }
        });

    ghct()
</script>