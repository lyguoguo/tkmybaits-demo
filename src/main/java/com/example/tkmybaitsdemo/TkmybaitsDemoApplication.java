package com.example.tkmybaitsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SuppressWarnings("deprecation")
@SpringBootApplication
@MapperScan("com.example.tkmybaitsdemo.mapper")
public class TkmybaitsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkmybaitsDemoApplication.class, args);
    }

}
