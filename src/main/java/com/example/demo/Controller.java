package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
@RequestMapping("/app")
public class Controller {
	
	public String test() {
		return "woohoo!!!Congrats...your App is up adn running";
	}
	
	@GetMapping("/students")
	public Student getStudentBy(@RequestBody Student student) {
		return student;
	}
	
	@GetMapping("/hello")
	public String GetMyName(){
		return "Hello Ravi";
	}
}
