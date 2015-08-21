package com.company.salary;

public class BonusStrategy implements SalaryStrategy {
	private final double salary;
	private final double bonus;
	
	public BonusStrategy(double salary, double bonus) {
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public double calculateSalary() {
		return bonus+salary;
	}

}
