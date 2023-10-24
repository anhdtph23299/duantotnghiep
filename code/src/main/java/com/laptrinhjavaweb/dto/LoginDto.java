package com.laptrinhjavaweb.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class LoginDto {
    private String email;
    private String password;
}
