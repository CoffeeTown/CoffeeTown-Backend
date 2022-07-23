package com.oxcafebabe.town;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.oxcafebabe.town.mapper")
public class CoffeeTown {
    public static void main(String[] args) {
        SpringApplication.run(CoffeeTown.class, args);
    }
}
