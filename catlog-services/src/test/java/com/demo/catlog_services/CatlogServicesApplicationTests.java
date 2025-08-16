package com.demo.catlog_services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(ContainersConfig.class)
@SpringBootTest
class CatlogServicesApplicationTests {

    @Test
    void contextLoads() {}
}
