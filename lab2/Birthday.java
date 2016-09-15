import java.util.*;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Birthday {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your birth month [1..12]: ");
		int month = in.nextInt();
		System.out.print("Enter your birth day of month: ");
		int day = in.nextInt();		
		System.out.print("Enter your birth year [4-digit year]: ");
		int year = in.nextInt();	
		
		GregorianCalendar bday = new GregorianCalendar(year, month-1, day);
		Calendar today = Calendar.getInstance();
		
		if (bday.get(Calendar.MONTH) < today.get(Calendar.MONTH)){
			System.out.println("Your birthday has already happened this year.");
			int age = today.get(Calendar.YEAR) - bday.get(Calendar.YEAR);
			System.out.println("Your are " + age + " years old.");
		} else {
			if(bday.get(Calendar.MONTH) == today.get(Calendar.MONTH)){
				if(bday.get(Calendar.DATE) <= today.get(Calendar.DATE)){
					if(bday.get(Calendar.DATE) == today.get(Calendar.DATE)){
						System.out.println("Your birthday is today!");
						int age = today.get(Calendar.YEAR) - bday.get(Calendar.YEAR);
						System.out.println("Your are " + age + " years old.");
					} else {
						System.out.println("Your birthday has already happened this year.");
						int age = today.get(Calendar.YEAR) - bday.get(Calendar.YEAR);
						System.out.println("Your are " + age + " years old.");
					}
				} else { // Added this statement after the grade
					System.out.println("Your birthday has not yet happened this year.");
					int age = today.get(Calendar.YEAR) - bday.get(Calendar.YEAR) - 1;
					System.out.println("Your are " + age + " years old.");
				}
				
			} else {
				System.out.println("Your birthday has not yet happened this year.");
				int age = today.get(Calendar.YEAR) - bday.get(Calendar.YEAR) - 1;
				System.out.println("Your are " + age + " years old.");
				}
			}
		}
	}