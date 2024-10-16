package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory factory;

	@Override
	public String addStudent(Student student) {

		Session session = null;

		try {
			session = factory.openSession();
			session.save(student);
			session.beginTransaction().commit();
			return "Data Added";

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return null;
	}

}
