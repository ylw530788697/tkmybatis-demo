package com.evan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author evanYang
 * @version 1.0
 * @date 08/27/2019 14:42
 */
@SpringBootApplication
@MapperScan("com.evan.dao")
public class AppTKMybatis {
    public static void main(String[] args) {
        SpringApplication.run(AppTKMybatis.class,args);
    }
}
