<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 10/5/2023
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Setting</title>
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
            Setting
        </h4>

        <button class="btn btn-info" type="button" data-bs-toggle="collapse" data-bs-target="#collapseExample1" aria-expanded="false" aria-controls="collapseExample1">
           Profile
        </button>
        <div class="collapse" id="collapseExample1">
            <div class="card card-body">
                <div class="table-responsive">
                    <form>
                        <div class="row">
                            <div class="col">
                                <label>Mã khách hàng:</label>
                                <input type="text" class="form-control" >
                            </div>
                            <div class="col">
                                <label>Họ và tên:</label>
                                <input type="text" class="form-control" >
                            </div>
                        </div>

                        <div class="row mt-3">
                            <div class="col">
                                <label>Số CCCD:</label>
                                <input type="text" class="form-control" >
                            </div>
                            <div class="col">
                                <label>Số điện thoại:</label>
                                <input type="text" class="form-control" >
                            </div>
                        </div>

                        <div class="row mt-3">
                            <div class="col">
                                <label>Địa chỉ email:</label>
                                <input type="email" class="form-control" >
                            </div>
                            <div class="col">
                                <label>Địa chỉ:</label>
                                <input type="text" class="form-control" >
                            </div>
                        </div>

                        <div class="row mt-3">
                            <div class="col">
                                <label for="datepicker" class="form-label">Ngày sinh:</label>
                                <input type="date" class="form-control" id="datepicker">
                            </div>
                            <div class="col">
                                <label>Giới tính:</label>
                                <select class="form-select">
                                    <option value="Nam" selected>Nam</option>
                                    <option value="Nữ">Nữ</option>
                                </select>
                            </div>

                            <div class="row mt-3">
                                <div class="col">
                                    <div class="form-floating">
                                        <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea"></textarea>
                                        <label for="floatingTextarea">Mô tả</label>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="row mt-3">
                            <div class="col">
                                <button class="btn" style="background-color: #A6edab; color: #00852d">Add</button>
                                <button class="btn ms-2" style="background-color: #FFc5c4; color: #be2329">Cancel</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <button class="btn btn-primary" type="button" data-bs-toggle="collapse" data-bs-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
            Personnel Information
        </button>
        <div class="collapse" id="collapseExample">
            <div class="card card-body">
                <div class="table-responsive">
                    <table class="table table-hover style-1" id="ListDatatableView">
                        <thead>
                        <tr class="table-info">
                            <th>
                        <span class="custom-checkbox">
                            <input type="checkbox" id="selectAll">
                            <label for="selectAll"></label>
                        </span>
                            </th>
                            <th scope="col">No</th>
                            <th scope="col">CUSTOMER</th>
                            <th scope="col">COUNTRY</th>
                            <th scope="col">DATE</th>
                            <th scope="col">COMPANY NAME</th>
                            <th scope="col">STATUS</th>
                            <th scope="col">ACTION</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>
                        <span class="custom-checkbox">
                            <input type="checkbox" class="checkbox" name="option[]" value="1">
                        </span>
                            </td>
                            <td>
                                <h6>1</h6>
                            </td>
                            <td>
                                <div class="media style-1">
                                    <img src="/template/admin/images/avatar/1.jpg" style="border-radius: 50%" class="img-fluid mr-2" alt="">
                                    <div class="media-body">
                                        <h6>John Doe</h6>
                                    </div>
                                </div>
                            </td>
                            <td>
                                <div>
                                    <h6>England</h6>
                                    <span>COde:En</span>
                                </div>
                            </td>
                            <td>
                                <div>
                                    <h6 class="text-primary">10/21/2016</h6>
                                    <span>Paid</span>
                                </div>
                            </td>
                            <td>
                                Abbott-Jacobs
                            </td>
                            <td><span class="badge badge-warning">Pending</span></td>
                            <td>
                                <a type="button" class="btn btn-warning" href="/admin/dashboards/updateKH" style="text-decoration: none">
                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                                        <path d="M17 3C17.2626 2.73735 17.5744 2.52901 17.9176 2.38687C18.2608 2.24473 18.6286 2.17157 19 2.17157C19.3714 2.17157 19.7392 2.24473 20.0824 2.38687C20.4256 2.52901 20.7374 2.73735 21 3C21.2626 3.26264 21.471 3.57444 21.6131 3.9176C21.7553 4.26077 21.8284 4.62856 21.8284 5C21.8284 5.37143 21.7553 5.73923 21.6131 6.08239C21.471 6.42555 21.2626 6.73735 21 7L7.5 20.5L2 22L3.5 16.5L17 3Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
                                    </svg>
                                </a>


                                <!-- Button trigger modal -->
                                <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#kkkk">
                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                                        <path d="M3 6H5H21" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                        <path d="M8 6V4C8 3.46957 8.21071 2.96086 8.58579 2.58579C8.96086 2.21071 9.46957 2 10 2H14C14.5304 2 15.0391 2.21071 15.4142 2.58579C15.7893 2.96086 16 3.46957 16 4V6M19 6V20C19 20.5304 18.7893 21.0391 18.4142 21.4142C18.0391 21.7893 17.5304 22 17 22H7C6.46957 22 5.96086 21.7893 5.58579 21.4142C5.21071 21.0391 5 20.5304 5 20V6H19Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                    </svg>
                                </button>

                                <!-- Modal -->
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
                                                <button type="button" class="btn btn-danger">Delete</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                                                            <span class="custom-checkbox">
                                                                            <input type="checkbox" class="checkbox" name="option[]" value="2">
                                                                            </span>
                            </td>
                            <td>
                                <h6>2</h6>
                            </td>
                            <td>
                                <div class="media style-1">
                                    <span class="icon-name mr-2 bgl-success text-success" style="border-radius: 50%">m</span>
                                    <div class="media-body">
                                        <h6>Martin Chuaks</h6>
                                    </div>
                                </div>
                            </td>
                            <td>
                                <div>
                                    <h6>Indonasia</h6>
                                    <span>COde:In</span>
                                </div>
                            </td>
                            <td>
                                <div>
                                    <h6 class="text-primary">05/11/2016</h6>
                                    <span>Pending</span>
                                </div>
                            </td>
                            <td>
                                Loyto-Farik
                            </td>
                            <td><span class="badge badge-danger">Danger</span></td>
                            <td>
                                <button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                                        <path d="M17 3C17.2626 2.73735 17.5744 2.52901 17.9176 2.38687C18.2608 2.24473 18.6286 2.17157 19 2.17157C19.3714 2.17157 19.7392 2.24473 20.0824 2.38687C20.4256 2.52901 20.7374 2.73735 21 3C21.2626 3.26264 21.471 3.57444 21.6131 3.9176C21.7553 4.26077 21.8284 4.62856 21.8284 5C21.8284 5.37143 21.7553 5.73923 21.6131 6.08239C21.471 6.42555 21.2626 6.73735 21 7L7.5 20.5L2 22L3.5 16.5L17 3Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
                                    </svg>
                                </button>

                                <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h1 class="modal-title fs-5" id="staticBackdropLabel">Sửa thông tin khách hàng</h1>
                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                            </div>
                                            <div class="modal-body">
                                                <form>
                                                    <div class="row">
                                                        <div class="col">
                                                            <input type="text" class="form-control" placeholder="Mã khách hàng:">
                                                        </div>
                                                        <div class="col">
                                                            <input type="text" class="form-control" placeholder="Họ và tên:">
                                                        </div>
                                                    </div>

                                                    <div class="row mt-3">
                                                        <div class="col">
                                                            <input type="text" class="form-control" placeholder="CCCD:">
                                                        </div>
                                                        <div class="col">
                                                            <input type="text" class="form-control" placeholder="Số điện thoại:">
                                                        </div>
                                                    </div>

                                                    <div class="row mt-3">
                                                        <div class="col">
                                                            <input type="email" class="form-control" placeholder="Email:">
                                                        </div>
                                                        <div class="col">
                                                            <input type="text" class="form-control" placeholder="Địa chỉ:">
                                                        </div>
                                                    </div>

                                                    <div class="row mt-3">
                                                        <div class="col">
                                                            <label for="datepicker" class="form-label">Ngày sinh</label>
                                                            <input type="date" class="form-control" id="datepicker">
                                                        </div>
                                                        <div class="col">
                                                            <div class="row">
                                                                <h6>Giới tính</h6>
                                                            </div>

                                                            <div class="row">
                                                                <div class="col">
                                                                    <div class="form-check form-check-inline">
                                                                        <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
                                                                        <label class="form-check-label" for="inlineRadio1">Nam</label>
                                                                    </div>
                                                                    <div class="form-check form-check-inline">
                                                                        <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
                                                                        <label class="form-check-label" for="inlineRadio2">Nữ</label>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="row mt-3">
                                                            <div class="col">
                                                                <div class="form-floating">
                                                                    <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea"></textarea>
                                                                    <label for="floatingTextarea">Mô tả</label>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </form>
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-warning">Update</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <a href="javascript:void(0);" class="ml-2 btn btn-xs px-2  btn-danger">
                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                                        <path d="M3 6H5H21" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                        <path d="M8 6V4C8 3.46957 8.21071 2.96086 8.58579 2.58579C8.96086 2.21071 9.46957 2 10 2H14C14.5304 2 15.0391 2.21071 15.4142 2.58579C15.7893 2.96086 16 3.46957 16 4V6M19 6V20C19 20.5304 18.7893 21.0391 18.4142 21.4142C18.0391 21.7893 17.5304 22 17 22H7C6.46957 22 5.96086 21.7893 5.58579 21.4142C5.21071 21.0391 5 20.5304 5 20V6H19Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                    </svg>
                                </a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                    <span class="custom-checkbox">
                            <input type="checkbox" class="checkbox" name="option[]" value="3">
                        </span>
                            </td>
                            <td>
                                <h6>3</h6>
                            </td>
                            <td>
                                <div class="media style-1">
                                    <img src="/template/admin/images/avatar/2.jpg" style="border-radius: 50%" class="img-fluid mr-2" alt="">
                                    <div class="media-body">
                                        <h6>Oliver Jean</h6>
                                    </div>
                                </div>
                            </td>
                            <td>
                                <div>
                                    <h6>Malesia</h6>
                                    <span>COde:Ml</span>
                                </div>
                            </td>
                            <td>
                                <div>
                                    <h6 class="text-primary">08/15/2016</h6>
                                    <span>Paid</span>
                                </div>
                            </td>
                            <td>
                                Uno-Matrics
                            </td>
                            <td><span class="badge badge-info">Info</span></td>
                            <td>
                                <button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                                        <path d="M17 3C17.2626 2.73735 17.5744 2.52901 17.9176 2.38687C18.2608 2.24473 18.6286 2.17157 19 2.17157C19.3714 2.17157 19.7392 2.24473 20.0824 2.38687C20.4256 2.52901 20.7374 2.73735 21 3C21.2626 3.26264 21.471 3.57444 21.6131 3.9176C21.7553 4.26077 21.8284 4.62856 21.8284 5C21.8284 5.37143 21.7553 5.73923 21.6131 6.08239C21.471 6.42555 21.2626 6.73735 21 7L7.5 20.5L2 22L3.5 16.5L17 3Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
                                    </svg>
                                </button>

                                <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h1 class="modal-title fs-5" id="staticBackdropLabel">Modal title</h1>
                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                            </div>
                                            <div class="modal-body">
                                                hello
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-warning">Update</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <a href="javascript:void(0);" class="ml-2 btn btn-xs px-2  btn-danger">
                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                                        <path d="M3 6H5H21" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                        <path d="M8 6V4C8 3.46957 8.21071 2.96086 8.58579 2.58579C8.96086 2.21071 9.46957 2 10 2H14C14.5304 2 15.0391 2.21071 15.4142 2.58579C15.7893 2.96086 16 3.46957 16 4V6M19 6V20C19 20.5304 18.7893 21.0391 18.4142 21.4142C18.0391 21.7893 17.5304 22 17 22H7C6.46957 22 5.96086 21.7893 5.58579 21.4142C5.21071 21.0391 5 20.5304 5 20V6H19Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                    </svg>
                                </a>
                            </td>
                        </tr>
                        <tr>
                            <td><span class="custom-checkbox">
                            <input type="checkbox" class="checkbox" name="option[]" value="4">
                        </span>
                            </td>
                            <td>
                                <h6>4</h6>
                            </td>
                            <td>
                                <div class="media style-1">
                                    <img src="/template/admin/images/avatar/3.jpg" style="border-radius: 50%" class="img-fluid mr-2" alt="">
                                    <div class="media-body">
                                        <h6>John Doe</h6>
                                    </div>
                                </div>
                            </td>
                            <td>
                                <div>
                                    <h6>England</h6>
                                    <span>COde:En</span>
                                </div>
                            </td>
                            <td>
                                <div>
                                    <h6 class="text-primary">11/05/2016</h6>
                                    <span>Paid</span>
                                </div>
                            </td>
                            <td>
                                Walter-Cummings
                            </td>
                            <td><span class="badge badge-success">Success</span></td>
                            <td>
                                <button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                                        <path d="M17 3C17.2626 2.73735 17.5744 2.52901 17.9176 2.38687C18.2608 2.24473 18.6286 2.17157 19 2.17157C19.3714 2.17157 19.7392 2.24473 20.0824 2.38687C20.4256 2.52901 20.7374 2.73735 21 3C21.2626 3.26264 21.471 3.57444 21.6131 3.9176C21.7553 4.26077 21.8284 4.62856 21.8284 5C21.8284 5.37143 21.7553 5.73923 21.6131 6.08239C21.471 6.42555 21.2626 6.73735 21 7L7.5 20.5L2 22L3.5 16.5L17 3Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
                                    </svg>
                                </button>

                                <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h1 class="modal-title fs-5" id="staticBackdropLabel">Modal title</h1>
                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                            </div>
                                            <div class="modal-body">
                                                hello
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-warning">Update</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <a href="javascript:void(0);" class="ml-2 btn btn-xs px-2  btn-danger">
                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                                        <path d="M3 6H5H21" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                        <path d="M8 6V4C8 3.46957 8.21071 2.96086 8.58579 2.58579C8.96086 2.21071 9.46957 2 10 2H14C14.5304 2 15.0391 2.21071 15.4142 2.58579C15.7893 2.96086 16 3.46957 16 4V6M19 6V20C19 20.5304 18.7893 21.0391 18.4142 21.4142C18.0391 21.7893 17.5304 22 17 22H7C6.46957 22 5.96086 21.7893 5.58579 21.4142C5.21071 21.0391 5 20.5304 5 20V6H19Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                    </svg>
                                </a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="custom-checkbox">
                            <input type="checkbox" class="checkbox" name="option[]" value="5">
                        </span>
                            </td>
                            <td>
                                <h6>5</h6>
                            </td>
                            <td>
                                <div class="media style-1">
                                    <span class="icon-name mr-2 bgl-info text-info" style="border-radius: 50%">p</span>
                                    <div class="media-body">
                                        <h6>Post Melone</h6>
                                    </div>
                                </div>
                            </td>
                            <td>
                                <div>
                                    <h6>China</h6>
                                    <span>COde:Ch</span>
                                </div>
                            </td>
                            <td>
                                <div>
                                    <h6 class="text-primary">10/21/2016</h6>
                                    <span>Approved</span>
                                </div>
                            </td>
                            <td>
                                Abbott-Jacobs
                            </td>
                            <td><span class="badge badge-danger">Danger</span></td>
                            <td>
                                <button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                                        <path d="M17 3C17.2626 2.73735 17.5744 2.52901 17.9176 2.38687C18.2608 2.24473 18.6286 2.17157 19 2.17157C19.3714 2.17157 19.7392 2.24473 20.0824 2.38687C20.4256 2.52901 20.7374 2.73735 21 3C21.2626 3.26264 21.471 3.57444 21.6131 3.9176C21.7553 4.26077 21.8284 4.62856 21.8284 5C21.8284 5.37143 21.7553 5.73923 21.6131 6.08239C21.471 6.42555 21.2626 6.73735 21 7L7.5 20.5L2 22L3.5 16.5L17 3Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>--%>
                                    </svg>
                                </button>

                                <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h1 class="modal-title fs-5" id="staticBackdropLabel">Modal title</h1>
                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                            </div>
                                            <div class="modal-body">
                                                hello
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-warning">Update</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <a href="javascript:void(0);" class="ml-2 btn btn-xs px-2  btn-danger">
                                    <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                                        <path d="M3 6H5H21" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                        <path d="M8 6V4C8 3.46957 8.21071 2.96086 8.58579 2.58579C8.96086 2.21071 9.46957 2 10 2H14C14.5304 2 15.0391 2.21071 15.4142 2.58579C15.7893 2.96086 16 3.46957 16 4V6M19 6V20C19 20.5304 18.7893 21.0391 18.4142 21.4142C18.0391 21.7893 17.5304 22 17 22H7C6.46957 22 5.96086 21.7893 5.58579 21.4142C5.21071 21.0391 5 20.5304 5 20V6H19Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                    </svg>
                                </a>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <button class="btn btn-secondary" type="button" data-bs-toggle="collapse" data-bs-target="#collapseExample2" aria-expanded="false" aria-controls="collapseExample2">
            Change Password
        </button>
        <div class="collapse" id="collapseExample2">
            <div class="card card-body">
                <div class="table-responsive">
                    <form>
                        <div class="row">
                            <div class="col">
                                <label>Mã khách hàng:</label>
                                <input type="text" class="form-control" >
                            </div>
                            <div class="col">
                                <label>Họ và tên:</label>
                                <input type="text" class="form-control" >
                            </div>
                        </div>

                        <div class="row mt-3">
                            <div class="col">
                                <label>Số CCCD:</label>
                                <input type="text" class="form-control" >
                            </div>
                            <div class="col">
                                <label>Số điện thoại:</label>
                                <input type="text" class="form-control" >
                            </div>
                        </div>

                        <div class="row mt-3">
                            <div class="col">
                                <label>Địa chỉ email:</label>
                                <input type="email" class="form-control" >
                            </div>
                            <div class="col">
                                <label>Địa chỉ:</label>
                                <input type="text" class="form-control" >
                            </div>
                        </div>

                        <div class="row mt-3">
                            <div class="col">
                                <label for="datepicker" class="form-label">Ngày sinh:</label>
                                <input type="date" class="form-control" id="datepicker">
                            </div>
                            <div class="col">
                                <label>Giới tính:</label>
                                <select class="form-select">
                                    <option value="Nam" selected>Nam</option>
                                    <option value="Nữ">Nữ</option>
                                </select>
                            </div>

                            <div class="row mt-3">
                                <div class="col">
                                    <div class="form-floating">
                                        <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea"></textarea>
                                        <label for="floatingTextarea">Mô tả</label>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="row mt-3">
                            <div class="col">
                                <button class="btn" style="background-color: #A6edab; color: #00852d">Add</button>
                                <button class="btn ms-2" style="background-color: #FFc5c4; color: #be2329">Cancel</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <button class="btn btn-success" type="button" data-bs-toggle="collapse" data-bs-target="#collapseWidthExample" aria-expanded="false" aria-controls="collapseWidthExample">
            Ngôn ngữ
        </button>
        <div style="min-height: 120px;">
            <div class="collapse collapse-horizontal" id="collapseWidthExample">
                <div class="card card-body" style="width: 300px;">
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                        <label class="form-check-label" for="flexRadioDefault1">
                            Vietnamese
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
                        <label class="form-check-label" for="flexRadioDefault2">
                            English
                        </label>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
