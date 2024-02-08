package com.algonquin.cst8288.assignment1;

import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.Date;
import org.junit.Test;
import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;

/**
 * Test class for ContractEmployeeImpl.
 * This class contains unit tests to verify the functionality of ContractEmployeeImpl methods.
 */
public class TestContractEmployeeImpl {

	ContractEmployeeImpl employee = new ContractEmployeeImpl();

    /**
     * Test for calculateTotalCompensation method.
     * Verifies if the total compensation is calculated correctly for a contract employee.
     */
    @Test
    public void testCalculateTotalCompensation() {
        employee.setSalary(20000);
        employee.calculateTotalCompensation();
        double expectedResult = 20000;
        assertEquals(expectedResult, employee.getTotalCompensation(), 0.00001);
    }
    
    /**
     * Test for renewalDate method.
     * Verifies if the renewal date is set correctly to one year from the current date.
     */
    @Test
    public void testRenewalDate() {
        // Setup expected result
        Calendar expectedCalendar = Calendar.getInstance();
        expectedCalendar.add(Calendar.YEAR, 1);

        employee.renewalDate();

        // Get the actual result
        Date result = employee.getRenewalDate();
        Calendar actualCalendar = Calendar.getInstance();
        actualCalendar.setTime(result);

        // Assert that the actual result matches the expected result
        assertEquals(expectedCalendar.get(Calendar.YEAR), actualCalendar.get(Calendar.YEAR));
        assertEquals(expectedCalendar.get(Calendar.MONTH), actualCalendar.get(Calendar.MONTH));
        assertEquals(expectedCalendar.get(Calendar.DAY_OF_MONTH), actualCalendar.get(Calendar.DAY_OF_MONTH));
    }
}
