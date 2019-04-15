package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
* @Description 第一个SpringBoot 应用启动类
* @author 欧阳
* @since 2019年4月3日 下午6:14:39
* @version V1.0
*/

//@EnableAutoConfiguration
//@Configuration
@SpringBootApplication
@MapperScan({"com.mapper", "com.mysql", "com.mybatis"})
@EnableCaching
@EnableAsync
@EnableScheduling
public class App {

	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
	}

}
