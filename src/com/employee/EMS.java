package com.employee;

import java.util.Scanner;

/**
 * This class is the main entry point for the Employee Management System.
 * It handles user input, creates employees, and manages them using the EmployeeManager.
 * This is where I run the show — It will  then Ask for input and handling the different actions.
 */
public class EMS {
    public static void main(String[] args) {
        EmployeeManager manager = EmployeeManager.getInstance();  // Get the one and only EmployeeManager instance
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Employee Management System!");

        while (true) {
            // I ask the user which type of employee they want to create
            System.out.println("Do you want to create a Part-Time or Full-Time employee? (Enter 'parttime', 'fulltime' or 'exit' to quit): ");
            String type = scanner.nextLine().toLowerCase();  // Convert input to lowercase to avoid case sensitivity issues

            if (type.equals("exit")) {
                break;  // If the user wants to exit, I stop the loop
            }

            // Get the employee’s details from the user
            System.out.println("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character after integer input

            System.out.println("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.println("Enter Department: ");
            String department = scanner.nextLine();

            System.out.println("Enter Role: ");
            String role = scanner.nextLine();

            System.out.println("Enter Working Hours Per Week: ");
            int hours = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            System.out.println("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline character

            // Choose the correct director based on the employee type
            EmployeeDirector director;
            if (type.equals("fulltime")) {
                director = new EmployeeDirector(new FullTimeEmployeeBuilder());
            } else if (type.equals("parttime")) {
                director = new EmployeeDirector(new PartTimeEmployeeBuilder());
            } else {
                System.out.println("Invalid employee type! Please enter 'parttime' or 'fulltime'.");
                continue;  // Skip to the next loop iteration if the type is invalid
            }

            // Use the factory to create the appropriate employee
            Employee employee = new EmployeeFactory().createEmployee(type, director, id, name, department, role, hours, salary);

            // Add the new employee to EmployeeManager
            manager.addEmployee(employee);
            System.out.println("Employee added successfully!");
        }

        System.out.println("All Employees:");
        manager.displayEmployees();  // Display all employees before exiting the program
    }
}
