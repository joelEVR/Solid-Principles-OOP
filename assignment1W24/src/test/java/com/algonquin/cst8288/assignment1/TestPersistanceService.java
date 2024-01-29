package com.algonquin.cst8288.assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.algonquin.cst8288.assignment1.controller.EmployeeController;
import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;

public class TestPersistanceService {

	@Test
	public void testSaveEmployeeJsonFormatter() throws Exception {
	    // Arrange
	    PermanentEmployeeImpl permanentEmployee = new PermanentEmployeeImpl("Jeff", "Jeff@hotmail.com", "201 Nepean", 70000, 3);
	    EmployeeController employeeService = new EmployeeController(new JSONFormatter());
	    String filename = "json_employee.txt";

	    // Act
	    employeeService.processEmployee(permanentEmployee);

	    // Assert
	    File file = new File(filename);
	    assertTrue(file.exists());

	    // Opcional: Verificar que el archivo no está vacío
	    assertTrue(file.length() > 0);

	    // Limpieza
	    Files.deleteIfExists(file.toPath());
	}

	@Test
	public void testSaveEmployeeTextFormatter() throws Exception {
	    // Arrange
	    ContractEmployeeImpl contractEmployee = new ContractEmployeeImpl("Jeff", "Jeff@hotmail.com", "201 Nepean", 70000, 3);
	    EmployeeController employeeService = new EmployeeController(new TextFormatter());
	    String filename = "text_employee.txt";

	    // Act
	    employeeService.processEmployee(contractEmployee);

	    // Assert
	    File file = new File(filename);
	    assertTrue(file.exists());

	    // Opcional: Verificar que el archivo no está vacío
	    assertTrue(file.length() > 0);

	    // Limpieza
	    Files.deleteIfExists(file.toPath());
	}


}
