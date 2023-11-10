$('#login-admin').on('click', function (event){
    event.preventDefault();
    let data = {
        userName: $('#userName').val(),
        password: $('#password').val()
    };
    $.ajax({
        url: '/api/staff/login',
        method: "POST",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        data: JSON.stringify(data),
        success: function (response) {
            localStorage.setItem("ACCESS_TOKEN", response.token);
            informationLogin();
            window.location.href = response.uri;
        },
        error: function (error) {
            window.location.href = "/admin/login?incorrectAccount";
        }
    })
})

$('#login-web').on('click', function (event){
    event.preventDefault();
    let data = {
        userName: $('#userName').val(),
        password: $('#password').val()
    };
    console.log(data);
    // $.ajax({
    //     url: '/api/customer/login',
    //     method: "POST",
    //     contentType: "application/json; charset=utf-8",
    //     dataType: "json",
    //     data: JSON.stringify(data),
    //     success: function (response) {
    //         localStorage.setItem("ACCESS_TOKEN", response.token);
    //         window.location.href = response.uri;
    //     },
    //     error: function (error) {
    //         window.location.href = "/login?incorrectAccount";
    //     }
    // })
})