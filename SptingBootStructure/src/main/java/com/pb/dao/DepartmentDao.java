package com.pb.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.pb.beanconfig.BeanConfig;
import com.pb.model.Department;

//@Component
@Repository
@Scope(scopeName = "singleton")
public class DepartmentDao {
	
	@Autowired
	List<Department> list = BeanConfig.list();

	Department d1 = new Department(101, "HR", 21, "2021-05-01");
	Department d2 = new Department(102, "IT", 11, "2019-01-01");
	Department d3 = new Department(103, "MR", 10, "2021-01-05");
	
	public DepartmentDao() {
		// TODO Auto-generated constructor stub
		list.add(d1);
		list.add(d2);
		list.add(d3);
	}
	

	public String addDepartment(Department dpt) {
		list.add(dpt);

		return "Added Successfully !!";
	}

	public List<Department> getallDepartment() {

		for (Department department : list) {
			list.add(department);
			return list;
		}
		return null;
	}

	public Department getGivenDepartment(String departmentName) {
		// TODO Auto-generated method stub
		for (Department department : list) {
			if(department.getDepartmentName().equals(departmentName)) {
				return department;
			}
		}
		return null;
	}
	
	public List<Department> deleteGivenDepartment(int departmentID) {
		for (Department department : list) {
			if(department.getDepartmentID()==departmentID) {
				list.remove(department);
				return list;			}
		}
		return list;
	}


	public List<Department> delDept(int departmentID) {
		// TODO Auto-generated method stub
		for (Department department : list) {
			if(department.getDepartmentID()==departmentID) {
				list.remove(department);
				return list;			}
		}
		return list;
	}


	public String addDeptIfNotExist(Department dpt) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for (Department department : list) {
			if(department.getDepartmentID() ==dpt.getDepartmentID() || department.getDepartmentName().equals(dpt.getDepartmentName())) {
				flag = true;
				break;
			}
		}
		if(flag != true) {
			list.add(dpt);
			return "Department Added SuccessFully..!!";
		}else {
			return null;
		}
		
	}
}
