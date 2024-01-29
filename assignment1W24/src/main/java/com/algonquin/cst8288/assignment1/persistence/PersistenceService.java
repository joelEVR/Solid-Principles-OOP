package com.algonquin.cst8288.assignment1.persistence;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;


public class PersistenceService {

    private Formatter formatter;

    // Constructor que inyecta la dependencia
    public PersistenceService(Formatter formatter) {
        this.formatter = formatter;
    }

    /**
     * Write data into file in a format specified by the injected formatter
     * 
     * @param employee
     * @param filename
     * @throws IOException
     */
    public void saveEmployee(Employee employee) throws IOException {

        String filename = "";
        if (formatter instanceof TextFormatter) {
            filename = "text_employee_data.txt";
        } else if (formatter instanceof JSONFormatter) {
                filename = "json_employee_data.json";
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
            writer.println(formatter.format(employee));
            writer.flush();
        }
    }
}
