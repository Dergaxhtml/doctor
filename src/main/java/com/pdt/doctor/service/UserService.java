package com.pdt.doctor.service;

import com.pdt.doctor.dto.UserDto;
import org.springframework.validation.annotation.Validated;

import java.util.List;

public interface UserService {

  List<UserDto> findAll();
  void register(@Validated UserDto userDto);

  }
