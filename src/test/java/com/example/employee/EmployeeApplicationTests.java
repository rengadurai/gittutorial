package com.example.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class EmployeeApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	EmployeeService empSer;
	
	@MockBean
	EmployeeRepository empRepo;
	
	@Test
	public void getAll() {
		when(empRepo.findAll()).thenReturn(Stream.of(new Employee(1, "Jack", 9876543210L, 17, "male", 50000), new Employee(2,"ana", 4567891230L, 16, "female", 70000)).collect(Collectors.toList()));
		assertEquals(2, empSer.getEmployee().size());
	}
	
	
	
	@Test
	public void getFemale() {
		when(empRepo.getFemalenames()).thenReturn( Stream.of("abc", "aaa").collect(Collectors.toList()));
		assertEquals(2, empSer.getFemalenames().size());
	}
	
	
	
}