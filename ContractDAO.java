package com.contra.dao;

import java.util.List;

import com.contra.entity.Contract;


public interface ContractDAO {
	void addContract(Contract contract);
	List<Contract> listContract();
	void deleteContract(int id);	
	void updateContract(Contract contract);
}
