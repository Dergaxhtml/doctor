package com.pdt.doctor;

import com.pdt.doctor.dto.UserDto;
import com.pdt.doctor.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
@Component
public class DataLoader implements ApplicationRunner {

  @Autowired
  private UserServiceImpl userService;

  @Autowired
  @Qualifier("userPasswordValidator")
  private Validator validator;

  @InitBinder
  private void initBinder(WebDataBinder binder) {
    binder.setValidator(validator);
  }
  @Override
  public void run(ApplicationArguments args) throws Exception {

    userService.register(new UserDto("Alonso", "PWN","PWN"));
    userService.register(new UserDto("Kubica", "orlen","orlen"));
    userService.register(new UserDto("Potts", "opera","opera"));


  }


}
