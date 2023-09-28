<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Khách hàng</title>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.6/css/jquery.dataTables.css" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

    <style>
        table {
            border-collapse: collapse;
            width: 100%;
            color: #333;
            font-family: Arial, sans-serif;
            font-size: 14px;
            text-align: left;
            border-radius: 30px;
            overflow: hidden;
            box-shadow: 0 .5rem 1rem rgba(0,0,0,.15)!important;
            margin: auto;
            margin-top: 50px;
            margin-bottom: 50px;
        }
        .tables{
            margin-top: 10px;
        }
        th{
            position: sticky;
            top: 0px;
        }

    </style>
</head>
<body>
<div class="container">
    <h1>Quan ly khach hang</h1>
    <label for="tenKhachHang">Tên Khách Hàng:</label>
    <input type="text" id="tenKhachHang" required>
    <button id="addCustomerButton">Thêm</button>


    <table class="table" id="customerTable">
        <thead>
        <tr>
            <th>ID</th>
            <th>Tên Khách Hàng</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
</div>
</script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="https://cdn.datatables.net/1.13.6/js/jquery.dataTables.js"></script>
<script type="text/javascript">
    var dataTable ;
    var currentPageIndex;
    function reloadDataTable() {
        currentPageIndex = dataTable.page();
        dataTable.destroy();
        loadCustomerTable();
    }
    function loadCustomerTable() {
        $.get('/admin/khachhang/getall').done(function (response) {
            dataTable = $("#customerTable").DataTable({
                data: response.data, // Dữ liệu trả về từ server
                columns: [
                    { data: "id" },
                    { data: "tenKhachHang" },
                    {
                        data: "id",
                        title: "Hành động",
                        render: function (data, type, row) {
                            return (
                                `
                                <button type="button" class="btn btn-outline-primary" onclick="deleteCustomer(\${data})">Delete</button>
                                                    `
                            );
                        },
                    }
                ],
                "order": [[0, "desc"]],
                page: currentPageIndex
            });
        });
    }
    function deleteCustomer(id) {
        $.ajax({
            url: '/admin/khachhang/delete/' + id,
            method: 'DELETE',
            success: function(response) {
                reloadDataTable();
            },
            error: function(xhr, status, error) {
                alert('Có lỗi xảy ra: ' + error);
            }
        });
    }
    $(document).ready(function() {
        loadCustomerTable();
        $('#addCustomerButton').click(function() {
            var tenKhachHang = $('#tenKhachHang').val();

            $.ajax({
                url: '/admin/khachhang/insert',
                method: 'POST',
                contentType: 'application/json',
                data: JSON.stringify({
                    tenKhachHang: tenKhachHang
                }),
                success: function(response) {
                    reloadDataTable();
                },
                error: function(xhr, status, error) {
                    alert('Có lỗi xảy ra: ' + error);
                }
            });
        });
    });
</script>
</body>
</html>
