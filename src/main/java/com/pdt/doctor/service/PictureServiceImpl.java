package com.pdt.doctor.service;

import com.pdt.doctor.entity.Picture;
import com.pdt.doctor.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

@Service
public class PictureServiceImpl implements PictureService{

  @Autowired
  private PictureRepository pictureRepository;

  @Override
  public List<Picture> findAll() {
    return pictureRepository.findAll();
  }

  @Override
  public Picture findById(Long id) {
    return pictureRepository.findById(id).get();
  }

  public void saveImage(String url){
    File file = new File(url);
    Blob image = null;
    try {
      FileInputStream inputStream = new FileInputStream(file);
      image =new SerialBlob(inputStream.readAllBytes());

    }catch (IOException | SQLException e){
      e.printStackTrace();
    }

    Picture picture=new Picture(image);
    pictureRepository.save(picture);

  }
}
