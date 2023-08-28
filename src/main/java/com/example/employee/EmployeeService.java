package com.example.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class EmployeeService {
@Autowired
EmployeeDao empDao;
public String addEmployee(Employee e) {
	System.out.println("git branch created");
	return empDao.addEmployee(e);
}


public String subEmployee(List<Employee> e) {
	return empDao.subEmployee(e);
}


public List<Employee> getEmployee(){
	return empDao.getEmployee();
}


public Employee getByid(int id) {
	return empDao.getByid(id);
}




public String updateByid(Employee id) {
	return empDao.updateByid(id);
}

public String deleteByid(int id) {
	return empDao.deleteByid(id);
}

public String getdetails(int id, int age) {
		if(age>18) {
			return empDao.getByid(id).getName() + " is major";
		}else{
			return empDao.getByid(id).getName()+ " is minor";
		}
}

public List<Employee> gethigh(){
	return empDao.getEmployee().stream().filter(x -> x.getSalary()>50000).toList();
}

public Employee getmaxsalary() {
	
	 List<Employee> emps = empDao.getEmployee();
	 Employee max = emps.get(0);
	 for(Employee x : emps) {
		 if(x.getSalary()>max.getSalary()) {
			 max = x;
		 }
	 }
	 return max;
}

public List<String> getlownames(){
	  return empDao.getEmployee().stream().filter(x -> x.getSalary() < 50000).map(x -> x.getName()).toList();
	}

public List<Employee> getfemale(){
	  return empDao.getEmployee().stream().filter(x -> x.getGender() == "female").toList();
}

public List<Employee> getBysalary(int sal1,int sal2){
	  return empDao.getBysalary(sal1, sal2);
}

public int getMinsalary() {
	  return empDao.getMinsalary();
}

public List<Employee> getMaxemployee() {
	  return empDao.getMaxemployee();
}

public List<String> getFemalenames(){
	  return empDao.getFemalenames();
}

public List<Integer> getOrder(){
	  return empDao.getOrder();
}



}


