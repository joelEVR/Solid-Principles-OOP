package com.algonquin.cst8288.assignment1.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
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
	private EmployeeProcessor processor;

	
	 
	 public EmployeeController(EmployeeValidator validator, PersistenceService dataSaver, EmployeeProcessor processor) {
	        this.validator = validator;
	        this.dataSaver = dataSaver;
	        this.processor = processor;
	    }

	public String ControlEmployee() throws IOException {

		// Process data		
		this.processor.processEmployeeData();

		
		// Validate data
		if (!this.validator.isValidEmployee()) {
			return "FALIED";
		}
		
		// Store data
		this.dataSaver.saveEmployee();
		return "SUCCESS";
	}

		
	}