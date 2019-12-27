package com.demo.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.HelloWorld;

@Controller
public class DemoController {
	
	
	
	@RequestMapping("/hello/{name}")
	public String handler(@PathVariable String name , Model model) {
		HelloWorld data = new HelloWorld();
		data.setMessage("Hello " + name );
		data.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("Test", data);
		return "helloworld";

	}
	 
	
	/*
	 * @RequestMapping("/helloworld") public String handler(Model model) {
	 * 
	 * HelloWorld helloWorld = new HelloWorld();
	 * helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
	 * helloWorld.setDateTime(LocalDateTime.now().toString());
	 * model.addAttribute("helloWorld", helloWorld);
	 *  return "helloworld"; }
	 */
	
	

}
