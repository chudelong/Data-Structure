package one;

import java.time.LocalDateTime;
import java.util.Calendar;

public class ONE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("=======================");
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(Calendar.getInstance().getTimeInMillis());
		System.out.println("++++++++++++++");
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

}
