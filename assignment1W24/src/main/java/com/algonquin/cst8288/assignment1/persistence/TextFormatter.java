package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;

public class TextFormatter implements Formatter {
    
    @Override
    public String format(Employee employee) throws IOException {
        if (employee == null) {
            throw new IllegalArgumentException("El objeto Employee no puede ser nulo");
        }

        Map<String, String> keyValueMap = new HashMap<>();
        
        // Agregar pares clave-valor al mapa
        keyValueMap.put("name", employee.getName());
        keyValueMap.put("email", employee.getEmail());
        keyValueMap.put("address", employee.getAddress());
        keyValueMap.put("salary", String.valueOf(employee.getSalary()));
        keyValueMap.put("numberOfServiceYear", String.valueOf(employee.getNumberOfServiceYear()));
        keyValueMap.put("bonus", String.valueOf(employee.getBonus()));
        keyValueMap.put("total compensation", String.valueOf(employee.getTotalCompensation()));
        keyValueMap.put("renewal date", String.valueOf(employee.getRenewalDate()));

        // Construir la cadena de salida
        StringBuilder formattedText = new StringBuilder();
        for (Map.Entry<String, String> entry : keyValueMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            formattedText.append(key).append("=").append(value).append(", ");
        }
        
        // Eliminar la coma y el espacio en blanco adicionales al final
        if (formattedText.length() > 2) {
            formattedText.setLength(formattedText.length() - 2);
        }

        return formattedText.toString();
    }

}



