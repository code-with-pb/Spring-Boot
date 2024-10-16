package com.pb.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.dao.AttendenceDao;
import com.pb.model.Attendence;
import com.pb.model.AttendenceDto;
import com.pb.model.Student;

@Service
public class AttendenceServiceImpl implements AttendenceService {
	
	@Autowired
	private AttendenceDao dao;
	
	@Autowired
	private SubjectService subservice;
	
	@Autowired
	private StudentService studservice;
	
	@Autowired
	private FacultyService facservice;
	
	@Autowired
	private UserService userservice;
	
	@Override
	public List<Student> getStudentAttendence() {
		// TODO Auto-generated method stub
		return dao.getStudentAttendence();
	}

	@Override
	public String takeAttendance(AttendenceDto dto) {
		// TODO Auto-generated method stub
		String id = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new java.util.Date());
		dto.setId(id);
		
		Attendence atdnc = new Attendence();
		atdnc.setId(id);
		atdnc.setDate(dto.getDate());
		atdnc.setTime(dto.getTime());
		atdnc.setCount(dto.getStudentId().size());
		
		
		
		atdnc.setSub(subservice.getSubjectById(dto.getSubjectId()));
		atdnc.setUser(userservice.getUserById(dto.getUsername()));
		atdnc.setList(studservice.getAllStudentById(dto.getStudentId()));
		atdnc.setFaculty(facservice.getFacultyById(dto.getFacultyId()));
		
		
		return dao.takeAttendence(atdnc);
	}

}
