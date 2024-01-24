package com.algonquin.cst8288.assignment1.emoloyee;

public interface PermanentEmployeeService extends EmployeeService {

	double pensionContribution(Employee employee);
	double calculateBonus(Employee employee);
}

