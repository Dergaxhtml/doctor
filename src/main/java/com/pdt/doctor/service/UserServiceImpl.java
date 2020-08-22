package com.pdt.doctor.service;

import com.pdt.doctor.dto.UserDto;
import com.pdt.doctor.entity.User;
import com.pdt.doctor.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PasswordEncoder passwordEncoder;

  private ModelMapper modelMapper = new ModelMapper();


  public void register(@Validated UserDto userDto) {

    User user = new User();
    user.setUsername(userDto.getUsername());
    user.setPassword(passwordEncoder.encode(userDto.getPassword()));

    userRepository.save(user);
  }

  public List<UserDto> findAll(){
return userRepository.findAll().stream()
  .map(user -> modelMapper.map(user, UserDto.class))
  .collect(Collectors.toList());
  }
}
