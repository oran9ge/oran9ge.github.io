package com.contra.dao;

import com.contra.entity.Terms;

public interface TermDAO {
	void addTerm(Terms terms);
	void deleteTerm(int contract_id);
}
