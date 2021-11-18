package com.clonecoding.myapp.main;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clonecoding.myapp.main.VO.Greeting;
import com.clonecoding.myapp.main.mainService.MainService;

@RestController
public class GrettingController {
	@Autowired
	MainService main;
	
	private static final String template = "hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value  ="name", defaultValue = "World")String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@RequestMapping("/test")
	public void test() {
		System.out.println(main.selectTest());
	}

}
