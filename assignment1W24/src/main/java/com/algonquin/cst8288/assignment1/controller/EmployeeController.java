package com.algonquin.cst8288.assignment1.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.emoloyee.EmployeeDataSaver;
import com.algonquin.cst8288.assignment1.emoloyee.EmployeeProcessor;
import com.algonquin.cst8288.assignment1.emoloyee.EmployeeValidator;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;

/**
 * 
 * Process, validate and save employee data.
 * 
 * 
 */

public class EmployeeController {

	private EmployeeValidator validator;
	private EmployeeDataSaver dataSaver;
	private EmployeeProcessor processor;

	 
	 public EmployeeController(EmployeeValidator validator, EmployeeDataSaver dataSaver,EmployeeProcessor processor ) {
	        this.validator = validator;
	        this.dataSaver = dataSaver;
	        this.processor = processor; 
	    }

	public String supermegahipercontrollerEmployee(Employee employee) throws IOException {

		// Process data
		this.processor.processEmployeeData(employee);
		
		
		// Validate data
		if (!this.validator.isValidEmployee(employee)) {
			return "FALIED";
		}
		
		// Store data
		this.dataSaver.saveEmployee(employee, "employee_data.txt");
		return "SUCCESS";
	}

}