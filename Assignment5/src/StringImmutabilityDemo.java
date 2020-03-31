/**
 * 
 */


/**
 * Demonstrates the String constant pool theory and how String is immutable.
 * @author srideviuppala
 *
 */
public class StringImmutabilityDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//String literal/constant
		String str1 = "Sridevi";
		
		str1.substring(0, 3);
		System.out.println("substring : "+str1); // ?? Sridevi - since string is immutable it is not going to modify the original string Sridevi
		
		System.out.println("**************************************");
		
		String subStringStr1 = str1.substring(0, 3);
		System.out.println("str1 : " + str1 + " subStringStr1 : " + subStringStr1);
		System.out.println("new substring : "+subStringStr1);
		
		System.out.println("**************************************");
		
		
		str1.replace('i', 'a');
		System.out.println("after replace : "+str1);
		//The state of str1 cannot be changed. So after substring/replace/or any other operation str1 will still be "Sridevi"
		//This behavior is called immutablity.
		
		System.out.println("**************************************");
		
		String strAfterReplace = str1.replace('i', 'a');
		System.out.println("new str1 after replace : "+strAfterReplace);
		
		
		System.out.println("**************************************");
		//String literal/constant
		String str2 = "Sridevi";
		
		// Following piece of code demostrates that the str1 and str 2 are pointing to the same literal String in the String Constant Pool.
		
		System.out.println("Are str1 and str2 equal ? "+(str1 == str2));
		System.out.println("Are str1 and str2 equal ? "+(str1.equals(str2)));
		
		System.out.println("**************************************");
		
		//String object 
		String str3 = new String("Sridevi");
		
		//String object 
		String str4 = new String("Sridevi");
		
		System.out.println("Are str3 and str4 equal (comparing references) ? "+(str3 == str4));
		System.out.println("Are str3 and str4 equal (comparing values) ? "+(str3.equals(str4)));
		
		System.out.println("**************************************");
		
		
		String str = "Uppala"; // string constant
		String str5 = new String("Uppala"); // string object
		
		System.out.println("Are str and str5 equal (comparing references) ? "+(str == str5)); // no
		System.out.println("Are str and str5 equal (comparing values) ? "+(str.equals(str5))); // yes
		
		System.out.println("**************************************");
		
	}

}
