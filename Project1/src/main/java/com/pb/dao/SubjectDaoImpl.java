package com.pb.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pb.model.Subject;

@Repository
public class SubjectDaoImpl implements SubjectDao {
	private String msg = "Subject not Added";
	@Autowired
	private SessionFactory sf;
	private Transaction tx;
	@Override
	public String addStudent(Subject sub1) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			sn.save(sub1);
			tx.commit();
			return "Added Subject..!!";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			sn.close();
		}
		return msg;
	}
	@Override
	public List<Subject> getAllSubject() {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			Criteria criteria = sn.createCriteria(Subject.class);
			List<Subject> list = criteria.list();
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
	public Subject getSubjectById(int id) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			Subject sub = sn.get(Subject.class, id);
			return sub;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			sn.close();
		}
		return null;
	}
	@Override
	public Subject updateSubject(Subject sub1) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			sn.update(sub1);
			tx.commit();
			return sub1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	@Override
	public String deleteSubject(int id) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			Subject sub = sn.get(Subject.class, id);
			sn.delete(sub);
			tx.commit();
			return "Deleted";
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sn.close();
		}
		return null;
	}

}
