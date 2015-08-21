package com.company;

public class EmployeeBuilder {


    private int id;
    private String firstName;
    private String lastName;
    private String age = "NOT INFORMED";
    private String email = "NOT INFORMED";
    private String phoneNumber = "NOT INFORMED";

    public EmployeeBuilder(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public EmployeeBuilder withAge(String age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public EmployeeBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Salesman buildSalesman(double baseSalary, int amountSold) {
        return new Salesman(id, firstName, lastName, age, email, phoneNumber, baseSalary, amountSold);
    }

    public Manager buildManager(double baseSalary, int bonus) {
        return new Manager(id, firstName, lastName, age, email, phoneNumber, baseSalary, bonus);
    }

}
