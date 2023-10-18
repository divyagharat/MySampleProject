package com.edubridge.app1.model;

public class Employee {
private int  employyeId;
private String employeeName;
private double employeeSalary;



public Employee(int employyeId, String employeeName, double employeeSalary) {
	super();
	this.employyeId = employyeId;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
}
@Override
public String toString() {
	return "Employee [employyeId=" + employyeId + ", employeeName=" + employeeName + ", employeeSalary="
			+ employeeSalary + "]";
}
}