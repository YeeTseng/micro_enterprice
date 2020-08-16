package com.zy.me;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 扫描dao包下的类
 * @author Administrator
 */
@SpringBootApplication
@MapperScan("com.zy.me.dao")
public class Start extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Start.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }

}
