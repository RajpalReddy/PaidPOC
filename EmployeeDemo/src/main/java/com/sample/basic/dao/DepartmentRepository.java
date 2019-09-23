package com.sample.basic.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.basic.domain.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer>{
	
	
	public List<Department> findAllByDepartmentName(String departmentName);
	
	@Modifying
	public int deleteAllByDepartmentName(String departmentName);

}
