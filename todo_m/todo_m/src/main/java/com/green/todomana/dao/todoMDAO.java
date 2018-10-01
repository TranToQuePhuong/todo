package com.green.todomana.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.todomana.entity.todoM;
@Repository
public class todoMDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<todoM> findAll()
	{
		Session session = sessionFactory.openSession();
		TypedQuery<todoM> query = session.createQuery("FROM todoM", todoM.class);
		List<todoM> contact = query.getResultList();
		return contact;
	}

	public todoM find(int id) {
		return sessionFactory.openSession().find(todoM.class, id);
	}
	
	public todoM create(todoM todo) {
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		session.save(todo);
		tran.commit();
		session.close();
		return todo;
	}
	
	public todoM update(todoM todo) {
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		session.update(todo);
		tran.commit();
		session.close();
		return todo;
	}
	
	public todoM delete(todoM todo) {
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		session.delete(todo);
		tran.commit();
		session.close();
		return todo;
	}
}
