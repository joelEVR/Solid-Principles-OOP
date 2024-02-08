package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Calendar;

/**
 * Implementation of a contract employee.
 * Extends the base Employee class and implements ContractEmployeeService interface.
 */
public class ContractEmployeeImpl extends Employee implements ContractEmployeeService {    

	 // Default constructor
    public ContractEmployeeImpl() {
        // Auto-generated constructor stub
    }
    
    // Parameterized constructor to initialize a contract employee with specific attributes
    public ContractEmployeeImpl(String name, String email, String address, double salary, int serviceYear) {
        super(name, email, address, salary, serviceYear);
    }

    // Calculate total compensation specific to contract employee
    @Override
    public void calculateTotalCompensation( ) {
        this.setTotalCompensation(this.getSalary());
    }

    // Determine the renewal date for the contract employee (one year from the current date)
    @Override
    public void renewalDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        this.setRenewalDate(calendar.getTime());
    }
    
}
