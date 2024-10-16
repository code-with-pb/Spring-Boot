package com.pb.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pb.model.Faculty;

@Repository
public class FacultyDaoImpl implements FacultyDao {
	
	@Autowired
	private SessionFactory sf;
	private Transaction tx;
	
	@Override
	public String addFaculty(Faculty f) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			sn.save(f);
			tx.commit();
			return "Faculty Data Added Successfully..";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			sn.close();
		}
		return null;
	}

	@Override
	public List<Faculty> getAllFaculty() {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			Criteria criteria = sn.createCriteria(Faculty.class);
			List list = criteria.list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			sn.close();
		}
		return null;
	}

	@Override
	public Faculty getFacultyById(int id) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			return sn.get(Faculty.class, id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			sn.close();
		}
		return null;
	}

	@Override
	public String updateFaculty(Faculty f) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			sn.update(f);
			tx.commit();
			return "Faculty Data Updated Successfully..";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			sn.close();
		}
		return null;
	}

	@Override
	public String deleteFaculty(int id) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			Faculty faculty = sn.get(Faculty.class, id);
			sn.delete(faculty);
			tx.commit();
			return "faculty Deleted Successfully..";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			sn.close();
		}
		return null;
	}

}
