package com.company.salary;

public class CommissionStrategy implements SalaryStrategy {
	private static final double MIN_TO_RECEIVE_COMMISSION = 6000.0;
	private static final Double COMMISSION_PERCENTAGE = .30;
	private static final double ZERO_COMMISSION = 0.0;

	private final int amountSold;
	private final double salary;

	public CommissionStrategy(double salary, int amountSold) {
		this.salary = salary;
		this.amountSold = amountSold;
	}

	public double calculateSalary() {
		return salary + calculateCommission();
	}

	private double calculateCommission() {
		if (amountSold > MIN_TO_RECEIVE_COMMISSION) {
			return amountSold * COMMISSION_PERCENTAGE;
		}

		return ZERO_COMMISSION;
	}
}
