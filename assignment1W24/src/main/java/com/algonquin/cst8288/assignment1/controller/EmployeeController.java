package com.algonquin.cst8288.assignment1.controller;

import java.io.IOException;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.PersistenceService;

/**
 * EmployeeController is responsible for processing, validating, and saving employee data.
 * It utilizes the EmployeeValidator for data validation and PersistenceService for data storage.
 */
public class EmployeeController {

    private EmployeeValidator validator;
    private PersistenceService dataSaver;
    
    /**
     * Constructor for EmployeeController.
     * Initializes the data saver and validator components.
     * @param formatter The formatter to be used by PersistenceService for data formatting.
     */
    public EmployeeController(Formatter formatter) {
        this.dataSaver = new PersistenceService(formatter);
        this.validator = new EmployeeValidator();
    }

    /**
     * Processes the given Employee object.
     * Validates the employee data and saves it if validation is successful.
     * @param employee The Employee object to be processed.
     * @return String indicating the result of the operation, either "SUCCESS" or "FAILED".
     * @throws IOException If an IO error occurs during data saving.
     */
    public String processEmployee(Employee employee) throws IOException {
        // Validate employee data
        if (!this.validator.isValidEmployee(employee)) {
            return "FAILED";
        }
        
        // Save the validated data
        saveData(employee);
        return "SUCCESS";
    }
    
    /**
     * Saves the given Employee object using the PersistenceService.
     * @param employee The Employee object to be saved.
     * @throws IOException If an IO error occurs during data saving.
     */
    private void saveData(Employee employee) throws IOException {
        this.dataSaver.saveEmployee(employee);
    }
}
