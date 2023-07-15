package com.example.hocspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class HocSpringBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(HocSpringBootApplication.class, args);
    }

}
