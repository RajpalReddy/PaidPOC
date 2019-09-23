package com.sample.basic.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.basic.domain.RoleFunction;

@Repository
public interface RoleFunctionRepository extends CrudRepository<RoleFunction, Integer>{
	
	public List<RoleFunction> findAllByRoleFunctionName(String roleFunctionName);
	
	public List<RoleFunction> findAllRoleFunctionsByRoleId(int roleId);
	
	public List<RoleFunction> findAllRoleFunctionsByFunctionId(int functionId);
	
	@Modifying 
	public int deleteAllByRoleFunctionName(String roleFunctionName);
	
	@Modifying
	public int deleteAllRoleFunctionsByRoleId(int roleId);
	
	@Modifying
	public int deleteAllRoleFunctionsByFunctionId(int functionId);
	
}
