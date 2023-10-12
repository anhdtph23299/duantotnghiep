<%--
  Created by IntelliJ IDEA.
  User: sktfk
  Date: 11/10/2023
  Time: 9:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="content-body">
  <div class="container-fluid">

    <input id="tenkhachhang"> Ten khachhang
    <button id="them">Thêm </button>
    <table class="table table-hover style-1" id="tblHoaDon">
      <thead>
      <tr class="table-info">

        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">ACTION</th>
      </tr>
      </thead>
      <tbody>

      </tbody>
    </table>
  </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script >

      $("#them").click(function (){
        var tenKhachHang = $("#tenkhachhang").val();
        $.ajax({
          url: '/api/admin/hoadon/insert',
          method: 'POST',
          contentType: 'application/json',
          data: JSON.stringify({
            tenKhachHang: tenKhachHang
          }),
          success: function(response) {
            loadHoaDon()
          },
          error: function(xhr, status, error) {
            alert('Có lỗi xảy ra: ' + error);
          }
        });
      })
     function loadHoaDon(){
        $.ajax({
          url: '/api/admin/hoadon',
          method: 'GET',
          success: function(req) {
            console.log(req.data);
            var tbody = $('#tblHoaDon tbody');
            tbody.empty();
            req.data.forEach(function(customer) {
              var row = `
                            <tr>
                                <td>\${customer.id}</td>
                                <td>\${customer.tenKhachHang}</td>
                                <td onclick="Delete(\${customer.id})">Xoá</td>
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
      loadHoaDon()
      function Delete(id){
        $.ajax({
          url: '/api/admin/hoadon/delete/'+id,
          method: 'DELETE',
          success: function(req) {
            alert(req);
            loadHoaDon()
          },
          error: function(xhr, status, error) {
            alert('Có lỗi xảy ra: ' + error);
          }
        });
      }
</script>