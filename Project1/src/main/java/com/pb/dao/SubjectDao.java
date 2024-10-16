package com.pb.dao;

import java.util.List;

import com.pb.model.Subject;

public interface SubjectDao {

	String addStudent(Subject sub1);

	List<Subject> getAllSubject();

	Subject getSubjectById(int id);

	Subject updateSubject(Subject sub1);

	String deleteSubject(int id);

}
