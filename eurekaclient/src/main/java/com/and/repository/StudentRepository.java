package com.and.repository;

import com.and.entity.Student;

import java.util.Collection;
import java.util.Collections;

/**
 * @Author:         jiangzhihong
 * @CreateDate:     2020/9/23 17:18
 */
public interface StudentRepository {
	public Collection<Student> findAll();
	public Student findById(Long id);
	public void saveOrUpdate(Student student);
	public void deleteById(Long id);
}