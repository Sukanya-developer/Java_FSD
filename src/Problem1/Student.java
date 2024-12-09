package Problem1;

import java.util.Scanner;

public class Student extends Exception {

	public String rollNo;
	public String Name;
	public int age;
	public String course;
	
	public Student() {}
	public Student(String rollNo,String Name,int age,String d)
	{
		this.rollNo=rollNo;
		this.Name=Name;
		this.age=age;
		this.course=course;
	}

	 public static void validateAge(int age) throws AgeNotWithinRangeException {
	        if (age <15  || age >21) {
	            throw new AgeNotWithinRangeException("AgeNotWithinRangeException");
	        }
	    }

	    public static void main(String[] args) {
	    	Student student=new Student();
	    	Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter your age: ");
	            int age = scanner.nextInt();

	            validateAge(age);
	            System.out.println("Age is valid: " + age);

	        } catch (AgeNotWithinRangeException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	}
	
	/*OUTPUT
	 * 
	 * Enter your age: 14 
	 * Error: AgeNotWithinRangeException
	 * 
	 * Enter your age: 15
     *  Age is valid: 15

	 */

