package com.and.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: [java类作用描述]
 * @Author: jiangzhihong
 * @CreateDate: 2020/9/26 20:59
 */
@RestController
@RequestMapping("/hello")
public class HelloHandler {
    @Value("${server.port}")
    private String port;

   @GetMapping("/index")
    public String index() {
       return this.port;
   }
}
