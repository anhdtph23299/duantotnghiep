<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<style>
    .img-cart{
        height: 170px;
    }
    .soluong{
        width: 50px;
    }

</style>
    <!-- Page Header Start -->
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
    <!-- Page Header End -->

    <!-- Cart Start -->
    <div class="container-fluid pt-5">
        <section class="h-100">
            <div class="container py-5">
                <div class=" d-flex justify-content-center my-4">
                    <div class="card mb-4">
                        <div class="card-header py-3">
                            <h5 class="mb-0">Cart - 2 items</h5>
                        </div>
                        <div class="card-body" id="cart">
                            <!-- Single item 1 -->
                            <div class="row">
                                <div class="col-lg-3 col-md-12 mb-4 mb-lg-0">
                                    <!-- Image -->
                                    <div
                                            class="bg-image hover-overlay hover-zoom ripple rounded"
                                            data-mdb-ripple-color="light"
                                    >
                                        <img
                                                src="https://mdbcdn.b-cdn.net/img/Photos/Horizontal/E-commerce/Vertical/12a.webp"
                                                class="w-100 img-cart"
                                                alt="Blue Jeans Jacket"
                                        />
                                        <a href="#!">
                                            <div
                                                    class="mask"
                                                    style="background-color: rgba(251, 251, 251, 0.2)"
                                            ></div>
                                        </a>
                                    </div>
                                    <!-- Image -->
                                </div>

                                <div class="col-lg-3 col-md-5 mb-4">
                                    <!-- Data -->
                                    <p><strong>Blue denim shirt thịnh hành hot</strong></p>
                                    <p>Color: blue</p>
                                    <p>Size: M</p>
                                    <button
                                            type="button"
                                            class="btn btn-primary btn-sm me-1 mb-2"
                                            data-mdb-toggle="tooltip"
                                            title="Remove item"
                                    >
                                        <i class="fas fa-trash"></i>
                                    </button>
                                    <button
                                            type="button"
                                            class="btn btn-danger btn-sm mb-2"
                                            data-mdb-toggle="tooltip"
                                            title="Move to the wish list"
                                    >
                                        <i class="fas fa-heart"></i>
                                    </button>
                                    <!-- Data -->
                                </div>

                                <div class="col-lg-6 col-md-6 mb-4 mb-lg-0">
                                    <div class="row">
                                        <div class="col-4">
                                            <p style="margin-left: 40px"><strong>Số lượng</strong></p>
                                            <div class="d-flex mb-4">
                                                <button
                                                        class="btn btn-primary px-3 nut"
                                                        onclick="this.parentNode.querySelector('input[type=number]').stepDown()"
                                                >
                                                    <i class="fas fa-minus"></i>
                                                </button>

                                                <div class="form-outline">
                                                    <input
                                                            
                                                            min="0"
                                                            name="quantity"
                                                            value="1"
                                                            type="number"
                                                            class="form-control  soluong"
                                                    />
                                                </div>

                                                <button
                                                        class="btn btn-primary px-3 nut"
                                                        onclick="this.parentNode.querySelector('input[type=number]').stepUp()"
                                                >
                                                    <i class="fas fa-plus"></i>
                                                </button>
                                            </div>
                                        </div>
                                        <div class="col-4">
                                            <p><strong>Đơn giá</strong></p>
                                            <div class="form-outline">
                                                <label class="form-label" 
                                                >2.000.000</label
                                                >
                                            </div>
                                        </div>
                                        <div class="col-4">
                                            <p><strong>Thành tiền</strong></p>
                                            <div class="form-outline">
                                                <label class="form-label" 
                                                >2.000.000</label
                                                >
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- Single item 1 -->

                            <!-- Single item 2 -->

                            <hr class="my-4" />
                            <div class="row">
                                <div class="col-lg-3 col-md-12 mb-4 mb-lg-0">
                                    <!-- Image -->
                                    <div
                                            class="bg-image hover-overlay hover-zoom ripple rounded"
                                            data-mdb-ripple-color="light"
                                    >
                                        <img
                                                src="https://mdbcdn.b-cdn.net/img/Photos/Horizontal/E-commerce/Vertical/13a.webp"
                                                class="w-100 img-cart"
                                        />
                                        <a href="#!">
                                            <div
                                                    class="mask"
                                                    style="background-color: rgba(251, 251, 251, 0.2)"
                                            ></div>
                                        </a>
                                    </div>
                                    <!-- Image -->
                                </div>

                                <div class="col-lg-4 col-md-5 mb-4 mb-lg-0">
                                    <!-- Data -->
                                    <p><strong>Red hoodie</strong></p>
                                    <p>Color: red</p>
                                    <p>Size: M</p>

                                    <button
                                            type="button"
                                            class="btn btn-primary btn-sm me-1 mb-2"
                                            data-mdb-toggle="tooltip"
                                            title="Remove item"
                                    >
                                        <i class="fas fa-trash"></i>
                                    </button>
                                    <button
                                            type="button"
                                            class="btn btn-danger btn-sm mb-2"
                                            data-mdb-toggle="tooltip"
                                            title="Move to the wish list"
                                    >
                                        <i class="fas fa-heart"></i>
                                    </button>
                                    <!-- Data -->
                                </div>

                                <div class="col-lg-5 col-md-6 mb-4 mb-lg-0">
                                    <div class="row">
                                        <div class="col-4">
                                            <p style="margin-left: 40px"><strong>Số lượng</strong></p>
                                            <div class="d-flex mb-4">
                                                <button
                                                        class="btn btn-primary px-3 nut"
                                                        onclick="this.parentNode.querySelector('input[type=number]').stepDown()"
                                                >
                                                    <i class="fas fa-minus"></i>
                                                </button>

                                                <div class="form-outline">
                                                    <input
                                                            
                                                            min="0"
                                                            name="quantity"
                                                            value="1"
                                                            type="number"
                                                            class="form-control  soluong"
                                                    />
                                                </div>

                                                <button
                                                        class="btn btn-primary px-3 nut"
                                                        onclick="this.parentNode.querySelector('input[type=number]').stepUp()"
                                                >
                                                    <i class="fas fa-plus"></i>
                                                </button>
                                            </div>
                                        </div>
                                        <div class="col-4">
                                            <p><strong>Đơn giá</strong></p>
                                            <div class="form-outline">
                                                <label class="form-label" 
                                                >2.000.000</label
                                                >
                                            </div>
                                        </div>
                                        <div class="col-4">
                                            <p><strong>Thành tiền</strong></p>
                                            <div class="form-outline">
                                                <label class="form-label" 
                                                >2.000.000</label
                                                >
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <br />

                            <!-- Single item 2 -->
                            <div class="row">
                                <div class="col-lg-3 col-md-12 mb-4 mb-lg-0">
                                    <!-- Image -->
                                    <div
                                            class="bg-image hover-overlay hover-zoom ripple rounded"
                                            data-mdb-ripple-color="light"
                                    >
                                        <img
                                                src="https://mdbcdn.b-cdn.net/img/Photos/Horizontal/E-commerce/Vertical/13a.webp"
                                                class="w-100 img-cart"
                                        />
                                        <a href="#!">
                                            <div
                                                    class="mask"
                                                    style="background-color: rgba(251, 251, 251, 0.2)"
                                            ></div>
                                        </a>
                                    </div>
                                    <!-- Image -->
                                </div>

                                <div class="col-lg-4 col-md-5 mb-4 mb-lg-0">
                                    <!-- Data -->
                                    <p><strong>Red hoodie</strong></p>
                                    <p>Color: red</p>
                                    <p>Size: M</p>

                                    <button
                                            type="button"
                                            class="btn btn-primary btn-sm me-1 mb-2"
                                            data-mdb-toggle="tooltip"
                                            title="Remove item"
                                    >
                                        <i class="fas fa-trash"></i>
                                    </button>
                                    <button
                                            type="button"
                                            class="btn btn-danger btn-sm mb-2"
                                            data-mdb-toggle="tooltip"
                                            title="Move to the wish list"
                                    >
                                        <i class="fas fa-heart"></i>
                                    </button>
                                    <!-- Data -->
                                </div>

                                <div class="col-lg-5 col-md-6 mb-4 mb-lg-0">
                                    <div class="row">
                                        <div class="col-4">
                                            <p style="margin-left: 40px"><strong>Số lượng</strong></p>
                                            <div class="d-flex mb-4">
                                                <button
                                                        class="btn btn-primary px-3 nut"
                                                        onclick="this.parentNode.querySelector('input[type=number]').stepDown()"
                                                >
                                                    <i class="fas fa-minus"></i>
                                                </button>

                                                <div class="form-outline">
                                                    <input
                                                            
                                                            min="0"
                                                            name="quantity"
                                                            value="1"
                                                            type="number"
                                                            class="form-control  soluong"
                                                    />
                                                </div>

                                                <button
                                                        class="btn btn-primary px-3 nut"
                                                        onclick="this.parentNode.querySelector('input[type=number]').stepUp()"
                                                >
                                                    <i class="fas fa-plus"></i>
                                                </button>
                                            </div>
                                        </div>
                                        <div class="col-4">
                                            <p><strong>Đơn giá</strong></p>
                                            <div class="form-outline">
                                                <label class="form-label" 
                                                >2.000.000</label
                                                >
                                            </div>
                                        </div>
                                        <div class="col-4">
                                            <p><strong>Thành tiền</strong></p>
                                            <div class="form-outline">
                                                <label class="form-label" 
                                                >2.000.000</label
                                                >
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- End cart trong -->
                        </div>
                    </div>
                    <!-- Các card và nội dung khác -->
                </div>
            </div>
        </section>
    </div>
    <!-- Cart End -->
