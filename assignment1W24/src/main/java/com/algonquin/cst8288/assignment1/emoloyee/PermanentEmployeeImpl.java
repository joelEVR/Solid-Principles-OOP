package com.algonquin.cst8288.assignment1.emoloyee;

import com.algonquin.cst8288.assignment1.controller.Rate;

/**
 * Implementation of a permanent employee.
 * Extends the Employee class and implements PermanentEmployeeService interface.
 * This class is specific to permanent employees and includes methods for their unique calculations.
 */
public class PermanentEmployeeImpl extends Employee implements PermanentEmployeeService {
    
    // Default constructor
    public PermanentEmployeeImpl() {
        // Auto-generated constructor stub
    }
    
    // Parameterized constructor for initializing a PermanentEmployeeImpl with specific attributes
    public PermanentEmployeeImpl(String name, String email, String address, double salary, int serviceYear) {
        super(name, email, address, salary, serviceYear);
    }

    // Calculate the pension contribution based on salary and pension rate
    @Override
    public double pensionContribution() {
        return this.getSalary() * Rate.PENSION_PERCENTAGE;
    }

    // Calculate the bonus based on salary, bonus rate, and number of service years
    @Override
    public void calculateBonus() {
        this.setBonus(this.getSalary() * Rate.BONUS_PERCENTAGE * this.getNumberOfServiceYear());
    }
    
    // Calculate total compensation including salary and bonus
    @Override
    public void calculateTotalCompensation() {
        this.setTotalCompensation(this.getSalary() + this.getBonus());
    }
}
