package com.pdt.doctor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "USR_ID")
  private Long id;
  @Column(name = "USR_USERNAME")
  private String username;
  @Column(name = "USR_PASSWORD")
  private String password;
}
