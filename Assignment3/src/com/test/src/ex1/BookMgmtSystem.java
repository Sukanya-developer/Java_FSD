package com.test.src.ex1;

import java.util.Scanner;

public class BookMgmtSystem {
	/**
	 *  Main method to get to the user input and process Add,Search,Remove and Display books
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library lib = new Library();

			while (true) {
			System.out.println("Enter your Option");
			System.out.println("1.Add new Book");
			System.out.println("2.Remove Book");
			System.out.println("3.Search Book");
			System.out.println("4.Display Book");
			Scanner scan2 = new Scanner(System.in);
			int ip = scan2.nextInt();
			Scanner scan = new Scanner(System.in);
			switch (ip) {

			case 1:

				System.out.println("Enter new Book ID");
				String id = scan.nextLine();
				System.out.println("Enter new Book name");
				String title = scan.nextLine();
				System.out.println("Enter new Book author");
				String author = scan.nextLine();
				System.out.println("Enter new Book availability");
				Boolean isAvailable = scan.nextBoolean();
				lib.addBook(new Book(id, title, author, isAvailable));

				lib.displayBooks();
				break;
			case 2:
				System.out.println("Enter Book id to remove");

				String ip2 = scan.nextLine();
				lib.removeBook(ip2);
				break;
			case 3:
				System.out.println("Enter Book id to Search");

				String ip3 = scan.nextLine();
				lib.SearchBook(ip3);
				break;
			case 4:
				lib.displayBooks();
				break;

			case 5:
				break;
			}
		}

		// scan.close();
	}

}

/*  OUTPUT
 * Enter your Option
1.Add new Book
2.Remove Book
3.Search Book
4.Display Book

1
Enter new Book ID
3e
Enter new Book name
ghgj
Enter new Book author
sdfsdfds
Enter new Book availability
false
Title: ghgj
Author: sdfsdfds
ISBN: 3e
Availability: false

Enter your Option
1.Add new Book
2.Remove Book
3.Search Book
4.Display Book
1
Enter new Book ID
67
Enter new Book name
ddd
Enter new Book author
ffff
Enter new Book availability
true
Title: ghgj
Author: sdfsdfds
ISBN: 3e
Availability: false

Title: ddd
Author: ffff
ISBN: 67
Availability: true

Enter your Option
1.Add new Book
2.Remove Book
3.Search Book
4.Display Book
4
Title: ghgj
Author: sdfsdfds
ISBN: 3e
Availability: false

Title: ddd
Author: ffff
ISBN: 67
Availability: true

Enter your Option
1.Add new Book
2.Remove Book
3.Search Book
4.Display Book

 */