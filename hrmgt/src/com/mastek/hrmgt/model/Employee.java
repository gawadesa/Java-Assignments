package com.mastek.hrmgt.model;

public class Employee {
	private int empno;
	private String ename;
	private String designation;
	private double salary;
	public Employee() {
	super();
	// TODO Auto-generated constructor stub
	}
	// Alto+s+a
	public Employee(int empno, String ename, String designation, double salary) {
	super();
	this.empno = empno;
	this.ename = ename;
	this.designation = designation;
	this.salary = salary;
	}
	public int getEmpno() {
	return empno;
	}
	public void setEmpno(int Empno) {
	this.empno = Empno;
	}
	public String getEName() {
	return ename;
	}
	public void setEName(String EName) {
	this.ename = EName;
	}
	public String getDesignation() {
	return designation;
	}
	public void setDesignation(String designation) {
	this.designation = designation;
	}
	public int getSalary() {
		return empno;
		}
		public void setSalary(double salary) {
		this.salary = salary;
		}
	@Override
	public String toString() {
	return "Employee [empno=" + empno + ", ename=" + ename + ", designation=" + designation + ",salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result +  empno;
	return result;
	}
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	Employee other = (Employee) obj;
	if (empno != other.empno)
	return false;
	return true;
	}
}
