package com.algonquin.cst8288.assignment1.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.emoloyee.EmployeeProcessor;
import com.algonquin.cst8288.assignment1.emoloyee.EmployeeValidator;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
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

	 
	 public EmployeeController(EmployeeValidator validator, PersistenceService dataSaver,EmployeeProcessor processor ) {
	        this.validator = validator;
	        this.dataSaver = dataSaver;
	    }

	public String ControlEmployee(Employee employee) throws IOException {

		// Process data		
		
		// Validate data
		if (!this.validator.isValidEmployee(employee)) {
			return "FALIED";
		}
		
		// Store data
		this.dataSaver.saveEmployee(employee, "employee_data.txt");
		return "SUCCESS";
	}

}