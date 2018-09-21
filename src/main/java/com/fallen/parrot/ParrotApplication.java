package com.fallen.parrot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fallen.parrot.mybatis.mapper")
public class ParrotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParrotApplication.class, args);
    }
}
