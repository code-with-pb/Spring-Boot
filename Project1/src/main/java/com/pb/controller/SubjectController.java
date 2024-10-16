package com.pb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pb.model.Subject;
import com.pb.service.SubjectService;

@RestController
@RequestMapping("/subject/")
public class SubjectController {
	@Autowired
	private SubjectService service;
	@Autowired
	private Subject sub;
	private String msg;
	
	@PostMapping("add-subject")
	public String addStudent(@RequestBody Subject sub1) {
		return service.addStudent(sub1);
	}
	
	@GetMapping("get-all-sub")
	public List<Subject> getAllSubject(){
		return service.getAllSubject();
	}
	
	@GetMapping("get-specific-sub")
	public Subject getSubjectById(@RequestParam int id) {
		return service.getSubjectById(id);
	}
	
	@PutMapping("update-sub")
	public Subject updateSubject(@RequestBody Subject sub1) {
		return service.updateSubject(sub1);
	}
	
	@DeleteMapping("delete-sub")
	public String deleteSubject(@RequestParam int id) {
		return service.deleteSubject(id);
	}
}
