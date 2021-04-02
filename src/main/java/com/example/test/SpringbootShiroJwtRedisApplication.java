package com.example.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.*.mapper")
public class SpringbootShiroJwtRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShiroJwtRedisApplication.class, args);
    }

}
