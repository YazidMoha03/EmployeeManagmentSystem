package com.employee;

/**
 * This class acts like a guide that helps me build Employee objects step-by-step.
 * It makes sure I set up all the necessary details in the right order by using the EmployeeBuilder.
 * Once all the details are filled in, I can call the `constructEmployee()` method,
 *  which then returns the complete Employee object.
 */
public class EmployeeDirector {
    private EmployeeBuilder builder;  // Holds the specific builder I’ll use to set up the employee’s details

    /**
     * I pass in a builder (e.g., FullTimeEmployeeBuilder or PartTimeEmployeeBuilder) to this constructor.
     * This way, I can use the same director to build different kinds of employees just by swapping the builder.
     */
    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    /**
     * I use this method to build an employee, setting each property one by one.
     * When all the properties are filled in, it calls the `build()` method to create the complete Employee object.
     */
    public Employee constructEmployee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        return builder.setId(id)
                      .setName(name)
                      .setDepartment(department)
                      .setRole(role)
                      .setWorkingHoursPerWeek(workingHoursPerWeek)
                      .setSalary(salary)
                      .build();  // This returns the fully built employee object
    }
}

