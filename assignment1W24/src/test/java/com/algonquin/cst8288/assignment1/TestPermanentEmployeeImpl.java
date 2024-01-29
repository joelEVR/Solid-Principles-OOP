package com.algonquin.cst8288.assignment1;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;

import org.junit.Test;

public class TestPermanentEmployeeImpl {

	PermanentEmployeeImpl employee = new PermanentEmployeeImpl();

	@Test
	public void TestPensionContribution() {
		employee.setSalary(10000);
		employee.pensionContribution();
		double expectedResult = 100;
		assertEquals(expectedResult, employee.pensionContribution(), 0.00001);
	}
	  
	@Test
	public void testCalculateBonus() {
        employee.setSalary(15000);
        employee.setNumberOfServiceYear(2);
        employee.calculateBonus();
        double expectedResult = 750;
		assertEquals(expectedResult, employee.getBonus(), 0.00001);
	}
	
	@Test
	public void testCalculateTotalCompensation() {
        employee.setSalary(20000);
        employee.setBonus(500);
        employee.calculateTotalCompensation();
        double expectedResult = 20500;
		assertEquals(expectedResult, employee.getTotalCompensation(), 0.00001);
	}
}
