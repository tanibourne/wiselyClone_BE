package com.hanghae.wisely.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class LoginRequestDto {
    private String email;
    private String password;
}
