package com.pdt.doctor;

import com.pdt.doctor.dto.UserDto;
import com.pdt.doctor.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.sql.rowset.serial.SerialBlob;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

@SpringBootApplication
public class DoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorApplication.class, args);
	}


//
//	@Component
//	@Order(0)
//	class MyApplicationListener implements ApplicationListener<ApplicationReadyEvent> {
//
//
//		@Autowired
//		private UserServiceImpl userService;
//
//		@Autowired
//		@Qualifier("userPasswordValidator")
//		private Validator validator;
//
//		@InitBinder
//		private void initBinder(WebDataBinder binder) {
//			binder.setValidator(validator);
//
//		@Override
//		public void onApplicationEvent(ApplicationReadyEvent event) {
//
//				userService.register(new UserDto("Alonso", "PWN","PWN"));
//				userService.register(new UserDto("Kubica", "orlen","orlen"));
//				userService.register(new UserDto("Potts", "opera","opera"));
//
//		}
//
//
//	}

}


