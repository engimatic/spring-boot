package com.sample.controller;

import com.sample.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2021-01-27 下午1:54
 */
@RestController
@RequestMapping("/test")
public class TestController {

	private final HelloWorldService helloWorldService;

	@Autowired
	public TestController(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	@GetMapping("/hello")
	public String hello(String name){
		return helloWorldService.helloWorld(name);
	}
}
