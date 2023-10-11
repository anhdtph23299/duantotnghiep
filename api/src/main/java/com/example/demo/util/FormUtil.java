package com.example.demo.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FormUtil {

    private static final ObjectMapper MAPPER = new ObjectMapper()
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

    public <T> T convertToObject(Class<T> clazz, Object data) {
        Gson gson = new Gson();
        try {
            return MAPPER.readValue(gson.toJson(data), clazz);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }
}
