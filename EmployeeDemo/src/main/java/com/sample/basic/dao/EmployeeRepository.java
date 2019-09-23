package com.sample.basic.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.basic.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	public List<Employee> findAllByEmployeeName(String employeeName);

	public List<Employee> findAllEmployeesByDepartmentId(int id);

	public List<Employee> findAllEmployeesByRoleId(int id);
	
	@Modifying
	public int deleteAllByEmployeeName(String employeeName);

	@Modifying
	public int deleteAllEmployeesByDepartmentId(int departmentId);
	
	@Modifying
	public int deleteAllEmployeesByRoleId(int roleId);
	
	@Query("SELECT DISTINCT(e.salary) FROM Employee e")
	public List<Object> distinctEmployeeSalaries();
	
	@Query("SELECT e.employeeName||'('||e.jobName||')' FROM Employee e")
	public List<Object> findAllByNameWithJobName();

}
