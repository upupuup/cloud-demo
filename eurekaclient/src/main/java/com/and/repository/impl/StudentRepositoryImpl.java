package com.and.repository.impl;

import com.and.entity.Student;
import com.and.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:         jiangzhihong
 * @CreateDate:     2020/9/23 17:20
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {
	private static Map<Long, Student> studentMap;

	static {
		studentMap = new HashMap<>();
		studentMap.put(1L, new Student(1L, "张三", 10));
		studentMap.put(2L, new Student(2L, "李四", 11));
		studentMap.put(3L, new Student(3L, "王五", 12));
	}

	@Override
	public Collection<Student> findAll() {
		return studentMap.values();
	}

	@Override
	public Student findById(Long id) {
		return studentMap.get(id);
	}

	@Override
	public void saveOrUpdate(Student student) {
		studentMap.put(student.getId(), student);
	}

	@Override
	public void deleteById(Long id) {
		studentMap.remove(id);
	}
}
