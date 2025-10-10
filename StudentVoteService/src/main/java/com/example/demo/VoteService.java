package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoteService {

	@PostMapping("voterId")
	String voterId(@RequestBody Student s) {
		
		if(s.getAge() > 18)
		{
			return s.getName() + "You are eligible for voter Id";
		}
		return s.getName() + "You are not eligible for voter Id";
	}
	
}


class Student{
	
	private String name;
	private String address;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
