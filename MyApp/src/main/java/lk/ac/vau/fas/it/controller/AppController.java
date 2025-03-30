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
	
	Student Bob= new Student("2020ict44","Bob",24,"IT",3.2);
	Student Ann= new Student("2020ict45","Ann",22,"IT",3.1);
	Student Suu= new Student("2020ict46","Suu",24,"IT",3.0);
	
	List<Student> students=new ArrayList<Student>();
	List<Student> studentsAge=new ArrayList<Student>();
	List<Student> sortedStudents = new ArrayList<>(students);
	
	
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

	 @GetMapping("/students/{rg}")
	   public Student getStudentReg(@PathVariable("rg") String regNo)
	   {
		   for(Student stu:students)
		   {
			   if(stu.getRegNo().equals(regNo))
			   {
				   return stu;
			   }
		   }
		   
		   return null;
	   }
	 @GetMapping("/students/ages")
	   public List<Student> getStudentAge()
	   {
		  for(Student stu:students)
		  {
			  if(stu.getAge() > 19 && stu.getAge() < 24)
			  {
				  studentsAge.add(stu);
			  }
		  }
		  return studentsAge;
	   }
	   
	 @GetMapping("/students/gpa")
	   public List<Student> getstudentGpa()
	   {
		   for (int i = 0; i < sortedStudents.size() - 1; i++) 
		   {
		        for (int j = 0; j < sortedStudents.size() - i - 1; j++)
		        {
		            if (sortedStudents.get(j).getGpa() > sortedStudents.get(j + 1).getGpa())
		            {
		                Student temp = sortedStudents.get(j);
		                sortedStudents.set(j, sortedStudents.get(j + 1));
		                sortedStudents.set(j + 1, temp);
		            }
		        }
		    }
		    
		    return sortedStudents;
	   }
}
