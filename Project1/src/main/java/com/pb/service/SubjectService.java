package com.pb.service;

import java.util.List;

import com.pb.model.Student;
import com.pb.model.Subject;

public interface SubjectService {

	String addStudent(Subject sub1);

	List<Subject> getAllSubject();

	Subject getSubjectById(int id);

	Subject updateSubject(Subject sub1);

	String deleteSubject(int id);
	

}
