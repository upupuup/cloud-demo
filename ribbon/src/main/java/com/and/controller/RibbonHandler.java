package com.and.controller;

import com.and.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @Author:         jiangzhihong
 * @CreateDate:     2020/9/24 17:06
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/findAll")
	public Collection<Student> findAll() {
		return restTemplate.getForObject("http://provider/student/findAll", Collection.class);
	}

	@GetMapping("/index")
	public String index() {
		return restTemplate.getForObject("http://provider/student/index", String.class);
	}
}
