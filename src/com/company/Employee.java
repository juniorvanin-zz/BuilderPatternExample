package com.company;

import com.company.salary.SalaryStrategy;

public class Employee {

    private final int id;
    private final String firstName;
    private final String lastName;
    private final String age;
    private final String phoneNumber;
    private final String email;

    private final SalaryStrategy salaryStrategy;

    private static String NEW_LINE = "\n";

    protected Employee(int id, String firstName, String lastName, String age, String email, String phoneNumber, SalaryStrategy salaryStrategy){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
		this.salaryStrategy = salaryStrategy;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getInfo() {
        return  NEW_LINE + "Employee type: " + getClass().getSimpleName() +
                NEW_LINE + "Id:"+ id +
                NEW_LINE + "First Name:"+ firstName +
                NEW_LINE + "Last Name:" + lastName +
                NEW_LINE + "Age:" + age +
                NEW_LINE + "Phone Number:" + phoneNumber +
                NEW_LINE + "Email:" + email +
                NEW_LINE + "Salary: " + salaryStrategy.calculateSalary();
    }


}
