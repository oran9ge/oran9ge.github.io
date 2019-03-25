package com.contra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="terms_and_condition")
public class Terms {

	@Id
	@Column(name="contract_id",length = 10)
	int contract_id;
	
	@NotNull
	@Column(name ="term1" ,length=100)
	String term1;
	
	@Column(name ="term2" ,length=100)
	String term2;
	
	@Column(name ="term3" ,length=100)
	String term3;

	@Column(name ="term4" ,length=100)
	String term4;
	
	@Column(name ="term5" ,length=100)
	String term5;
	
	@NotNull
	@Column(name = "condition1",length =100)
	String condition1;

	@Column(name = "condition2",length =100)
	String condition2;

	@Column(name = "condition3",length =100)
	String condition3;

	@Column(name = "condition4",length =100)
	String condition4;

	@Column(name = "condition5",length =100)
	String condition5;
	
	@Column(name = "other_info",length=200)
	String other_info;

	public int getContract_id() {
		return contract_id;
	}

	public void setContract_id(int contract_id) {
		this.contract_id = contract_id;
	}

	public String getTerm1() {
		return term1;
	}

	public void setTerm1(String term1) {
		this.term1 = term1;
	}

	public String getTerm2() {
		return term2;
	}

	public void setTerm2(String term2) {
		this.term2 = term2;
	}

	public String getTerm3() {
		return term3;
	}

	public void setTerm3(String term3) {
		this.term3 = term3;
	}

	public String getTerm4() {
		return term4;
	}

	public void setTerm4(String term4) {
		this.term4 = term4;
	}

	public String getTerm5() {
		return term5;
	}

	public void setTerm5(String term5) {
		this.term5 = term5;
	}

	public String getCondition1() {
		return condition1;
	}

	public void setCondition1(String condition1) {
		this.condition1 = condition1;
	}

	public String getCondition2() {
		return condition2;
	}

	public void setCondition2(String condition2) {
		this.condition2 = condition2;
	}

	public String getCondition3() {
		return condition3;
	}

	public void setCondition3(String condition3) {
		this.condition3 = condition3;
	}

	public String getCondition4() {
		return condition4;
	}

	public void setCondition4(String condition4) {
		this.condition4 = condition4;
	}

	public String getCondition5() {
		return condition5;
	}

	public void setCondition5(String condition5) {
		this.condition5 = condition5;
	}

	public String getOther_info() {
		return other_info;
	}

	public void setOther_info(String other_info) {
		this.other_info = other_info;
	}

	public Terms(int contract_id, String term1, String term2, String term3, String term4, String term5,
			String condition1, String condition2, String condition3, String condition4, String condition5,
			String other_info) {
		super();
		this.contract_id = contract_id;
		this.term1 = term1;
		this.term2 = term2;
		this.term3 = term3;
		this.term4 = term4;
		this.term5 = term5;
		this.condition1 = condition1;
		this.condition2 = condition2;
		this.condition3 = condition3;
		this.condition4 = condition4;
		this.condition5 = condition5;
		this.other_info = other_info;
	}

	public Terms() {
		super();
	}

	@Override
	public String toString() {
		return "Terms [contract_id=" + contract_id + ", term1=" + term1 + ", term2=" + term2 + ", term3=" + term3
				+ ", term4=" + term4 + ", term5=" + term5 + ", condition1=" + condition1 + ", condition2=" + condition2
				+ ", condition3=" + condition3 + ", condition4=" + condition4 + ", condition5=" + condition5
				+ ", other_info=" + other_info + "]";
	}
	
	
}
