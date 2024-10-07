package com.employee;

/**
 * This interface is like a checklist for me when I'm building an employee.
 * It lists all the steps I need to complete to fully set up an employee object.
 * I can use this to make sure I don't miss any critical detail before I call the `build()` method.
 */
public interface EmployeeBuilder {
    EmployeeBuilder setId(int id);               // Set the employee's ID
    EmployeeBuilder setName(String name);        // Set the employee's name
    EmployeeBuilder setDepartment(String department); // Set which department they work in
    EmployeeBuilder setRole(String role);        // Set their job role
    EmployeeBuilder setWorkingHoursPerWeek(int hours); // Set their weekly working hours
    EmployeeBuilder setSalary(double salary);    // Set their salary amount
    Employee build();                            // Put everything together and create the Employee object
}
