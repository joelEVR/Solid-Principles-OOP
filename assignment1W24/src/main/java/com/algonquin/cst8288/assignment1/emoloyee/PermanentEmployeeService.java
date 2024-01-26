package com.algonquin.cst8288.assignment1.emoloyee;

public interface PermanentEmployeeService extends EmployeeService {

	void pensionContribution(Employee employee);
	void calculateBonus(Employee employee);
}

