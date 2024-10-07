package com.employee;

/**
 * This class represents a full-time employee.
 * It builds on top of the Employee class, adding details specific to full-time staff.
 * Since it’s a concrete class, I can use it to create full-time employees and define how they clock in, 
 * clock out, and track their work hours.
 */
public class FullTimeEmployee extends Employee {

    /**
     * I use this constructor to initialize a full-time employee with all the necessary details.
     * I’m passing these values to the superclass (Employee) to handle common attributes.
     *
     */
    public FullTimeEmployee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);  // Initialize the employee attributes using the parent constructor
    }

    /**
     * This is how I define what happens when a full-time employee clocks in.
     * I can customize it further if needed, but for now, I’m just printing out a message.
     */
    @Override
    public void clockIn() {
        System.out.println(name + " has clocked in as a full-time employee.");
    }

    /**
     * This method handles what happens when a full-time employee clocks out.
     */
    @Override
    public void clockOut() {
        System.out.println(name + " has clocked out as a full-time employee.");
    }

    /**
     * This method is responsible for tracking the number of hours a full-time employee has worked.
     */
    @Override
    public void trackWorkHours() {
        System.out.println(name + " has tracked " + workingHoursPerWeek + " hours this week.");
    }
}
