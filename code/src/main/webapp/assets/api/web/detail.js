const pathNameOfUrl = window.location.pathname;
const splits = pathNameOfUrl.split('/');
let slug = splits[splits.length - 1];

$.ajax({
    url: `/api/sanphams/${slug}`,
    method: "GET",
    dataType: "json",
    success: (response) => {
        $('.product-name').html(response.ten);
        $('.product-price').html(response.gia);
        $('.product-image-primary').attr('src', `/assets/images/sanphams/${response.sanphamhinhanh[0].hinhanh}`);
        $.each(response.thuoctinh, (index, item) => {
            document.title = `${response.ten}`;
            let htmlAttr = ` <div class="d-flex mb-4">
                            <p class="text-dark font-weight-medium mb-0 mr-3">${item.ten}:</p><form>`;
            $.each(item.giatrithuoctinh, (index, itemAttrValue) => {
                htmlAttr += `<div class="custom-control custom-radio custom-control-inline">
                                <input type="radio" class="custom-control-input" value="${itemAttrValue.id}">
                                <label class="custom-control-label">${itemAttrValue.giatri}</label>
                            </div>`;
            })
            htmlAttr += '</form></div>';
            $('.product-attribute').append(htmlAttr);
        })
        let htmlImage = '';
        $.each(response.sanphamhinhanh, (index, item) => {
            if(index !== 0){
                htmlImage += `<div class="card product-item border-0">
                                <div class="card-header product-img position-relative overflow-hidden bg-transparent border p-0">
                                    <img alt="Ảnh sản phẩm" class="img-fluid w-100" src="/assets/images/sanphams/${item.hinhanh}"/>
                                </div>
                            </div>`;
            }
        })
        $('.product-list-images').html(htmlImage);
        $('.product-description').html(response.motasanpham);
    },

    error: (error) => {
        //console.log(error);
        window.location.href = "/not-found";
    }
});