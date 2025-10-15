package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@PostMapping("addStudent")
	String addStudent(@RequestBody Student student) {
		
		StudentService ss = new StudentService();
		return ss.saveStudent(student);
	}
	
	
	@GetMapping("getStudent")
	Student getStudent()
	{
		Student s1 = new Student();
		s1.setsName("Aditi");
		s1.setsAddress("Latur");
		s1.setsSchoolName("KVL");
		s1.setsAge(20);
		s1.setsRollNo(77);
		s1.setsDiv('c');
		
		return s1;
		
	}
}
