package com.bon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动类
 * com.bon
 *
 * @author pengwen
 * @create 2017/11/6 0006
 **/
@ServletComponentScan
@SpringBootApplication
@EnableAutoConfiguration
public class ApplicationRunner implements CommandLineRunner{
    private Logger logger = LoggerFactory.getLogger(ApplicationRunner.class);

    public static void main(String[] args) {
        System.out.println("------------Application is start---------------");
        SpringApplication.run(ApplicationRunner.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        logger.info("服务启动完成!");
    }
}
