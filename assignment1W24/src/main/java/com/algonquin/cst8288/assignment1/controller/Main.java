package com.algonquin.cst8288.assignment1.controller;

import java.io.IOException;
import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;

/**
 * Main class to execute the application.
 * It demonstrates creating and processing permanent and contract employee objects
 * and outputs their details in both JSON and Text formats.
 */

public class Main {
	
	public static void main(String[] args) throws IOException {
				
        // Creating instances of Permanent and Contract employees
		PermanentEmployeeImpl permanentEmployee = new PermanentEmployeeImpl("Joel", "vela0063@algonquinlive.com", "10 Rue Barrete Apt 3", 11700.52, 1);
		ContractEmployeeImpl contractEmployee = new ContractEmployeeImpl("Daniel", "danbuitragoto@unal.edu.co", "calle 45c # 19 -54", 23401.04, 6);

		permanentEmployee.calculateBonus();
	    permanentEmployee.pensionContribution();
	    permanentEmployee.calculateTotalCompensation();
		
		contractEmployee.renewalDate();
		contractEmployee.calculateTotalCompensation();
		
        // Instantiating EmployeeController for JSON and Text formatting
		EmployeeController jsonEmployeeController = new EmployeeController(new JSONFormatter());
		EmployeeController textEmployeeController = new EmployeeController(new TextFormatter());
	
        // Instantiate EmployeeController with JSONFormatter
		System.out.println("Permanent Employee JSON Format: ");
        System.out.println(jsonEmployeeController.processEmployee(permanentEmployee));
        System.out.println("Contract Employee JSON Format: ");
        System.out.println(jsonEmployeeController.processEmployee(contractEmployee));

        // Instantiate EmployeeController with TextFormatter
        System.out.println("Permanent Employee Text Format: ");
        System.out.println(textEmployeeController.processEmployee(permanentEmployee));
        System.out.println("Contract Employee Text Format: ");
        System.out.println(textEmployeeController.processEmployee(contractEmployee));	
	    
        
        // Outputting formatted employee data to the console
        System.out.println(permanentEmployee.toString());
        System.out.println(contractEmployee.toString());	
        }	

}
