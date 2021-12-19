package com.jd.study.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = "com.jd.study.demo.mapper")
public class Study20211219Application {

    public static void main(String[] args) {
        SpringApplication.run(Study20211219Application.class, args);
    }

}
