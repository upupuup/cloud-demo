package com.and.controller;

import com.and.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @Author:         jiangzhihong
 * @CreateDate:     2020/9/24 10:51
 */
@RestController
@RequestMapping("consumer")
public class Consumerhandler {
	@Autowired
	RestTemplate restTemplate;


	@GetMapping("/findAll")
	public Collection<Student> findAll() {
		return restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
	}

	@GetMapping("/findAll2")
	public Collection<Student> findAll2() {
		return restTemplate.getForObject("http://localhost:8010/student/findAll", Collection.class);
	}

	@GetMapping("/findById/{id}")
	public Student findById(@PathVariable("id") Long id) {
		return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}", Student.class, id).getBody();
	}

	@GetMapping("/findById2/{id}")
	public Student findById2(@PathVariable("id") Long id) {
		return restTemplate.getForObject("http://localhost:8010/student/findById/{id}", Student.class, id);
	}

	@PostMapping("/save")
	public void save(@RequestBody Student student) {
		restTemplate.postForEntity("http://localhost:8010/student/save", student, null).getBody();
	}

	@PostMapping("/save2")
	public void save2(@RequestBody Student student) {
		restTemplate.postForObject("http://localhost:8010/student/save", student, null);
	}

	@PostMapping("/update")
	public void update(@RequestBody Student student) {
		restTemplate.put("http://localhost:8010/student/update", student);
	}

	@GetMapping("/deleteById/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		restTemplate.delete("http://localhost:8010/student/deleteById/{id}", id);
	}
}