package com.pb.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pb.model.Attendence;
import com.pb.model.Student;

@Repository
public class AttendenceDaoImpl implements AttendenceDao {
	@Autowired
	private SessionFactory sf;
	private Transaction tx;
	
	@Override
	public List<Student> getStudentAttendence() {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			Criteria criteria = sn.createCriteria(Attendence.class);
			return criteria.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			sn.close();
		}
		return null;
	}

	@Override
	public String takeAttendence(Attendence atdnc) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			sn.save(atdnc);
			tx.commit();
			return "Attendence..Done..!!";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			sn.close();
		}
		return null;
	}

}
