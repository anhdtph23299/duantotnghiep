$(".btn-add-product").on("click", function (event) {
    event.preventDefault();
    let data = getDataFromForm();
    console.log(data);
    console.log(images);
    console.log(valueAttributes);
    const variants = getVariants();
    console.log(variants);
});

function getDataFromForm() {
    let dataFromForm = $(".form-submit-product").serializeArray();
    let data = {};
    $.each(dataFromForm, (index, value) => {
        let propertyName = value.name;
        let propertyValue = value.value;
        if (propertyName === "chitietsanpham") {
            propertyValue = CKEDITOR.instances.chitietsanpham.getData();
        }

        if (propertyName === "motasanpham") {
            propertyValue = CKEDITOR.instances.motasanpham.getData();
        }
        data[propertyName] = propertyValue;
    });
    return data;
}

function getVariants(){
    let variants = [];
    $(".table-variant-body tr").each((index, item) => {
        const ten = item.querySelector('.ten').textContent;
        let gia = null;
        if (item.querySelector('.gia').value !== null) {
            gia = item.querySelector('.gia').value
        }
        let hinhanh = null;
        let hinhanhbase64 = null;
        if (item.querySelector('.hinhanh') && item.querySelector('.hinhanh').files.length > 0) {
            hinhanh = item.querySelector('.hinhanh').files[0].name;
            hinhanhbase64 = item.querySelector('.hinhanhbase64').src;
        }
        let data = {};
        data['ten'] = ten;
        data['gia'] = gia;
        data['hinhanh'] = hinhanh;
        data['hinhanhbase64'] = hinhanhbase64;
        variants.push(data);
    });
    return variants;
}


