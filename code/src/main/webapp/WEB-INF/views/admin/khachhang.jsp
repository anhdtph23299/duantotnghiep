<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 9/26/2023
  Time: 11:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Khách hàng</title>
</head>
<body>
<div class="content-body">
    <div class="container-fluid">
    <h4 style="margin-top: 0;
    margin-bottom: 30px;
    border-bottom: 2px solid #FFD43B;
    padding-bottom: 10px;
    padding-left: 5px;
    color: black;">
        Danh sách thông tin khách hàng
    </h4>

    <div class="row">
        <div class="col-xl-12">
            <div class="card card-body hstack gap-3 ">
                <div class="p-2">
                    <a class="Btnaddkh" type="button" href="/admin/createKH" style="text-decoration: none">Add
                        <svg xmlns="http://www.w3.org/2000/svg" class="svg" height="1em" viewBox="0 0 448 512"><style>svg{fill:#ffffff}</style>
                            <path d="M256 80c0-17.7-14.3-32-32-32s-32 14.3-32 32V224H48c-17.7 0-32 14.3-32 32s14.3 32 32 32H192V432c0 17.7 14.3 32 32 32s32-14.3 32-32V288H400c17.7 0 32-14.3 32-32s-14.3-32-32-32H256V80z"/></svg>
                    </a>
                </div>
            </div>
        </div>
    </div>


        <div class="card">
            <div class="card-header ">

                <div class="filterEntries">
                    <div class="entries">
                        Show <select  name="" id="table_size">
                        <option value="10">10</option>
                        <option value="20">20</option>
                        <option value="50">50</option>
                        <option value="100">100</option>
                    </select> entries
                    </div>
                </div>

                <%--search--%>
                <div class="InputContainer">
                    <input type="text" name="text" class="input" id="input" placeholder="Search">

                    <label for="input" class="labelforsearch">
                        <svg viewBox="0 0 512 512" class="searchIcon"><path d="M416 208c0 45.9-14.9 88.3-40 122.7L502.6 457.4c12.5 12.5 12.5 32.8 0 45.3s-32.8 12.5-45.3 0L330.7 376c-34.4 25.2-76.8 40-122.7 40C93.1 416 0 322.9 0 208S93.1 0 208 0S416 93.1 416 208zM208 352a144 144 0 1 0 0-288 144 144 0 1 0 0 288z"></path></svg>
                    </label>
                    <div class="border"></div>

                    <button class="micButton"><svg viewBox="0 0 384 512" class="micIcon"><path d="M192 0C139 0 96 43 96 96V256c0 53 43 96 96 96s96-43 96-96V96c0-53-43-96-96-96zM64 216c0-13.3-10.7-24-24-24s-24 10.7-24 24v40c0 89.1 66.2 162.7 152 174.4V464H120c-13.3 0-24 10.7-24 24s10.7 24 24 24h72 72c13.3 0 24-10.7 24-24s-10.7-24-24-24H216V430.4c85.8-11.7 152-85.3 152-174.4V216c0-13.3-10.7-24-24-24s-24 10.7-24 24v40c0 70.7-57.3 128-128 128s-128-57.3-128-128V216z"></path></svg>
                    </button>

                </div>
            </div>
            <div class="card-body">
                <div class="">
                    <table class="table table-hover" id="tblKhachHang">
                        <thead>
                        <tr class="table-info">
                            <th>
                                <span class="custom-checkbox">
                                    <input type="checkbox" id="selectAll">
                                    <label for="selectAll"></label>
                                </span>
                            </th>
                            <th scope="col">#</th>
                            <th scope="col">MaKH</th>
                            <th scope="col">TenKH</th>
                            <th scope="col">SDT</th>
                            <th scope="col">Email</th>
                            <th scope="col">GioiTinh</th>
                            <th scope="col">NgaySinh</th>
                            <th scope="col">TrangThai</th>
                            <th scope="col">DiaChi</th>
                            <th scope="col">CCCD</th>
                            <th scope="col">MoTa</th>
                            <th scope="col">ACTION</th>
                        </tr>
                        </thead>
                        <tbody>

<%--                            <td>--%>
<%--                    <span class="custom-checkbox">--%>
<%--                        <input type="checkbox" class="checkbox" name="option[]" value="1">--%>
<%--                    </span>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <h6>1</h6>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div class="media style-1">--%>
<%--                                    <img src="/template/admin/images/avatar/1.jpg" style="border-radius: 50%" class="img-fluid mr-2" alt="">--%>
<%--                                    <div class="media-body">--%>
<%--                                        <h6>John Doe</h6>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div>--%>
<%--                                    <h6>England</h6>--%>
<%--                                    <span>COde:En</span>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div>--%>
<%--                                    <h6 class="text-primary">10/21/2016</h6>--%>
<%--                                    <span>Paid</span>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                Abbott-Jacobs--%>
<%--                            </td>--%>
<%--                            <td><span class="badge badge-warning">Pending</span></td>--%>
<%--                            <td>--%>
<%--                                <a type="button" class="btn btn-warning" href="/admin/updateKH" style="text-decoration: none">--%>
<%--                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">--%>
<%--                                        <path d="M17 3C17.2626 2.73735 17.5744 2.52901 17.9176 2.38687C18.2608 2.24473 18.6286 2.17157 19 2.17157C19.3714 2.17157 19.7392 2.24473 20.0824 2.38687C20.4256 2.52901 20.7374 2.73735 21 3C21.2626 3.26264 21.471 3.57444 21.6131 3.9176C21.7553 4.26077 21.8284 4.62856 21.8284 5C21.8284 5.37143 21.7553 5.73923 21.6131 6.08239C21.471 6.42555 21.2626 6.73735 21 7L7.5 20.5L2 22L3.5 16.5L17 3Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>&ndash;%&gt;--%>
<%--                                    </svg>--%>
<%--                                </a>--%>


<%--                                <!-- Button trigger modal -->--%>
<%--                                <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#kkkk">--%>
<%--                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">--%>
<%--                                        <path d="M3 6H5H21" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
<%--                                        <path d="M8 6V4C8 3.46957 8.21071 2.96086 8.58579 2.58579C8.96086 2.21071 9.46957 2 10 2H14C14.5304 2 15.0391 2.21071 15.4142 2.58579C15.7893 2.96086 16 3.46957 16 4V6M19 6V20C19 20.5304 18.7893 21.0391 18.4142 21.4142C18.0391 21.7893 17.5304 22 17 22H7C6.46957 22 5.96086 21.7893 5.58579 21.4142C5.21071 21.0391 5 20.5304 5 20V6H19Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
<%--                                    </svg>--%>
<%--                                </button>--%>

<%--                                <!-- Modal -->--%>
<%--                                <div class="modal" id="kkkk" tabindex="-1" aria-labelledby="remove" aria-hidden="true">--%>
<%--                                    <div class="modal-dialog">--%>
<%--                                        <div class="modal-content">--%>
<%--                                            <div class="modal-header">--%>
<%--                                                <h1 class="modal-title  fs-5" id="remove">Delete Customer</h1>--%>
<%--                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--                                            </div>--%>
<%--                                            <div class="modal-body">--%>
<%--                                                <h5 class="text-secondary">Are You Sure You Want To Delete This Records</h5>--%>
<%--                                                <p class="text-danger"><small>This Action Cannot Be Undone</small></p>--%>
<%--                                            </div>--%>
<%--                                            <div class="modal-footer">--%>
<%--                                                <button type="button" class="btn btn-default" data-bs-dismiss="modal">Cancel</button>--%>
<%--                                                <button type="button" class="btn btn-danger">Delete</button>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                        </tr>--%>
<%--                        <tr>--%>
<%--                            <td>--%>
<%--																		<span class="custom-checkbox">--%>
<%--																		<input type="checkbox" class="checkbox" name="option[]" value="2">--%>
<%--																		</span>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <h6>2</h6>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div class="media style-1">--%>
<%--                                    <span class="icon-name mr-2 bgl-success text-success" style="border-radius: 50%">m</span>--%>
<%--                                    <div class="media-body">--%>
<%--                                        <h6>Martin Chuaks</h6>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div>--%>
<%--                                    <h6>Indonasia</h6>--%>
<%--                                    <span>COde:In</span>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div>--%>
<%--                                    <h6 class="text-primary">05/11/2016</h6>--%>
<%--                                    <span>Pending</span>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                Loyto-Farik--%>
<%--                            </td>--%>
<%--                            <td><span class="badge badge-danger">Danger</span></td>--%>
<%--                            <td>--%>
<%--                                <button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#staticBackdrop">--%>
<%--                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">--%>
<%--                                        <path d="M17 3C17.2626 2.73735 17.5744 2.52901 17.9176 2.38687C18.2608 2.24473 18.6286 2.17157 19 2.17157C19.3714 2.17157 19.7392 2.24473 20.0824 2.38687C20.4256 2.52901 20.7374 2.73735 21 3C21.2626 3.26264 21.471 3.57444 21.6131 3.9176C21.7553 4.26077 21.8284 4.62856 21.8284 5C21.8284 5.37143 21.7553 5.73923 21.6131 6.08239C21.471 6.42555 21.2626 6.73735 21 7L7.5 20.5L2 22L3.5 16.5L17 3Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>&ndash;%&gt;--%>
<%--                                    </svg>--%>
<%--                                </button>--%>

<%--                                <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">--%>
<%--                                    <div class="modal-dialog">--%>
<%--                                        <div class="modal-content">--%>
<%--                                            <div class="modal-header">--%>
<%--                                                <h1 class="modal-title fs-5" id="staticBackdropLabel">Sửa thông tin khách hàng</h1>--%>
<%--                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--                                            </div>--%>
<%--                                            <div class="modal-body">--%>
<%--                                                <form>--%>
<%--                                                    <div class="row">--%>
<%--                                                        <div class="col">--%>
<%--                                                            <input type="text" class="form-control" placeholder="Mã khách hàng:">--%>
<%--                                                        </div>--%>
<%--                                                        <div class="col">--%>
<%--                                                            <input type="text" class="form-control" placeholder="Họ và tên:">--%>
<%--                                                        </div>--%>
<%--                                                    </div>--%>

<%--                                                    <div class="row mt-3">--%>
<%--                                                        <div class="col">--%>
<%--                                                            <input type="text" class="form-control" placeholder="CCCD:">--%>
<%--                                                        </div>--%>
<%--                                                        <div class="col">--%>
<%--                                                            <input type="text" class="form-control" placeholder="Số điện thoại:">--%>
<%--                                                        </div>--%>
<%--                                                    </div>--%>

<%--                                                    <div class="row mt-3">--%>
<%--                                                        <div class="col">--%>
<%--                                                            <input type="email" class="form-control" placeholder="Email:">--%>
<%--                                                        </div>--%>
<%--                                                        <div class="col">--%>
<%--                                                            <input type="text" class="form-control" placeholder="Địa chỉ:">--%>
<%--                                                        </div>--%>
<%--                                                    </div>--%>

<%--                                                    <div class="row mt-3">--%>
<%--                                                        <div class="col">--%>
<%--                                                            <label for="datepicker" class="form-label">Ngày sinh</label>--%>
<%--                                                            <input type="date" class="form-control" id="datepicker">--%>
<%--                                                        </div>--%>
<%--                                                        <div class="col">--%>
<%--                                                            <div class="row">--%>
<%--                                                                <h6>Giới tính</h6>--%>
<%--                                                            </div>--%>

<%--                                                            <div class="row">--%>
<%--                                                                <div class="col">--%>
<%--                                                                    <div class="form-check form-check-inline">--%>
<%--                                                                        <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">--%>
<%--                                                                        <label class="form-check-label" for="inlineRadio1">Nam</label>--%>
<%--                                                                    </div>--%>
<%--                                                                    <div class="form-check form-check-inline">--%>
<%--                                                                        <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">--%>
<%--                                                                        <label class="form-check-label" for="inlineRadio2">Nữ</label>--%>
<%--                                                                    </div>--%>
<%--                                                                </div>--%>
<%--                                                            </div>--%>
<%--                                                        </div>--%>

<%--                                                        <div class="row mt-3">--%>
<%--                                                            <div class="col">--%>
<%--                                                                <div class="form-floating">--%>
<%--                                                                    <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea"></textarea>--%>
<%--                                                                    <label for="floatingTextarea">Mô tả</label>--%>
<%--                                                                </div>--%>
<%--                                                            </div>--%>
<%--                                                        </div>--%>
<%--                                                    </div>--%>
<%--                                                </form>--%>
<%--                                            </div>--%>
<%--                                            <div class="modal-footer">--%>
<%--                                                <button type="button" class="btn btn-warning">Update</button>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <a href="javascript:void(0);" class="ml-2 btn btn-xs px-2  btn-danger">--%>
<%--                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">--%>
<%--                                        <path d="M3 6H5H21" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
<%--                                        <path d="M8 6V4C8 3.46957 8.21071 2.96086 8.58579 2.58579C8.96086 2.21071 9.46957 2 10 2H14C14.5304 2 15.0391 2.21071 15.4142 2.58579C15.7893 2.96086 16 3.46957 16 4V6M19 6V20C19 20.5304 18.7893 21.0391 18.4142 21.4142C18.0391 21.7893 17.5304 22 17 22H7C6.46957 22 5.96086 21.7893 5.58579 21.4142C5.21071 21.0391 5 20.5304 5 20V6H19Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
<%--                                    </svg>--%>
<%--                                </a>--%>
<%--                            </td>--%>
<%--                        </tr>--%>
<%--                        <tr>--%>
<%--                            <td>--%>
<%--								<span class="custom-checkbox">--%>
<%--                        <input type="checkbox" class="checkbox" name="option[]" value="3">--%>
<%--                    </span>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <h6>3</h6>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div class="media style-1">--%>
<%--                                    <img src="/template/admin/images/avatar/2.jpg" style="border-radius: 50%" class="img-fluid mr-2" alt="">--%>
<%--                                    <div class="media-body">--%>
<%--                                        <h6>Oliver Jean</h6>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div>--%>
<%--                                    <h6>Malesia</h6>--%>
<%--                                    <span>COde:Ml</span>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div>--%>
<%--                                    <h6 class="text-primary">08/15/2016</h6>--%>
<%--                                    <span>Paid</span>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                Uno-Matrics--%>
<%--                            </td>--%>
<%--                            <td><span class="badge badge-info">Info</span></td>--%>
<%--                            <td>--%>
<%--                                <button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#staticBackdrop">--%>
<%--                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">--%>
<%--                                        <path d="M17 3C17.2626 2.73735 17.5744 2.52901 17.9176 2.38687C18.2608 2.24473 18.6286 2.17157 19 2.17157C19.3714 2.17157 19.7392 2.24473 20.0824 2.38687C20.4256 2.52901 20.7374 2.73735 21 3C21.2626 3.26264 21.471 3.57444 21.6131 3.9176C21.7553 4.26077 21.8284 4.62856 21.8284 5C21.8284 5.37143 21.7553 5.73923 21.6131 6.08239C21.471 6.42555 21.2626 6.73735 21 7L7.5 20.5L2 22L3.5 16.5L17 3Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>&ndash;%&gt;--%>
<%--                                    </svg>--%>
<%--                                </button>--%>

<%--                                <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">--%>
<%--                                    <div class="modal-dialog">--%>
<%--                                        <div class="modal-content">--%>
<%--                                            <div class="modal-header">--%>
<%--                                                <h1 class="modal-title fs-5" id="staticBackdropLabel">Modal title</h1>--%>
<%--                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--                                            </div>--%>
<%--                                            <div class="modal-body">--%>
<%--                                                hello--%>
<%--                                            </div>--%>
<%--                                            <div class="modal-footer">--%>
<%--                                                <button type="button" class="btn btn-warning">Update</button>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <a href="javascript:void(0);" class="ml-2 btn btn-xs px-2  btn-danger">--%>
<%--                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">--%>
<%--                                        <path d="M3 6H5H21" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
<%--                                        <path d="M8 6V4C8 3.46957 8.21071 2.96086 8.58579 2.58579C8.96086 2.21071 9.46957 2 10 2H14C14.5304 2 15.0391 2.21071 15.4142 2.58579C15.7893 2.96086 16 3.46957 16 4V6M19 6V20C19 20.5304 18.7893 21.0391 18.4142 21.4142C18.0391 21.7893 17.5304 22 17 22H7C6.46957 22 5.96086 21.7893 5.58579 21.4142C5.21071 21.0391 5 20.5304 5 20V6H19Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
<%--                                    </svg>--%>
<%--                                </a>--%>
<%--                            </td>--%>
<%--                        </tr>--%>
<%--                        <tr>--%>
<%--                            <td><span class="custom-checkbox">--%>
<%--                        <input type="checkbox" class="checkbox" name="option[]" value="4">--%>
<%--                    </span>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <h6>4</h6>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div class="media style-1">--%>
<%--                                    <img src="/template/admin/images/avatar/3.jpg" style="border-radius: 50%" class="img-fluid mr-2" alt="">--%>
<%--                                    <div class="media-body">--%>
<%--                                        <h6>John Doe</h6>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div>--%>
<%--                                    <h6>England</h6>--%>
<%--                                    <span>COde:En</span>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div>--%>
<%--                                    <h6 class="text-primary">11/05/2016</h6>--%>
<%--                                    <span>Paid</span>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                Walter-Cummings--%>
<%--                            </td>--%>
<%--                            <td><span class="badge badge-success">Success</span></td>--%>
<%--                            <td>--%>
<%--                                <button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#staticBackdrop">--%>
<%--                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">--%>
<%--                                        <path d="M17 3C17.2626 2.73735 17.5744 2.52901 17.9176 2.38687C18.2608 2.24473 18.6286 2.17157 19 2.17157C19.3714 2.17157 19.7392 2.24473 20.0824 2.38687C20.4256 2.52901 20.7374 2.73735 21 3C21.2626 3.26264 21.471 3.57444 21.6131 3.9176C21.7553 4.26077 21.8284 4.62856 21.8284 5C21.8284 5.37143 21.7553 5.73923 21.6131 6.08239C21.471 6.42555 21.2626 6.73735 21 7L7.5 20.5L2 22L3.5 16.5L17 3Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>&ndash;%&gt;--%>
<%--                                    </svg>--%>
<%--                                </button>--%>

<%--                                <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">--%>
<%--                                    <div class="modal-dialog">--%>
<%--                                        <div class="modal-content">--%>
<%--                                            <div class="modal-header">--%>
<%--                                                <h1 class="modal-title fs-5" id="staticBackdropLabel">Modal title</h1>--%>
<%--                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--                                            </div>--%>
<%--                                            <div class="modal-body">--%>
<%--                                                hello--%>
<%--                                            </div>--%>
<%--                                            <div class="modal-footer">--%>
<%--                                                <button type="button" class="btn btn-warning">Update</button>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <a href="javascript:void(0);" class="ml-2 btn btn-xs px-2  btn-danger">--%>
<%--                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">--%>
<%--                                        <path d="M3 6H5H21" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
<%--                                        <path d="M8 6V4C8 3.46957 8.21071 2.96086 8.58579 2.58579C8.96086 2.21071 9.46957 2 10 2H14C14.5304 2 15.0391 2.21071 15.4142 2.58579C15.7893 2.96086 16 3.46957 16 4V6M19 6V20C19 20.5304 18.7893 21.0391 18.4142 21.4142C18.0391 21.7893 17.5304 22 17 22H7C6.46957 22 5.96086 21.7893 5.58579 21.4142C5.21071 21.0391 5 20.5304 5 20V6H19Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
<%--                                    </svg>--%>
<%--                                </a>--%>
<%--                            </td>--%>
<%--                        </tr>--%>
<%--                        <tr>--%>
<%--                            <td>--%>
<%--							<span class="custom-checkbox">--%>
<%--                        <input type="checkbox" class="checkbox" name="option[]" value="5">--%>
<%--                    </span>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <h6>5</h6>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div class="media style-1">--%>
<%--                                    <span class="icon-name mr-2 bgl-info text-info" style="border-radius: 50%">p</span>--%>
<%--                                    <div class="media-body">--%>
<%--                                        <h6>Post Melone</h6>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div>--%>
<%--                                    <h6>China</h6>--%>
<%--                                    <span>COde:Ch</span>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                <div>--%>
<%--                                    <h6 class="text-primary">10/21/2016</h6>--%>
<%--                                    <span>Approved</span>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                            <td>--%>
<%--                                Abbott-Jacobs--%>
<%--                            </td>--%>
<%--                            <td><span class="badge badge-danger">Danger</span></td>--%>
<%--                            <td>--%>
<%--                                <button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#staticBackdrop">--%>
<%--                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">--%>
<%--                                        <path d="M17 3C17.2626 2.73735 17.5744 2.52901 17.9176 2.38687C18.2608 2.24473 18.6286 2.17157 19 2.17157C19.3714 2.17157 19.7392 2.24473 20.0824 2.38687C20.4256 2.52901 20.7374 2.73735 21 3C21.2626 3.26264 21.471 3.57444 21.6131 3.9176C21.7553 4.26077 21.8284 4.62856 21.8284 5C21.8284 5.37143 21.7553 5.73923 21.6131 6.08239C21.471 6.42555 21.2626 6.73735 21 7L7.5 20.5L2 22L3.5 16.5L17 3Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>&ndash;%&gt;--%>
<%--                                    </svg>--%>
<%--                                </button>--%>

<%--                                <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">--%>
<%--                                    <div class="modal-dialog">--%>
<%--                                        <div class="modal-content">--%>
<%--                                            <div class="modal-header">--%>
<%--                                                <h1 class="modal-title fs-5" id="staticBackdropLabel">Modal title</h1>--%>
<%--                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--                                            </div>--%>
<%--                                            <div class="modal-body">--%>
<%--                                                hello--%>
<%--                                            </div>--%>
<%--                                            <div class="modal-footer">--%>
<%--                                                <button type="button" class="btn btn-warning">Update</button>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <a href="javascript:void(0);" class="ml-2 btn btn-xs px-2  btn-danger">--%>
<%--                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">--%>
<%--                                        <path d="M3 6H5H21" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
<%--                                        <path d="M8 6V4C8 3.46957 8.21071 2.96086 8.58579 2.58579C8.96086 2.21071 9.46957 2 10 2H14C14.5304 2 15.0391 2.21071 15.4142 2.58579C15.7893 2.96086 16 3.46957 16 4V6M19 6V20C19 20.5304 18.7893 21.0391 18.4142 21.4142C18.0391 21.7893 17.5304 22 17 22H7C6.46957 22 5.96086 21.7893 5.58579 21.4142C5.21071 21.0391 5 20.5304 5 20V6H19Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
<%--                                    </svg>--%>
<%--                                </a>--%>
<%--                            </td>--%>
<%--                        </tr>--%>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="card-footer d-flex justify-content-between">
                <h6 class="mt-3">Showing 1 to 10 of 50 entries</h6>
                <nav class="mt-2">
                    <ul class="pagination pagination-gutter pagination-primary  no-bg">
                        <li class="page-item page-indicator">
                            <a class="page-link" href="javascript:void(0)">
                                <i class="la la-angle-left"></i></a>
                        </li>
                        <li class="page-item "><a class="page-link" href="javascript:void(0)">1</a>
                        </li>
                        <li class="page-item active"><a class="page-link" href="javascript:void(0)">2</a></li>
                        <li class="page-item"><a class="page-link" href="javascript:void(0)">3</a></li>
                        <li class="page-item"><a class="page-link" href="javascript:void(0)">4</a></li>
                        <li class="page-item page-indicator">
                            <a class="page-link" href="javascript:void(0)">
                                <i class="la la-angle-right"></i></a>
                        </li>
                    </ul>
                </nav>
            </div>

        </div>
    </div>
</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script >

    $("#them").click(function (){
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

        $.ajax({
            url: '/api/admin/khachhang/insert',
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify({
                maKH: maKH,
                tenKH: tenKH,
                sdt: sdt,
                email: email,
                gioiTinh:  gioiTinh,
                ngaySinh: ngaySinh,
                trangThai: trangThai,
                diaChi: diaChi,
                cccd: cccd,
                moTa: moTa
            }),
            success: function(response) {
                loadKhachHang()
            },
            error: function(xhr, status, error) {
                alert('Có lỗi xảy ra: ' + error);
            }
        });
    })
    function loadKhachHang(){
        $.ajax({
            url: '/api/admin/khachhang',
            method: 'GET',
            success: function(req) {
                console.log(req.data);
                var tbody = $('#tblKhachHang tbody');
                tbody.empty();
                req.data.forEach(function(item) {
                    var row = `
                            <tr>
                                <td>
                                   <span class="custom-checkbox">
                                        <input type="checkbox" class="checkbox" name="option[]" value="1">
                                   </span>
                                </td>
                                <td>${index + 1}</td>
                                <td>\${item.maKH}</td>
                                 <td>\${item.tenKH}</td>
                                 <td>\${item.sdt}</td>
                                 <td>\${item.email}</td>
                                 <td>\${item.gioiTinh == true ? "Nam": "Nữ"}</td>
                                 <td>\${item.ngaySinh}</td>
                                 <td>\${item.trangThai}</td>
                                 <td>\${item.diaChi}</td>
                                 <td>\${item.cccd}</td>
                                 <td>\${item.moTa}</td>
                                 <td>
                                     <a type="button" class="btn btn-warning" href="/admin/updateKH" style="text-decoration: none">
                                        <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                                          <path d="M17 3C17.2626 2.73735 17.5744 2.52901 17.9176 2.38687C18.2608 2.24473 18.6286 2.17157 19 2.17157C19.3714 2.17157 19.7392 2.24473 20.0824 2.38687C20.4256 2.52901 20.7374 2.73735 21 3C21.2626 3.26264 21.471 3.57444 21.6131 3.9176C21.7553 4.26077 21.8284 4.62856 21.8284 5C21.8284 5.37143 21.7553 5.73923 21.6131 6.08239C21.471 6.42555 21.2626 6.73735 21 7L7.5 20.5L2 22L3.5 16.5L17 3Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>&ndash;%&gt;
                                        </svg>
                                    </a>
                                    <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#kkkk" >
                                       <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                                           <path d="M3 6H5H21" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                           <path d="M8 6V4C8 3.46957 8.21071 2.96086 8.58579 2.58579C8.96086 2.21071 9.46957 2 10 2H14C14.5304 2 15.0391 2.21071 15.4142 2.58579C15.7893 2.96086 16 3.46957 16 4V6M19 6V20C19 20.5304 18.7893 21.0391 18.4142 21.4142C18.0391 21.7893 17.5304 22 17 22H7C6.46957 22 5.96086 21.7893 5.58579 21.4142C5.21071 21.0391 5 20.5304 5 20V6H19Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                       </svg>
                                   </button>
                                   <div class="modal" id="kkkk" tabindex="-1" aria-labelledby="remove" aria-hidden="true">
                                                              <div class="modal-dialog">
                                                                <div class="modal-content">
                                                                  <div class="modal-header">
                                                                      <h1 class="modal-title  fs-5" id="remove">Delete Customer</h1>
                                                                      <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                                  </div>
                                                                    <div class="modal-body">
                                                                           <h5 class="text-secondary">Are You Sure You Want To Delete This Records</h5>
                                                                           <p class="text-danger"><small>This Action Cannot Be Undone</small></p>
                                                                    </div>
                                                                    <div class="modal-footer">
                                                                           <button type="button" class="btn btn-default" data-bs-dismiss="modal">Cancel</button>
                                                                           <button type="button" class="btn btn-danger" onclick="Delete(\${item.id})">Delete</button>
                                                                    </div>
                                                                    </div>
                                                               </div>
                                   </div>
                                 </td>
                            </tr>
                        `;
                    tbody.append(row);
                });
            },
            error: function(xhr, status, error) {
                alert('Có lỗi xảy ra: ' + error);
            }
        });
    }

    loadKhachHang()

    function Delete(id){
        $.ajax({
            url: '/api/admin/khachhang/delete/'+id,
            method: 'DELETE',
            success: function(req) {
                alert(req);
                loadKhachHang()
            },
            error: function(xhr, status, error) {
                alert('Có lỗi xảy ra: ' + error);
            }
        });
    }
</script>
</body>
</html>
