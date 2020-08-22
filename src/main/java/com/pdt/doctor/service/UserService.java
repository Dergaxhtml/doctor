package com.pdt.doctor.service;

import com.pdt.doctor.dto.UserDto;
import com.pdt.doctor.entity.User;
import org.springframework.validation.annotation.Validated;

import java.util.List;

public interface UserService {

  List<User> findAll();
  void register(@Validated UserDto userDto);

  }
