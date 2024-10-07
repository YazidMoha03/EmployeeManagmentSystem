package com.employee_Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.employee.Employee;
import com.employee.EmployeeDirector;

public class EmployeeDirectorTest {
  
	private EmployeeDirector director ;
	
	@Before
	public void setup() throws Exception {
		director = new EmployeeDirector(new FullTimeemployeeBuilder());
		
	}
	
	@Test
	public void testEmployeeDirector() {
		
		assertNotNull(director);
		
	}

	@Test
	public void testConstructEmployee() {
		
		Employee employee = director.constructEmployee(1, "Yazid", "IT", "Devop",20,50000);
		
		
		assertNotNull(employee);
		assertEquals(1,employee.id);
		assertEquals("Yazid",employee.name);
		assertEquals("IT", employee.department);
		assertEquals("Devop",employee.role);
		assertEquals(20,employee.workingHoursePerWeek);
		assertEquals(50000,employee.salary,);
		
	
	}

}
