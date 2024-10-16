package com.pb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.dao.FacultyDao;
import com.pb.model.Faculty;

@Service
public class FacultyServiceImpl implements FacultyService {
	
	@Autowired
	private FacultyDao dao;
	
	@Override
	public String addFaculty(Faculty f) {
		// TODO Auto-generated method stub
		return dao.addFaculty(f);
	}

	@Override
	public List<Faculty> getAllFaculty() {
		// TODO Auto-generated method stub
		return dao.getAllFaculty();
	}

	@Override
	public Faculty getFacultyById(int id) {
		// TODO Auto-generated method stub
		return dao.getFacultyById(id);
	}

	@Override
	public String updateFaculty(Faculty f) {
		// TODO Auto-generated method stub
		return dao.updateFaculty(f);
	}

	@Override
	public String deleteFaculty(int id) {
		// TODO Auto-generated method stub
		return dao.deleteFaculty(id);
	}

}
