/**
 * 
 */


/**
 * @author srideviuppala
 *
 */
public class StringSBufferSBuilderDemo {
	
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		StringBuffer buffer = new StringBuffer("Sridevi");
		
		for (int i = 0; i < 100000; i++) {
			buffer.append("Uppala");
			
		}
		
		System.out.println("Time taken by StringBuffer :"+(System.currentTimeMillis() - startTime)+"milliseconds");
		
		startTime = System.currentTimeMillis();
		
		StringBuilder builder = new StringBuilder("Sridevi");
		
		for (int i = 0; i < 100000; i++) {
			builder.append("Uppala");
			
		}
		
		System.out.println("Time taken by StringBuilder :"+(System.currentTimeMillis() - startTime)+"milliseconds");
		
        startTime = System.currentTimeMillis();
		
		String string = new String("Sridevi");
		
		for (int i = 0; i < 100000; i++) {
			string.concat("Uppala");
			
		}
		
		System.out.println("Time taken by String :"+(System.currentTimeMillis() - startTime)+"milliseconds");
	}

}
