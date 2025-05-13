package com.bj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.bj.*"})
@MapperScan(basePackages = {"com.bj.dao.mapper"})
//@ImportResource(value = {"classpath:/spring-tauth.xml", "classpath:/dubbo-config.xml","classpath:/spring-mvc.xml"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, RedisAutoConfiguration.class})
public class ClApp {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ClApp.class);
        app.run(args);
    }
}