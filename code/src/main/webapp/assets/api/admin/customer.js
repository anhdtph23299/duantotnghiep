$('#btn-add-customer').on('click', ()=>{
    let dataForm = $('#form-data-customer').serializeArray();
    let data = {};
    $.each(dataForm, (index, value) => {
        let propertyName = value.name;
        let propertyValue = value.value;

        data[propertyName] = propertyValue;
    });
    $.ajax({
        url: "/api/assignment/customer",
        method: "POST",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        data: JSON.stringify(data),
        success: (response) => {
            $('.close-add-customer').removeClass('show');
            $('.modal-backdrop').addClass('d-none');
            $('#search-customer').val(`${response.ten} + " - " + ${response.sodienthoai}`);
            $('#code-customer').val(response.ma);
        },
        error: (error) => {
            console.log(error);
        }
    });
})