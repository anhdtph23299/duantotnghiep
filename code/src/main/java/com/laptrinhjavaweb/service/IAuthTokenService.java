package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.AuthToken;

public interface IAuthTokenService {

    AuthToken findByUserNameAndPassWord(String username, String password);
}
