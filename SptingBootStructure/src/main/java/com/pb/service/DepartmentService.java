package com.pb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pb.beanconfig.BeanConfig;
import com.pb.dao.DepartmentDao;
import com.pb.model.Department;

//@Component
@Service
@Scope(scopeName = "singleton")
public class DepartmentService {
	//DepartmentDao dd = new DepartmentDao();
	@Autowired
	private DepartmentDao dd;
	
	@Autowired
	List<Department> list = BeanConfig.list();

	public String addDepartment(Department dpt) {
		String msg = dd.addDepartment(dpt);
		return msg;
	}

	public List<Department> getallDepartment() {

		List<Department> l = dd.getallDepartment();

		return l;
	}

	public Department getGivenDepartment(String departmentName) {
		// TODO Auto-generated method stub
		return dd.getGivenDepartment(departmentName);
	}
	
	public List<Department> deleteGivenDepartment(int departmentID) {
		return dd.deleteGivenDepartment(departmentID);
	}

	public List<Department> delDept(int departmentID) {
		// TODO Auto-generated method stub
		return dd.delDept(departmentID);
	}

	public String addDeptIfNotExist(Department dpt) {
		// TODO Auto-generated method stub
		return dd.addDeptIfNotExist(dpt);
	}
}
