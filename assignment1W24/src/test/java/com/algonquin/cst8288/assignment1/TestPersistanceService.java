package com.algonquin.cst8288.assignment1;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.Test;
import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.PersistenceService;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;

/**
 * Test class for PersistenceService.
 * Verifies the functionality of saving employee data using different formatters.
 */
public class TestPersistanceService {

	/**
     * Test saving an employee object in JSON format.
     * Validates if the file is created and contains data.
     */
	@Test
    public void testSaveEmployeeJsonFormatter() throws Exception {
	    // Arrange: Set up a PermanentEmployeeImpl object and a PersistenceService with JSONFormatter
        PermanentEmployeeImpl permanentEmployee = new PermanentEmployeeImpl("Jeff", "Jeff@hotmail.com", "201 Nepean", 70000, 3);
        PersistenceService service = new PersistenceService(new JSONFormatter());
        String filename = "json_employee_data.json";

        // Act: Save the permanentEmployee object using the service
        service.saveEmployee(permanentEmployee);

        // Assert: Verify that the file exists and contains data
        assertTrue(Files.exists(Paths.get(filename)));
        assertTrue(Files.size(Paths.get(filename)) > 0);

        // Clean up: Delete the file to avoid clutter
        Files.deleteIfExists(Paths.get(filename));
    }
	
	/**
     * Test saving an employee object in text format.
     * Validates if the file is created and contains data.
     */
	@Test
    public void testSaveEmployeeTextFormatter() throws Exception {
        // Arrange
        ContractEmployeeImpl contractEmployee = new ContractEmployeeImpl("Jeff", "Jeff@hotmail.com", "201 Nepean", 70000, 3);
        PersistenceService service = new PersistenceService(new TextFormatter());
        String filename = "text_employee_data.txt";

        // Act: Save the contractEmployee object using the service
        service.saveEmployee(contractEmployee);

        // Assert: Verify that the file exists and contains data
        assertTrue(Files.exists(Paths.get(filename)));
        assertTrue(Files.size(Paths.get(filename)) > 0);

        // Clean up: Delete the file to avoid clutter
        Files.deleteIfExists(Paths.get(filename));
    }
  }
 
