import java.util.Arrays;

public class PolynomialTester
{
    public static void main(String[] args){
        System.out.println("Create a zero polynomial");
        Polynomial p1 = new Polynomial();
        System.out.println(p1.toFormattedString());
        System.out.println("Expected: 0.0");

        System.out.println("Create another polynomial with one element 3.0x^5");
        Polynomial p2 = new Polynomial(new Term(3.0, 5));
        System.out.println(p2.toFormattedString());
        System.out.println("Expected: 3.0x^5");

        System.out.println("Add the zero polynomial and 3.0x^5");
        Polynomial p3 = p1.add(p2);
        System.out.println(p1.toFormattedString());
        System.out.println("Expected: 0.0");
        System.out.println(p2.toFormattedString());
        System.out.println("Expected: 3.0x^5");
        System.out.println(p3.toFormattedString());
        System.out.println("Expected: 3.0x^5");

        System.out.println("Add 2x^3 to 3.0x^5");
        Polynomial p4 = p3.add(new Polynomial(new Term(2, 3)));
        System.out.println(p4.toFormattedString());
        System.out.println("Expected: 3.0x^5 + 2.0x^3");

        System.out.println("Add 2x^5 to 3.0x^5 + 2.0x^3");
        Polynomial p5 = p4.add(new Polynomial(new Term(2, 5)));
        System.out.println(p5.toFormattedString());
        System.out.println("Expected: 5.0x^5 + 2.0x^3");

        System.out.println("Create new Poly x^3 + -3");
        Polynomial p6 = new Polynomial(new Term(1,3));
        Polynomial p7 = p6.add(new Polynomial(new Term(-3, 0)));
        Polynomial p8 = p7.add(p5);
        System.out.println(p8.toFormattedString());
        System.out.println("Expected: 5.0x^5 + 3.0x^3 + - 3.0");

        System.out.println("Evaluate above polynomial at x = 1");
        double result = p8.eval(1);
        System.out.println(result);
        System.out.println("Expected: 5.0");

        System.out.println("Evaluate above polynomial at x = 2");
        result = p8.eval(2);
        System.out.println(result);
        System.out.println("Expected: 181.0");




    }

}