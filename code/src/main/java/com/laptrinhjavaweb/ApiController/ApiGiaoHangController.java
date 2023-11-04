package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.model.datarq.ApiResponse;
import com.laptrinhjavaweb.model.datarq.PreviewGiaoHang;
import com.laptrinhjavaweb.model.request.ThongTinDatHangRequest;
import com.laptrinhjavaweb.service.GiaoHangService;
import com.laptrinhjavaweb.util.convertjson.ConvertJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
@RequestMapping("/api/admin/giaohang")
@CrossOrigin(origins = "*")
public class ApiGiaoHangController {

    @Autowired
    private GiaoHangService giaoHangService;
    @Value("${tokenghn.string}")
    private String tokenghn;
    @Value("${urlgiaohang.string}")
    private String urlGiaoHang ;

    RestTemplate restTemplate = new RestTemplate();

  //  @Value("${diachibuucuc.string}")


    HttpHeaders getHeader (){
        HttpHeaders headers = new HttpHeaders();
        headers.set("Token", tokenghn);
        headers.setContentType(MediaType.APPLICATION_JSON);
        return  headers;
    }

    @GetMapping("/phiship")
    public ResponseEntity<Object> phiShip(@RequestParam(name = "idttgh") Long idttgh,
                                          @RequestParam(name = "idkh") Long idkh) throws IOException {
        final String uri = urlGiaoHang + "/preview";

        // Tạo HttpHeaders và đặt các header
        HttpHeaders headers = getHeader();

        // Tạo đối tượng request
        ThongTinDatHangRequest request = giaoHangService.getThongTinDatHang(idttgh,idkh);

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


//    @GetMapping("/preview")
//    public ResponseEntity<Object> preview() throws IOException {
//        final String uri = urlGiaoHang + "/preview";
//
//        // Tạo HttpHeaders và đặt các header
//        HttpHeaders headers = getHeader();
//
//        // Tạo đối tượng request
//        ThongTinDatHangRequest request = getData();
//
//        // Sử dụng `request` để truyền dữ liệu JSON
//        HttpEntity<ThongTinDatHangRequest> requestEntity = new HttpEntity<>(request, headers);
//
//        // Gọi API với yêu cầu POST và `requestEntity`
//        PreviewGiaoHang responseEntity = ConvertJson.convert(restTemplate,uri
//                ,HttpMethod.POST,requestEntity
//        ,   new ParameterizedTypeReference<ApiResponse<PreviewGiaoHang>>() {}
//        );
//            // Xử lý khi yêu cầu thành công
//            return ResponseEntity.ok(responseEntity);
//    }

//    @GetMapping("/order")
//    public ResponseEntity<Object> order() {
//        final String uri = urlGiaoHang + "/create";
//
//        // Tạo HttpHeaders và đặt các header
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Token", tokenghn);
//        headers.set("ShopId","190177");
//        headers.setContentType(MediaType.APPLICATION_JSON);
//
//        // Tạo đối tượng request
//        ThongTinDatHangRequest request = getData();
//
//        // Sử dụng `request` để truyền dữ liệu JSON
//        HttpEntity<ThongTinDatHangRequest> requestEntity = new HttpEntity<>(request, headers);
//
//        // Gọi API với yêu cầu POST và `requestEntity`
//        ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, requestEntity, Object.class);
//
//        HttpStatus httpStatus = responseEntity.getStatusCode();
//
//        if (httpStatus.is2xxSuccessful()) {
//            // Xử lý khi yêu cầu thành công
//            Object result = responseEntity.getBody();
//            return ResponseEntity.ok(result);
//        } else {
//            // Trả về phản hồi từ API với mã lỗi và thông báo lỗi
//            Object apiErrorResponse = responseEntity.getBody();
//            return ResponseEntity.status(httpStatus).body(apiErrorResponse);
//        }
//    }

}
