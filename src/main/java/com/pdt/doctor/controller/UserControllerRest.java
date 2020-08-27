package com.pdt.doctor.controller;

import com.pdt.doctor.dto.UserDto;
import com.pdt.doctor.entity.RestPicture;
import com.pdt.doctor.entity.User;
import com.pdt.doctor.service.PictureService;
import com.pdt.doctor.service.UserService;
import com.pdt.doctor.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class UserControllerRest {
  @Autowired
  private UserService userService;

  @Autowired
  private PictureService pictureService;

  @GetMapping("all")
  public List<User> findAll() {
    return userService.findAll();
  }

@GetMapping("picture/{id}")
  public RestPicture findOnePicture(@PathVariable Long id){
 return new RestPicture(id, "/picture/test?id="+id);
}
}
