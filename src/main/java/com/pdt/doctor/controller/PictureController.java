package com.pdt.doctor.controller;

import com.pdt.doctor.entity.Picture;
import com.pdt.doctor.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

@Controller
@RequestMapping("/picture")
public class PictureController {

  @Autowired
  private PictureService pictureService;

  @GetMapping("/test")
  public void display(@RequestParam Long id, HttpServletResponse response) {
    Picture picture = pictureService.findById(id);
    Blob image = picture.getImage();

    response.setContentType("image/jpeg");
    try (ServletOutputStream outputStream = response.getOutputStream()) {

      outputStream.write(image.getBinaryStream().readAllBytes());

    } catch (IOException | SQLException e) {
      e.printStackTrace();
    }
  }
}
