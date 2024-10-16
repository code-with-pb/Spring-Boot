package com.pb.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.dao.SubjectDao;
import com.pb.model.Subject;

@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	private SubjectDao dao;
	
	@Override
	public String addStudent(Subject sub1) {
		// TODO Auto-generated method stub
		return dao.addStudent(sub1);
	}

	@Override
	public List<Subject> getAllSubject() {
		// TODO Auto-generated method stub
		return dao.getAllSubject();
	}

	@Override
	public Subject getSubjectById(int id) {
		// TODO Auto-generated method stub
		return dao.getSubjectById(id);
	}

	@Override
	public Subject updateSubject(Subject sub1) {
		// TODO Auto-generated method stub
		return dao.updateSubject(sub1);
	}

	@Override
	public String deleteSubject(int id) {
		// TODO Auto-generated method stub
		return dao.deleteSubject(id);
	}

}
