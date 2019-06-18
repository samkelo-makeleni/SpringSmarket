package com.hello.employee.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hello.main.Employee;


@Service
public class EmployeeService {
	List<Employee> employees = new ArrayList<Employee>();
	
	public EmployeeService(){		
		Employee emp1 = new Employee(12,"sam", "nkosi", 10000, "developer");
		Employee emp2 = new Employee(13, "smith", "smith", 5000, "tester");
		Employee emp3 = new Employee(14,"sam", "nkosi", 10000, "ba");
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
	}	
	
	public Employee getEmployee(int id) {
		Employee employee = null;
		
		for (Employee emp : employees) {
			if(emp.getEmpId() == id) {
				employee = emp;
			}
		}
		return employee;
	}
	
	public List<Employee> getAllEmployees(){
		return employees;
	}
	
	public String postEmployee(Employee emp) {
		System.out.println("employees"+ emp);
		
		employees.add(emp);
		
		return "Employee added";
	}

	

	public void deleteById(int empId) {
	
		
		Employee employee = null;
        for(Employee emp: employees) {
        	if(emp.getEmpId() == empId) {
        		employee = emp;
        	}
        }
		
		if(employee != null) {
			employees.remove(employee);
		}
		
	}
	public String putEmployee(Employee emp) {
		for(int i = 0; i < employees.size();i++) {
			Employee t = employees.get(i);
			if(t.equals(emp)) {
				employees.set(i, emp);
			}
		}
		return null;
		
	}
}


  	 
	
	

       