<script>
    function ghct(){
        $.ajax({
            url: '/api/user/ghct/dsspttchiatheosp/'+1,
            method: 'GET',
            success: function(req) {
                var data = req.data;
                console.log(data)
                var tbody =$("#cart");
                tbody.empty();
                data.forEach(function (item){
                    item.forEach(function (sp){
                        var html =`
                        <div class="row mb-3">
                                <div class="col-lg-3 col-md-12 mb-4 mb-lg-0">
                                   <!-- Image -->
                                    <div
                                            class="bg-image hover-overlay hover-zoom ripple rounded"
                                            data-mdb-ripple-color="light"
                                    >
                                        <img
                                                src="https://mdbcdn.b-cdn.net/img/Photos/Horizontal/E-commerce/Vertical/12a.webp"
                                                class="w-100 img-cart"
                                                alt="Blue Jeans Jacket"
                                        />
                                        <a href="#!">
                                            <div
                                                    class="mask"
                                                    style="background-color: rgba(251, 251, 251, 0.2)"
                                            ></div>
                                        </a>
                                    </div>
                                    <!-- Image -->
                                </div>

                                <div class="col-lg-3 col-md-5 mb-4">
                                    <!-- Data -->
                                    <p><strong>\${sp.tenSanPham}</strong></p>
                                    <p>\${sp.tenBienThe}</p>
<!--                                    <p>Size: M</p>-->
                                    <button
                                            type="button"
                                            class="btn btn-primary btn-sm me-1 mb-2"
                                            data-mdb-toggle="tooltip"
                                            title="Remove item"
                                    >
                                        <i class="fas fa-trash"></i>
                                    </button>
                                    <button
                                            type="button"
                                            class="btn btn-danger btn-sm mb-2"
                                            data-mdb-toggle="tooltip"
                                            title="Move to the wish list"
                                    >
                                        <i class="fas fa-heart"></i>
                                    </button>
                                    <!-- Data -->
                                </div>

                                <div class="col-lg-6 col-md-6 mb-4 mb-lg-0">
                                    <div class="row">
                                        <div class="col-4">
                                            <p style="margin-left: 40px"><strong>Số lượng</strong></p>
                                            <div class="d-flex mb-4">
                                                <button
                                                        class="btn btn-primary px-3 nut"
                                                        onclick="this.parentNode.querySelector('input[type=number]').stepDown()"
                                                >
                                                    <i class="fas fa-minus"></i>
                                                </button>

                                                <div class="form-outline">
                                                    <input

                                                            min="0"
                                                            name="quantity"
                                                            value="\${sp.soLuong}"
                                                            type="number"
                                                            class="form-control  soluong"
                                                    />
                                                </div>

                                                <button
                                                        class="btn btn-primary px-3 nut"
                                                        onclick="this.parentNode.querySelector('input[type=number]').stepUp()"
                                                >
                                                    <i class="fas fa-plus"></i>
                                                </button>
                                            </div>
                                        </div>
                                        <div class="col-4">
                                            <p><strong>Đơn giá</strong></p>
                                            <div class="form-outline">
                                                <label class="form-label"
                                                >\${sp.giaTien}</label
                                                >
                                            </div>
                                        </div>
                                        <div class="col-4">
                                            <p><strong>Thành tiền</strong></p>
                                            <div class="form-outline">
                                                <label class="form-label"
                                                >\${sp.tongTien}</label
                                                >
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        `
                        tbody.append(html);
                    })
                    tbody.append('<hr class="my-4" />');
                })

            },
            error: function(xhr, status, error) {
                alert('Có lỗi xảy ra: ' + error);
            }
        });
    }

        function tongTien(){
            $.ajax({
                url: '/api/user/ghct/subtotal/'+1,
                method: 'GET',
                success: function(req) {
                    var data = req.data;
                    $("#subtotal").html(convertVND(data));
                    $("#total").html(convertVND(data))
                },
                error: function(xhr, status, error) {
                    alert('Có lỗi xảy ra: ' + error);
                }
            });

        }
  //  ghct()
    // tongTien()
        function thayDoiSoLuong(idsp,idgh,sl){
            $.ajax({
                url: '/api/user/ghct/thaydoisoluong',
                method: 'POST',
                contentType: 'application/json',
                data: JSON.stringify({
                    idGioHang :idgh,
                    idSpTT : idsp,
                    soLuong:sl
                }),
                success: function(req) {
                    ghct();
                   tongTien();
                },
                error: function(xhr, status, error) {
                    alert('Có lỗi xảy ra: ' + error);
                }
            });
        }
        $("#checkout").click(function () {
            window.location.href = "/checkout"
        })
</script>