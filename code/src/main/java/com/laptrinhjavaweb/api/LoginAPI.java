package com.laptrinhjavaweb.api;

import com.laptrinhjavaweb.dto.AuthToken;
import com.laptrinhjavaweb.dto.KhachHangDTO;
import com.laptrinhjavaweb.dto.NhanVienDTO;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.service.IAuthTokenService;
import com.laptrinhjavaweb.service.IKhachHangService;
import com.laptrinhjavaweb.service.INhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginAPI {

    @Autowired
    private IAuthTokenService authTokenService;

    @Autowired
    private IKhachHangService khachHangService;

    @Autowired
    private INhanVienService nhanVienService;

    @PostMapping("/api/customer/login")
    public ResponseEntity<?> loginWeb(@RequestBody UserDTO userDTO){
        KhachHangDTO khachHangDTO = khachHangService.findByMaAndMatkhau(userDTO.getUserName(), userDTO.getPassword());
        if(khachHangDTO == null){
            throw new UsernameNotFoundException("User name not found");
        }
        AuthToken authToken = authTokenService.findByUserNameAndPassWord(userDTO.getUserName(), userDTO.getPassword());
        return new ResponseEntity<>(authToken, HttpStatus.OK);
    }

    @PostMapping("/api/staff/login")
    public ResponseEntity<?> loginStaff(@RequestBody UserDTO userDTO){
        NhanVienDTO nhanVienDTO = nhanVienService.findByMaAndMatkhau(userDTO.getUserName(), userDTO.getPassword());
        if(nhanVienDTO == null){
            throw new UsernameNotFoundException("User name not found");
        }
        AuthToken authToken = authTokenService.findByUserNameAndPassWord(userDTO.getUserName(), userDTO.getPassword());
        return new ResponseEntity<>(authToken, HttpStatus.OK);
    }
}
