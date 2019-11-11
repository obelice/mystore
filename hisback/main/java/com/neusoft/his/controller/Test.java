package com.neusoft.his.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@RequestMapping("/test2")
	public String work2(@RequestBody Integer a) {

		return "aaa";
	}
	
	@RequestMapping("/test1")
	public String work1(@RequestBody Integer a) {

		return "aaa";
	}

	@RequestMapping("/test")
	public String work(@RequestBody String a) {
		return "hello word!";
	}
}
