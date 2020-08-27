package com.pdt.doctor.service;

import com.pdt.doctor.entity.Picture;

import java.util.List;

public interface PictureService {
  List<Picture> findAll();
  Picture findById(Long id);

}
