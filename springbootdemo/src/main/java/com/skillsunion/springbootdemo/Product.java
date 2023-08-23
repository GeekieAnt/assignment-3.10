package com.skillsunion.springbootdemo;

import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Setter
@Getter
public class Product {
  private String id;
  private String name;
  private String description;
  private double price;

  public Product(String id) {
    this.id = UUID.randomUUID().toString();
  }

  public Product(String name, String description, double price) {
    this.id = UUID.randomUUID().toString();
    this.name = name;
    this.description = description;
    this.price = price;
  }

}
