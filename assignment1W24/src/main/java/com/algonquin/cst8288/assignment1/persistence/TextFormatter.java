package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;

/**
 * Implementation of Formatter for text formatting.
 * Converts Employee objects into a simple key-value pair string format.
 */
public class TextFormatter implements Formatter {
    
	/**
     * Formats an Employee object into a text-based key-value representation.
     * @param employee The Employee object to format.
     * @return A String containing the Employee's attributes in key-value format.
     * @throws IOException If an error occurs during formatting.
     */
    @Override
    public String format(Employee employee) throws IOException {
        if (employee == null) {
            throw new IllegalArgumentException("El objeto Employee no puede ser nulo");
        }

        Map<String, String> keyValueMap = new HashMap<>();
        // Populate the map with employee attributes
        keyValueMap.put("name", employee.getName());
        keyValueMap.put("email", employee.getEmail());
        keyValueMap.put("address", employee.getAddress());
        keyValueMap.put("salary", String.valueOf(employee.getSalary()));
        keyValueMap.put("numberOfServiceYear", String.valueOf(employee.getNumberOfServiceYear()));
        keyValueMap.put("bonus", String.valueOf(employee.getBonus()));
        keyValueMap.put("total compensation", String.valueOf(employee.getTotalCompensation()));
        keyValueMap.put("renewal date", String.valueOf(employee.getRenewalDate()));

        // Build the output string
        StringBuilder formattedText = new StringBuilder();
        for (Map.Entry<String, String> entry : keyValueMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            formattedText.append(key).append("=").append(value).append(", ");
        }
        
        // Remove the trailing comma and space
        if (formattedText.length() > 2) {
            formattedText.setLength(formattedText.length() - 2);
        }

        return formattedText.toString();
    }

}



