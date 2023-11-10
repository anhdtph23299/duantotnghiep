package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.config.TokenProvider;
import com.laptrinhjavaweb.constant.SystemConstant;
import com.laptrinhjavaweb.dto.AuthToken;
import com.laptrinhjavaweb.service.IAuthTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthTokenService implements IAuthTokenService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenProvider jwtTokenUtil;

    @Override
    public AuthToken findByUserNameAndPassWord(String username, String password) {
        final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        username,
                        password
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        final String token = jwtTokenUtil.generateToken(authentication);
        AuthToken authToken = new AuthToken(token);
        List<String> roles = new ArrayList<>();
        List<GrantedAuthority> authorities = (List<GrantedAuthority>)(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
        for (GrantedAuthority authority : authorities) {
            roles.add(authority.getAuthority());
        }
        String url = null;
        if(isAdmin(roles)) {
            url = "/admin/dashboards";
        }else if(isStaff(roles)) {
            url = "/admin/giaoca/moca";
        }
        else if(isCustomer(roles)) {
            url = "/trang-chu";
        }
        authToken.setUri(url);
        return authToken;
    }

    private boolean isAdmin(List<String> roles) {
        if(roles.contains("ROLE_MANAGER")) return true;
        return false;
    }

    private boolean isStaff(List<String> roles) {
        if(roles.contains("ROLE_STAFF")) return true;
        return false;
    }

    private boolean isCustomer(List<String> roles) {
        if(roles.contains("ROLE_CUSTOMER")) return true;
        return false;
    }
}
