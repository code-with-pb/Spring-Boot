package com.pb.dao;

import java.util.List;

import com.pb.model.Attendence;
import com.pb.model.Student;

public interface AttendenceDao {

	List<Student> getStudentAttendence();

	String takeAttendence(Attendence atdnc);

}
