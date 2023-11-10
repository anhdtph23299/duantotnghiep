package com.laptrinhjavaweb.api;

import com.laptrinhjavaweb.dto.MyUserDetail;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserAPI {
    @GetMapping("/profile")
    public ResponseEntity<?> profile(Authentication authentication){
        if(authentication != null && authentication.isAuthenticated()){
            MyUserDetail myUserDetail = (MyUserDetail) authentication.getPrincipal();
            return new ResponseEntity<>(myUserDetail, HttpStatus.OK);
        }
        return null;
    }
}
