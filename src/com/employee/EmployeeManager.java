package com.employee;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is like the central hub for managing all the employees.
 * I use the Singleton pattern here, which means I can only have one instance of EmployeeManager throughout the application.
 * It makes sure that all the employee operations (like adding, removing, and searching) are handled in one place.
 */
public class EmployeeManager {
    private static EmployeeManager instance;  // The only instance of EmployeeManager that will exist
    private List<Employee> employees;         // This is where I keep track of all employee objects

    // I keep the constructor private to prevent anyone from creating more instances outside this class
    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    /**
     * This method returns the only instance of EmployeeManager.
     * If it doesn’t exist yet, I create it here and return it.
     */
    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();  // Create the instance if it’s not already created
        }
        return instance;
    }

    /**
     * Adds a new employee to my list of employees.
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Removes an existing employee from my list.
     */
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    /**
     * Finds an employee by their ID. If no match is found, it returns null.
     */
    public Employee getEmployeeById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return e;  // Found a match, return the employee
            }
        }
        return null;  // No match found, return null
    }

    /**
     * Displays all the employees I’m managing right now.
     */
    public void displayEmployees() {
        for (Employee e : employees) {
            System.out.println(e.toString());  // Print each employee’s details
        }
    }
}
