import java.util.*;
import java.util.GregorianCalendar;

public class Date {
	public static void main(String[] args) {
		GregorianCalendar greg = new GregorianCalendar(1995, Calendar.JANUARY, 20);
		System.out.println(1+greg.get(Calendar.MONTH) + "/" + greg.get(Calendar.DATE) + "/" + greg.get(Calendar.YEAR) );
		greg.add(Calendar.DATE, 20);
		System.out.println(1+greg.get(Calendar.MONTH) + "/" + greg.get(Calendar.DATE) + "/" + greg.get(Calendar.YEAR) );
	}
}