<%--
  Created by IntelliJ IDEA.
  User: sktfk
  Date: 11/10/2023
  Time: 9:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="content-body">
<div class="row mt-5 mb-5">
  <div class="col-9"></div>
  <div class="col-3"><button class="btn" id="taohoadon" style="background-color: #eb8153;color: white">Tạo hoá đơn</button></div>
</div>
<div class="mb-5">
  <table id="tblHoaDon" class="table" style="min-width: 845px">
    <thead class="table-light">
    <tr>
      <th>Mã hoá đơn</th>
      <th>Mã Nhân Viên</th>
      <th>Ngày tạo</th>
      <th>Người nhận</th>
      <th>Số điện thoại</th>
      <th>Trạng thái</th>
      <th></th>
    </tr>
    </thead>
    <tbody>

    </tbody>
  </table>
</div>
</div>

<script >

      $("#taohoadon").click(function (){
        var tenKhachHang = $("#tenkhachhang").val();
        $.ajax({
          url: '/api/admin/hoadon/insert',
          method: 'POST',
          contentType: 'application/json',
          data: JSON.stringify({
            tenKhachHang: tenKhachHang
          }),
          success: function(response) {
            showSuccess(response.data);
            loadHoaDon()
          },
          error: function(xhr, status, error) {
            alert('Có lỗi xảy ra: ' + error);
          }
        });
      })
  var datatable = $("#tblHoaDon").DataTable({
    columns: [
      { data: 'id', title: 'ID' },
      { data: null, title: 'Tên Khách Hàng', defaultContent: 'Anh' },
      {
        data: 'ngayDat',
        title: 'Ngày Đặt',
        render: function (data) {
          // Chuyển đổi giá trị ngày từ số sang dạng ngày tháng năm
          return getFormattedDate(data);
        }
      },
      { data: null, title: 'Người Tạo'  ,defaultContent: 'Anh'},
      { data: null, title: 'Số Điện Thoại', defaultContent: 'Anh' },
      { data: 'getTrangThaiHD', title: 'Trạng Thái' },
      {
        data: 'id',
        render: function (data) {
          return `
                    <div class="d-flex">
                        <a href="#" class="btn btn-primary shadow btn-xs sharp mr-1"><i class="fa fa-pencil"></i></a>
                        <a onclick="Delete(\${data})" class="btn btn-danger shadow btn-xs sharp"><i class="fa fa-trash"></i></a>
                    </div>
                `;
        }
      }
    ],
    order: [[0, 'desc']]
  });

  function loadHoaDon() {
    $.ajax({
      url: '/api/admin/hoadon',
      method: 'GET',
      success: function (req) {
        datatable.clear();
        datatable.rows.add(req.data);
        datatable.draw();
      },
      error: function (xhr, status, error) {
        showError('Có lỗi xảy ra: ' + error);
      }
    });
  }

  // Gọi loadHoaDon() mỗi khi cần cập nhật dữ liệu
  loadHoaDon();

      async function Delete(id){
       var x = await showConfirm("Bạn có muỗn xoá không");
       if(x){
         $.ajax({
           url: '/api/admin/hoadon/delete/'+id,
           method: 'DELETE',
           success: function(req) {
             loadHoaDon()
             showSuccess("Xoá thành công")
           },
           error: function(xhr, status, error) {
             showError('Có lỗi xảy ra: ' + error);
           }
         });
       }

      }
</script>