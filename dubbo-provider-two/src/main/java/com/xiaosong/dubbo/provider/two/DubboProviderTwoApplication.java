package com.xiaosong.dubbo.provider.two;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubbo
@SpringBootApplication
public class DubboProviderTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderTwoApplication.class, args);
    }

}
