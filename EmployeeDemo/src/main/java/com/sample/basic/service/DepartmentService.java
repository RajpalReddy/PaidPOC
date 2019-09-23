package com.sample.basic.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.basic.dao.DepartmentRepository;
import com.sample.basic.domain.Department;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentJpa;
	
	public Department addDepartment(Department department) {
		return departmentJpa.save(department);
	}
	
	public Department getByDepartmentId(int id) {
		return departmentJpa.findById(id).get();
	}
	
	public List<Department> getAllByDepartmentName(String departmentName) {
		return departmentJpa.findAllByDepartmentName(departmentName);
	}
	
	public Iterable<Department> listAllDepartments() {
		return departmentJpa.findAll();
	}
	
	public long noOfDepartments() {
		return departmentJpa.count();
	}
	
	@Transactional
	public void removeByDepartmentId(int id) {
		departmentJpa.deleteById(id);
	}
	
	@Transactional
	public int removeAllByDepartmentName(String departmentName) {
		return departmentJpa.deleteAllByDepartmentName(departmentName);
	}
	
	@Transactional
	public void removeAllDepartments() {
		departmentJpa.deleteAll();
	}
}
