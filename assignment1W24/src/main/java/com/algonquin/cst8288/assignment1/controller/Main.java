package com.algonquin.cst8288.assignment1.controller;

import java.io.IOException;
import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;

/**
 * 
 * Main class to execute the application
 * 
 */

public class Main {
	
	
	public static void main(String[] args) throws IOException {
				
		/// Instanciar objetos Employee
		PermanentEmployeeImpl permanentEmployee = new PermanentEmployeeImpl("Joel Velasquez", "vela0063@algonquinlive.com", "10 Rue Barrete Apt 3", 11700.52, 1);
		permanentEmployee.calculateBonus();
	    permanentEmployee.pensionContribution();
	    permanentEmployee.calculateTotalCompensation();
		
		ContractEmployeeImpl contractEmployee = new ContractEmployeeImpl("Daniel Buitrago", "danbuitragoto@unal.edu.co", "calle 45c # 19 -54", 23401.04, 6);
		contractEmployee.renewalDate();
		contractEmployee.calculateTotalCompensation();
		
	
		// String proccessEmployee(Employee employee) throws IOException {
			
		 System.out.println(permanentEmployee);
		 System.out.println(contractEmployee);

		
		// and ContractEmployeeService.java to calculate and populate required data for objects
		// Utilize EmployeeController.java to save both objects in JSON and Text formats, 
		// saving the data in files named json_employee_data.txt and text_employee_data.txt.
		// Do the same thing to output the data to the console instead of saving it to a file.
		
	}	

}
