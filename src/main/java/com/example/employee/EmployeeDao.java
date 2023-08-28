package com.example.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;
	public String addEmployee(Employee e) {
		empRepo.save(e);
		return "Successfully Added";
	}
	

	public String subEmployee(List<Employee> e) {
		empRepo.saveAll(e);
		return "Successfully saved a list";
	}
	
	
	public List<Employee> getEmployee(){
		return empRepo.findAll();
	}
	

	public Employee getByid(int id) {
		return empRepo.findById(id).get();
	}
	
	
	public String updateByid(Employee id) {
		empRepo.save(id);
		return "Updated Successfully";
	}
	
	public String deleteByid(int id) {
		empRepo.deleteById(id);
		return "Deleted Successfully";
	}
	
	public List<Employee> getBysalary(int sal1, int sal2){
		  return empRepo.getBysalary(sal1, sal2);
	  }
	
	public int getMinsalary() {
		  return empRepo.getMinsalary();
	  }
	
	public List<Employee> getMaxemployee() {
		  return empRepo.getMaxemployee();
	  }
	
	public List<String> getFemalenames(){
		  return empRepo.getFemalenames();
	  }
	
	public List<Integer> getOrder(){
		  return empRepo.getOrder();
	  }
	
	
}

