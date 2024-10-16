package com.pb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pb.model.Department;
import com.pb.service.DepartmentService;

@RestController
public class Controller {
	//DepartmentService ds = new DepartmentService();
	//@Autowired // Field Dependency Injection
	private DepartmentService ds;
	

/*	@Autowired // Method  Dipendency Injection
	public void setDs(DepartmentService ds) {
		this.ds = ds;
	}*/
	
	@Autowired
	public Controller(DepartmentService ds) {
		super();
		this.ds = ds;
	}


	@PostMapping("/add-department")
	public String addDepartment(@RequestBody Department dpt) {
		String msg = ds.addDepartment(dpt);
		return msg;
	}

	@GetMapping("/getall-department")
	public Object getallDepartment() {
		Object obj = ds.getallDepartment();
		if (obj != null) {
			return obj;
		}
		return null;

	}
	
	@GetMapping("/get-name-by-department")
	public Object getGivenDepartment(@RequestParam String DepartmentName) {
		Department dpt = ds.getGivenDepartment(DepartmentName);
		if(dpt != null) {
			return dpt;
		}
		else {
			return "Department Not Found...!!";
		}
	}
	
	@GetMapping("/delete-department/{departmentID}")
	public List<Department> deleteGivenDepartment(@PathVariable int departmentID) {
		List<Department> list1 = ds.deleteGivenDepartment(departmentID);
		return list1;
	}
	
	@GetMapping("/delete-department/gg")
	public List<Department> delDept(@RequestParam int id) {
		List<Department> list2 = ds.delDept(id);
		return list2;
	}
	
	@PostMapping("/add-department-if-not-exist")
	public String addDeptIfNotExist(@RequestBody Department dpt) {
		String msg2 = ds.addDeptIfNotExist(dpt);
		if(msg2 != null) {
			return msg2;
		}
		else {
			return "Department Already Exist";
		}
	}
}
