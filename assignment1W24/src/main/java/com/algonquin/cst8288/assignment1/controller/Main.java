package com.algonquin.cst8288.assignment1.controller;


import java.io.IOException;

import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.emoloyee.EmployeeProcessor;
import com.algonquin.cst8288.assignment1.emoloyee.EmployeeValidator;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.PersistenceService;

/**
 * 
 * Main class to execute the application
 * 
 */

public class Main {
	
	
	public static void main(String[] args) throws IOException {
				
		// Instantiate two Employee objects and use PermanentEmployeeService.java 
		Employee employee1 = new Employee("Joel Velasquez", "vela0063@algonquinlive.com", "10 Rue Barrete Apt 3", 11700.52, 0);
		Employee employee2 = new Employee("Daniel Buitrago", "danbuitragoto@unal.edu.co", "calle 45c # 19 -54", 23401.04, 6);

		
		ContractEmployeeImpl contractemploy = new ContractEmployeeImpl();
		PermanentEmployeeImpl permanentcontract = new PermanentEmployeeImpl();// corregir clase contratopermanente
		
		//todo
		// crear objeto validador
		// crear objeto data saver
		// crear objeto procesador
		
		
		
		EmployeeController controlador = new EmployeeController(validator,  dataSaver,  processor);
		
		controlador.ControlEmployee(employee1, contractemploy); // que emepleado y que contrato
		
		
		

		 


		// String proccessEmployee(Employee employee) throws IOException {
			
		 System.out.println(employee1);
		 System.out.println(employee2);

		
		// and ContractEmployeeService.java to calculate and populate required data for objects
		// Utilize EmployeeController.java to save both objects in JSON and Text formats, 
		// saving the data in files named json_employee_data.txt and text_employee_data.txt.
		// Do the same thing to output the data to the console instead of saving it to a file.
		
	}	

}
