package lk.ac.vau.fas.it.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.it.model.Student;


@RestController
@RequestMapping("/app")
public class AppController {
	
	Student Bob= new Student("2020/ict/44","Bob",24,"IT",3.2);
	Student Ann= new Student("2020/ict/45","Ann",24,"IT",3.1);
	Student Suu= new Student("2020/ict/46","Suu",24,"IT",3.0);
	
	List<Student> students=new ArrayList<Student>();
	
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
	@GetMapping("/students")
	public List<Student> getStudents(){
		students.add(Bob);
		students.add(Ann);
		students.add(Suu);
		return students;
	}

}
