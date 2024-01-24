package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;

public class TextFormatter implements Formatter {
    
    @Override
    public String format(Employee employee) throws IOException {
        if (employee == null) {
            throw new IllegalArgumentException("El objeto Employee no puede ser nulo");
        }

        String formattedEmail = "email=" + formatEmail(employee.getEmail());
        String formattedName = "name=" + employee.getName();

        return formattedName + ", " + formattedEmail;
    }

    private String formatEmail(String email) {
        if (email == null || email.isEmpty()) {
            return "";
        }
        
        int atIndex = email.indexOf('@');
        if (atIndex != -1) {
            String localPart = email.substring(0, atIndex);
            String domainPart = email.substring(atIndex + 1);
            return localPart + "@" + domainPart;
        } else {
            return email; 
        }
    }
}

