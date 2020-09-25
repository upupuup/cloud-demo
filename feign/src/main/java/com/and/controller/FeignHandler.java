package com.and.controller;

import com.and.entity.Student;
import com.and.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Author:         jiangzhihong
 * @CreateDate:     2020/9/24 21:47
 */
@RestController
@RequestMapping("/feign")
public class FeignHandler {
	@Autowired
	private FeignProviderClient feignProviderClient;

	@RequestMapping("/findAll")
	public Collection<Student> findAll() {
		return feignProviderClient.findAll();
	}

	@RequestMapping("/index")
	public String index() {
		return feignProviderClient.index();
	}

}
