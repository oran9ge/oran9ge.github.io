package com.contra.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.contra.entity.Contract;

@Repository("productDAO")
public class ContractDAOImpl implements ContractDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addContract(Contract contract) {
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contract> listContract() {
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
		CriteriaQuery<Contract> criteriaQuery=criteriaBuilder.createQuery(Contract.class);
		Root<Contract> root=criteriaQuery.from(Contract.class);
		criteriaQuery.select(root);
		Query query =session.createQuery(criteriaQuery);
		return query.getResultList();	
	}

	@Override
	public void deleteContract(int id) {
		
	}

	@Override
	public void updateContract(Contract contract) {
		
	}

}
