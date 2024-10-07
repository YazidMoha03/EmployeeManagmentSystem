package com.employee_Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.employee.EmployeeManager;

public class EmployeeManagerTest {

	private EmployeeManager manager;
	
	@Before
	public void setup() throws Exception 
	
	manager = EmployeeManager.getInstance();

		
	}

	@Test
	public void testGetInstance() {
		
		EmployeeManager anotherManger = EmployeeManager.getInstance();
		
		assertEquals(manager,anotherManager);
		
	}
	
	

	@Test
	public void testAddEmployee() {
		
		Employee employee = new FullTimeEmployee(1,"Yazid","CP","Developer","30","70000");
		
		manager.addEmployee(employee);
		asssertEquals(employee, manager.getEmployeeById(1));
		
	}
	
	

	@Test
	public void testRemoveEmployee() {
		
		Employee employee = new FullTimeEmployee(2,"Mohamed","VP","Managment",20,20000);
		manager.addEmployee(employee);
		
		manager.removeEmployee(employee);
		
		assertNull(manager.getEmployeeById(2));
		
	}

	@Test
	public void testGetEmployeeById() {
		
		Employee employee = new FullTimeEmployee(3,"Mark","sales","Sales Representative",30,60000);
		manager.addEmployee(employee);
		
		Employee retrievedEmployee = manager.getEmployeeById(3);
		
		assertNotNull(retrievedEmployee);
		assertEquals("Mark",retrievedEmployee.name);
		
	}

	@Test
	public void testDisplayEmployees() {
		
		Employee employee1 = new FullTimeEmployee(4,"John","IT","Developer",30,70000);
		Employee employee2 = new PartTimeEmployee(5,"Yazid2.0","Marketing","Marketing Manager",50,30000);
		
		
	    manager.addEmployee(employee1);
	    manager.addEmployee(employee2);
	    
	    manager.displayEmployees();
	    
	    assertNotNull(manager.getEmployeeById(4));
	    assertNotNull(manager.getEmployeeById(5));
	}

}
