package com.chillvibe.chillvibe.domain.user.dto;

import lombok.Getter;

@Getter
public class LoginRequestDto {

  private String email;
  private String password;
}
