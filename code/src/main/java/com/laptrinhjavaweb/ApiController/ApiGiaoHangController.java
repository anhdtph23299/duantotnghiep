package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.model.datarq.SanPham;
import com.laptrinhjavaweb.model.request.ThongTinDatHangRequest;
import org.springframework.beans.factory.annotation.Value;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
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

    ThongTinDatHangRequest getData (){
        List<SanPham> sps = new ArrayList<>();
        SanPham sp = SanPham.builder()
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
                .from_address("Nhà 28 ngõ 25 ngách 106 đường phú minh, Phường Minh Khai, Quận Bắc Từ Liêm, Hà Nội, Vietnam")
                .from_ward_name("Phường Minh Khai")
                .from_district_name("Quận Bắc Từ Liêm")
                .from_province_name("Hà Nội")
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
                        SanPham.builder()
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
    public ResponseEntity<Object> preview() {
        final String uri = urlGiaoHang + "/preview";

        // Tạo HttpHeaders và đặt các header
        HttpHeaders headers = getHeader();

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
