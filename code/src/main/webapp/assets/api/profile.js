function informationLogin(){
    $.ajax({
        url: '/api/profile',
        method: 'GET',
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        headers: {
            Authorization: 'Bearer '+ localStorage.getItem("ACCESS_TOKEN")
        },
        success: function (response) {
            localStorage.setItem("USER_NAME", response.username);
            localStorage.setItem("FULL_NAME", response.fullname);
            localStorage.setItem("ROLE", response.chucvu);
        },
        error: function (error) {
            console.log(error)
        }
    })
}

