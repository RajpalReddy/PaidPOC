package com.sample.basic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Function {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "function_name")
	private String functionName;
	

	public Function() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Function(int id, String functionName) {
		super();
		this.id = id;
		this.functionName = functionName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	@Override
	public String toString() {
		return "Function [id=" + id + ", functionName=" + functionName + "]";
	}
		
}
