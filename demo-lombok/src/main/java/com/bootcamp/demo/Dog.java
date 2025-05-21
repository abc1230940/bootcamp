package com.bootcamp.demo;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// JDK -> has no lombok
// pom.xml -> add dependency (lombok framework) -> load into your Java project
// So, your project is able to use JDK(toString, equals()...) + lombok(generate the codes)

// ! Compile time: java -> class
// Java compiler -> convert Annotation (i.e. @Getter) to normal Java code
// JVM executes class files (include generated codes by lombok)
// ! Why we can call set / get in VSCode before compilation
// VSCode強大地方 -> implicity compile your java code (VSCode每打一隻字都會compile) -> 但run時候再compile多一次

// Special cases:
// 1. Field level annotation (i.e. Getter, Setter, EqualsAndHashCode)
// 2. callSuper (Parent class)

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor

public class Dog extends SuperAnimal{
  private String name;
  // @ToString.Exclude
  private double weight;
  private int age;

  // All argument constructor

  public Dog(double superpower, String name, double weight, int age) {

  }

  // Getter

  // Setter

  public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.setName("John");
    d1.setWeight(35.6);
    d1.setAge(12);
    System.out.println(d1);
    Dog d2 = new Dog("John", 35.6, 12);
    System.out.println(d1.equals(d2)); // true
    Dog d3 = new Dog();
    d3.setName("Peter");
    d3.setWeight(23.4);
    d3.setAge(14);
    System.out.println(d3);

    
    
    Dog d6 = new Dog(2.22, "Mary", 25.6, 9);
    System.out.println(d6);
    // EqualsAndHashCode入面預設唔跟exend, 所以superpower不一樣／一樣都唔影響佢似唔似
  }
}
