package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Implementation of Formatter for JSON formatting.
 * This class provides functionality to convert Employee objects into a JSON string format.
 */
public class JSONFormatter implements Formatter {

    /**
     * Formats an Employee object into a JSON string.
     * Utilizes Jackson's ObjectMapper for JSON processing.
     * @param person The Employee object to format.
     * @return A JSON string representation of the Employee.
     * @throws IOException If a processing error occurs during JSON formatting.
     */
    @Override
    public String format(Employee person) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        try {
            return mapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            throw new IOException(e);
        }
    }
}
