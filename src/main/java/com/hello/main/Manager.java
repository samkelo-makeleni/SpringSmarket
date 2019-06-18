package com.hello.main;

public class Manager {
	private int mId;
	private String mName;
	private String mSurname;
	private Supervisor mysupervisor;
	private Employee emp;
	
	public Manager(int mId, String mName, String mSurname, Supervisor mySupervisor, Employee emp) {
		this.mId = mId;
		this.mName = mName;
		this.mSurname = mSurname;
		this.mysupervisor = mySupervisor; 
		this.emp=emp;
		
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmSurname() {
		return mSurname;
	}

	public void setmSurname(String mSurname) {
		this.mSurname = mSurname;
	}

	public Supervisor getMysupervisor() {
		return mysupervisor;
	}

	public void setMysupervisor(Supervisor mysupervisor) {
		this.mysupervisor = mysupervisor;
	}

   public Employee getEmp() {
		return emp;
	}

  public void setEmp(Employee emp) {
	this.emp = emp;
   }

}
