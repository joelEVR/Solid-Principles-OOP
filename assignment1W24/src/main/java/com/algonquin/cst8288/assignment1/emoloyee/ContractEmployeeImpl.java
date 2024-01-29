package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Calendar;

public class ContractEmployeeImpl extends Employee implements ContractEmployeeService {	

	public ContractEmployeeImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public ContractEmployeeImpl(String string, String string2, String string3, double d, int i) {
		super(string, string2, string3, d, i);
	}

	@Override
	public void calculateTotalCompensation( ) {
        this.setTotalCompensation(this.getSalary());
	}

	@Override
	public void renewalDate() {
		Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        this.setRenewalDate(calendar.getTime());
	}
	
}
