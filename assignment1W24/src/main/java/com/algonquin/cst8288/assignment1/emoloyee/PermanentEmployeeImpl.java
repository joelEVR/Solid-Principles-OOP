package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

import com.algonquin.cst8288.assignment1.controller.Rate;

public class PermanentEmployeeImpl implements PermanentEmployeeService {

    private Employee employee;

    public PermanentEmployeeImpl(Employee employee) {
        this.employee = employee;
    }
	
    @override
	public double calculateTotalCompensation(Employee employee) {
    	double bonus = calculateBonus(employee);
        return employee.getSalary() + bonus;
	}
	
	@Override
	public double pensionContribution(Employee employee) {
        return employee.getSalary() * Rate.PENSION_PERCENTAGE;
	}

	@Override
	public double calculateBonus(Employee employee) {
        return employee.getSalary() * Rate.BONUS_PERCENTAGE * employee.getNumberOfServiceYear();
	}

	

	
}
