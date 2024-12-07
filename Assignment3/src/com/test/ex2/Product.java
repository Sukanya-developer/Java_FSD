package com.test.ex2;

public class Product implements Taxable{

//	Product class to return the tax calculation
	 public String pId;
	 public float price;
	 public int quantity;
	 public float tax;
	@Override
	public double Taxcalc(int price) {
		// TODO Auto-generated method stub
		tax=(float) ((price*salesTax)*0.07);
		 System.out.println("Total income tax of the Product  is "+tax);
		return tax;
		
		
		
	}
	 
}
