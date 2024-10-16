package com.pb.service;

import java.util.List;

import com.pb.model.Faculty;
import com.pb.model.Student;
import com.pb.model.Subject;

public interface StudentService {
	
	public List<Student> getAllStudent();

	public String addStudent(Student std);

	public Student getStudentById(int id);

	public String updateStudent(Student std);

	public String deleteStudentById(int id);
	
	public List<Student> getAllStudentById(List<Integer> list);

	public List<Subject> getAllSubject();

	public String addSubject(Subject sbjt);

	public Subject getSubjectById(int id);

	public String updateSubject(Subject sbjt);

	public String deleteSubjectById(int id);

	public List<Faculty> getAllFaculty();

	public String addFaculty(Faculty ft);

	public Faculty getFacultyById(int id);

	public String updateFaculty(Faculty ft);

	public String deleteFacultyById(int id);

	public List<Integer> getAllStudentById();

}
