import java.util.Scanner;

public class Account {

	public double Balance;
	public String AccountNo;

	public Account() {
	}

	public Account(String AccountNo, double Balance) {
		this.AccountNo = AccountNo;
		this.Balance = Balance;
		DisplayBalance(Balance);
	}

	public double DepositAmount() {

		System.out.println("Enter the amount ot be deposited");
		Scanner scan = new Scanner(System.in);
		int Deposit = scan.nextInt();
		if (Deposit > 0) {
			Balance = Balance + Deposit;
		}

		System.out.println("Your amount of " + Deposit + "is deposited successfully.");
		DisplayBalance(Balance);
		return Balance;
	}

	public double WithDrawAmount() {
		System.out.println("Please Enter the withdrawal amount");
		Scanner scan = new Scanner(System.in);
		int WithDrawAmt = scan.nextInt();
		if (Balance >= WithDrawAmt) {
			Balance = Balance - WithDrawAmt;
			System.out.println("Your Withdarwal  amount of " + WithDrawAmt + " is successful");

			DisplayBalance(Balance);
		} else {
			System.out.println("Your account has insufficient Funds");
		}
		return Balance;

	}

	public double DisplayBalance(double Balance) {

		System.out.println("Your account Balance is " + Balance);
		return Balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account("ID1234345", 45000);
		// a.DisplayBalance();
		a.WithDrawAmount();
		a.DepositAmount();

	}

}
