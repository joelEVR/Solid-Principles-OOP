package com.algonquin.cst8288.assignment1.emoloyee;

import com.algonquin.cst8288.assignment1.controller.Rate;

public class PermanentEmployeeImpl implements PermanentEmployeeService {

    private Employee employee;

    public PermanentEmployeeImpl(Employee employee) {
        this.employee = employee;
    }
	
	@Override
	public void pensionContribution(Employee employee) {
        employee.setPension(employee.getSalary() * Rate.PENSION_PERCENTAGE);
	}

	@Override
	public void calculateBonus(Employee employee) {
        employee.setBonus(employee.getSalary() * Rate.BONUS_PERCENTAGE * employee.getNumberOfServiceYear());
	}
	
    @Override
	public void calculateTotalCompensation(Employee employee) {
    	employee.setTotalCompensation(employee.getSalary() + employee.getBonus());
	}
	


	

	
}
