package com.fallen.parrot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.fallen.parrot.mybatis.mapper")
public class ParrotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParrotApplication.class, args);
        System.out.println("启动完成。。。。。。。。。");
    }
}
