package com.algonquin.cst8288.assignment1.emoloyee;

import com.algonquin.cst8288.assignment1.controller.Rate;

public class PermanentEmployeeImpl extends Employee implements PermanentEmployeeService {
	
	public PermanentEmployeeImpl(String string, String string2, String string3, double d, int i) {
		super(string, string2, string3, d, i);// TODO Auto-generated constructor stub
	}

	@Override
	public void pensionContribution() {
        this.setPension(this.getSalary() * Rate.PENSION_PERCENTAGE);
	}

	@Override
	public void calculateBonus() {
        this.setBonus(this.getSalary() * Rate.BONUS_PERCENTAGE * this.getNumberOfServiceYear());
	}
	
    @Override
	public void calculateTotalCompensation() {
    	this.setTotalCompensation(this.getSalary() + this.getBonus());
	}
	


	

	
}
