package com.hello.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hello.employee.service.EmployeeService;

@RestController
@RequestMapping(path="api/")
public class SuperMarketController {
	@Autowired
	public EmployeeService empService;	
	
	 @GetMapping(path="employee/{id}",produces="application/json")
	 public @ResponseBody Employee getEmployee(@PathVariable(name="id") int empId) {
		 return empService.getEmployee(empId);
		 
	 }
	 
	 @GetMapping(path="employee",produces="application/json")
	 public @ResponseBody List<Employee> getAllEmployees() {
		 return empService.getAllEmployees();	 
	 }

	
	 @PostMapping(path="employee", consumes="application/json")
	 public @ResponseBody String createEmployee(@RequestBody Employee emp) {
		 return empService.postEmployee(emp); 
	 }
	 
	  @DeleteMapping("/employee/{id}")
	  public String deleteStudent(@PathVariable(name="id") int empId) {
	    empService.deleteById(empId);
	    return "Deleted";
		 
	 }
	  
	  @PutMapping(path="employee", consumes="application/json")
		 public @ResponseBody String updateEmployee(@RequestBody Employee emp) {
			 return empService.putEmployee(emp); 
		 }
 }

