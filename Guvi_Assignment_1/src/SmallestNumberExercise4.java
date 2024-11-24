import java.util.Scanner;

public class SmallestNumberExercise4 {

	public static void main(String[] args) {
		// Finding Smallest Number among 3 numbers
		int val;

		int[] array = new int[3];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}

		int smallest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (smallest > array[i]) {

				smallest = array[i];

			}

		}
		System.out.println("smallest number is " + smallest);
	}

}
