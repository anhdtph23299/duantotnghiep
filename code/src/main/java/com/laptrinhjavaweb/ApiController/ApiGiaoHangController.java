package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.model.datarq.ApiResponse;
import com.laptrinhjavaweb.model.datarq.PreviewGiaoHang;
import com.laptrinhjavaweb.model.datarq.SanPhamGhnApi;
import com.laptrinhjavaweb.model.request.ThongTinDatHangRequest;
import com.laptrinhjavaweb.util.convertjson.ConvertJson;
import com.laptrinhjavaweb.util.convertjson.DiaChiBuuCuc;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/admin/giaohang")
@CrossOrigin(origins = "*")
public class ApiGiaoHangController {

    @Value("${tokenghn.string}")
    private String tokenghn;
    @Value("${urlgiaohang.string}")
    private String urlGiaoHang ;

    RestTemplate restTemplate = new RestTemplate();

  //  @Value("${diachibuucuc.string}")
    private String diaChiBuuCuc ="Số 97 Thiên hiền , Phường Mỹ Đình 1, QUận Nam Từ Liêm , Hà Nội, Vietnam";

    private String[] getDiaChi(){
        String[] diaChi =  diaChiBuuCuc.replace(" ","").split(",");
        ArrayUtils.reverse(diaChi);
        diaChi[0] = diaChiBuuCuc;
       return diaChi;
    }
    ThongTinDatHangRequest getData (){
        String[] diaChi = getDiaChi();
        System.out.println(diaChi);
        List<SanPhamGhnApi> sps = new ArrayList<>();
        SanPhamGhnApi sp = SanPhamGhnApi.builder()
                .name("Áo Polo")
                //  .code("Polo123")
                .quantity(1)
                .price(200000L)
//                                .length(12)
//                                .width(12)
//                                .weight(1200)
//                                .height(12)
                .build();
        sps.add(sp);
        ThongTinDatHangRequest request = ThongTinDatHangRequest.builder()
                .payment_type_id(2L)
                .note("Chuyển khoản")
                .required_note("KHONGCHOXEMHANG")
                .client_order_code("")
                .from_name("Lợn ABC")
                .from_phone("0389478937")
                .from_address(diaChi[0])
                .from_ward_name(diaChi[3])
                .from_district_name(diaChi[2])
                .from_province_name(diaChi[1])
                .to_name("Nguyễn thị thơ")
                .to_phone("0977853450")
                .to_address("Ninh Hoà, Xã Yên Trị, Huyện Yên Thủy, Hòa Bình, Vietnam")
                .to_ward_name("Xã Yên Trị")
                .to_district_name("Huyện Yên Thủy")
                .to_province_name("Hòa Bình")
                .cod_amount(70000L)
                .content("Test mua đơn hàng")
                .weight(200)
                .length(1)
                .width(19)
                .height(10)
                .deliver_station_id(null)
                .service_id(0L)
                .service_type_id(2L)
                .items(Arrays.asList(
                        SanPhamGhnApi.builder()
                                .name("Áo Polo")
                               // .code("Polo123")
                                .quantity(1)
                                .price(200000L)
                                .build()
                ))
                .build();

        return request;
    }

    HttpHeaders getHeader (){
        HttpHeaders headers = new HttpHeaders();
        headers.set("Token", tokenghn);
        headers.setContentType(MediaType.APPLICATION_JSON);
        return  headers;
    }
    @GetMapping("/preview")
    public ResponseEntity<Object> preview() throws IOException {
        final String uri = urlGiaoHang + "/preview";

        // Tạo HttpHeaders và đặt các header
        HttpHeaders headers = getHeader();

        // Tạo đối tượng request
        ThongTinDatHangRequest request = getData();

        // Sử dụng `request` để truyền dữ liệu JSON
        HttpEntity<ThongTinDatHangRequest> requestEntity = new HttpEntity<>(request, headers);

        // Gọi API với yêu cầu POST và `requestEntity`
        PreviewGiaoHang responseEntity = ConvertJson.convert(restTemplate,uri
                ,HttpMethod.POST,requestEntity
        ,   new ParameterizedTypeReference<ApiResponse<PreviewGiaoHang>>() {}
        );
            // Xử lý khi yêu cầu thành công
            return ResponseEntity.ok(responseEntity);
    }

    @GetMapping("/order")
    public ResponseEntity<Object> order() {
        final String uri = urlGiaoHang + "/create";

        // Tạo HttpHeaders và đặt các header
        HttpHeaders headers = new HttpHeaders();
        headers.set("Token", tokenghn);
        headers.set("ShopId","190177");
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Tạo đối tượng request
        ThongTinDatHangRequest request = getData();

        // Sử dụng `request` để truyền dữ liệu JSON
        HttpEntity<ThongTinDatHangRequest> requestEntity = new HttpEntity<>(request, headers);

        // Gọi API với yêu cầu POST và `requestEntity`
        ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, requestEntity, Object.class);

        HttpStatus httpStatus = responseEntity.getStatusCode();

        if (httpStatus.is2xxSuccessful()) {
            // Xử lý khi yêu cầu thành công
            Object result = responseEntity.getBody();
            return ResponseEntity.ok(result);
        } else {
            // Trả về phản hồi từ API với mã lỗi và thông báo lỗi
            Object apiErrorResponse = responseEntity.getBody();
            return ResponseEntity.status(httpStatus).body(apiErrorResponse);
        }
    }

}
