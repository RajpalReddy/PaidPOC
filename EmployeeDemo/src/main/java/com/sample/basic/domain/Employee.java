package com.sample.basic.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name = "phone_no")
	private long phoneNo;

	@Temporal(TemporalType.DATE)
	@Column(name = "hire_date")
	private Date hireDate;
	
	@Column(name = "job_name")
	private String jobName;
	
	@Column(name = "manager_id")
	private String managerId;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "salary")
	private double salary;
	
	@Column(name = "bonus")
	private double bonus;
	
	@Column(name = "commission")
	private double commission;
	
	@Column(name = "address")
	private String address;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private Department department;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	private Role role;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String employeeName, long phoneNo, Date hireDate, String jobName, String managerId,
			String gender, double salary, double bonus, double commission, String address, Department department,
			Role role) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.phoneNo = phoneNo;
		this.hireDate = hireDate;
		this.jobName = jobName;
		this.managerId = managerId;
		this.gender = gender;
		this.salary = salary;
		this.bonus = bonus;
		this.commission = commission;
		this.address = address;
		this.department = department;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", phoneNo=" + phoneNo + ", hireDate="
				+ hireDate + ", jobName=" + jobName + ", managerId=" + managerId + ", gender=" + gender + ", salary="
				+ salary + ", bonus=" + bonus + ", commission=" + commission + ", address=" + address + ", department="
				+ department + ", role=" + role + "]";
	}

}
