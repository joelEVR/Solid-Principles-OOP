package com.algonquin.cst8288.assignment1.emoloyee;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;


public class EmployeeDataSaver {

	
	
	/**
	 * Write data into file but it violates DIP
	 * 
	 * @param employee
	 * @throws IOException
	 * 
	 * 
	 */
	public void saveEmployee(Employee person, String filename) throws IOException {
		Formatter formatter = new JSONFormatter();
		try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
			writer.println(formatter.format(person));
			writer.flush();
		}
	}
	
}
