package com.contra.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.contra.entity.Terms;


@Repository("TermDAO")
public class TermDAOImpl implements TermDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addTerm(Terms terms) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(terms);
	}

	@Override
	public void deleteTerm(int contract_id) {
		Session currentSession=sessionFactory.getCurrentSession();
		Terms terms=currentSession.byId(Terms.class).load(contract_id);
		currentSession.delete(terms);
	}

}
