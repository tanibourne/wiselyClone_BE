package com.hanghae.wisely.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@NoArgsConstructor
public class LoginRequestDto {
    private String email;
    private String password;
}
