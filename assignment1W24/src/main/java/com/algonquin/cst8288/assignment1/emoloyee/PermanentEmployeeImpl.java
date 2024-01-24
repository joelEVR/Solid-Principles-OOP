package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

import com.algonquin.cst8288.assignment1.controller.Rate;

public class PermanentEmployeeImpl implements EmployeeService, EmployeePensionService, Rate {

	public PermanentEmployeeImpl() {
		super();	
		}
	
	public double calculateTotalCompensation(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double pensionContribution(Employee employee) {
		double pension = employee.getSalary() * PENSION_PERCENTAGE;
		return pension;
		
	}

	
	public double calculateBonus(Employee employee) {
		return 0;
	}

	
}
