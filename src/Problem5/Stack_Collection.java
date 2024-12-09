package Problem5;
import java.util.Stack;

public class Stack_Collection {
	// Collection classes to store Integers.Add and Remove elements in Stack
	Stack<Integer> s = new Stack<>();

	public void addStack() {
		// Add elements in Stack
		s.push(1);
		s.push(10);
		s.push(100);
		s.push(1000);
		s.push(100);
		s.push(10000);
		System.out.println(s);
		System.out.println("Added Elements are: " + s);

	}

	public void removeStack() {
		// Remove elements in Stack
		System.out.println("Remove Elements  ");
		s.pop();
		System.out.println("After Removal data is :" + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_Collection stack = new Stack_Collection();
		stack.addStack();
		stack.removeStack();
	}

}

/*
 * OUTPUT
 * 
 * [1, 10, 100, 1000, 100, 10000] Added Elements are: [1, 10, 100, 1000, 100,
 * 10000] Remove Elements After Removal data is :[1, 10, 100, 1000, 100]
 */