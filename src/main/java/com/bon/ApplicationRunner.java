package com.bon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动类
 * com.bon
 *
 * @author pengwen
 * @create 2017/11/6 0006
 **/
@ServletComponentScan
@RestController
@SpringBootApplication
@EnableAutoConfiguration
public class ApplicationRunner {

    public static void main(String[] args) {
        System.out.println("------------Application is start---------------");
        SpringApplication.run(ApplicationRunner.class, args);
    }
}
