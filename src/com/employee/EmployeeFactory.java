package com.employee;

/**
 * I use this class to decide which type of employee (full-time or part-time) I want to build.
 * It keeps the logic of choosing the type separate from how the employee is actually built, making it easier 
 * for me to expand or change things later. This way, I can create different types of employees without 
 * changing the underlying construction logic.
 */
public class EmployeeFactory {

    /**
     * This is the main method I use to create an employee based on the type.
     * If the type is "fulltime", it will create a full-time employee. If it's "parttime", it'll create a part-time employee.
     * If the type doesn't match, I throw an exception to handle it.
     */
    public Employee createEmployee(String type, EmployeeDirector director, int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        if (type.equalsIgnoreCase("fulltime")) {
            return director.constructEmployee(id, name, department, role, workingHoursPerWeek, salary); // Build a full-time employee
        } else if (type.equalsIgnoreCase("parttime")) {
            return director.constructEmployee(id, name, department, role, workingHoursPerWeek, salary); // Build a part-time employee
        } else {
            throw new IllegalArgumentException("Unknown employee type: " + type);  // Handle invalid employee types
        }
    }
}
