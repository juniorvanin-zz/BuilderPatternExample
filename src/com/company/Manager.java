package com.company;

import com.company.salary.BonusStrategy;

public class Manager extends Employee {

    public Manager(int id, String firstName, String lastName, String age, String email, String phoneNumber, double baseSalary, int bonus) {
        super(id, firstName, lastName, age, email, phoneNumber, new BonusStrategy(baseSalary, bonus));
    }


}
