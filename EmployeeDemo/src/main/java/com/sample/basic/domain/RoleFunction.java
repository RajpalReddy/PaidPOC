package com.sample.basic.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class RoleFunction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "role_function_name")
	private String roleFunctionName;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	private Role role;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "function_id")
	private Function function;

	public RoleFunction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleFunction(int id, String roleFunctionName, Role role, Function function) {
		super();
		this.id = id;
		this.roleFunctionName = roleFunctionName;
		this.role = role;
		this.function = function;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleFunctionName() {
		return roleFunctionName;
	}

	public void setRoleFunctionName(String roleFunctionName) {
		this.roleFunctionName = roleFunctionName;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	@Override
	public String toString() {
		return "RoleFunction [id=" + id + ", roleFunctionName=" + roleFunctionName + ", role=" + role + ", function="
				+ function + "]";
	}
	
}
