package com.sample.basic.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.basic.dao.EmployeeRepository;
import com.sample.basic.domain.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeJpa;

	@Transactional
	public Employee addEmployee(Employee employee) {
		return employeeJpa.save(employee);
	}

	public Employee getByEmployeeId(int id) {
		return employeeJpa.findById(id).get();
	}

	public List<Employee> getAllByEmployeeName(String employeeName) {
		return employeeJpa.findAllByEmployeeName(employeeName);
	}
	
	public List<Employee> getAllEmployeesByDepartmentId(int id) {
		return employeeJpa.findAllEmployeesByDepartmentId(id);
	}

	public List<Employee> getAllEmployeesByRoleId(int id) {
		return employeeJpa.findAllEmployeesByRoleId(id);
	}

	public Iterable<Employee> listAllEmployees() {
		return employeeJpa.findAll();
	}

	public long totalNoOfEmployees() {
		return employeeJpa.count();
	}
	
	public List<Object> uniqueEmployeeSalaries() {
		return employeeJpa.distinctEmployeeSalaries();
	}
	
	@Transactional
	public void removeByEmployeeId(int id) {
		employeeJpa.deleteById(id);
	}
	
	@Transactional
	public int removeAllByEmployeeName(String employeeName) {
		return employeeJpa.deleteAllByEmployeeName(employeeName);
	}

	@Transactional
	public int removeAllEmployeesByDepartmentId(int id) {
		return employeeJpa.deleteAllEmployeesByDepartmentId(id);
	}

	@Transactional
	public int removeAllEmployeesByRoleId(int id) {
		return employeeJpa.deleteAllEmployeesByRoleId(id);
	}

	@Transactional
	public void removeAllEmployees() {
		employeeJpa.deleteAll();
	}
	
	public List<Object> getAllByNameWithJobName() {
		return employeeJpa.findAllByNameWithJobName();
	}

}
