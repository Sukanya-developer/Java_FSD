import java.util.Scanner;

public class Number_Identification_Pgm2 {

	public static void main(String[] args) {
		// Program to write Positive or Negative Number
		Scanner obj=new Scanner(System.in);
		int value=obj.nextInt();
		if(value>0) {
			System.out.println("Positive");
			
		}
		else if(value<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
	}

}
