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

import com.sample.basic.domain.Department;
import com.sample.basic.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/saveDepartment")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.addDepartment(department);
	}
	
	@GetMapping("/findByDepartmentId")
	public Department findByDepartmentId(@RequestParam int id) {
		return departmentService.getByDepartmentId(id);
	}
	
	@GetMapping("/findAllByDepartmentName")
	public List<Department> findAllByDepartmentName(@RequestParam String departmentName) {
		return departmentService.getAllByDepartmentName(departmentName);
	}
	
	@GetMapping("/findAllDepartments")
	public Iterable<Department> findAllDepartments() {
		return departmentService.listAllDepartments();
	}
	
	@GetMapping("/countNoOfDepartments")
	public long countNoOfDepartments() {
		return departmentService.noOfDepartments();
	}
	
	@DeleteMapping("/deleteByDepartmentId")
	public void deleteByDepartmentId(@RequestParam int id) {
		departmentService.removeByDepartmentId(id);
	}
	
	@DeleteMapping("/deleteAllByDepartmentName")
	public int deleteAllByDepartmentName(@RequestParam String departmentName) {
		return departmentService.removeAllByDepartmentName(departmentName);
	}
	
	@DeleteMapping("/deleteAllDepartments")
	public void deleteAllDepartments() {
		departmentService.removeAllDepartments();
	}
}
