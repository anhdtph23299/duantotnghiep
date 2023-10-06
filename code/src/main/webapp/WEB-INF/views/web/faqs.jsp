<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 10/5/2023
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FAQs</title>
</head>
<body>
<div class="container-fluid bg-secondary mb-5">
    <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 300px">
        <h1 class="font-weight-semi-bold text-uppercase mb-3">FAQs</h1>
        <div class="d-inline-flex">
            <p class="m-0"><a href="">Home</a></p>
            <p class="m-0 px-2">-</p>
            <p class="m-0">FAQs</p>
        </div>
    </div>
</div>
<div class="container-fluid pt-5">
    <div class="text-center mb-4">
        <h2 class="section-title px-5"><span class="px-2">Frequently Asked Questions</span></h2>
    </div>
    <div class="row px-xl-5">
        <div class="col-12 pb-1">
            <div class="d-flex align-items-center justify-content-between mb-4">
                <form action="">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search by name">
                        <div class="input-group-append">
                            <span class="input-group-text bg-transparent text-primary">
                                <i class="fa fa-search"></i>
                            </span>
                        </div>
                    </div>
                </form>
                <div class="dropdown ml-4">
                    <button class="btn border dropdown-toggle" type="button" id="triggerId" data-toggle="dropdown" aria-haspopup="true"
                            aria-expanded="false">
                        Sort by
                    </button>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="triggerId">
                        <a class="dropdown-item" href="#">Latest</a>
                        <a class="dropdown-item" href="#">Popularity</a>
                        <a class="dropdown-item" href="#">Best Rating</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row px-xl-5">
        <div class="col-lg-8 col-md-12 pb-1 ">
                <div class="tab-pane fade show active" id="tab-pane-1">
                    <h5 class="">Questions and answers about accounts</h5>
                    <hr>
                    <h6 style="color: #c17a74">1. How do I become a member of Shop?</h6>
                    <p>Please click the "Register" button on the top menu bar of the screen (For Desktop) or in the left corner of the screen, select the Menu icon and then select "Register" (For Mobile).</p>
                    <hr>
                    <h6 style="color: #c17a74">2. Why can't I log in to my account?</h6>
                    <p>Please carefully check your typing style or Caps Lock/ CAPS key while filling in member login information. In case you cannot log in successfully, please select the "Forgot password" button right below the box. password and enter registered email.</p>
                    <hr>
                    <h6 style="color: #c17a74">3. Can I use the same account with others?</h6>
                    <p>You should use your personal account to ensure reliability as well as your own rights when shopping. Using the same account can lead to errors that are directly affected by the customer.</p>
                    <hr>
                    <h6 style="color: #c17a74">4. Why should I register as a Shop member?</h6>
                    <p>Registering an account is an opportunity to help you become one of Dola's loyal customers, with the quickest access to promotions and preferential information when shopping.</p>
                    <hr>
                    <br>
                    <h5 class="">Q&A about ordering</h5>
                    <hr>
                    <h6 style="color: #c17a74">1. In what ways can I place an order?</h6>
                    <p>You can purchase products at Shop in the following ways:<br>
                        Order online at the website<br>
                        Order directly with a consultant via Hotline 1900 2003<br>
                        Order online on e-commerce platforms<br>
                        Buy directly at store systems<br>
                        Shop always encourages you to create an account and order online to enjoy better membership incentives.</p>
                    <hr>
                    <h6 style="color: #c17a74">2. I need purchasing support, how do I contact a consultant?</h6>
                    <p>To contact a consultant, please contact Hotline 1900 2003 from 9:00 - 18:00, Monday - Friday every week.</p>
                    <hr>
                    <h6 style="color: #c17a74">3. I want to make a complaint/return the goods, what is the process?</h6>
                    <p>Shop is always willing to receive your comments and feedback. Please contact Dola's consultant Hotline 1900 2003 to cancel or change the product in your order.</p>
                    <hr>
                    <br>
                    <h5 class="">Q&A about payment</h5>
                    <hr>
                    <h6 style="color: #c17a74">1. In what ways can I pay for my order?</h6>
                    <p>You can pay Shop in the following forms:<br>
                        1.On-site payment (Ship COD)<br>
                        2. Advance transfer: Customers can choose to transfer money in advance to the Shop's account:</p>
                    <hr>
                    <br>
                    <h5 class="">Questions and answers about delivery</h5>
                    <hr>
                    <h6 style="color: #c17a74">1. I am not in Ho Chi Minh, does Shop support delivery?</h6>
                    <p>Shop applies nationwide delivery for all order values. Shipping fees and delivery times will vary depending on order value and specific area.</p>
                    <hr>
                    <h6 style="color: #c17a74">2. Will I receive shipping fees?</h6>
                    <p>Shop supports Free shipping for customers according to area and order value: <br>
                        Ho Chi Minh City: Free shipping for orders from 500,000 <br>
                        Nationwide: Free shipping for orders from 1,500,000 <br>
                        For orders that do not qualify for free shipping, there will be a delivery fee based on the estimate displayed on the website. Delivery fees are calculated based on the weight of the goods, express or regular delivery method and geographical location. Therefore, this cost depends on each specific condition.</p>
                    <hr>
                </div>
        </div>
        <div class="col-lg-4 col-md-12 pb-1">
            <div class="p-3" style="border: 1px solid #FFF0F0;border-radius: 5px;background-color: #FFF0F0">
                <h5>Solve the question</h5>
                <p>If you have any questions, you can send us a request, and we will contact you as soon as possible.</p>
                <form>
                    <div class="row">
                    <div class="col-12">
                    <input type="text" class="form-control" placeholder="Name:" >
                    </div>
                    <div class="col-12 mt-3">
                        <input type="email" class="form-control" placeholder="Email:" >
                    </div>
                    <div class="col-12 mt-3">
                        <input type="text" class="form-control" placeholder="Phone Number:" >
                    </div>
                    <div class="col-12 mt-3">
                        <textarea class="form-control" placeholder="Content" ></textarea>
                    </div>
                    </div>
                </form>
                <button class="btn btn-success mt-3">Submit</button>
            </div>
        </div>
    </div>
</div>

</div>
</body>
</html>
