package com.sample.service;

import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2021-01-27 下午1:53
 */
@Service
public class HelloWorldService {
	public String helloWorld(String name){
		return "hello " + name + "!";
	}
}
