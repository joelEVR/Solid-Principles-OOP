package com.algonquin.cst8288.assignment1;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;

public class TestContractEmployeeImpl {

	ContractEmployeeImpl employee = new ContractEmployeeImpl();

	@Test
	public void testCalculateTotalCompensation() {
        employee.setSalary(20000);
        employee.calculateTotalCompensation();
        double expectedResult = 20000;
		assertEquals(expectedResult, employee.getTotalCompensation(), 0.00001);
	}
	
	@Test
	public void testRenewalDate() {
	    // Arrange
	    Calendar expectedCalendar = Calendar.getInstance();
	    expectedCalendar.add(Calendar.YEAR, 1);

	    employee.renewalDate();

	    // Act
	    Date result = employee.getRenewalDate();
	    Calendar actualCalendar = Calendar.getInstance();
	    actualCalendar.setTime(result);

	    // Assert
	    assertEquals(expectedCalendar.get(Calendar.YEAR), actualCalendar.get(Calendar.YEAR));
	    assertEquals(expectedCalendar.get(Calendar.MONTH), actualCalendar.get(Calendar.MONTH));
	    assertEquals(expectedCalendar.get(Calendar.DAY_OF_MONTH), actualCalendar.get(Calendar.DAY_OF_MONTH));
	}

}
