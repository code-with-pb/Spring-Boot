package com.pb.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pb.model.Faculty;
import com.pb.model.Student;
import com.pb.model.Subject;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private Student st;

	@Autowired
	private SessionFactory sf;
	private Transaction tx;

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			Criteria criteria = sn.createCriteria(Student.class);
			List<Student> list = criteria.list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			sn.close();
		}
		return null;
	}

	@Override
	public String addStudent(Student std) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			sn.save(std);
			tx.commit();
			return "Studnet Added SuccessFully..!!";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			sn.close();
		}
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub

		Session sn = sf.openSession();
		try {
			Student st1 = sn.get(Student.class, id);
			return st1;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			sn.close();
		}
		return null;
	}

	@Override
	public String updateStudent(Student std) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			sn.update(std);
			tx.commit();
			return "Student Updated SuccessFully !!";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			sn.close();
		}
		return null;
	}

	@Override
	public String deleteStudentById(int id) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			Student st1 = sn.get(Student.class, id);
			sn.delete(st1);
			tx.commit();
			return "Student Deleted SuccessFully..!!";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			sn.close();
		}
		return null;
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
		} finally {
			sn.close();
		}
		return null;
	}

	@Override
	public String addSubject(Subject sbjt) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			sn.save(sbjt);
			tx.commit();
			return "Subject Added SuccessFully..!!";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			sn.close();
		}
		return null;
	}

	@Override
	public Subject getSubjectById(int id) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			Subject subject = sn.get(Subject.class, id);
			return subject;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			sn.close();
		}
		return null;
	}

	@Override
	public String updateSubject(Subject sbjt) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			sn.update(sbjt);
			tx.commit();
			return "Subject Updated SuccessFully..!!";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			sn.close();
		}
		return null;
	}

	@Override
	public String deleteSubjectById(int id) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			Subject subject = sn.get(Subject.class, id);
			sn.delete(subject);
			tx.commit();
			return "Subject Deleted SuccessFully..!!";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
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
			List<Faculty> list = criteria.list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			sn.close();
		}
		return null;
	}

	@Override
	public String addFaculty(Faculty ft) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			sn.save(ft);
			tx.commit();
			return "Faculty Added SuccessFully..!!";
		} catch (Exception e) {
			// TODO: handle exception
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
			Faculty faculty = sn.get(Faculty.class, id);
			return faculty;
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sn.close();
		}
		return null;
	}

	@Override
	public String updateFaculty(Faculty ft) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			sn.update(ft);
			tx.commit();
			return "Faculty Updeted SuccessFully..!!";
		}catch(Exception e) {
			
		}finally {
			sn.close();
		}
		return null;
	}

	@Override
	public String deleteFacultyById(int id) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			Faculty faculty = sn.get(Faculty.class, id);
			sn.delete(faculty);
			tx.commit();
			return "Deleted SuccessFully..";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<Student> getAllStudentById(List<Integer> list) {
		Session sn = sf.openSession();
		try {
			List<Student> list1 = sn.byMultipleIds(Student.class).multiLoad(list);
			return list1;
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sn.close();
		}
		return null;
	}

	@Override
	public List<Integer> getAllStudentById() {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			String hql = "select s.studentId from Student s";
			Query<Integer> query = sn.createQuery(hql);
			List<Integer> list = query.getResultList();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			sn.close();
		}
		return null;
	}
}
