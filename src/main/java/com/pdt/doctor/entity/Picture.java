package com.pdt.doctor.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name = "pictures")
@Data
public class Picture {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long id;
  @Column
  private Blob image;

  public Picture(Blob image){
    this.image=image;
  }

  public Picture(){

  }
}
