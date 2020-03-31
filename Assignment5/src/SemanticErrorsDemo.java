/**
 *
 */


/**
 * @author Sridevi Uppala
 *
 */
public class SemanticErrorsDemo {
	public static void understandErrors() {

		//int s = "sri";
		float f;
		int i =10;
		f =i; // assigning int to a float (automatic type conversion happens)

		//i=f; // assigning float to int - semantic error flagged by compiler.


		Integer a = new Integer(10);
		Integer b = new Integer(10);
		if (a == b) { // semantic error not flagged by compiler "== comparator works only for primitive types"
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

		int m = 10;
		int n = 10;
		if (m == n) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

	}

	public static void main(String[] args) {
		understandErrors();
	}

}
