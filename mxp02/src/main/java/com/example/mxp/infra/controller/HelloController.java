package com.example.mxp.infra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		KotlinDataClass  kdc =new  KotlinDataClass();
		kdc.value = "1";
		return "helowo";
	}
}
