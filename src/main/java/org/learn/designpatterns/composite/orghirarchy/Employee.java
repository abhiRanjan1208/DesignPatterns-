package org.learn.designpatterns.composite.orghirarchy;

public class Employee implements Entity{

    String name;

    String designation;

    Double salary;

    public Employee(String name, String designation, Double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee Name - " + name + ", designation - "  + designation);
    }

    @Override
    public Double getSalary() {
        return salary;
    }
}
