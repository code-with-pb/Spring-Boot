package com.pb.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AttendenceDto {
	private String id;
	private int subjectId;
	private List<Integer> studentId;
	private int facultyId;
	private String time;
	private String username;
	private String date;
	private int counts;
	
	public AttendenceDto() {
		// TODO Auto-generated constructor stub
	}

	public AttendenceDto(String id,int subjectId,String time, List<Integer> studentId, int facultyId, String username, String date,
			int counts) {
		super();
		this.id = id;
		this.subjectId = subjectId;
		this.studentId = studentId;
		this.time = time;
		this.facultyId = facultyId;
		this.username = username;
		this.date = date;
		this.counts = counts;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public List<Integer> getStudentId() {
		return studentId;
	}

	public void setStudentId(List<Integer> studentId) {
		this.studentId = studentId;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCounts() {
		return counts;
	}

	public void setCounts(int counts) {
		this.counts = counts;
	}
	

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "AttendenceDto [subjectId=" + subjectId + ", studentId=" + studentId + ", facultyId=" + facultyId
				+ ", username=" + username + ", date=" + date + ", counts=" + counts + "]";
	}

	
}
