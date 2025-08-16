package com.demo.catlog_services;

import org.springframework.boot.SpringApplication;

public class TestCatlogServicesApplication {

    public static void main(String[] args) {
        SpringApplication.from(CatlogServicesApplication::main)
                .with(ContainersConfig.class)
                .run(args);
    }
}
