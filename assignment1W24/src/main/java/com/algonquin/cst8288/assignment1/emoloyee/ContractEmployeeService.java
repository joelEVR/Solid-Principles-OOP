package com.algonquin.cst8288.assignment1.emoloyee;

/**
 * Interface defining services specific to contract employees.
 * Extends the EmployeeService interface to include additional functionalities.
 */
public interface ContractEmployeeService extends EmployeeService {

    /**
     * Method to calculate and set the renewal date for a contract employee.
     * The implementation of this method should define how the renewal date is determined.
     */
    void renewalDate();
}
