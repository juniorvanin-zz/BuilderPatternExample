package com.company;

import com.company.salary.CommissionStrategy;

public class Salesman extends Employee {

	public Salesman(int id, String firstName, String lastName, String age, String email, String phoneNumber, double salaryBase, int amountSold) {
	    super(id, firstName, lastName, age, email,phoneNumber, new CommissionStrategy(salaryBase, amountSold));
	}

}
