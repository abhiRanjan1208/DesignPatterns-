package org.learn.designpatterns.composite.orghirarchy;

/**
 You are working on a software application for managing a company’s organizational
 structure. The organization consists of various departments, and each department
 can have multiple sub-departments and employees. Employees can belong to
 different levels within the hierarchy, such as managers, team leads, and
 individual contributors. The application needs to represent this hierarchical
 structure and provide functionality to perform operations such as calculating
 total salaries, listing all employees in a department, and displaying the
 organizational structure.
 */

public class Runner {

    public static void main(String[] args){

        Employee employee1 = new Employee("John", "Analyst", 50000.0);
        Employee employee2 = new Employee("Doe", "Associate", 60000.0);
        Employee employee3 = new Employee("Jane", "VP", 100000.0);

        Department devDepartment = new Department("Engineering");
        devDepartment.addEmployee(employee1);
        devDepartment.addEmployee(employee2);
        devDepartment.addEmployee(employee3);

        devDepartment.showDetails();
        Double totalSalary = devDepartment.getSalary();
        System.out.println("Total salary of engineering department - " + totalSalary);

        System.out.println("Removing John...");
        devDepartment.removeEmployee(employee1);
        totalSalary = devDepartment.getSalary();
        System.out.println("Total salary of engineering department - " + totalSalary);

    }
}
