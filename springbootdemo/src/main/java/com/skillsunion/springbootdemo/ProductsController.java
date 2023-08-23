package com.skillsunion.springbootdemo;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("products")
public class ProductsController {

  private static final Logger logger = LoggerFactory.getLogger(ProductsController.class);
  private ArrayList<Product> products = new ArrayList<>();

  public ProductsController() {
    products.add(new Product("Audi", "Audi Car", 9999.0));
    products.add(new Product("Volvo", "Volvo Car", 8888.0));
  }

  @GetMapping("")
  public ArrayList<Product> getAllProducts() {
    logger.info("Getting all products");
    return products;
  }

  @PostMapping("")
  public ResponseEntity<Product> createProduct(@RequestBody Product product) {
    logger.info("Creating a product");
    products.add(product);
    return new ResponseEntity<>(product, HttpStatus.CREATED);
  }

}
