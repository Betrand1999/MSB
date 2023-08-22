package com.example.javaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaProjectApplication {

   @GetMapping("/")
   public String hello() {
       return "<h1>Hello, world!</h1>";
   }
   public static void main(String[] args) {
      SpringApplication.run(JavaProjectApplication.class, args);
   }

}
