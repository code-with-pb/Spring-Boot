package com.pb.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Attendence {
	
	@Id
	private String id;
	@ManyToOne
	@JoinColumn(name = "username")
	private User user;
	private String date;
	private String time;
	private int count;
	@ManyToOne
	@JoinColumn(name = "subId")
	private Subject sub;
	@ManyToOne
	@JoinColumn(name = "faculty")
	private Faculty faculty;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "student_attendence", 
			joinColumns = @JoinColumn(name = "attendence_Id"),
			inverseJoinColumns =  @JoinColumn(name = "student_Id"))
	private List<Student> list;
	public Attendence() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public Attendence(String id, User user, String date, String time, int count, Subject sub,Faculty faculty, List<Student> list) {
		super();
		this.id = id;
		this.user = user;
		this.date = date;
		this.time = time;
		this.count = count;
		this.sub = sub;
		this.faculty = faculty;
		this.list = list;
	}
	@Override
	public String toString() {
		return "Attendence [id=" + id + ", user=" + user + ", date=" + date + ", time=" + time + ", count=" + count
				+ ", sub=" + sub + ", list=" + list + "]";
	}
	
	
}
