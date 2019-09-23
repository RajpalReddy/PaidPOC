package com.sample.basic.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.basic.domain.RoleFunction;
import com.sample.basic.service.RoleFunctionService;

@RestController
@RequestMapping("/roleFunction")
public class RoleFunctionController {
	
	@Autowired
	RoleFunctionService roleFunctionService;
	
	@PostMapping("/saveRoleFunction")
	public RoleFunction saveRoleFunction(@RequestBody RoleFunction roleFunction) {
		return roleFunctionService.addRoleFunction(roleFunction);
	}
	
	@GetMapping("/findByRoleFunctionId")
	public Object findByRoleFunctionId(@RequestParam int id) {
		return roleFunctionService.getByRoleFunctionId(id);
	}
	
	@GetMapping("/findAllByRoleFunctionName")
	public List<RoleFunction> findAllByRoleFunctionName(@RequestParam String roleFunctionName) {
		return roleFunctionService.getAllByRoleFunctionName(roleFunctionName);
	}
	
	@GetMapping("/findAllRoleFunctionsByRoleId")
	public List<RoleFunction> findAllRoleFunctionsByRoleId(@RequestParam int id) {
		return roleFunctionService.getAllRoleFunctionsByRoleId(id);
	}
	
	@GetMapping("/findAllRoleFunctionsByFunctionId")
	public List<RoleFunction> findAllRoleFunctionsByFunctionId(@RequestParam int id) {
		return roleFunctionService.getAllRoleFunctionsByFunctionId(id);
	}
	
	@GetMapping("/findAllRoleFunctions")
	public Iterable<RoleFunction> findAllRoleFunctions() {
		return roleFunctionService.listAllRoleFunctions();
	}
	
	@GetMapping("/countNoOfRoleFunctions")
	public long countNoOfRoleFunctions() {
		return roleFunctionService.noOfRoleFunctions();
	}	
	
	@DeleteMapping("/deleteByRoleFunctionId")
	public void deleteByRoleFunctionId(@RequestParam int id) {
		roleFunctionService.removeByRoleFunctionId(id);
	}
	
	@DeleteMapping("/deleteAllByRoleFunctionName")
	public int deleteAllByRollFunctionName(@RequestParam String roleFunctionName) {
		return roleFunctionService.removeAllByRollFunctionName(roleFunctionName);
	}
	
	@Transactional
	@DeleteMapping("/deleteAllRoleFunctionsByRoleId")
	public int deleteAllRoleFunctionsByRoleId(@RequestParam int id) {
		return roleFunctionService.removeAllRoleFunctionsByRoleId(id);
	}
	
	@Transactional
	@DeleteMapping("/deleteAllRoleFunctionsByFunctionId")
	public int deleteAllRoleFunctionsByFunctionId(@RequestParam int id) {
		return roleFunctionService.removeAllRoleFunctionsByFunctionId(id);
	}
	
	@DeleteMapping("/deleteAllRoleFunctions")
	public void deleteAllRoleFunctions() {
		roleFunctionService.removeAllRoleFunctions();
	}
}
