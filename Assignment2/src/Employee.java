
public class Employee extends Person1 {
	
	public String EmpId;
	public double salary;
	 
	public Employee() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Person1 P=new Person1("Test",18);
		Employee emp=new Employee("Test",18,"1234",23400.00);
				System.out.println(emp.name);
				System.out.println(emp.age);
				System.out.println(emp.EmpId);
				System.out.println(emp.salary);
				
		
	}

	public Employee(String name,int age,String EmpId,double salary ) {
		super(name, age);
		this.EmpId=EmpId;
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}

}
