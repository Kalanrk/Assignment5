/**
 *
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author SrideviUppala
 *
 */
public class tryCatchDemo {

	public static void main(String[] args) {

		Date now = new Date(2018, 8, 23);
		 Calendar cal = Calendar.getInstance();
		 cal.set(2018, 7, 22);
		
		System.out.println(now.toString());


		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		try {
			Date requestedDate = format.parse(cal.toString());
			System.out.println("requestedDate :"+requestedDate);

		} catch (ParseException e) {
			System.out.println("Exception occured!!");
			e.printStackTrace();
		}
		
		
	}
}
