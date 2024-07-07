package org.learn.designpatterns.composite.orghirarchy;

import java.util.ArrayList;
import java.util.List;

public class Department implements Entity{

    String name;
    List<Employee> employees;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Department Name - " + name + "\n");
        employees.forEach(employee -> {
            employee.showDetails();
        });
    }

    @Override
    public Double getSalary() {
        Double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        return totalSalary;
    }

}
