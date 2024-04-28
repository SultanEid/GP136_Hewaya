package com.hewayah.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//مارضي يشتغل ال (mapper)غير بهذا النوتيشن
@ComponentScan(basePackages = "com.hewayah.hello_world.model.mapper")

public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);

    }
}


