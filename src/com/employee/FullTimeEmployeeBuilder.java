package com.employee;

/**
 * This class helps me build Full-Time Employee objects step-by-step.
 * I can set details like the ID, name, department, role, working hours, and salary.
 * Once everything is filled in, I use the `build()` method to create a complete Full-Time Employee.
 *
 * This way, I don't have to worry about remembering all the properties at once — 
 * I can set them one by one, and in the end, it all comes together.
 */
public class FullTimeEmployeeBuilder implements EmployeeBuilder {
    private int id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    @Override
    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;  // I return the current builder object so I can chain methods easily
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

    // Once I’ve set all the details, this method builds the final Full-Time Employee object
    @Override
    public Employee build() {
        return new FullTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }
}


