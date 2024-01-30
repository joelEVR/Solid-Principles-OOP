package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

/**
 * Represents a general Employee in the system.
 * This class serves as the base for different types of employees.
 */
public class Employee {

    // Employee attributes
	private String name;
	private String email;
	private String address;
	private double salary;
	private int numberOfServiceYear;
	private double bonus;
	private double totalCompensation;
	private Date renewalDate;

	// Default constructor
	public Employee() {
	}
	
    // Parameterized constructor for Employee initialization
	public Employee(String name, String email, String address, double salary, int numberOfServiceYear) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.salary = salary;
		this.numberOfServiceYear = numberOfServiceYear;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNumberOfServiceYear() {
		return numberOfServiceYear;
	}

	public void setNumberOfServiceYear(int numberOfServiceYear) {
		this.numberOfServiceYear = numberOfServiceYear;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getTotalCompensation() {
		return this.totalCompensation;
	}

	public void setTotalCompensation(double totalCompensation) {
		this.totalCompensation = totalCompensation;
	}

	public Date getRenewalDate() {
		return renewalDate;
	}

	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}

    // Override toString for a readable representation of Employee
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", address=" + address + ", salary=" + salary
				+ ", numberOfServiceYear=" + numberOfServiceYear + ", bonus=" + bonus + ", totalCompensation="
				+ totalCompensation + ", renewalDate=" + renewalDate + "]";
	}

}