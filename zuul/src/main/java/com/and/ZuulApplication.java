package com.and;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author:         jiangzhihong
 * @CreateDate:     2020/9/24 12:42
 */
@EnableZuulProxy // 包含了@EnableZuulServer，设置该类是网关的启动类
@EnableAutoConfiguration // 帮助SpringBoot应用将所有符合条件的@Configuration配置加载到当前SpringBoot创建的IOC容器里
public class ZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
