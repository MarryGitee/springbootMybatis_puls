package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.dao")
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class);
    }
}
