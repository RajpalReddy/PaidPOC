package com.sample.basic.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.basic.dao.RoleFunctionRepository;
import com.sample.basic.domain.RoleFunction;

@Service
public class RoleFunctionService {
	
	@Autowired
	RoleFunctionRepository roleFunctionJpa;
	
	public RoleFunction addRoleFunction(RoleFunction roleFunction) {
		return roleFunctionJpa.save(roleFunction);
	}
	
	public RoleFunction getByRoleFunctionId(int id) {
		return roleFunctionJpa.findById(id).get();
	}
	
	public List<RoleFunction> getAllByRoleFunctionName(String name) {
		return roleFunctionJpa.findAllByRoleFunctionName(name);
	}
	
	public List<RoleFunction> getAllRoleFunctionsByRoleId(int id) {
		return roleFunctionJpa.findAllRoleFunctionsByRoleId(id);
	}
	
	public List<RoleFunction> getAllRoleFunctionsByFunctionId(int id) {
		return roleFunctionJpa.findAllRoleFunctionsByFunctionId(id);
	}
	
	public Iterable<RoleFunction> listAllRoleFunctions() {
		return roleFunctionJpa.findAll();
	}
	
	public long noOfRoleFunctions() {
		return roleFunctionJpa.count();
	}
	
	public void removeByRoleFunctionId(int id) {
		roleFunctionJpa.deleteById(id);
	}
	
	@Transactional
	public int removeAllByRollFunctionName(String name) {
		return roleFunctionJpa.deleteAllByRoleFunctionName(name);
	}
	
	@Transactional
	public int removeAllRoleFunctionsByRoleId(int id) {
		return roleFunctionJpa.deleteAllRoleFunctionsByRoleId(id);
	}
	
	@Transactional
	public int removeAllRoleFunctionsByFunctionId(int id) {
		return roleFunctionJpa.deleteAllRoleFunctionsByFunctionId(id);
	}
	
	public void removeAllRoleFunctions() {
		roleFunctionJpa.deleteAll();
	}
}
