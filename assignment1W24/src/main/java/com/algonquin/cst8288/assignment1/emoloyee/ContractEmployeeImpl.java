package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Calendar;
import java.util.Date;

public class ContractEmployeeImpl implements ContractEmployeeService {
	

	private Employee employee;
	
		
	
	@Override
	public void calculateTotalCompensation(Employee employee) {
        employee.setTotalCompensation(employee.getSalary());
	}

	@Override
	public void renewalDate(Employee employee) {
		Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        employee.setRenewalDate(calendar.getTime());
	}
	
}
