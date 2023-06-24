package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Staff;
import com.project.services.StaffServices;

@RestController
public class StaffController {
	@Autowired
	StaffServices ss;
	@GetMapping("/show")
	public List<Staff> getStaffData() {
		return ss.getStaffData();
	}
	
	@GetMapping("staff/{id}")
	public List<Staff> getStaffId(@PathVariable int id) {
		
		return	ss.getStaffId(id);
	}
	
	
	@PostMapping("/insert1")
	public boolean getInsertData(@RequestBody Staff staff) {
		boolean inserted = ss.getInsertData(staff);
		return inserted;
	}
	
	// 4
	@GetMapping("/maxsal")
	public List<Staff> getMaxSal() {
		return ss.getMaxSal();
	}
	
	
	// 5
	
	@GetMapping("/exp")
	public List<Staff> getExp() {
		return ss.getExp();
	}
	
	// 6
	
	@GetMapping("/max")
	public List<Staff> getMax() {
		return ss.getMax();
	}
	
	// 7 
	
	@PutMapping("/update")
	public Staff getUpdSal(@RequestBody Staff staff) {
			return ss.getUpdSal(staff);
	}    
	
	
	// 8
	@GetMapping("/min")
	public String minExp() {
		return ss.minExp();
	}
	
	// 9
	@GetMapping("/profile")
	public List<Staff> getProTrai() {
		return ss.getProTrai();
	}
	
	// 10
	
	@GetMapping("/nottrainer")
	public List<Staff> getNotTrai() {
		return ss.getNotTrai();
	}

}
