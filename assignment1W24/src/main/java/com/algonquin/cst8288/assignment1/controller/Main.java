package com.algonquin.cst8288.assignment1.controller;

import java.io.IOException;
import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;

/**
 * 
 * Main class to execute the application
 * 
 */

public class Main {
	
	public static void main(String[] args) throws IOException {
				
		/// Instanciar objetos Employee
		PermanentEmployeeImpl permanentEmployee = new PermanentEmployeeImpl("Joel", "vela0063@algonquinlive.com", "10 Rue Barrete Apt 3", 11700.52, 1);
		permanentEmployee.calculateBonus();
	    permanentEmployee.pensionContribution();
	    permanentEmployee.calculateTotalCompensation();
		
		ContractEmployeeImpl contractEmployee = new ContractEmployeeImpl("Daniel", "danbuitragoto@unal.edu.co", "calle 45c # 19 -54", 23401.04, 6);
		contractEmployee.renewalDate();
		contractEmployee.calculateTotalCompensation();
		
		EmployeeController jsonEmployeeController = new EmployeeController(new JSONFormatter());
		EmployeeController textEmployeeController = new EmployeeController(new TextFormatter());
	
		System.out.println("Permanent Employee JSON Format: ");
        System.out.println(jsonEmployeeController.processEmployee(permanentEmployee));
        System.out.println("Contract Employee JSON Format: ");
        System.out.println(jsonEmployeeController.processEmployee(contractEmployee));

        // Instantiate EmployeeController with TextFormatter
        System.out.println("Permanent Employee Text Format: ");
        System.out.println(textEmployeeController.processEmployee(permanentEmployee));
        System.out.println("Contract Employee Text Format: ");
        System.out.println(textEmployeeController.processEmployee(contractEmployee));


	
		// String proccessEmployee(Employee employee) throws IOException {

		// and ContractEmployeeService.java to calculate and populate required data for objects
		// Utilize EmployeeController.java to save both objects in JSON and Text formats, 
		// saving the data in files named json_employee_data.txt and text_employee_data.txt.
		// Do the same thing to output the data to the console instead of saving it to a file.
		
	        	        
	}	

}
