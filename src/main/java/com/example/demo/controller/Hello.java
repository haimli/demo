package com.example.demo.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.ConfigSpringBootInfo;
import com.example.demo.common.ConfigSpringBootInfo1;
import com.example.demo.service.HelloService;

@RestController
public class Hello {

	@Autowired
	private HelloService helloService;
	
	@Autowired
	private ConfigSpringBootInfo configSpringBootInfo;
	
	@Autowired
	private ConfigSpringBootInfo1 configSpringBootInfo1;
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping("/getdate")
	public String hello(String name) throws InterruptedException, ExecutionException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(new Date());
	}
	
	@RequestMapping("/configspringboot")
	public String configSpringBootInfo() {
		return configSpringBootInfo.getUsername()+" "+configSpringBootInfo.getAge()+" "+configSpringBootInfo.getAddress();
	}
	
	@RequestMapping("/configspringboot1")
	public String configSpringBootInfo1() {
		return configSpringBootInfo1.getInfo();
	}
	
	
	
}
