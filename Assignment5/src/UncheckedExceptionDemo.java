/**
 *
 */


/**
 * @author SrideviUppala
 *
 */
public class UncheckedExceptionDemo {

	public static void main(String[] args) {
//		int a = 10/0; // causes / by zero ArithmeticExpection which is an unchecked/runtime exception
		try {
						int i = 10/0; // causes divide


			int j = 100 *10;
			System.out.println(j);
		} catch (ArithmeticException ae) {

			System.out.println("I am in the catch block!!");
			System.out.println(ae.getMessage());
		}
	}
}
