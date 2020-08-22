package com.pdt.doctor.mapper;

import com.pdt.doctor.dto.UserDto;
import com.pdt.doctor.entity.User;

public class UserMapper {
  public static UserDto mapEntityToDto(User user) {

    UserDto dto = new UserDto();
    dto.setUsername(user.getUsername());


    return dto;
  }
}

