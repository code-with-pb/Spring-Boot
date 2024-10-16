package com.pb.dao;

import java.util.List;

import com.pb.model.Faculty;

public interface FacultyDao {

	String addFaculty(Faculty f);

	List<Faculty> getAllFaculty();

	Faculty getFacultyById(int id);

	String updateFaculty(Faculty f);

	String deleteFaculty(int id);

}
