package com.hello.main;

public class Employee {
   private int empId;
   private String empName;
   private String empSurname;
   private double salary;
   private String job;

	public Employee(int empId,String empName,String empSurname,double salary,String job) {
    	
    	this.empId = empId;
    	this.empName = empName;
    	this.empSurname = empSurname;
    	this.salary = salary;
    	this.job = job;
    }
   
    
    
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpSurname() {
	return empSurname;
}
public void setEmpSurname(String empSurname) {
	this.empSurname = empSurname;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}


   
}
