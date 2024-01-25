package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Calendar;
import java.util.Date;

public class ContractEmployeeImpl implements ContractEmployeeService {

	private Employee employee;
	
	public ContractEmployeeImpl(Employee employee) {
		this.employee = employee;
	}
	
	@Override
	public double calculateTotalCompensation(Employee employee) {
        return employee.getSalary();
	}

	@Override
	public Date renewalDate() {
		Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        return calendar.getTime();	}
	
}
