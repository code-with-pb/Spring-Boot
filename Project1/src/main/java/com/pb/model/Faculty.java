package com.pb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table
@Scope(scopeName = "prototype")
public class Faculty {

	@Id
	private int facultyId;
	private String facultyName;
	private String facultyDepartment;
	private String facultyDesignation;
	private String email;
	private String phoneNo;
	private String qualification;
	private int yearOfExperience;
	private double salary;
	
	public Faculty() {
		// TODO Auto-generated constructor stub
	}

	public Faculty(int facultyId, String facultyName, String facultyDepartment, String facultyDesignation, String email,
			String phoneNo, String qualification, int yearOfExperience, double salary) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.facultyDepartment = facultyDepartment;
		this.facultyDesignation = facultyDesignation;
		this.email = email;
		this.phoneNo = phoneNo;
		this.qualification = qualification;
		this.yearOfExperience = yearOfExperience;
		this.salary = salary;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getFacultyDepartment() {
		return facultyDepartment;
	}

	public void setFacultyDepartment(String facultyDepartment) {
		this.facultyDepartment = facultyDepartment;
	}

	public String getFacultyDesignation() {
		return facultyDesignation;
	}

	public void setFacultyDesignation(String facultyDesignation) {
		this.facultyDesignation = facultyDesignation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", facultyDepartment="
				+ facultyDepartment + ", facultyDesignation=" + facultyDesignation + ", email=" + email + ", phoneNo="
				+ phoneNo + ", qualification=" + qualification + ", yearOfExperience=" + yearOfExperience + ", salary="
				+ salary + "]";
	}
	
}
