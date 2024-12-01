
public class Person {

	public static String Name = "TestPerson1";
	public static int age = 18;

	public void Display(String _name, int _age) {
		Person P = new Person();
		System.out.println("Person Name :" + _name);
		System.out.println("Person Age :" + _age);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person P = new Person();
		P.Display(Name, age);
	}

}
