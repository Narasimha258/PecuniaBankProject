package com.cg.pecuniabank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeDetails")
public class Employee {
	
	@Id
	@Column(name="Emp_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="genName1")
	@SequenceGenerator(name="genName1", sequenceName="acc",initialValue=11711,allocationSize=1)
	private long employeeId;
	
	@Column(name="Emp_Name")
	private String employeeName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Empbranch_id")
	private BranchDetails employeebranchId;
	
	@JoinColumn(name="EmpDesignation")
	private String employeeDesignation;
	
	@JoinColumn(name="email")
	private String email;
	
	@JoinColumn(name="password")
	private String password;
	
	public Employee()
	{
		
	}
	
	public Employee(long employeeId,String employeeName,BranchDetails employeebranchId,String employeeDesignation,String email,String password)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeebranchId=employeebranchId;
		this.employeeDesignation=employeeDesignation;
		this.email=email;
		this.password=password;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public BranchDetails getEmployeebranchId() {
		return employeebranchId;
	}

	public void setEmployeebranchId(BranchDetails employeebranchId) {
		this.employeebranchId = employeebranchId;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	
	
	
	

}
