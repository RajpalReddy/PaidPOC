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

import com.sample.basic.domain.Employee;
import com.sample.basic.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveEmployee") 
	public Employee saveEmployee(@RequestBody Employee employee) { 
		return employeeService.addEmployee(employee); 
	}
	
	@GetMapping("/findByEmployeeId")
	public Employee findByEmployeeId(@RequestParam int id) {
		return employeeService.getByEmployeeId(id);
	}
	
	@GetMapping("/findAllByEmployeeName")
	public List<Employee> findAllByEmployeeName(@RequestParam String employeeName) {
		return employeeService.getAllByEmployeeName(employeeName);
	}
	
	@GetMapping("/findAllEmployeesByDepartmentId")
	public List<Employee> findAllEmployeesByDepartmentId(@RequestParam int id) {
		return employeeService.getAllEmployeesByDepartmentId(id);
	}
	
	@GetMapping("/findAllEmployeesByRoleId")
	public List<Employee> findAllEmployeesByRoleId(@RequestParam int id) {
		return employeeService.getAllEmployeesByRoleId(id);
	}
	
	@GetMapping("/findAllEmployees")
	public Iterable<Employee> findAllEmployees() {
		return employeeService.listAllEmployees();
	}
	
	@GetMapping("/countNoOfEmployees")
	public long countNoOfEmployees() {
		return employeeService.totalNoOfEmployees();
	}
	
	@GetMapping("/distinctEmployeeSalaries")
	public List<Object> distinctEmployeeSalaries() {
		return employeeService.uniqueEmployeeSalaries();
	}
	
	@DeleteMapping("/deleteByEmployeeId")
	public void deleteByEmployeeId(@RequestParam int id) {
		employeeService.removeByEmployeeId(id);
	}
	
	@DeleteMapping("/deleteAllByEmployeeName")
	public int deleteAllByEmployeeName(@RequestParam String employeeName) {
		return employeeService.removeAllByEmployeeName(employeeName);
	}
		
	@DeleteMapping("/deleteAllEmployeesByDepartmentId")
	public int deleteAllEmployeesByDepartmentId(@RequestParam int id) {
		return employeeService.removeAllEmployeesByDepartmentId(id);
	}
	
	@DeleteMapping("/deleteAllEmployeesByRoleId")
	public int deleteAllEmployeesByRoleId(@RequestParam int id) {
		return employeeService.removeAllEmployeesByRoleId(id);
	}
	
	@DeleteMapping("/deleteAllEmployees")
	public void deleteAllEmployees() {
		employeeService.removeAllEmployees();
	}
	
	@GetMapping("/findAllByNameWithJobName")
	public List<Object> findAllByNameWithJobName() {
		return employeeService.getAllByNameWithJobName();
	}
}
