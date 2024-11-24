
public class PatternPrintingPgm_6 {
	
	//Pattern Printing problem 
	//Unable to solve it
	 public static void main(String args[])
    {
		 
        int i, j,k;

        // outer loop to handle rows
        for (i = 5; i>0 ; i--) {

            // inner loop to handle columns
            for (j = 5; j>i; j--) {
                System.out.print(j);
            }
            for(k=i;k>0;k--) {
            	System.out.println(k);
            }
            // printing new line for each row
            System.out.println();
        }
    }

  

}
