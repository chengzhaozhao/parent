package com.czz.api.boot;

import org.minbox.framework.logging.spring.context.annotation.admin.EnableLoggingAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableLoggingAdmin
public class ApiCenterApplication {
    static Logger logger = LoggerFactory.getLogger (ApiCenterApplication.class);

    public static void main(String[] args) {
        SpringApplication.run (ApiCenterApplication.class, args);
        logger.info ("{}服务启动成功.", "Logging Server");
    }
}


