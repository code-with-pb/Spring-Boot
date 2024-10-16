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

import com.pb.model.Faculty;
import com.pb.service.FacultyService;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
	
	@Autowired
	private FacultyService service;
	@Autowired
	private Faculty faculty;
	
	@PostMapping("/add-faculty")
	public String addFaculty(@RequestBody Faculty f) {
		return service.addFaculty(f);
	}
	
	@GetMapping("/get-all-faculty")
	public List<Faculty> getAllFaculty(){
		return service.getAllFaculty();
	}
	
	@GetMapping("/get-faculty-by-id")
	public Faculty getFacultyById(@RequestParam int id) {
		return service.getFacultyById(id);
	}
	
	@PutMapping("/update-fauculty")
	public String updateFaculty(@RequestBody Faculty f) {
		return service.updateFaculty(f);
	}
	
	@DeleteMapping("/delete-faculty-by-id")
	public String deleteFaculty(@RequestParam int id) {
		return service.deleteFaculty(id);
	}
}
