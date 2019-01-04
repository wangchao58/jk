package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.jk.mapper")
@EnableScheduling
@SpringBootApplication
public class JkApplication {

    public static void main(String[] args) {
        SpringApplication.run(JkApplication.class, args);
    }

}

