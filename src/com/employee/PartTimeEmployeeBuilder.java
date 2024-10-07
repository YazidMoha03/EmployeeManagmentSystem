package com.employee;

/**
 * This class helps me put together Part-Time Employee objects step-by-step.
 * Just like the FullTimeEmployeeBuilder, it allows me to set the ID, name, department, role, 
 * working hours, and salary specific to part-time employees. 
 * When I'm done setting all the properties, I can use the `build()` method to create the final Part-Time Employee.
 */
public class PartTimeEmployeeBuilder implements EmployeeBuilder {
    private int id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    @Override
    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    @Override
    public EmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    @Override
    public EmployeeBuilder setWorkingHoursPerWeek(int hours) {
        this.workingHoursPerWeek = hours;
        return this;
    }

    @Override
    public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    // After setting everything, this method will build the Part-Time Employee object
    @Override
    public Employee build() {
        return new PartTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }
}
