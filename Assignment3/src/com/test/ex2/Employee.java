package com.test.ex2;

import java.util.Scanner;

public class Employee implements Taxable{
//	Employee class to return the tax calculation
	public String empId;
	public String name;
	public double salary;
	static Employee emp;
	@Override
	public double Taxcalc(int salary) {
		// TODO Auto-generated method stub
		this.salary=salary;
	 double tax=((salary*incomeTax)/100);
	 
	 System.out.println("Total income tax of the employee is "+tax);
	return tax;
	}
	
	

}
