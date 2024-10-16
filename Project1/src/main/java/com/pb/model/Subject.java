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
public class Subject {
	
	@Id
	private int subjectId;
	private String subjectName;
	private String subjectCode;
	private int creditHours;
	private String teacherName;
	private String semester;
	private boolean isElective;
	public Subject() {
		// TODO Auto-generated constructor stub
	}
	public Subject(int subjectId, String subjectName, String subjectCode, int creditHours, String teacherName,
			String semester, boolean isElective) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.subjectCode = subjectCode;
		this.creditHours = creditHours;
		this.teacherName = teacherName;
		this.semester = semester;
		this.isElective = isElective;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public boolean isElective() {
		return isElective;
	}
	public void setElective(boolean isElective) {
		this.isElective = isElective;
	}
	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", subjectCode=" + subjectCode
				+ ", creditHours=" + creditHours + ", teacherName=" + teacherName + ", semester=" + semester
				+ ", isElective=" + isElective + "]";
	}
}
