
package Problem3;
import java.util.HashMap;
import java.util.Scanner;
public class Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
              // Create a HashMap
              HashMap<Integer,String> map = new HashMap<>();
 
              // Add key-value pairs
              map.put(0,"Sunday");
              map.put(1,"Monday");
              map.put(2,"Tuesday");
              map.put(3,"Wedhesday");
              map.put(4,"Thursday");
              map.put(5,"Friday");
              map.put(6,"Saturday");
              System.out.println("Enter the day");
              // Retrieve a value using the key
              Scanner scan=new Scanner(System.in);
              int index=scan.nextInt();
             
              if(index>6) {
            	  System.out.println("Index out of Bound Exception");
              }
              else {
            	 
                  String days = map.get(index); 
                  System.out.println(days); // Output: 2
              }
              // Iterate through the map
             
             
          }
}
/* OUTPUT
 * 
 * Enter the day
 *  8
 *  
 * Index out of Bound Exception
 * 
 * Enter the day
 * 2
 * Tuesday

 */
	
		
		
