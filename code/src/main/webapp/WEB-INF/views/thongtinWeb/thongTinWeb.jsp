<%--
  Created by IntelliJ IDEA.
  User: MMC
  Date: 10/25/2023
  Time: 11:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tất cả</title>
</head>
<body>
<div class="container-fluid pt-5">
    <div class="row">
        <div class="col-md-3">
            <div class="list-group">
                <a href="#" class="list-group-item list-group-item-action active" aria-current="true">
                    The current link item
                </a>
                <a href="#" class="list-group-item list-group-item-action">A second link item</a>
                <a href="#" class="list-group-item list-group-item-action">A third link item</a>
                <a href="#" class="list-group-item list-group-item-action">A fourth link item</a>
                <a class="list-group-item list-group-item-action disabled" aria-disabled="true">A disabled link item</a>
            </div>
        </div>
        <div class="col-md-9">
            <nav>
                <div class="nav nav-tabs" id="nav-tab" role="tablist">
                    <button class="nav-link active me-4" id="nav-all-tab" data-bs-toggle="tab" data-bs-target="#nav-all"
                            type="button" role="tab" aria-controls="nav-all" aria-selected="true">All
                    </button>
                    <button class="nav-link me-4" id="nav-chothanhtoan-tab" data-bs-toggle="tab"
                            data-bs-target="#nav-chothanhtoan"
                            type="button" role="tab" aria-controls="nav-chothanhtoan" aria-selected="false">Chờ Thanh
                        Toán
                    </button>
                    <button class="nav-link me-4" id="nav-dahuy-tab" data-bs-toggle="tab" data-bs-target="#nav-dahuy"
                            type="button"
                            role="tab" aria-controls="nav-dahuy" aria-selected="false">Đã Hủy
                    </button>
                    <button class="nav-link me-4" id="nav-damua-tab" data-bs-toggle="tab" data-bs-target="#nav-damua"
                            type="button" role="tab" aria-controls="nav-damua" aria-selected="false">Đã Mua
                    </button>
                    <button class="nav-link me-4" id="nav-danggiao-tab" data-bs-toggle="tab" data-bs-target="#nav-danggiao"
                            type="button" role="tab" aria-controls="nav-danggiao" aria-selected="false">Đang Giao
                    </button>
                    <button class="nav-link me-4" id="nav-hoanthanh-tab" data-bs-toggle="tab" data-bs-target="#nav-hoanthanh"
                            type="button" role="tab" aria-controls="nav-hoanthanh" aria-selected="false">Hoàn Thành
                    </button>
                    <button class="nav-link me-4" id="nav-vanchuyen-tab" data-bs-toggle="tab" data-bs-target="#nav-vanchuyen"
                            type="button" role="tab" aria-controls="nav-vanchuyen" aria-selected="false">Vận Chuyển
                    </button>


                </div>
            </nav>
            <div class="tab-content mt-2" id="nav-tabContent">
                <div class="tab-pane fade show active" id="nav-all" role="tabpanel" aria-labelledby="nav-all-tab"
                     tabindex="0"> Thông tin trống
                </div>
                <div class="tab-pane fade" id="nav-chothanhtoan" role="tabpanel" aria-labelledby="nav-chothanhtoan-tab"
                     tabindex="0">
                    Thông tin trống
                </div>
                <div class="tab-pane fade" id="nav-dahuy" role="tabpanel" aria-labelledby="nav-dahuy-tab" tabindex="0">
                    Thông tin trống
                </div>
                <div class="tab-pane fade" id="nav-damua" role="tabpanel" aria-labelledby="nav-damua-tab" tabindex="0">
                    Thông tin trống
                </div>
                <div class="tab-pane fade" id="nav-danggiao" role="tabpanel" aria-labelledby="nav-danggiao-tab"
                     tabindex="0">
                    Thông tin trống
                </div>
                <div class="tab-pane fade" id="nav-hoanthanh" role="tabpanel" aria-labelledby="nav-hoanthanh-tab"
                     tabindex="0">
                    Thông tin trống
                </div>
                <div class="tab-pane fade" id="nav-vanchuyen" role="tabpanel" aria-labelledby="nav-vanchuyen-tab"
                     tabindex="0">
                    Thông tin trống
                </div>
            </div>
        </div>
    </div>

</div>
</body>
</html>
