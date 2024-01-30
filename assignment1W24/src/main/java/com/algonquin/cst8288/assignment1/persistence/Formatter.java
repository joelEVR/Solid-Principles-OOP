package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;

/**
 * Formatter interface for formatting Employee data.
 * This interface declares a method for formatting an Employee object into a specific format.
 */
public interface Formatter {
    
    /**
     * Formats an Employee object into a specific string representation.
     * The implementation of this method should specify the format (e.g., JSON, text).
     * @param employee The Employee object to format.
     * @return A String representation of the formatted Employee data.
     * @throws IOException If an I/O error occurs during formatting.
     */
    public String format(Employee employee) throws IOException;
}
