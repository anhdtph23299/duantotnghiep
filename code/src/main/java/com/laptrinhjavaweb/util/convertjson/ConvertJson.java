package com.laptrinhjavaweb.util.convertjson;

import com.laptrinhjavaweb.model.datarq.ApiResponse;
import com.laptrinhjavaweb.model.datarq.PreviewGiaoHang;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ConvertJson {
    public static <T> T convert(
            RestTemplate restTemplate,
            String uri,
            HttpMethod method,
            HttpEntity<?> requestEntity,
            ParameterizedTypeReference<ApiResponse<T>> responseType
    ) {
        ResponseEntity<ApiResponse<T>> responseEntity = restTemplate.exchange(uri, method, requestEntity, responseType);
        return responseEntity.getBody().getData();
    }

}
