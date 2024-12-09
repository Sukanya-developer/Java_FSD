package Problem4;
import java.util.HashMap;

public class StudentGrade {

	HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
  //HashMap problem
	public void addStudent(String a, Integer b) {

		hashmap.put("A", 90);
		hashmap.put("B", 80);
		hashmap.put("C", 97);
		hashmap.put("D", 55);
		hashmap.put(a, b);
		System.out.println(hashmap);
		System.out.println("The Added Hashmap of " + a + " is :" + b);
	}

	public void removeStudent(String a, Integer b) {
		hashmap.remove(a);
		System.out.println("The removed Hashmap of " + a + " is :" + b);

		System.out.println(hashmap);
	}

	public void displayStudent(String a) {
		hashmap.get(a);
		System.out.println("The Displaying  Student grade of a " + hashmap.get(a));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentGrade grade = new StudentGrade();
		grade.addStudent("E", 66);
		grade.removeStudent("C", 97);
		grade.displayStudent("D");

	}

}
/*
 * {A=90, B=80, C=97, D=55, E=66} The Added Hashmap of E is :66 The removed
 * Hashmap of C is :97 {A=90, B=80, D=55, E=66} The Displaying Student grade of
 * a 55
 */

