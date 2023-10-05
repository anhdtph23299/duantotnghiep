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
    <title>Nhân viên</title>
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
            Danh sách thông tin nhân viên
        </h4>

        <div class="row">
            <div class="col-xl-12">
                <div class="card ">
                    <div class=" card-body d-flex mb-3 ">
                            <div class="p-2">
                                <a href="/admin/dashboards/addnv" type="button" class="btn" style="background-color: #9df99d;color: #003c00">
                                   Add
                                </a>
                            </div>
                        <div class="p-2">
                            <button class="btn" style="background-color: #ff4545;color: white" data-bs-toggle="modal" data-bs-target="#kkkk">
                                Delete All
                            </button>
                            <div class="modal" id="kkkk" tabindex="-1" aria-labelledby="remove1" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h1 class="modal-title  fs-5" id="remove1">Delete All Personnel</h1>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                        </div>
                                        <div class="modal-body">
                                            <h5 class="text-secondary">Are You Sure You Want To Delete This Records</h5>
                                            <p class="text-warning"><small>This Action Cannot Be Undone</small></p>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-bs-dismiss="modal">Cancel</button>
                                            <button type="button" class="btn btn-danger">Delete</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="p-2">
                            <button class="btn" style="background-color: orange;color: white" >
                                Import
                            </button>
                        </div>

                        <div class="p-2">
                            <button class="btn"style="background-color: #EFCACA;color: #BF0000" >
                                Export
                            </button>
                        </div>
                        <%--search--%>
                    <div class="ms-auto p-2">
                        <div class="InputContainer ">
                            <input type="text" name="text" class="input" id="input" placeholder="Search">

                            <label for="input" class="labelforsearch">
                                <svg viewBox="0 0 512 512" class="searchIcon"><path d="M416 208c0 45.9-14.9 88.3-40 122.7L502.6 457.4c12.5 12.5 12.5 32.8 0 45.3s-32.8 12.5-45.3 0L330.7 376c-34.4 25.2-76.8 40-122.7 40C93.1 416 0 322.9 0 208S93.1 0 208 0S416 93.1 416 208zM208 352a144 144 0 1 0 0-288 144 144 0 1 0 0 288z"></path></svg>
                            </label>
                            <div class="border"></div>

                            <button class="micButton"><svg viewBox="0 0 384 512" class="micIcon"><path d="M192 0C139 0 96 43 96 96V256c0 53 43 96 96 96s96-43 96-96V96c0-53-43-96-96-96zM64 216c0-13.3-10.7-24-24-24s-24 10.7-24 24v40c0 89.1 66.2 162.7 152 174.4V464H120c-13.3 0-24 10.7-24 24s10.7 24 24 24h72 72c13.3 0 24-10.7 24-24s-10.7-24-24-24H216V430.4c85.8-11.7 152-85.3 152-174.4V216c0-13.3-10.7-24-24-24s-24 10.7-24 24v40c0 70.7-57.3 128-128 128s-128-57.3-128-128V216z"></path></svg>
                            </button>
                        </div>
                    </div>
                    </div>

                </div>


            </div>


            <div class="col-xl-3 col-xxl-4 col-sm-6">
                <div class="card user-card">
                    <div class="card-body pb-0">
                        <div class="d-flex mb-3 align-items-center">
                            <div class="dz-media mr-3">
                                <img src="/template/admin/images/users/pic1.jpg" alt="">
                            </div>
                            <div>
                                <h5 class="title"><a href="javascript:void(0);">Thomas Djons</a></h5>
                                <span class="" style="color: #eb8153">Senior Developer</span>
                            </div>
                        </div>
                        <p class="fs-12">Answering guest inquiries, directing phone calls, coordinating travel plans, and more.</p>

                    </div>
                    <div class="card-footer d-flex justify-content-between">

                        <a class="edit-button" href="/admin/dashboards/updateNV" style="text-decoration: none">
                            <svg class="edit-svgIcon" viewBox="0 0 512 512">
                                <path d="M410.3 231l11.3-11.3-33.9-33.9-62.1-62.1L291.7 89.8l-11.3 11.3-22.6 22.6L58.6 322.9c-10.4 10.4-18 23.3-22.2 37.4L1 480.7c-2.5 8.4-.2 17.5 6.1 23.7s15.3 8.5 23.7 6.1l120.3-35.4c14.1-4.2 27-11.8 37.4-22.2L387.7 253.7 410.3 231zM160 399.4l-9.1 22.7c-4 3.1-8.5 5.4-13.3 6.9L59.4 452l23-78.1c1.4-4.9 3.8-9.4 6.9-13.3l22.7-9.1v32c0 8.8 7.2 16 16 16h32zM362.7 18.7L348.3 33.2 325.7 55.8 314.3 67.1l33.9 33.9 62.1 62.1 33.9 33.9 11.3-11.3 22.6-22.6 14.5-14.5c25-25 25-65.5 0-90.5L453.3 18.7c-25-25-65.5-25-90.5 0zm-47.4 168l-144 144c-6.2 6.2-16.4 6.2-22.6 0s-6.2-16.4 0-22.6l144-144c6.2-6.2 16.4-6.2 22.6 0s6.2 16.4 0 22.6z"></path>
                            </svg>
                        </a>

                        <button class="delete-button"  data-bs-toggle="modal" data-bs-target="#kkk">
                            <svg class="delete-svgIcon" viewBox="0 0 448 512">
                                <path d="M135.2 17.7L128 32H32C14.3 32 0 46.3 0 64S14.3 96 32 96H416c17.7 0 32-14.3 32-32s-14.3-32-32-32H320l-7.2-14.3C307.4 6.8 296.3 0 284.2 0H163.8c-12.1 0-23.2 6.8-28.6 17.7zM416 128H32L53.2 467c1.6 25.3 22.6 45 47.9 45H346.9c25.3 0 46.3-19.7 47.9-45L416 128z"></path>
                            </svg>
                        </button>
                        <div class="modal" id="kkk" tabindex="-1" aria-labelledby="remove" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h1 class="modal-title  fs-5" id="remove">Delete Personnel</h1>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <h5 class="text-secondary">Are You Sure You Want To Delete This Records</h5>
                                        <p class="text-warning"><small>This Action Cannot Be Undone</small></p>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-bs-dismiss="modal">Cancel</button>
                                        <button type="button" class="btn btn-danger">Delete</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-xl-3 col-xxl-4 col-sm-6">
                <div class="card user-card">
                    <div class="card-body pb-0">
                        <div class="d-flex mb-3 align-items-center">
                            <div class="dz-media mr-3 rounded-circle">
                                <img src="/template/admin/images/users/pic2.jpg" alt="">
                            </div>
                            <div>
                                <h5 class="title"><a href="javascript:void(0);">Oliver Jean</a></h5>
                                <span class="" style="color: #eb8153">Junior Developer</span>
                            </div>
                        </div>
                        <p class="fs-12">Maintain inventory of supplies and order new stock as needed Maintain inventory stock</p>

                    </div>
                    <div class="card-footer d-flex justify-content-between">

                        <button class="edit-button">
                            <svg class="edit-svgIcon" viewBox="0 0 512 512">
                                <path d="M410.3 231l11.3-11.3-33.9-33.9-62.1-62.1L291.7 89.8l-11.3 11.3-22.6 22.6L58.6 322.9c-10.4 10.4-18 23.3-22.2 37.4L1 480.7c-2.5 8.4-.2 17.5 6.1 23.7s15.3 8.5 23.7 6.1l120.3-35.4c14.1-4.2 27-11.8 37.4-22.2L387.7 253.7 410.3 231zM160 399.4l-9.1 22.7c-4 3.1-8.5 5.4-13.3 6.9L59.4 452l23-78.1c1.4-4.9 3.8-9.4 6.9-13.3l22.7-9.1v32c0 8.8 7.2 16 16 16h32zM362.7 18.7L348.3 33.2 325.7 55.8 314.3 67.1l33.9 33.9 62.1 62.1 33.9 33.9 11.3-11.3 22.6-22.6 14.5-14.5c25-25 25-65.5 0-90.5L453.3 18.7c-25-25-65.5-25-90.5 0zm-47.4 168l-144 144c-6.2 6.2-16.4 6.2-22.6 0s-6.2-16.4 0-22.6l144-144c6.2-6.2 16.4-6.2 22.6 0s6.2 16.4 0 22.6z"></path>
                            </svg>
                        </button>

                        <button class="delete-button"  data-bs-toggle="modal" data-bs-target="#kkk">
                            <svg class="delete-svgIcon" viewBox="0 0 448 512">
                                <path d="M135.2 17.7L128 32H32C14.3 32 0 46.3 0 64S14.3 96 32 96H416c17.7 0 32-14.3 32-32s-14.3-32-32-32H320l-7.2-14.3C307.4 6.8 296.3 0 284.2 0H163.8c-12.1 0-23.2 6.8-28.6 17.7zM416 128H32L53.2 467c1.6 25.3 22.6 45 47.9 45H346.9c25.3 0 46.3-19.7 47.9-45L416 128z"></path>
                            </svg>
                        </button>
                        <div class="modal" id="kkk" tabindex="-1" aria-labelledby="remove" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h1 class="modal-title  fs-5" id="remove">Delete Personnel</h1>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <h5 class="text-secondary">Are You Sure You Want To Delete This Records</h5>
                                        <p class="text-warning"><small>This Action Cannot Be Undone</small></p>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-bs-dismiss="modal">Cancel</button>
                                        <button type="button" class="btn btn-danger">Delete</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-xl-3 col-xxl-4 col-sm-6">
                <div class="card user-card">
                    <div class="card-body pb-0">
                        <div class="d-flex mb-3 align-items-center">
                            <div class="dz-media mr-3">
                                <span class="icon-placeholder bg-primary text-white">pm</span>
                            </div>
                            <div>
                                <h5 class="title"><a href="javascript:void(0);">Post Melone</a></h5>
                                <span class=""  style="color: #eb8153">Senior Designer</span>
                            </div>
                        </div>
                        <p class="fs-12">Anticipate guests needs in order to accommodate them and provide an exceptional guest experience</p>

                    </div>
                    <div class="card-footer d-flex justify-content-between">

                        <button class="edit-button">
                            <svg class="edit-svgIcon" viewBox="0 0 512 512">
                                <path d="M410.3 231l11.3-11.3-33.9-33.9-62.1-62.1L291.7 89.8l-11.3 11.3-22.6 22.6L58.6 322.9c-10.4 10.4-18 23.3-22.2 37.4L1 480.7c-2.5 8.4-.2 17.5 6.1 23.7s15.3 8.5 23.7 6.1l120.3-35.4c14.1-4.2 27-11.8 37.4-22.2L387.7 253.7 410.3 231zM160 399.4l-9.1 22.7c-4 3.1-8.5 5.4-13.3 6.9L59.4 452l23-78.1c1.4-4.9 3.8-9.4 6.9-13.3l22.7-9.1v32c0 8.8 7.2 16 16 16h32zM362.7 18.7L348.3 33.2 325.7 55.8 314.3 67.1l33.9 33.9 62.1 62.1 33.9 33.9 11.3-11.3 22.6-22.6 14.5-14.5c25-25 25-65.5 0-90.5L453.3 18.7c-25-25-65.5-25-90.5 0zm-47.4 168l-144 144c-6.2 6.2-16.4 6.2-22.6 0s-6.2-16.4 0-22.6l144-144c6.2-6.2 16.4-6.2 22.6 0s6.2 16.4 0 22.6z"></path>
                            </svg>
                        </button>

                        <button class="delete-button"  data-bs-toggle="modal" data-bs-target="#kkk">
                            <svg class="delete-svgIcon" viewBox="0 0 448 512">
                                <path d="M135.2 17.7L128 32H32C14.3 32 0 46.3 0 64S14.3 96 32 96H416c17.7 0 32-14.3 32-32s-14.3-32-32-32H320l-7.2-14.3C307.4 6.8 296.3 0 284.2 0H163.8c-12.1 0-23.2 6.8-28.6 17.7zM416 128H32L53.2 467c1.6 25.3 22.6 45 47.9 45H346.9c25.3 0 46.3-19.7 47.9-45L416 128z"></path>
                            </svg>
                        </button>
                        <div class="modal" id="kkk" tabindex="-1" aria-labelledby="remove" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h1 class="modal-title  fs-5" id="remove">Delete Personnel</h1>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <h5 class="text-secondary">Are You Sure You Want To Delete This Records</h5>
                                        <p class="text-warning"><small>This Action Cannot Be Undone</small></p>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-bs-dismiss="modal">Cancel</button>
                                        <button type="button" class="btn btn-danger">Delete</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-xl-3 col-xxl-4 col-sm-6">
                <div class="card user-card">
                    <div class="card-body pb-0">
                        <div class="d-flex mb-3 align-items-center">
                            <div class="dz-media rounded-circle mr-3">
                                <span class="icon-placeholder bgl-success text-success">km</span>
                            </div>
                            <div>
                                <h5 class="title"><a href="javascript:void(0);">Kevin Mandala</a></h5>
                                <span class="" style="color: #eb8153">Junior Developer</span>
                            </div>
                        </div>
                        <p class="fs-12">Answering guest inquiries, directing phone calls, coordinating travel plans, and more.</p>

                    </div>
                    <div class="card-footer d-flex justify-content-between">

                        <button class="edit-button">
                            <svg class="edit-svgIcon" viewBox="0 0 512 512">
                                <path d="M410.3 231l11.3-11.3-33.9-33.9-62.1-62.1L291.7 89.8l-11.3 11.3-22.6 22.6L58.6 322.9c-10.4 10.4-18 23.3-22.2 37.4L1 480.7c-2.5 8.4-.2 17.5 6.1 23.7s15.3 8.5 23.7 6.1l120.3-35.4c14.1-4.2 27-11.8 37.4-22.2L387.7 253.7 410.3 231zM160 399.4l-9.1 22.7c-4 3.1-8.5 5.4-13.3 6.9L59.4 452l23-78.1c1.4-4.9 3.8-9.4 6.9-13.3l22.7-9.1v32c0 8.8 7.2 16 16 16h32zM362.7 18.7L348.3 33.2 325.7 55.8 314.3 67.1l33.9 33.9 62.1 62.1 33.9 33.9 11.3-11.3 22.6-22.6 14.5-14.5c25-25 25-65.5 0-90.5L453.3 18.7c-25-25-65.5-25-90.5 0zm-47.4 168l-144 144c-6.2 6.2-16.4 6.2-22.6 0s-6.2-16.4 0-22.6l144-144c6.2-6.2 16.4-6.2 22.6 0s6.2 16.4 0 22.6z"></path>
                            </svg>
                        </button>

                        <button class="delete-button"  data-bs-toggle="modal" data-bs-target="#kkk">
                            <svg class="delete-svgIcon" viewBox="0 0 448 512">
                                <path d="M135.2 17.7L128 32H32C14.3 32 0 46.3 0 64S14.3 96 32 96H416c17.7 0 32-14.3 32-32s-14.3-32-32-32H320l-7.2-14.3C307.4 6.8 296.3 0 284.2 0H163.8c-12.1 0-23.2 6.8-28.6 17.7zM416 128H32L53.2 467c1.6 25.3 22.6 45 47.9 45H346.9c25.3 0 46.3-19.7 47.9-45L416 128z"></path>
                            </svg>
                        </button>
                        <div class="modal" id="kkk" tabindex="-1" aria-labelledby="remove" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h1 class="modal-title  fs-5" id="remove">Delete Personnel</h1>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <h5 class="text-secondary">Are You Sure You Want To Delete This Records</h5>
                                        <p class="text-warning"><small>This Action Cannot Be Undone</small></p>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-bs-dismiss="modal">Cancel</button>
                                        <button type="button" class="btn btn-danger">Delete</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-xl-3 col-xxl-4 col-sm-6">
                <div class="card user-card">
                    <div class="card-body pb-0">
                        <div class="d-flex mb-3 align-items-center">
                            <div class="dz-media mr-3">
                                <img src="/template/admin/images/users/pic3.jpg" alt="">
                            </div>
                            <div>
                                <h5 class="title"><a href="javascript:void(0);">Mc. Kowalski</a></h5>
                                <span class="" style="color: #eb8153">Php Developer</span>
                            </div>
                        </div>
                        <p class="fs-12">Answering guest inquiries, directing phone calls, coordinating travel plans, and more.</p>

                    </div>
                    <div class="card-footer d-flex justify-content-between">

                        <button class="edit-button">
                            <svg class="edit-svgIcon" viewBox="0 0 512 512">
                                <path d="M410.3 231l11.3-11.3-33.9-33.9-62.1-62.1L291.7 89.8l-11.3 11.3-22.6 22.6L58.6 322.9c-10.4 10.4-18 23.3-22.2 37.4L1 480.7c-2.5 8.4-.2 17.5 6.1 23.7s15.3 8.5 23.7 6.1l120.3-35.4c14.1-4.2 27-11.8 37.4-22.2L387.7 253.7 410.3 231zM160 399.4l-9.1 22.7c-4 3.1-8.5 5.4-13.3 6.9L59.4 452l23-78.1c1.4-4.9 3.8-9.4 6.9-13.3l22.7-9.1v32c0 8.8 7.2 16 16 16h32zM362.7 18.7L348.3 33.2 325.7 55.8 314.3 67.1l33.9 33.9 62.1 62.1 33.9 33.9 11.3-11.3 22.6-22.6 14.5-14.5c25-25 25-65.5 0-90.5L453.3 18.7c-25-25-65.5-25-90.5 0zm-47.4 168l-144 144c-6.2 6.2-16.4 6.2-22.6 0s-6.2-16.4 0-22.6l144-144c6.2-6.2 16.4-6.2 22.6 0s6.2 16.4 0 22.6z"></path>
                            </svg>
                        </button>

                        <button class="delete-button"  data-bs-toggle="modal" data-bs-target="#kkk">
                            <svg class="delete-svgIcon" viewBox="0 0 448 512">
                                <path d="M135.2 17.7L128 32H32C14.3 32 0 46.3 0 64S14.3 96 32 96H416c17.7 0 32-14.3 32-32s-14.3-32-32-32H320l-7.2-14.3C307.4 6.8 296.3 0 284.2 0H163.8c-12.1 0-23.2 6.8-28.6 17.7zM416 128H32L53.2 467c1.6 25.3 22.6 45 47.9 45H346.9c25.3 0 46.3-19.7 47.9-45L416 128z"></path>
                            </svg>
                        </button>
                        <div class="modal" id="kkk" tabindex="-1" aria-labelledby="remove" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h1 class="modal-title  fs-5" id="remove">Delete Personnel</h1>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <h5 class="text-secondary">Are You Sure You Want To Delete This Records</h5>
                                        <p class="text-warning"><small>This Action Cannot Be Undone</small></p>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-bs-dismiss="modal">Cancel</button>
                                        <button type="button" class="btn btn-danger">Delete</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-xl-3 col-xxl-4 col-sm-6">
                <div class="card user-card">
                    <div class="card-body pb-0">
                        <div class="d-flex mb-3 align-items-center">
                            <div class="dz-media mr-3">
                                <img src="/template/admin/images/users/pic4.jpg" alt="">
                            </div>
                            <div>
                                <h5 class="title"><a href="javascript:void(0);">Rio Fernandez</a></h5>
                                <span class=""  style="color: #eb8153">Python Developer</span>
                            </div>
                        </div>
                        <p class="fs-12">Answering guest inquiries, directing phone calls, coordinating travel plans, and more.</p>

                    </div>
                    <div class="card-footer d-flex justify-content-between">

                        <button class="edit-button">
                            <svg class="edit-svgIcon" viewBox="0 0 512 512">
                                <path d="M410.3 231l11.3-11.3-33.9-33.9-62.1-62.1L291.7 89.8l-11.3 11.3-22.6 22.6L58.6 322.9c-10.4 10.4-18 23.3-22.2 37.4L1 480.7c-2.5 8.4-.2 17.5 6.1 23.7s15.3 8.5 23.7 6.1l120.3-35.4c14.1-4.2 27-11.8 37.4-22.2L387.7 253.7 410.3 231zM160 399.4l-9.1 22.7c-4 3.1-8.5 5.4-13.3 6.9L59.4 452l23-78.1c1.4-4.9 3.8-9.4 6.9-13.3l22.7-9.1v32c0 8.8 7.2 16 16 16h32zM362.7 18.7L348.3 33.2 325.7 55.8 314.3 67.1l33.9 33.9 62.1 62.1 33.9 33.9 11.3-11.3 22.6-22.6 14.5-14.5c25-25 25-65.5 0-90.5L453.3 18.7c-25-25-65.5-25-90.5 0zm-47.4 168l-144 144c-6.2 6.2-16.4 6.2-22.6 0s-6.2-16.4 0-22.6l144-144c6.2-6.2 16.4-6.2 22.6 0s6.2 16.4 0 22.6z"></path>
                            </svg>
                        </button>

                        <button class="delete-button"  data-bs-toggle="modal" data-bs-target="#kkk">
                            <svg class="delete-svgIcon" viewBox="0 0 448 512">
                                <path d="M135.2 17.7L128 32H32C14.3 32 0 46.3 0 64S14.3 96 32 96H416c17.7 0 32-14.3 32-32s-14.3-32-32-32H320l-7.2-14.3C307.4 6.8 296.3 0 284.2 0H163.8c-12.1 0-23.2 6.8-28.6 17.7zM416 128H32L53.2 467c1.6 25.3 22.6 45 47.9 45H346.9c25.3 0 46.3-19.7 47.9-45L416 128z"></path>
                            </svg>
                        </button>
                        <div class="modal" id="kkk" tabindex="-1" aria-labelledby="remove" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h1 class="modal-title  fs-5" id="remove">Delete Personnel</h1>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <h5 class="text-secondary">Are You Sure You Want To Delete This Records</h5>
                                        <p class="text-warning"><small>This Action Cannot Be Undone</small></p>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-bs-dismiss="modal">Cancel</button>
                                        <button type="button" class="btn btn-danger">Delete</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>

        </div>
        <nav>
            <ul class="pagination pagination-gutter pagination-primary no-bg d-flex justify-content-center">
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
</body>
</html>
