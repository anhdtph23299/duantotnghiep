<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 10/19/2023
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ca làm việc</title>
</head>
<body>
<div class="content-body">
    <div class="container-fluid">
        <h4 style="margin-top: 0;
    margin-bottom: 30px;
    border-bottom: 2px solid #FFD43B;
    padding-bottom: 10px;
    padding-left: 5px;
    color: black;" >Ca làm việc</h4>

        <div class="row">
            <div class="col-xl-12">
                <div class="card ">
                    <div class=" card-body d-flex mb-3 ">
                        <div class="p-2">
                            <a href="/admin/giaoca/createCLV" type="button" class="btn"
                               style="background-color: #9df99d;color: #003c00">
                                Add
                            </a>
                        </div>

                        <%--search--%>
                        <div class="p-2 ms-auto">
                            <div class="InputContainer">
                                <input type="text" id="searchAll"  name="text" class="input"  placeholder="Search">

                                <div class="border"></div>

                                <button id="searchButton" class="micButton">
                                    <svg viewBox="0 0 512 512" class="searchIcon"><path d="M416 208c0 45.9-14.9 88.3-40 122.7L502.6 457.4c12.5 12.5 12.5 32.8 0 45.3s-32.8 12.5-45.3 0L330.7 376c-34.4 25.2-76.8 40-122.7 40C93.1 416 0 322.9 0 208S93.1 0 208 0S416 93.1 416 208zM208 352a144 144 0 1 0 0-288 144 144 0 1 0 0 288z"></path></svg>
                                </button>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>

        <div class="card card-body">
        <table id="calamviec" class="table table-hover" >
            <thead>
            <tr>
                <th>STT</th>
                <th>MaCaLV</th>
                <th>Tên nhân viên</th>
                <th>Ngày làm việc</th>
                <th>Thời gian</th>
                <th>Tổng giờ</th>
                <th>Trạng thái</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
        </div>
    </div>
</div>

<script>
    function loadCaLamViec(){
        $.ajax({
            url: '/api/admin/calamviec',
            method: 'GET',
            success: function(req) {
                console.log(req.data);
                var tbody = $('#calamviec tbody');
                tbody.empty();
                var index = 0;
                req.data.forEach(function(item) {
                    var row = `
                            <tr>
                                <td>\${++index}</td>
                                <td>\${item.maCaLV}</td>
                                 <td>\${item.nhanVien.tenNV}</td>
                                 <td>\${getFormattedDate(item.ngayLamViec)}</td>
                                 <td>\${item.gioBatDau} - \${item.gioKetThuc}</td>
                                 <td>\${tinhTongGioLamViec(item.gioBatDau, item.gioKetThuc)}</td>
                                 <td>\${item.trangThai == 1 ? "Hoạt động": "Ngừng hoạt động"}</td>
                                 <td>
                                      <a type="button" class="btn btn-warning" href="/admin/giaoca/updateCLV/\${item.id}" style="text-decoration: none">
                                        <svg xmlns="http://www.w3.org/2000/svg" height="1em" viewBox="0 0 512 512">
                                            <path d="M471.6 21.7c-21.9-21.9-57.3-21.9-79.2 0L362.3 51.7l97.9 97.9 30.1-30.1c21.9-21.9 21.9-57.3 0-79.2L471.6 21.7zm-299.2 220c-6.1 6.1-10.8 13.6-13.5 21.9l-29.6 88.8c-2.9 8.6-.6 18.1 5.8 24.6s15.9 8.7 24.6 5.8l88.8-29.6c8.2-2.7 15.7-7.4 21.9-13.5L437.7 172.3 339.7 74.3 172.4 241.7zM96 64C43 64 0 107 0 160V416c0 53 43 96 96 96H352c53 0 96-43 96-96V320c0-17.7-14.3-32-32-32s-32 14.3-32 32v96c0 17.7-14.3 32-32 32H96c-17.7 0-32-14.3-32-32V160c0-17.7 14.3-32 32-32h96c17.7 0 32-14.3 32-32s-14.3-32-32-32H96z"/>
                                        </svg>
                                    </a>
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

    loadCaLamViec()


    function Delete(id) {
        console.log(id);
        showConfirm("Bạn có muốn xóa?", id)
            .then((confirmed) => {
                if (confirmed) {
                    $.ajax({
                        url: '/api/admin/calamviec/delete/' + id,
                        method: 'DELETE',
                        success: function (req) {
                            loadCaLamViec();
                            showSuccess("Delete success");
                        },
                        error: function (xhr, status, error) {
                            showError("Delete fail");
                        }
                    });
                }
            });
    }

    function tinhTongGioLamViec(gioBatDau, gioKetThuc) {
        const startTime = new Date("1970-01-01T" + gioBatDau);
        const endTime = new Date("1970-01-01T" + gioKetThuc);

        const timeDiff = endTime - startTime;

        const hours = Math.floor(timeDiff / 3600000);
        const minutes = Math.floor((timeDiff % 3600000) / 60000);

        return hours + " giờ " + minutes + " phút";
    }

</script>
</body>
</html>
