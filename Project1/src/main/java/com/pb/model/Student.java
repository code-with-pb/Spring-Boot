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
public class Student {
	@Id
	private int studentId;
	private String firstName;
	private String lastName;
	private String gender;
	private String ctnumber;
	private String email;
	private String course;
	private String yearOfStudy;
	private double gpa;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String firstName, String lastName, String gender, String ctnumber, String email,
			String course, String yearOfStudy, double gpa) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.ctnumber = ctnumber;
		this.email = email;
		this.course = course;
		this.yearOfStudy = yearOfStudy;
		this.gpa = gpa;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCtnumber() {
		return ctnumber;
	}

	public void setCtnumber(String ctnumber) {
		this.ctnumber = ctnumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(String yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", ctnumber=" + ctnumber + ", email=" + email + ", course=" + course + ", yearOfStudy="
				+ yearOfStudy + ", gpa=" + gpa + "]";
	}
	
}
