package com.pdt.doctor.controller;

import com.pdt.doctor.dto.UserDto;
import com.pdt.doctor.entity.User;
import com.pdt.doctor.service.UserService;
import com.pdt.doctor.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping("all")
  public List<User> findAll() {
    return userService.findAll();
  }
}
