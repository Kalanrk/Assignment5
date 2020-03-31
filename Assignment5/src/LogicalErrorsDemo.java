/**
 *
 */


/**
 * @author Sridevi Uppala
 *
 */
public class LogicalErrorsDemo {


	//The code compiles and runs without any errors  � but doesn't give the output that you expected.
	//Hardest to find.
	//compiler cannot help you find logical errors.

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// misplaced parenthesis
		int var1 = 4 + 3 * 2 / 1;
	    int var2 = (4 + 3) * 2 / 1;

	    System.out.println("var1 :"+var1);
	    System.out.println("var2 :"+var2);

	    // missing parenthesis
	    int a = 10;
	    int b = 20;

	    System.out.println("The sum is "+ a+b);
	    System.out.println("The sum is "+ (a+b));


	}

	//Other logical errors are
	// Defining wrong count (starting from 1 and not 0)
}
