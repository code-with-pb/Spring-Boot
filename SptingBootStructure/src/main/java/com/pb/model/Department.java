package com.pb.model;

import org.springframework.stereotype.Component;

@Component
public class Department {
	private int departmentID;
	private String departmentName;
	private int strength;
	private String date;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int departmentID, String departmentName, int strength, String date) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.strength = strength;
		this.date = date;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + ", strength="
				+ strength + ", Date=" + date + "]";
	}
	
}
