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
                    <a class="Btnaddkh" type="button" href="/admin/createKH" style="text-decoration: none">Add new
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
                                 <td>\${item.trangThai}</td>
                                     <a type="button" class="btn btn-warning" href="/admin/updateKH" style="text-decoration: none">
                                        <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                                          <path d="M17 3C17.2626 2.73735 17.5744 2.52901 17.9176 2.38687C18.2608 2.24473 18.6286 2.17157 19 2.17157C19.3714 2.17157 19.7392 2.24473 20.0824 2.38687C20.4256 2.52901 20.7374 2.73735 21 3C21.2626 3.26264 21.471 3.57444 21.6131 3.9176C21.7553 4.26077 21.8284 4.62856 21.8284 5C21.8284 5.37143 21.7553 5.73923 21.6131 6.08239C21.471 6.42555 21.2626 6.73735 21 7L7.5 20.5L2 22L3.5 16.5L17 3Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>&ndash;%&gt;
                                     <button class="btn btn-primary" onclick="updateStatus(\${item.id}, \${item.trangThai})">
                                        <svg xmlns="http://www.w3.org/2000/svg" height="1em" viewBox="0 0 576 512">
                                            <path d="M0 64C0 28.7 28.7 0 64 0H224V128c0 17.7 14.3 32 32 32H384V285.7l-86.8 86.8c-10.3 10.3-17.5 23.1-21 37.2l-18.7 74.9c-2.3 9.2-1.8 18.8 1.3 27.5H64c-35.3 0-64-28.7-64-64V64zm384 64H256V0L384 128zM549.8 235.7l14.4 14.4c15.6 15.6 15.6 40.9 0 56.6l-29.4 29.4-71-71 29.4-29.4c15.6-15.6 40.9-15.6 56.6 0zM311.9 417L441.1 287.8l71 71L382.9 487.9c-4.1 4.1-9.2 7-14.9 8.4l-60.1 15c-5.5 1.4-11.2-.2-15.2-4.2s-5.6-9.7-4.2-15.2l15-60.1c1.4-5.6 4.3-10.8 8.4-14.9z"/>
                                        </svg>
                                    </button>
                                    <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#kkkk" >
                                       <svg width="20" height="20" viewbox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
        console.log(id);
        showConfirm("Bạn có muốn xóa?", id)
            .then((confirmed) => {
                if (confirmed) {
                            loadKhachHang();
                            showSuccess("Delete success");
                        },
                        error: function (xhr, status, error) {
                alert(req);
                        }
                    });
                }
            });
    }

    function updateStatus(id) {
        $.ajax({
            url: '/api/admin/khachhang/updateStatus/' + id,
            method: 'PUT',
            success: function (response) {
                loadKhachHang()
                showSuccess("Update success");
                alert('Có lỗi xảy ra: ' + error);

</body>
</html>
