package com;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

/**
 * @author zcx
 * @Title 程序入口
 * @date 2018年09月13日 11:31
 * 首先这是一个Spring Boot应用程序的入口，或者叫做主程序。
 * 其中使用了一个注解@SpringBootApplication来标注他是一个Spring Boot应用。
 * main方法使他成为一个主程序，将在应用被启动时首先被执行。
 * 注解@RestController同时标注这个程序还是一个控制器，如果浏览器访问应用的/hello。
 * 他将调用home方法，并输出字符串hello。
 *
 **/
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping(value = "/hello")
    String home() {
        return "hello";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
