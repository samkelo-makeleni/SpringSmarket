package com.hello.main;

public class Supervisor {
  private int sId;	
  private String sName;
  private String sSurname;
  private Double sSalary;
  
  public Supervisor(int sId, String sName, String sSurname, double sSalary) {
	  this.sId = sId;
	  this.sName = sName;
	  this.sSurname = sSurname;
	  this.sSalary = sSalary;
	  
  }

public int getsId() {
	return sId;
}

public void setsId(int sId) {
	this.sId = sId;
}

public String getsName() {
	return sName;
}

public void setsName(String sName) {
	this.sName = sName;
}

public String getsSurname() {
	return sSurname;
}

public void setsSurname(String sSurname) {
	this.sSurname = sSurname;
}

public Double getsSalary() {
	return sSalary;
}

public void setsSalary(Double sSalary) {
	this.sSalary = sSalary;
}
  
  
  
}
