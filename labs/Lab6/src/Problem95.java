import java.util.Calendar;
import java.util.GregorianCalendar;
public class Problem95 {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		System.out.println("Year: " + calendar.get(Calendar.YEAR));
		System.out.println("Month: " + calendar.get(Calendar.MONTH));
		System.out.println("Day of The Month: " + calendar.get(Calendar.DAY_OF_MONTH));

		calendar.setTimeInMillis(123456789765L);
		System.out.println("Year: " + calendar.get(Calendar.YEAR));
		System.out.println("Month: " + calendar.get(Calendar.MONTH));
		System.out.println("Day of The Month: " + calendar.get(Calendar.DAY_OF_MONTH));
	}
}
