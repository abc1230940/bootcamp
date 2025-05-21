package com.bootcamp.demo;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Person {
  private String name;
  private String hkid;
  private LocalDate dob;
  private int age; 
  private double height;
  private double weight;
  
  public static void main(String[] args) {
    
  }
}
