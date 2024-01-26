package com.algonquin.cst8288.assignment1.emoloyee;

import com.algonquin.cst8288.assignment1.controller.Rate;

public class PermanentEmployeeImpl implements PermanentEmployeeService {

    private Employee employee;

    public PermanentEmployeeImpl(Employee employee) {
        this.employee = employee;
    }
	
    @Override
	public double calculateTotalCompensation(Employee employee) {
    	employee.setTotalCompensation(employee.getSalary() + employee.getBonus());
    	return employee.getTotalCompensation();
	}
	
	@Override
	public double pensionContribution(Employee employee) {
        return employee.getSalary() * Rate.PENSION_PERCENTAGE;
	}

	@Override
	public double calculateBonus(Employee employee) {
        employee.setBonus(employee.getSalary() * Rate.BONUS_PERCENTAGE * employee.getNumberOfServiceYear());
		return employee.getBonus();
	}

	

	
}
