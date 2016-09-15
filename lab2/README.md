1.0) Nicole Fronda
1.1) import GregorianCalendar
1.2) 
```
GregorianCalendar greg = new GregorianCalendar(1995, Calendar.JANUARY, 20)
```
1.3) 		

``` 
System.out.println(greg.get(Calendar.YEAR));
System.out.println(greg.get(Calendar.MONTH));
System.out.println(greg.get(Calendar.DATE));
```
1.4) 0 
1.5)
```
greg.add(Calendar.DATE, 20);
```
2.1)
Compile errors I got:
```
Lab2.java:1: error: ';' expected
import GregorianCalendar;
```
I didn't properly import the GregorianCalendar package.
```
Lab2.java:3: error: class, interface, or enum expected
public Class Lab2 {
```
I capitalized 'class' when it should be lowercase.

3.1)
Compile errors I got:
```
Birthday.java:17: error: cannot find symbol
                Calendary today = Calendar.getInstance();
```
I misspelled the Class name.
```
Birthday.java:19: error: ')' expected
                if (bday.get(Calendar.MONTH) < today.get(Calendar.MONTH){
```
I forgot a parentheses.

3.2)
Test Case 1 - Birthday is after today's date 9/1/2016:
```
Enter your birth month [1..12]: 12
Enter your birth day of month: 20
Enter your birth year [4-digit year]: 1991
Your birthday has not yet happened this year.
```
Test Case 2 - Birthday is before today's date 9/1/2016:
```
Enter your birth month [1..12]: 1
Enter your birth day of month: 20
Enter your birth year [4-digit year]: 1991
Your birthday has already happened this year.
```
Test Case 3 - Birthday is today's date 9/1/2016:
```
Enter your birth month [1..12]: 9
Enter your birth day of month: 1
Enter your birth year [4-digit year]: 1991
Your birthday has already happened this year.
```