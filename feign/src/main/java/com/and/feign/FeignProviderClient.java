package com.and.feign;

import com.and.entity.Student;
import com.and.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @Author:         jiangzhihong
 * @CreateDate:     2020/9/24 21:42
 */
@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignProviderClient {
	@GetMapping("/student/findAll")
	public Collection<Student> findAll();

	@GetMapping("/student/index")
	public String index();
}
