package com.example.employee;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query(value= "select * from employee where salary>=:sal1 AND salary<=:sal2", nativeQuery = true)
	public List<Employee> getBysalary(@Param("sal1") int sal1, @Param("sal2") int sal2);
	
	@Query(value= "select min(salary) from employee", nativeQuery = true)
	public int getMinsalary();
	
	@Query(value= "select * from employee where salary = (select max(salary) as salary from employee)", nativeQuery = true)
	public List<Employee> getMaxemployee();
	
	@Query(value= "select name from employee where gender = \"female\"", nativeQuery = true)
	public List<String> getFemalenames();
	
	@Query(value= "SELECT salary FROM employee ORDER BY salary")
	public List<Integer> getOrder();
}