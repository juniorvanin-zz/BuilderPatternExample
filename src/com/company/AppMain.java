package com.company;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
	 public static void main(String[] args) {
		 	Manager employeeManager = new EmployeeBuilder(1,"Ana","Alves")
                                            .withAge("20")
                                            .withEmail("manager@email.com")
                                            .buildManager(4000,1000);

	        Salesman employeeSalesman1 = new EmployeeBuilder(1, "Joao", "Carlos")
                                            .withEmail("salesman@email.com")
                                            .withPhoneNumber("1111-2222")
                                            .buildSalesman(2000,6000);

	        Salesman employeeSalesman2 = new EmployeeBuilder(3, "Maria", "Claudia")
                                            .buildSalesman(3000,700);

	        List<Employee> employees = new ArrayList<Employee>();

	        employees.add(employeeManager);
	        employees.add(employeeSalesman1);
	        employees.add(employeeSalesman2);

	        for (Employee employee : employees){
	            System.out.println(employee.getInfo());
	        }
	 }
}
