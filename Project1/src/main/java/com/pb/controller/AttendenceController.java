package com.pb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pb.model.Attendence;
import com.pb.model.AttendenceDto;
import com.pb.model.Student;
import com.pb.service.AttendenceService;

@RestController
@RequestMapping("/attendence")
public class AttendenceController {
	
	@Autowired
	private AttendenceService service;
	@Autowired
	private Attendence attendence;
	
	@Autowired
	private AttendenceDto dto;
	
	@GetMapping("/student-attendence")
	public List<Student> getStudentAttendence(){
		return service.getStudentAttendence();
	}
	
	@PostMapping("/take-attendance")
	public String takeAttendance(@RequestBody AttendenceDto attendancedto) {		
		return service.takeAttendance(attendancedto);
	}
}
