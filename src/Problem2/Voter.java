package Problem2;

/**
 * 
 */
public class Voter {

	public String voterId;
	public String name;
	public int age;

	public Voter() {
	}

	public Voter(String voterId, String name, int age) {
		this.voterId = voterId;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) throws Exception {
		
		Voter voter = new Voter("S123", "Test", 17);

		if (voter.age < 18) {
			throw new Exception("invalid age for voter");
		} else {
			System.out.println("You are valid to get voter id");
		}
	}

}

/* OUTPUT
 * 
 * Exception in thread "main" java.lang.Exception: invalid age for voter at
 * Voter.main(Voter.java:22)
 */
