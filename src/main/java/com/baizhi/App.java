package com.baizhi;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.baizhi.dao")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
        System.out.println("11");
        System.out.println("11");
        System.out.println("2222");
    }
}
