<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>--%>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<!DOCTYPE html>
<html>
<head>
    <title>Khách hàng</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.6/css/jquery.dataTables.css" />

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


    <table class="table" id="customerTable" border="1">
        <thead>
        <tr>
            <th>ID</th>
            <th>Tên Khách Hàng</th>
            <th></th>
            <!-- Các cột khác tùy theo cấu trúc của đối tượng KhachHang -->
        </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
</div>


</script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script>
    function loadCustomerTable() {
        $.ajax({
            url: '/admin/khachhang/getall',
            method: 'GET',
            success: function(req) {
                var tbody = $('#customerTable tbody');
                tbody.empty();
                req.data.forEach(function(customer) {
                    var row = `
                            <tr>
                                <td>\${customer.id}</td>
                                <td>\${customer.tenKhachHang}</td>
                                <td><button onclick="deleteCustomer(\${customer.id})">Xoá</button></td>
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
    function deleteCustomer(id) {
        $.ajax({
            url: '/admin/khachhang/delete/' + id,
            method: 'DELETE',
            success: function(response) {
                loadCustomerTable();
            },
            error: function(xhr, status, error) {
                alert('Có lỗi xảy ra: ' + error);
            }
        });
    }
    $(document).ready(function() {
        loadCustomerTable();
        // $("#customerTable").DataTable({
        //     paging: true,      // Bật tính năng phân trang
        //     searching: true    // Bật tính năng tìm kiếm
        // });
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
                    // alert('Khách hàng đã được thêm thành công.');
                    // Gọi hàm để load lại dữ liệu trong bảng
                    loadCustomerTable();
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
