package Problem3;
import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the day of yours");
		Scanner scan=new Scanner(System.in);
		int day=scan.nextInt();
		switch(day)
		{
		case 0:
			System.out.println("Sunday");
		    break;
		    
		case 1:
			System.out.println("Monday");
		    break;
		    
		case 2:
			System.out.println("Tuesday");
		    break;
		    
		case 3:
			System.out.println("Wedhesday");
		    break;
		    
		case 4:
			System.out.println("Thursday");
		    break;
		    
		case 5:
			System.out.println("Friday");
		    break;
		    
		case 6:
			System.out.println("Saturday");
		    break;
		    
		 default:
			 System.out.println("Invalid entry");
		    
		 
		}
	}

}


/* OUTPUT 
 * 
 * Enter the day of yours 4 Thursday
 */
