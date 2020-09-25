package com.and;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:         jiangzhihong
 * @CreateDate:     2020/9/24 17:04
 */
@SpringBootApplication
public class RibbonApplication {
	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced // 实现负载均衡
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
