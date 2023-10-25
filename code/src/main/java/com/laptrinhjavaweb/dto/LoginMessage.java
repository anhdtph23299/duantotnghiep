package com.laptrinhjavaweb.dto;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class LoginMessage {
    String message;
        Boolean status;
}
