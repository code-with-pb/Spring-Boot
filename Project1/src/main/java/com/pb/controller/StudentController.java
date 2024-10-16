package com.pb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pb.model.Faculty;
import com.pb.model.Student;
import com.pb.model.Subject;
import com.pb.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private Student st;
	
	@Autowired
	private Subject sbj;
	
	@Autowired
	private Faculty fct;
	
	@Autowired
	private StudentService ss;
	
	private String msg;
	
	@GetMapping("/get-all-student")
	public List<Student> getAllStudent(){
		List<Student> list = ss.getAllStudent();
		
		return list;
	}
	
	@GetMapping("/get-all-student-ids")
	public List<Integer> getallStudentids(){
		return ss.getAllStudentById();
	}
	
	@PostMapping("/add-student")
	public String addStudent(@RequestBody Student std) {
		msg = ss.addStudent(std);
		if(msg != null) {
			return msg;
		}
		else {
			return "Student not Added";
		}
	}
	
	@GetMapping("/get-student-by-id/{id}")
	public Student getStudentById(@PathVariable int id) {
		st = ss.getStudentById(id);
		if(st != null) {
			return st;
		}
		else {
			return null;
		}
	}
	
	@PutMapping("/update-student")
	public String updateStudent(@RequestBody Student std) {
		msg = ss.updateStudent(std);
		msg = ss.addStudent(std);
		if(msg != null) {
			return msg;
		}
		else {
			return "Student not Updated";
		}
	}
	
	@DeleteMapping("/delete-student")
	public String deleteStudentById(@RequestParam int id) {
		msg = ss.deleteStudentById(id);
		if(msg != null) {
			return msg;
		}
		else {
			return "Student not Found";
		}
	}
	
	@GetMapping("/get-all-subject")
	public List<Subject> getAllSubject(){
		List<Subject> list = ss.getAllSubject();
		
		return list;
	}
	
	@PostMapping("/add-subject")
	public String addSubject(@RequestBody Subject sbjt) {
		msg = ss.addSubject(sbjt);
		if(msg != null) {
			return msg;
		}
		else {
			return "Student not Added";
		}
	}
	
	@GetMapping("/get-subject-by-id/{id}")
	public Subject getSubjectById(@PathVariable int id) {
		sbj = ss.getSubjectById(id);
		if(sbj != null) {
			return sbj;
		}
		else {
			return null;
		}
	}
	
	@PutMapping("/update-subject")
	public String updateSubject(@RequestBody Subject sbjt) {
		msg = ss.updateSubject(sbjt);
		msg = ss.addSubject(sbjt);
		if(msg != null) {
			return msg;
		}
		else {
			return "Student not Updated";
		}
	}
	
	@DeleteMapping("/delete-subject")
	public String deleteSubjectById(@RequestParam int id) {
		msg = ss.deleteSubjectById(id);
		if(msg != null) {
			return msg;
		}
		else {
			return "Student not Found";
		}
	}
	
	@GetMapping("/get-all-faculty")
	public List<Faculty> getAllFaculty(){
		List<Faculty> list = ss.getAllFaculty();
		
		return list;
	}
	
	@PostMapping("/add-faculty")
	public String addFaculty(@RequestBody Faculty ft) {
		msg = ss.addFaculty(ft);
		if(msg != null) {
			return msg;
		}
		else {
			return "Student not Added";
		}
	}
	
	@GetMapping("/get-faculty-by-id/{id}")
	public Faculty getFacultyById(@PathVariable int id) {
		fct = ss.getFacultyById(id);
		if(fct != null) {
			return fct;
		}
		else {
			return null;
		}
	}
	
	@PutMapping("/update-faculty")
	public String updateFaculty(@RequestBody Faculty ft) {
		msg = ss.updateFaculty(ft);
		msg = ss.addFaculty(ft);
		if(msg != null) {
			return msg;
		}
		else {
			return "Student not Updated";
		}
	}
	
	@DeleteMapping("/delete-faculty")
	public String deleteFacultyById(@RequestParam int id) {
		msg = ss.deleteFacultyById(id);
		if(msg != null) {
			return msg;
		}
		else {
			return "Student not Found";
		}
	}
}
