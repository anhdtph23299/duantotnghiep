<%--
  Created by IntelliJ IDEA.
  User: MMC
  Date: 10/30/2023
  Time: 7:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail Hóa Đơn</title>
</head>
<body>
 <section>
     <div class="content-body" style="background-color: #f2eded">
         <div class="container-fluid">
             <h3 style="margin-top: 0;
    margin-bottom: 30px;
    border-bottom: 2px solid #FFD43B;
    padding-bottom: 10px;
    padding-left: 5px;
    color: black;">
                Chi tiết hóa đơn
             </h3>
             <div class="row">
                 <div class="col-lg-8">
                    <div class="card" style="box-shadow: rgba(50, 50, 93, 0.25) 0px 2px 5px -1px, rgba(0, 0, 0, 0.3) 0px 1px 3px -1px;
    padding: 20px; background-color: #fff">
                        <div class="row col-12">
                            <h4>Thông tin khách hàng</h4>
                        </div>
                        <hr>
                        <div class="d-flex justify-content-between">
                            <div class="row ms-2" >
                                    <div class="col-lg-4 col-md-4 col-sm-4 ">
                                        <img src="/template/web/img/anh1.png" width="50px" style="border-radius: 50%" alt="">
                                    </div>
                                    <div class="col-lg-8 col-md-8 col-sm-8" >
                                        <h5 style="color: #EB8153">seiichitakashi</h5>
                                       <span>0987654321</span>
                                    </div>
                            </div>
                            <div class="">
                                <button type="button" class="buttonExport" id="exportButton">
                                    <span class="button__text">Export</span>
                                    <span class="button__icon"><svg class="svgExport" data-name="Layer 2" id="bdd05811-e15d-428c-bb53-8661459f9307" viewBox="0 0 35 35" xmlns="http://www.w3.org/2000/svg"><path d="M17.5,22.131a1.249,1.249,0,0,1-1.25-1.25V2.187a1.25,1.25,0,0,1,2.5,0V20.881A1.25,1.25,0,0,1,17.5,22.131Z"></path><path d="M17.5,22.693a3.189,3.189,0,0,1-2.262-.936L8.487,15.006a1.249,1.249,0,0,1,1.767-1.767l6.751,6.751a.7.7,0,0,0,.99,0l6.751-6.751a1.25,1.25,0,0,1,1.768,1.767l-6.752,6.751A3.191,3.191,0,0,1,17.5,22.693Z"></path><path d="M31.436,34.063H3.564A3.318,3.318,0,0,1,.25,30.749V22.011a1.25,1.25,0,0,1,2.5,0v8.738a.815.815,0,0,0,.814.814H31.436a.815.815,0,0,0,.814-.814V22.011a1.25,1.25,0,1,1,2.5,0v8.738A3.318,3.318,0,0,1,31.436,34.063Z"></path></svg></span>
                                </button>
                            </div>
                        </div>
                    </div>
                     <div class="card mt-2" style="box-shadow: rgba(50, 50, 93, 0.25) 0px 2px 5px -1px, rgba(0, 0, 0, 0.3) 0px 1px 3px -1px;
    padding: 20px; background-color: #fff">
                         <h4>Thông tin sản phẩm</h4>
                         <hr>
                         <table class="table table-hover table-striped">
                             <thead>
                             <tr class="table-warning">
                                 <th scope="col">Mã hàng</th>
                                 <th scope="col">Tên hàng </th>
                                 <th scope="col">Số lượng</th>
                                 <th scope="col">Đơn giá</th>
                                 <th scope="col">Giảm giá</th>
                                 <th scope="col">Giá bán</th>
                                 <th scope="col">Thành tiền</th>
                             </tr>
                             </thead>
                             <tbody>
                             <tr>
                                 <td>SP01</td>
                                 <td>Aos polo nam aelimited</td>
                                 <td>3</td>
                                 <td>300000</td>
                                 <td></td>
                                 <td>300000</td>
                                 <td><b>900000</b></td>
                             </tr>
                             <tr>
                                 <td>SP01</td>
                                 <td>Aos polo nam aelimited</td>
                                 <td>3</td>
                                 <td>300000</td>
                                 <td></td>
                                 <td>300000</td>
                                 <td><b>900000</b></td>
                             </tr>
                             <tr>
                                 <td>SP01</td>
                                 <td>Aos polo nam aelimited</td>
                                 <td>3</td>
                                 <td>300000</td>
                                 <td></td>
                                 <td>300000</td>
                                 <td><b>900000</b></td>
                             </tr>
                             <tr>
                                 <td>SP01</td>
                                 <td>Aos polo nam aelimited</td>
                                 <td>3</td>
                                 <td>300000</td>
                                 <td></td>
                                 <td>300000</td>
                                 <td><b>900000</b></td>
                             </tr>
                             </tbody>
                         </table>
                         <div class="row">
                             <div class="col-8"></div>
                             <div class="col-4">
                                <div class="row">
                                    <div class="col-7">
                                        Tổng số lượng:
                                    </div>
                                    <div class="col-5 text-right font-weight-bold">12</div>
                                </div>
                                 <div class="row mt-2">
                                     <div class="col-7">
                                         Tổng tiền hàng:
                                     </div>
                                     <div class="col-5 text-right font-weight-bold">3600000</div>
                                 </div>
                                 <div class="row mt-2">
                                     <div class="col-7">
                                        Giảm giá hóa đơn:
                                     </div>
                                     <div class="col-5 text-right font-weight-bold">0</div>
                                 </div>
                                 <div class="row mt-2">
                                     <div class="col-7">
                                         Khách cần trả:
                                     </div>
                                     <div class="col-5 text-right font-weight-bold">3600000</div>
                                 </div>
                                 <div class="row mt-2">
                                     <div class="col-7">
                                         Khách đã trả:
                                     </div>
                                     <div class="col-5 text-right font-weight-bold">3600000</div>
                                 </div>
                             </div>
                         </div>
                     </div>
                 </div>
                 <div class="col-lg-4">
                     <div class="card " style="box-shadow: rgba(50, 50, 93, 0.25) 0px 2px 5px -1px, rgba(0, 0, 0, 0.3) 0px 1px 3px -1px;
    padding: 20px; background-color: #fff">
                         <h4>Thông tin hóa đơn</h4>
                         <hr>
                         <div class="row">
                             <div class="col-4">
                                 <h6>Mã hóa đơn:</h6>
                             </div>
                             <div class="col-8">
                                 <span style="color: #EB8153">HD01</span>
                             </div>
                         </div>
                         <div class="row mt-3">
                             <div class="col-4">
                                 <h6>Thời gian:</h6>
                             </div>
                             <div class="col-8">
                                 <div class="input-wrapper1">
                                     <input class="input-box1" type="date"  disabled>
                                     <span class="underline1"></span>
                                 </div>
                             </div>
                         </div>
                         <div class="row mt-3">
                             <div class="col-4">
                                 <h6>Người tạo:</h6>
                             </div>
                             <div class="col-8">
                                 <div class="input-wrapper1">
                                     <input class="input-box1" type="text" placeholder="Khánh Linh" disabled>
                                     <span class="underline1"></span>
                                 </div>
                             </div>
                         </div>
                         <div class="row mt-3">
                             <div class="col-4">
                                 <h6>Người bán:</h6>
                             </div>
                             <div class="col-8">
                                 <div class="input-wrapper1">
                                     <input class="input-box1" type="text" placeholder="Khánh Linh" disabled>
                                     <span class="underline1"></span>
                                 </div>
                             </div>
                         </div>
                         <div class="row mt-3">
                             <div class="col-4">
                                 <h6>Trạng thái</h6>
                             </div>
                             <div class="col-8">
                                 <span style="color: #EB8153">Hoàn thành</span>
                             </div>
                         </div>
                         <div class="row mt-3">
                                 <h6>Ghi chú:</h6>
                                 <textarea class="form-control"></textarea>
                         </div>
                     </div>
                 </div>
             </div>
             <div class="card" style="box-shadow: rgba(50, 50, 93, 0.25) 0px 2px 5px -1px, rgba(0, 0, 0, 0.3) 0px 1px 3px -1px;
    padding: 20px; background-color: #fff">
                 <div class="row col-12">
                     <h4>Lịch sử thanh toán</h4>
                 </div>
                 <hr>
                 <div class="d-flex justify-content-between">

                     <hr>
                     <table class="table table-hover table-striped">
                         <thead>
                         <tr class="table-success">
                             <th scope="col">Mã phiếu</th>
                             <th scope="col">Thời gian </th>
                             <th scope="col">Người tạo</th>
                             <th scope="col">Giá trị phiếu</th>
                             <th scope="col">Phương thức</th>
                             <th scope="col">Trạng thái</th>
                             <th scope="col">Tiền thu/chi</th>
                         </tr>
                         </thead>
                         <tbody>
                         <tr>
                             <td>MP0001</td>
                             <td>30/10/2023 14:25</td>
                             <td>Khánh Linh</td>
                             <td>300,000</td>
                             <td>Tiền mặt</td>
                             <td>Đã thanh toán</td>
                             <td><b>300,000</b></td>
                         </tr>
                         </tbody>
                     </table>
                 </div>
             </div>
         </div>
     </div>
 </section>
</body>
</html>
