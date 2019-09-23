package com.sample.basic.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.basic.domain.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{
	
	public List<Role> findAllByRoleName(String roleName);
	
	@Modifying
	public int deleteAllByRoleName(String roleName);
	
}
