package com.algonquin.cst8288.assignment1.controller;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.PersistenceService;

/**
 * 
 * Process, validate and save employee data.
 * 
 * 
 */
public class EmployeeController {

	private EmployeeValidator validator;
	private PersistenceService dataSaver;
	
	 public EmployeeController(Formatter formatter) {
	        this.dataSaver = new PersistenceService(formatter);
	        this.validator = new EmployeeValidator();
	    }

	public String processEmployee(Employee employee) throws IOException {

		// Process data		
		// Validate data
		if (!this.validator.isValidEmployee(employee)) {
			return "FAILED";
		}
		
		saveData(employee);
		return "SUCCESS";
	}
	
	public void saveData(Employee employee) throws IOException {
		// Store data
		this.dataSaver.saveEmployee(employee);
		}
	}