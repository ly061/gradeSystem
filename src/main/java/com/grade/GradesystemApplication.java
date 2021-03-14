package com.grade;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.grade.*.mapper")
public class GradesystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradesystemApplication.class, args);
    }

}
