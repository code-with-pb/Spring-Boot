package com.pb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.dao.StudentDao;
import com.pb.model.Faculty;
import com.pb.model.Student;
import com.pb.model.Subject;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao sd;
	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return sd.getAllStudent();
	}

	@Override
	public String addStudent(Student std) {
		// TODO Auto-generated method stub
		return sd.addStudent(std);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return sd.getStudentById(id);
	}

	@Override
	public String updateStudent(Student std) {
		// TODO Auto-generated method stub
		return sd.updateStudent(std);
	}

	@Override
	public String deleteStudentById(int id) {
		// TODO Auto-generated method stub
		return sd.deleteStudentById(id);
	}

	@Override
	public List<Subject> getAllSubject() {
		// TODO Auto-generated method stub
		return sd.getAllSubject();
	}

	@Override
	public String addSubject(Subject sbjt) {
		// TODO Auto-generated method stub
		return sd.addSubject(sbjt);
	}

	@Override
	public Subject getSubjectById(int id) {
		// TODO Auto-generated method stub
		return sd.getSubjectById(id);
	}

	@Override
	public String updateSubject(Subject sbjt) {
		// TODO Auto-generated method stub
		return sd.updateSubject(sbjt);
	}

	@Override
	public String deleteSubjectById(int id) {
		// TODO Auto-generated method stub
		return sd.deleteSubjectById(id);
	}

	@Override
	public List<Faculty> getAllFaculty() {
		// TODO Auto-generated method stub
		return sd.getAllFaculty();
	}

	@Override
	public String addFaculty(Faculty ft) {
		// TODO Auto-generated method stub
		return sd.addFaculty(ft);
	}

	@Override
	public Faculty getFacultyById(int id) {
		// TODO Auto-generated method stub
		return sd.getFacultyById(id);
	}

	@Override
	public String updateFaculty(Faculty ft) {
		// TODO Auto-generated method stub
		return sd.updateFaculty(ft);
	}

	@Override
	public String deleteFacultyById(int id) {
		// TODO Auto-generated method stub
		return sd.deleteFacultyById(id);
	}

	@Override
	public List<Student> getAllStudentById(List<Integer> list) {
		// TODO Auto-generated method stub
		return sd.getAllStudentById(list);
	}

	@Override
	public List<Integer> getAllStudentById() {
		// TODO Auto-generated method stub
		return sd.getAllStudentById();
	}

}
