package com.and.feign.impl;

import com.and.entity.Student;
import com.and.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @Author:         jiangzhihong
 * @CreateDate:     2020/9/24 22:07
 */
@Component
public class FeignError implements FeignProviderClient {

	@Override
	public Collection<Student> findAll() {
		return null;
	}

	@Override
	public String index() {
		return "服务器维护中。。。。。。";
	}
}
