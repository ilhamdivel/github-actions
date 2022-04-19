package com.praktikum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PraktikumApplication {


    public static void main(String[] args) {
        SpringApplication.run(PraktikumApplication.class, args);
    }

}
