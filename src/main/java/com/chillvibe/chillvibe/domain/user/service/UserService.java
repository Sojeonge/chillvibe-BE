package com.chillvibe.chillvibe.domain.user.service;

import com.chillvibe.chillvibe.domain.user.dto.UserInfoResponseDto;
import com.chillvibe.chillvibe.domain.user.entity.User;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {

  void join(String joinDto, MultipartFile multipartFile);

  void update(String userUpdateDto, MultipartFile multipartFile);

  void softDeleteUser();

  void restoreUser();

  UserInfoResponseDto getMyPageInfo();

  UserInfoResponseDto getUserInfo(Long userId);

  User getUserById(Long userId);
}