package com.and.controller;

import com.and.entity.Student;
import com.and.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @Author:         jiangzhihong
 * @CreateDate:     2020/9/23 17:25
 */
@RestController
@RequestMapping("/student")
public class StudentHandler {
	@Autowired
	private StudentRepository studentRepository;
	@Value("${server.port}")
	private String port;

	@GetMapping("/findAll")
	public Collection<Student> findAll() {
		return studentRepository.findAll();
	}

	@GetMapping("/findById/{id}")
	public Student findId(@PathVariable("id") Long id) {
		return studentRepository.findById(id);
	}

	@PostMapping("/save")
	public void save(@RequestBody Student student) {
		studentRepository.saveOrUpdate(student);
	}

	@PostMapping("/update")
	public void update(@RequestBody Student student) {
		studentRepository.saveOrUpdate(student);
	}

	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		studentRepository.deleteById(id);
	}

	@GetMapping("/index")
	public String index() {
		return "当前端口：" + this.port;
	}
}
