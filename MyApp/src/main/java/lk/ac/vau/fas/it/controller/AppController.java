package lk.ac.vau.fas.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.it.model.Student;


@RestController
@RequestMapping("/app")
public class AppController {
	
	Student Bob= new Student("2020/ict/44","Bob",24,"IT",3.2);
	
	@GetMapping("/msg")
	public String myMessage() {
	    return "Hello Springboot";
	}
	@GetMapping("/name")
	public String myName() {
	    return "My Name is Springboot";
	}
	@GetMapping("/age/{ag}")
	public String myAge(@PathVariable("ag")int age){
		return "My age is "+age;	
	}
	@GetMapping("/student")
	public Student getStudent() {
		return Bob;
	}

}
