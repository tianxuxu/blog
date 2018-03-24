package com.xaut.blog.controller.index;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

	@GetMapping("/hello")
	public String hello(){
		return "helloworld";
	}
}