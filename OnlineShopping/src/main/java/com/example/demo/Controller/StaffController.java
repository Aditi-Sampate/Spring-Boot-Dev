package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Staff;
import com.example.demo.service.StaffService;

@RestController
public class StaffController {

	@PostMapping("addStaff")
	String addStaff(@RequestBody Staff staff) {
		StaffService ss = new StaffService();
		return ss.saveStaff(staff);

	}

	@GetMapping("getStaff")
	Staff getStaff() {
		Staff s1 = new Staff();
		s1.setsName("Ram");
		s1.setsAddress("pune");
		s1.setSmbNo(32348273);

		return s1;
	}

}
