package com.employee;

/**
 * This class represents a part-time employee.
 * It’s built on top of the Employee class, and it provides specific details and behaviors for part-time staff.
 * I can create part-time employees using this class and define how they clock in, clock out, and track their work hours.
 */
public class PartTimeEmployee extends Employee {

    /**
     * I use this constructor to set up a part-time employee with all their details.
     * These values are passed up to the superclass (Employee), which handles the common attributes.
     *
     */
    public PartTimeEmployee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);  // Initialize the employee attributes using the parent constructor
    }

    /**
     * Defines what happens when a part-time employee clocks in.
     * For now, I’m keeping it simple as the FullTimeEmployeeCalss with a print statement.
     */
    @Override
    public void clockIn() {
        System.out.println(name + " has clocked in as a part-time employee.");
    }

    /**
     * This method handles what happens when a part-time employee clocks out.
     */
    @Override
    public void clockOut() {
        System.out.println(name + " has clocked out as a part-time employee.");
    }

    /**
     * This method tracks the number of hours a part-time employee has worked.
     * Part-time employees usually work fewer hours, so I can customize this to show specific details if needed.
     */
    @Override
    public void trackWorkHours() {
        System.out.println(name + " has tracked " + workingHoursPerWeek + " hours this week.");
    }
}
