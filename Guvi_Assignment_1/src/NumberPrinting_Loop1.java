
public class NumberPrinting_Loop1 {

	public static void main(String[] args) {
		// Pattern 1
		// Printing numbers from 10 to 50 using for loop
		System.out.println("a) Printing numbers from 10 to 50 using for loop");
		for (int i = 10; i <= 50; i++) {
			System.out.println(i);
		}
		System.out.println(" Printing numbers from 10 to 50 using for loop--successfully Completed");

		System.out.println("_____________________________________________________________________");

		// Pattern 2
		// Printing numbers from 10 to 50 using while loop
		int j = 10;
		System.out.println("b) Printing numbers from 10 to 50 using for while loop");
		while (j <= 50) {
			System.out.println(j);
			j++;
		}
		System.out.println(" Printing numbers from 10 to 50 using for while loop--successfully Completed");
	}

}
