package com.contra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.contra.dao.TermDAO;
import com.contra.dao.TermDAOImpl;
import com.contra.entity.Terms;

@Service("productService")
public class TermServiceImpl {

	@Autowired
	TermDAO termDAO=new TermDAOImpl();
	
	@Transactional
	public void addTerms(Terms terms) {
		termDAO.addTerm(terms);
	}
	
	@Transactional
	public void deleteTerm(int contract_id) {
		termDAO.deleteTerm(contract_id);
	}
}
