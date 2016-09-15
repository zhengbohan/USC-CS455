import java.util.*;
import java.util.GregorianCalendar;

public class Lab2 {
	public static void main(String[] args) {
		GregorianCalendar greg = new GregorianCalendar(1995, Calendar.JANUARY, 20);
		System.out.println(greg.get(Calendar.YEAR));
		System.out.println(greg.get(Calendar.MONTH));
		System.out.println(greg.get(Calendar.DATE));
		greg.add(Calendar.DATE, 20);
		System.out.println(greg.get(Calendar.YEAR) + " " + greg.get(Calendar.MONTH) + " " + greg.get(Calendar.DATE));
	}
}