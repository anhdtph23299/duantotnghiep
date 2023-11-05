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
                    <div class="p-2">
                        <button type="button" class="buttonImport" id="importButton" onclick="importFile()">
                            <span class="button__text1">Import</span>
                            <span class="button__icon1">
                                <svg xmlns="http://www.w3.org/2000/svg" class="svgImport" viewBox="0 0 512 512">
                                    <path d="M128 64c0-35.3 28.7-64 64-64H352V128c0 17.7 14.3 32 32 32H512V448c0 35.3-28.7 64-64 64H192c-35.3 0-64-28.7-64-64V336H302.1l-39 39c-9.4 9.4-9.4 24.6 0 33.9s24.6 9.4 33.9 0l80-80c9.4-9.4 9.4-24.6 0-33.9l-80-80c-9.4-9.4-24.6-9.4-33.9 0s-9.4 24.6 0 33.9l39 39H128V64zm0 224v48H24c-13.3 0-24-10.7-24-24s10.7-24 24-24H128zM512 128H384V0L512 128z"/>
                                </svg>
                            </span>
                        </button>
                    </div>
                    <div class="p-2">
                        <button type="button" class="buttonExport" id="exportButton">
                            <span class="button__text">Export</span>
                            <span class="button__icon"><svg class="svgExport" data-name="Layer 2" id="bdd05811-e15d-428c-bb53-8661459f9307" viewBox="0 0 35 35" xmlns="http://www.w3.org/2000/svg"><path d="M17.5,22.131a1.249,1.249,0,0,1-1.25-1.25V2.187a1.25,1.25,0,0,1,2.5,0V20.881A1.25,1.25,0,0,1,17.5,22.131Z"></path><path d="M17.5,22.693a3.189,3.189,0,0,1-2.262-.936L8.487,15.006a1.249,1.249,0,0,1,1.767-1.767l6.751,6.751a.7.7,0,0,0,.99,0l6.751-6.751a1.25,1.25,0,0,1,1.768,1.767l-6.752,6.751A3.191,3.191,0,0,1,17.5,22.693Z"></path><path d="M31.436,34.063H3.564A3.318,3.318,0,0,1,.25,30.749V22.011a1.25,1.25,0,0,1,2.5,0v8.738a.815.815,0,0,0,.814.814H31.436a.815.815,0,0,0,.814-.814V22.011a1.25,1.25,0,1,1,2.5,0v8.738A3.318,3.318,0,0,1,31.436,34.063Z"></path></svg></span>
                        </button>
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
                    <input type="text" id="searchAll"  name="text" class="input"  placeholder="Search">

                    <div class="border"></div>

                    <button id="searchButton" class="micButton">
                        <svg viewBox="0 0 512 512" class="searchIcon"><path d="M416 208c0 45.9-14.9 88.3-40 122.7L502.6 457.4c12.5 12.5 12.5 32.8 0 45.3s-32.8 12.5-45.3 0L330.7 376c-34.4 25.2-76.8 40-122.7 40C93.1 416 0 322.9 0 208S93.1 0 208 0S416 93.1 416 208zM208 352a144 144 0 1 0 0-288 144 144 0 1 0 0 288z"></path></svg>
                    </button>

                </div>
            </div>
            <div class="card-body">
                <div class="">
                    <table class="table table-hover" id="tblKhachHang">
                        <thead>
                        <tr>
                            <th>
                                <span class="custom-checkbox">
                                    <input type="checkbox" id="selectAll">
                                    <label for="selectAll"></label>
                                </span>
                            </th>
                            <th scope="col">STT</th>
                            <th scope="col">Mã KH</th>
                            <th scope="col">Họ và tên</th>
                            <th scope="col">SDT</th>
                            <th scope="col">Email</th>
                            <th scope="col">Giới tính</th>
                            <th scope="col">Ngày sinh</th>
                            <th scope="col">Địa chỉ</th>
                            <th scope="col">CCCD</th>
                            <th scope="col">Ngày đăng ký</th>
                            <th scope="col">Mô tả</th>
                            <th scope="col">Trạng thái</th>
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


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script >

    function loadKhachHang(){
        $.ajax({
            url: '/api/admin/khachhang',
            method: 'GET',
            success: function(req) {
                console.log(req.data);
                var tbody = $('#tblKhachHang tbody');
                tbody.empty();
                var index = 0;
                req.data.forEach(function(item) {
                    var row = `
                            <tr>
                                <td>
                                   <span class="custom-checkbox">
                                        <input type="checkbox" class="checkbox" name="option[]" value="1">
                                   </span>
                                </td>
                                <td>\${++index}</td>
                                <td>\${item.maKH}</td>
                                 <td>\${item.tenKH}</td>
                                 <td>\${item.sdt}</td>
                                 <td>\${item.email}</td>
                                 <td>\${item.gioiTinh == true ? "Nam": "Nữ"}</td>
                                 <td>\${getFormattedDate(item.ngaySinh)}</td>
                                 <td>\${item.diaChi}</td>
                                 <td>\${item.cccd}</td>
                                 <td>\${getFormattedDate(item.ngayDangKy)}</td>
                                 <td>\${item.moTa}</td>
                                 <td>\${item.trangThai == 1 ? "Hoạt động": "Ngừng hoạt động"}</td>
                                 <td>
                                      <a type="button" class="btn btn-warning" href="/admin/updateKH/\${item.id}" style="text-decoration: none">
                                        <svg xmlns="http://www.w3.org/2000/svg" height="1em" viewBox="0 0 512 512">
                                            <path d="M471.6 21.7c-21.9-21.9-57.3-21.9-79.2 0L362.3 51.7l97.9 97.9 30.1-30.1c21.9-21.9 21.9-57.3 0-79.2L471.6 21.7zm-299.2 220c-6.1 6.1-10.8 13.6-13.5 21.9l-29.6 88.8c-2.9 8.6-.6 18.1 5.8 24.6s15.9 8.7 24.6 5.8l88.8-29.6c8.2-2.7 15.7-7.4 21.9-13.5L437.7 172.3 339.7 74.3 172.4 241.7zM96 64C43 64 0 107 0 160V416c0 53 43 96 96 96H352c53 0 96-43 96-96V320c0-17.7-14.3-32-32-32s-32 14.3-32 32v96c0 17.7-14.3 32-32 32H96c-17.7 0-32-14.3-32-32V160c0-17.7 14.3-32 32-32h96c17.7 0 32-14.3 32-32s-14.3-32-32-32H96z"/>
                                        </svg>
                                    </a>
                                     <button class="btn btn-primary" onclick="updateStatus(\${item.id}, \${item.trangThai})">
                                        <svg xmlns="http://www.w3.org/2000/svg" height="1em" viewBox="0 0 576 512">
                                            <path d="M0 64C0 28.7 28.7 0 64 0H224V128c0 17.7 14.3 32 32 32H384V285.7l-86.8 86.8c-10.3 10.3-17.5 23.1-21 37.2l-18.7 74.9c-2.3 9.2-1.8 18.8 1.3 27.5H64c-35.3 0-64-28.7-64-64V64zm384 64H256V0L384 128zM549.8 235.7l14.4 14.4c15.6 15.6 15.6 40.9 0 56.6l-29.4 29.4-71-71 29.4-29.4c15.6-15.6 40.9-15.6 56.6 0zM311.9 417L441.1 287.8l71 71L382.9 487.9c-4.1 4.1-9.2 7-14.9 8.4l-60.1 15c-5.5 1.4-11.2-.2-15.2-4.2s-5.6-9.7-4.2-15.2l15-60.1c1.4-5.6 4.3-10.8 8.4-14.9z"/>
                                        </svg>
                                    </button>
                                    <button type="button" class="btn btn-danger" onclick="Delete(\${item.id})" >
                                       <svg viewbox="0 0 24 24" height="1em" xmlns="http://www.w3.org/2000/svg">
                                           <path d="M3 6H5H21" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                           <path d="M8 6V4C8 3.46957 8.21071 2.96086 8.58579 2.58579C8.96086 2.21071 9.46957 2 10 2H14C14.5304 2 15.0391 2.21071 15.4142 2.58579C15.7893 2.96086 16 3.46957 16 4V6M19 6V20C19 20.5304 18.7893 21.0391 18.4142 21.4142C18.0391 21.7893 17.5304 22 17 22H7C6.46957 22 5.96086 21.7893 5.58579 21.4142C5.21071 21.0391 5 20.5304 5 20V6H19Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                       </svg>
                                   </button>
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

    function Delete(id) {
        console.log(id);
        showConfirm("Bạn có muốn xóa?", id)
            .then((confirmed) => {
                if (confirmed) {
                    $.ajax({
                        url: '/api/admin/khachhang/delete/' + id,
                        method: 'DELETE',
                        success: function (req) {
                            loadKhachHang();
                            showSuccess("Delete success");
                        },
                        error: function (xhr, status, error) {
                            showError("Delete fail");
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
                loadKhachHang();
                showSuccess("Update success");
            },
            error: function (xhr, status, error) {
                showError("Update fail");
            }
        });
    }

    function searchCustomersAll() {
        var maKH= $('#searchAll').val();
        var tenKH= $('#searchAll').val();
        var email= $('#searchAll').val();
        var sdt= $('#searchAll').val();
        var diaChi= $('#searchAll').val();
        var cccd= $('#searchAll').val();


        var searchKH = {
            maKH: maKH,
            tenKH: tenKH,
            email: email,
            sdt: sdt,
            diaChi: diaChi,
            cccd: cccd,
        };

        $.ajax({
            url: '/api/admin/khachhang/search',
            type: 'GET',
            data: searchKH,
            success: function (response) {
                if (response.success) {
                    var customers = response.data;

                    var tbody = $('#tblKhachHang tbody');
                    tbody.empty();

                    customers.forEach(function (item, index) {
                        var row = `
                          <tr>
                                <td>
                                   <span class="custom-checkbox">
                                        <input type="checkbox" class="checkbox" name="option[]" value="1">
                                   </span>
                                </td>
                                <td>\${index+1}</td>
                                <td>\${item.maKH}</td>
                                 <td>\${item.tenKH}</td>
                                 <td>\${item.sdt}</td>
                                 <td>\${item.email}</td>
                                 <td>\${item.gioiTinh == true ? "Nam": "Nữ"}</td>
                                 <td>\${getFormattedDate(item.ngaySinh)}</td>
                                 <td>\${item.diaChi}</td>
                                 <td>\${item.cccd}</td>
                                 <td>\${getFormattedDate(item.ngayDangKy)}</td>
                                 <td>\${item.moTa}</td>
                                 <td>\${item.trangThai == 1 ? "Hoạt động": "Ngừng hoạt động"}</td>
                                 <td>
                                      <a type="button" class="btn btn-warning" href="/admin/updateKH/\${item.id}" style="text-decoration: none">
                                        <svg xmlns="http://www.w3.org/2000/svg" height="1em" viewBox="0 0 512 512">
                                            <path d="M471.6 21.7c-21.9-21.9-57.3-21.9-79.2 0L362.3 51.7l97.9 97.9 30.1-30.1c21.9-21.9 21.9-57.3 0-79.2L471.6 21.7zm-299.2 220c-6.1 6.1-10.8 13.6-13.5 21.9l-29.6 88.8c-2.9 8.6-.6 18.1 5.8 24.6s15.9 8.7 24.6 5.8l88.8-29.6c8.2-2.7 15.7-7.4 21.9-13.5L437.7 172.3 339.7 74.3 172.4 241.7zM96 64C43 64 0 107 0 160V416c0 53 43 96 96 96H352c53 0 96-43 96-96V320c0-17.7-14.3-32-32-32s-32 14.3-32 32v96c0 17.7-14.3 32-32 32H96c-17.7 0-32-14.3-32-32V160c0-17.7 14.3-32 32-32h96c17.7 0 32-14.3 32-32s-14.3-32-32-32H96z"/>
                                        </svg>
                                    </a>
                                     <button class="btn btn-primary" onclick="updateStatus(\${item.id}, \${item.trangThai})">
                                        <svg xmlns="http://www.w3.org/2000/svg" height="1em" viewBox="0 0 576 512">
                                            <path d="M0 64C0 28.7 28.7 0 64 0H224V128c0 17.7 14.3 32 32 32H384V285.7l-86.8 86.8c-10.3 10.3-17.5 23.1-21 37.2l-18.7 74.9c-2.3 9.2-1.8 18.8 1.3 27.5H64c-35.3 0-64-28.7-64-64V64zm384 64H256V0L384 128zM549.8 235.7l14.4 14.4c15.6 15.6 15.6 40.9 0 56.6l-29.4 29.4-71-71 29.4-29.4c15.6-15.6 40.9-15.6 56.6 0zM311.9 417L441.1 287.8l71 71L382.9 487.9c-4.1 4.1-9.2 7-14.9 8.4l-60.1 15c-5.5 1.4-11.2-.2-15.2-4.2s-5.6-9.7-4.2-15.2l15-60.1c1.4-5.6 4.3-10.8 8.4-14.9z"/>
                                        </svg>
                                    </button>
                                    <button type="button" class="btn btn-danger" onclick="Delete(\${item.id})" >
                                       <svg viewbox="0 0 24 24" height="1em" xmlns="http://www.w3.org/2000/svg">
                                           <path d="M3 6H5H21" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                           <path d="M8 6V4C8 3.46957 8.21071 2.96086 8.58579 2.58579C8.96086 2.21071 9.46957 2 10 2H14C14.5304 2 15.0391 2.21071 15.4142 2.58579C15.7893 2.96086 16 3.46957 16 4V6M19 6V20C19 20.5304 18.7893 21.0391 18.4142 21.4142C18.0391 21.7893 17.5304 22 17 22H7C6.46957 22 5.96086 21.7893 5.58579 21.4142C5.21071 21.0391 5 20.5304 5 20V6H19Z" stroke="#fff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"></path>
                                       </svg>
                                   </button>
                                 </td>
                            </tr>
                    `;
                        tbody.append(row);
                    });
                } else {
                    showError(response.message);
                }
            },
            error: function (xhr, status, error) {
                showError("Search Fail");
            }
        });
    }

    $('#searchButton').click(function () {
        searchCustomersAll();
    });

    $("#exportButton").click(function () {
        // Lấy các thông tin tìm kiếm
        var maKH = $('#searchAll').val();
        var tenKH = $('#searchAll').val();
        var email = $('#searchAll').val();
        var sdt = $('#searchAll').val();
        var diaChi = $('#searchAll').val();
        var cccd = $('#searchAll').val();

        window.location.href = "/api/admin/khachhang/exportCustomersToExcel?maKH=" + maKH + "&tenKH=" + tenKH + "&email=" + email + "&sdt=" + sdt + "&diaChi=" + diaChi + "&cccd=" + cccd;
    });

    function importFile() {
        var fileInput = document.createElement("input");
        fileInput.type = "file";
        fileInput.style.display = "none";
        document.body.appendChild(fileInput);
        fileInput.addEventListener("change", function () {
            var file = fileInput.files[0];
            if (file) {
                var formData = new FormData();
                formData.append("file", file);
                $.ajax({
                    url: "/api/admin/khachhang/importCustomers",
                    type: "POST",
                    data: formData,
                    contentType: false,
                    processData: false,
                    success: function (response) {
                        showSuccess("Import success");
                        loadKhachHang();
                    },
                    error: function () {
                        showError("Import Fail");
                    }
                });
            }
            document.body.removeChild(fileInput);
        });
        fileInput.click();
    }

    $(document).ready(function() {
        // Xác định thẻ table và thẻ th
        var table = $("table");
        var th = table.find("th");
        // Bắt đầu sắp xếp khi thẻ th được nhấp
        th.click(function() {
            var table = $(this).parents("table").eq(0);
            var rows = table.find('tr:gt(0)').toArray().sort(compare($(this).index()));

            // Đảm bảo sắp xếp theo chiều tăng hoặc giảm dần
            this.asc = !this.asc;
            if (!this.asc) {
                rows = rows.reverse();
            }
            // Sắp xếp các dòng
            for (var i = 0; i < rows.length; i++) {
                table.append(rows[i]);
            }
        });
        // Hàm so sánh để sắp xếp dữ liệu
        function compare(index) {
            return function(a, b) {
                var valA = getCellValue(a, index);
                var valB = getCellValue(b, index);
                return $.isNumeric(valA) && $.isNumeric(valB) ? valA - valB : valA.toString().localeCompare(valB);
            };
        }
        // Lấy giá trị của ô cụ thể trong dòng
        function getCellValue(row, index) {
            return $(row).children('td').eq(index).text();
        }
    });
</script>
</body>
</html>