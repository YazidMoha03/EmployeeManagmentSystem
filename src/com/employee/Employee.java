package com.employee;

/**
 * This class is where I define the basic structure and behaviors that all employees should have.
 * It holds common attributes like ID, name, department, role, working hours, and salary.
 * I use it as a foundation, and other employee types (like Full-Time and Part-Time) build on this.
 *
 * Since it's an abstract class, I can't create an Employee directly from this.
 * Instead, subclasses like FullTimeEmployee and PartTimeEmployee will extend it and provide more specific details.
 */
public abstract class Employee {
    protected int id;                 // A unique identifier for each employee
    protected String name;            // The employee's name
    protected String department;      // Which department they work in
    protected String role;            // Their role or job title
    protected int workingHoursPerWeek;// How many hours they work each week
    protected double salary;          // Their salary amount

    /**
     * I use this constructor to set up the core details of an employee. 
     * Anytime I create an employee (via a subclass), I can pass these values to initialize it.
     */
    public Employee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
    }

    // These abstract methods define what actions any employee should be able to do.
    public abstract void clockIn();  // To start their workday
    public abstract void clockOut(); // To end their workday
    public abstract void trackWorkHours(); // To track their total work hours

    // This is my way of printing out an employee’s details in a readable format.
    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Department=" + department + ", Role=" + role +
                ", Working Hours/Week=" + workingHoursPerWeek + ", Salary=" + salary + "]";
    }
}





