package com.algonquin.cst8288.assignment1.emoloyee;

/**
 * Interface defining services specific to permanent employees.
 * Extends the EmployeeService interface to include additional functionalities.
 */
public interface PermanentEmployeeService extends EmployeeService {

    /**
     * Calculates the pension contribution for a permanent employee.
     * @return double representing the pension contribution amount.
     */
    double pensionContribution();

    /**
     * Calculates the bonus for a permanent employee.
     * The implementation of this method should define how the bonus is calculated.
     */
    void calculateBonus();
}
