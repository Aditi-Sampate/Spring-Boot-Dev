package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarkingSystem {

		@PostMapping("studentResult")
		String studentResult(@RequestBody Student s)
		{
			if(s.getPercentage()>35) {
				
				return "you are pass";
			}
			return "you are fail.";
			
		}

}


class Student{
	
	private String name;
	private int percentage;
	private int roll;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
		
}




