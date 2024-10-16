package com.pb.service;

import java.util.List;

import com.pb.model.AttendenceDto;
import com.pb.model.Student;

public interface AttendenceService {

	List<Student> getStudentAttendence();

	String takeAttendance(AttendenceDto attendancedto);

}
