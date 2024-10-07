package com.employee_Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EmployeeFactoryTest {

    private EmployeeFactory factory;
    private EmployeeDirector director;

    @Before
    public void setUp() throws Exception {
        
        factory = new EmployeeFactory();
        director = new EmployeeDirector(new FullTimeEmployeeBuilder());
    }

    @Test
    public void testCreateEmployee() {
        
        Employee fullTimeEmployee = factory.createEmployee("fulltime", director, 1, "Yazid", "IT", "Developer", 40, 60000);
        
        
        assertNotNull(fullTimeEmployee);
        assertEquals("Yazid", fullTimeEmployee.name);
        assertEquals("IT", fullTimeEmployee.department);
        assertEquals("Developer", fullTimeEmployee.role);
        assertEquals(40, fullTimeEmployee.workingHoursPerWeek);
        assertEquals(60000, fullTimeEmployee.salary, 0.01);

    
        director = new EmployeeDirector(new PartTimeEmployeeBuilder());
        Employee partTimeEmployee = factory.createEmployee("parttime", director, 2, "Messi", "HR", "Consultant", 20, 30000);
        
        
        assertNotNull(partTimeEmployee);
        assertEquals("Messi", partTimeEmployee.name);
        assertEquals("HR", partTimeEmployee.department);
        assertEquals("Consultant", partTimeEmployee.role);
        assertEquals(20, partTimeEmployee.workingHoursPerWeek);
        assertEquals(30000, partTimeEmployee.salary, 0.01);
    }
}

