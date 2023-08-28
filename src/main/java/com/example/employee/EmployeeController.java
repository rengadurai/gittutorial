package com.example.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "h")
public class EmployeeController {
	
	@Autowired
	EmployeeService empser;
	@PostMapping(value= "/add")
	public String addEmployee(@RequestBody Employee e) {
		System.out.println("first controller git commint");
		System.out.println("merge conflict git commit");
		return empser.addEmployee(e);
	}
	
	@PostMapping(value= "/sub")
	public String subEmployee(@RequestBody List<Employee> e) {
		return empser.subEmployee(e);
	}
	
	@GetMapping(value= "/getall")
	public List<Employee> getEmployee(){
		return empser.getEmployee();
	}
	
	@GetMapping(value= "/getbyid/{id}")
	public Employee getByid(@PathVariable("id") int id) {
		return empser.getByid(id);
	}
	
	@PostMapping(value= "/updatebyid/{id}")
	public String updateByid(@RequestBody Employee id) {
		return empser.updateByid(id);
	}
	
	@DeleteMapping(value= "deletebyid/{id}")
	public String deleteByid(@PathVariable("id") int id) {
		return empser.deleteByid(id);
	}
	
	@GetMapping(value= "/getminorormajor/{id}/{age}")
	public String getdetails(@PathVariable int id, @PathVariable int age) {
		return empser.getdetails(id,age);
	}
	
	@GetMapping(value= "/gethighsalaryemployees")
	public List<Employee> gethigh(){
		return empser.gethigh();
	}
	
	
	  @GetMapping(value= "/getmaxsalaryemployee") 
	  public Employee getmaxsalary() { 
		  return empser.getmaxsalary();
	  }
	  
	  @GetMapping(value= "/getnamesoflowsalary")
	  public List<String> getlownames(){
		  return empser.getlownames();
	  }
	  
	  @GetMapping(value= "/getlistoffemaleemployess")
	  public List<Employee> getfemale(){
		  return empser.getfemale();
	  }
	  
	  @GetMapping(value= "/getbysalary/{sal1}/{sal2}")
	  public List<Employee> getBysalary(@PathVariable int sal1, @PathVariable int sal2){
		  return empser.getBysalary(sal1, sal2);
	  }
	  	
	  @GetMapping(value= "/getminsalary")
	  public int getMinsalary() {
		  return empser.getMinsalary();
	  }
	  
	  @GetMapping(value= "/getmaxemployee")
	  public List<Employee> getMaxemployee() {
		  return empser.getMaxemployee();
	  }
	  
	  @GetMapping(value= "/getfemalenames")
	  public List<String> getFemalenames(){
		  return empser.getFemalenames();
	  }
	  
	  @GetMapping(value= "/getorderbyname")
	  public List<Integer> getOrder(){
		  return empser.getOrder();
	  }
	  
	
	  
	  }
	 
	
