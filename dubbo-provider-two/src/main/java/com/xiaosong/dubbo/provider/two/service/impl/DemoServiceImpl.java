package com.xiaosong.dubbo.provider.two.service.impl;



import com.xiaoze.api.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;



/**
 * DemoServiceImpl
 * 服务提供类
 * @author xiaoze
 * @date 2018/6/7
 */
@Slf4j
@Service(version = "${demo.service.version}")
@Component
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        log.info("服务端2： "+name);
        return "Hello, " + name + " (from Spring Boot)";
    }
}
