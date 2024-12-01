package problem_Q2;

import java.util.Scanner;

public class XYZ {
	
	public static int val;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr=new int[5];
		Scanner obj=new Scanner(System.in);
		System.out.print("Please enter the following details");
		for(int i=0;i<arr.length;i++) {
			System.out.print("Please enter the Product Product ID of "+i+1);
			System.out.print("Please enter the Product Price of "+i+1);
			System.out.print("Please enter the Product Quantity of "+i+1);
		  arr[i]=obj.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
		
			System.out.print(arr[i]+" ");
	}
	}

}
