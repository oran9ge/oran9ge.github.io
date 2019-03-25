package com.contra.service;

import com.contra.entity.Terms;

public interface TermService {
	void addTerms(Terms terms);
	void deleteTerms(int contract_id);
}
