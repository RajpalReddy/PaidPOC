package com.sample.basic.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.basic.dao.RoleRepository;
import com.sample.basic.domain.Role;

@Service
public class RoleService {
	
	@Autowired
	RoleRepository roleJpa;
	
	public Role addRole(Role role) {
		return roleJpa.save(role);
	}
	
	public Role getByRoleId(int id) {
		return roleJpa.findById(id).get();
	}
	
	public List<Role> getAllByRoleName(String roleName) {
		return roleJpa.findAllByRoleName(roleName);
	}
	
	public Iterable<Role> listAllRoles() {
		return roleJpa.findAll();
	}
	
	public long noOfRoles() {
		return roleJpa.count();
	}
	
	@Transactional
	public void removeByRoleId(int id) {
		roleJpa.deleteById(id);
	}
	
	@Transactional
	public int removeAllByRoleName(String roleName) {
		return roleJpa.deleteAllByRoleName(roleName);
	}
	
	@Transactional
	public void removeAllRoles() {
		roleJpa.deleteAll();
	}
}
