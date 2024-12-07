package com.test.ex2;

import java.util.Scanner;

public class DriverMain {
    //Main function to invoke the Product and employee class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee emp=new Employee();
		Product product=new Product();
		while(true) {
		System.out.println("1.employee information");
		
		System.out.println("2.Product information");
		
		Scanner scan=new Scanner(System.in);
		int ip=scan.nextInt();
		
		switch(ip) {
		
		case 1:
			System.out.println("Please enter employee information");
			System.out.println("enter your employee ID");
			Scanner scan1=new Scanner(System.in);
			String empid=scan1.nextLine();	 
			System.out.println("enter your Name");
	     	String name=scan1.nextLine();	
			System.out.println("enter your salary");
		    int salary=scan1.nextInt();
			System.out.println("Dear "+name + "Your E ID is "+empid+"Salary is"+salary);
			 emp.Taxcalc(salary);
			break;
			
		case 2:
			System.out.println("Please enter Product information");
			System.out.println("Enter your annual production turnover");
			Scanner scan2=new Scanner(System.in);
			int ip2=scan2.nextInt();
			product.Taxcalc(ip2);
			break;
			
		}
		
		
	}
	}
}
/*OUTPUT
 * 

1.employee information
2.Product information
1
Please enter employee information
enter your employee ID
hh
enter your Name
sdcdsc
enter your salary
500000
Dear sdcdscYour E ID is hhSalary is500000
Total income tax of the employee is 52500.0
1.employee information
2.Product information
2
Please enter Product information
Enter your annual production turnover
40000
Total income tax of the Product  is 19600.0
1.employee information
2.Product information

 * 
 */