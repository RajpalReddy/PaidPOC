package com.sample.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.basic.domain.Role;
import com.sample.basic.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@PostMapping("/saveRole")
	public Role saveRole(@RequestBody Role role) {
		return roleService.addRole(role);
	}
	
	@GetMapping("/findByRoleId")
	public Role findByRoleId(@RequestParam int id) {
		return roleService.getByRoleId(id);
	}
	
	@GetMapping("/findAllByRoleName")
	public List<Role> findAllByRoleName(@RequestParam String roleName) {
		return roleService.getAllByRoleName(roleName);
	}
	
	@GetMapping("/findAllRoles")
	public Iterable<Role> findAllRoles() {
		return roleService.listAllRoles();
	}
	
	@GetMapping("/countNoOfRoles")
	public long countNoOfRoles() {
		return roleService.noOfRoles();
	}
	
	@DeleteMapping("/deleteByRoleId")
	public void deleteByRoleId(@RequestParam int id) {
		roleService.removeByRoleId(id);
	}
	
	@DeleteMapping("/deleteAllByRoleName")
	public int deleteAllByRoleName(@RequestParam String roleName) {
		return roleService.removeAllByRoleName(roleName);
	}
	
	@DeleteMapping("/deleteAllRoles")
	public void deleteAllRoles() {
		roleService.removeAllRoles();
	}
}
