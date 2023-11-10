$('#add-mo-ca').on('click', function (){
    $.ajax({
        url: `/api/staff?ma=${user_name}&trangthai=1`,
        type: 'PUT',
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        headers: { Authorization: $`Bearer ${access_token}` },
        success: function (response) {
            window.location.href = "/admin/giaodich/hoadon";
        },
        error: function (error) {
            console.log(error);
        }
    })
});