import java.util.Scanner;

public class PurchaseAmountCalculation_5 {

	public static void main(String[] args) {

		// Purchase amount calculation with discount program
		int discount, final_price;
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();

		if (amount > 0 && amount < 500) {
			discount = 0;
			final_price = amount - discount;
			System.out.println("final_price of the customer is " + final_price);
		} else if (amount >= 500 && amount <= 1000) {
			discount = (amount * 10 / 100);
			final_price = amount - discount;
			System.out.println("final_price of the customer is " + final_price);
		} else if (amount > 1000) {
			discount = (amount * 20 / 100);
			final_price = amount - discount;
			System.out.println("final_price of the customer is " + final_price);
		} else {
			System.out.println("Please enter valuable number");
		}

	}
}
