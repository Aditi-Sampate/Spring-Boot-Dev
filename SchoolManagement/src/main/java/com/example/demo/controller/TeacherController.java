package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;

@RestController
public class TeacherController {

	@PostMapping("addTeacher")
	String addTeacher(@RequestBody Teacher teacher)
	{
		
		TeacherService ts = new TeacherService();
		return ts.saveTeacher(teacher);
	}
	
	
	@GetMapping("getTeacher")
	Teacher getTeacher()
	{
		Teacher t1 = new Teacher();
		t1.settName("ABC");
		t1.settClgName("COCSIT");
		t1.settId(65543);
		
		return t1;
		
	}
	
}
