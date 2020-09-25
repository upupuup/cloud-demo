package com.and;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author:         jiangzhihong
 * @CreateDate:     2020/9/23 16:30
 */
@SpringBootApplication
// 声明是一个Eureka Server微服务，提供服务注册和服务发现功能，即注册中心
@EnableEurekaServer
public class EurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
