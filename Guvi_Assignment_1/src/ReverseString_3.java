import java.util.Scanner;

public class ReverseString_3 {

	public static void main(String[] args) {
		// Reverse the string using user input
		/*
		 * Scanner scan=new Scanner(System.in); int input=scan.nextInt();
		 */

		// Reverse the string using given number
		int input = 876;
		int reverse = 0, temp;
		while (input > 0) {
			temp = input % 10;
			reverse = reverse * 10 + temp;
			input = input / 10;
		}
		System.out.println("Reversed String : " + reverse);
	}
}
