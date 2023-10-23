package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.service.ThongTinMuaHangService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user/ttgh")
@CrossOrigin(origins = "*")
public class ApiThongTinMuaHangController {
    @Autowired
    ThongTinMuaHangService thongTinMuaHangService;

    @Value("${tokenghn.string}")
    private String tokenghn;

    RestTemplate restTemplate = new RestTemplate();
    @GetMapping("/default/{idkh}")
    public ResponseObject getDefaultThongTinGiaoHang(@PathVariable(name = "idkh")Long idkh){
        return new ResponseObject(thongTinMuaHangService.findThongTinMuaHangDefault(idkh));
    }

    @GetMapping("/dsthongtingiaohang/{idkh}")
    public ResponseObject dsThongTinGiaoHang(@PathVariable(name = "idkh")Long idkh){
        return new ResponseObject(thongTinMuaHangService.dsThongTinMuaHang(idkh));
    }

    @GetMapping("/thanhpho")
    public Object thanhPho() {
        final String uri = "https://online-gateway.ghn.vn/shiip/public-api/master-data/province";

        // Tạo HttpHeaders và đặt các header mà bạn muốn thêm
        HttpHeaders headers = new HttpHeaders();
        headers.set("Token", tokenghn); // Thay "HeaderName" và "HeaderValue" bằng giá trị thực tế

        // Tạo yêu cầu sử dụng HttpHeaders
        HttpEntity<Object> entity = new HttpEntity<>(headers);

        // Gọi API với yêu cầu có header
        ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, entity, Object.class);

        Object result = responseEntity.getBody();
        return result;
    }

    @GetMapping("/huyen/{id}")
    public Object quanhuyen(@PathVariable(name = "id")Long id) {
        final String uri = "https://online-gateway.ghn.vn/shiip/public-api/master-data/district";

        // Tạo HttpHeaders và đặt các header
        HttpHeaders headers = new HttpHeaders();
        headers.set("Token", tokenghn);
        headers.setContentType(MediaType.APPLICATION_JSON);
// Tạo một Map để biểu diễn dữ liệu JSON
        Map<String, Object> requestBody = new LinkedHashMap<>();
        requestBody.put("province_id",id);
        // Sử dụng `requestBody` để truyền dữ liệu JSON
        // requestBody sẽ được tự động chuyển thành JSON bởi Spring Boot
        HttpEntity<Object> requestEntity = new HttpEntity<>(requestBody, headers);

        // Gọi API với yêu cầu POST và `requestBody`
        ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, requestEntity, Object.class);

        Object result = responseEntity.getBody();
        return result;
    }

    @GetMapping("/xa/{id}")
    public Object xa(@PathVariable(name = "id")Long id) {
        final String uri = "https://online-gateway.ghn.vn/shiip/public-api/master-data/ward";

        // Tạo HttpHeaders và đặt các header
        HttpHeaders headers = new HttpHeaders();
        headers.set("Token", tokenghn);
        headers.setContentType(MediaType.APPLICATION_JSON);
// Tạo một Map để biểu diễn dữ liệu JSON
        Map<String, Object> requestBody = new LinkedHashMap<>();
        requestBody.put("district_id",id);
        // Sử dụng `requestBody` để truyền dữ liệu JSON
        // requestBody sẽ được tự động chuyển thành JSON bởi Spring Boot
        HttpEntity<Object> requestEntity = new HttpEntity<>(requestBody, headers);

        // Gọi API với yêu cầu POST và `requestBody`
        ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, requestEntity, Object.class);

        Object result = responseEntity.getBody();
        return result;
    }
}
