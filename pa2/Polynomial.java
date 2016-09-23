// Name:
// USC loginid:
// CS 455 PA2
// Fall 2016


import java.util.ArrayList;
import java.lang.Math;

/**
   A polynomial. Polynomials can be added together, evaluated, and
   converted to a string form for printing.
*/
public class Polynomial {

    /**
       Creates the 0 polynomial
    */
    public Polynomial() {
        polyterms = new ArrayList<Term>();

        assert isValidPolynomial();


    }


    /**
       Creates polynomial with single term given
     */
    public Polynomial(Term term) {
        polyterms = new ArrayList<Term>();
        polyterms.add(term);

        assert isValidPolynomial();
    }


    /**
       Returns the Polynomial that is the sum of this polynomial and b
       (neither poly is modified)
     */
    public Polynomial add(Polynomial b) {

        //return new Polynomial();  // dummy code.  just to get stub to compile

        int i = 0;
        int j = 0;

        Polynomial result = new Polynomial();

        while(i < this.size() && j < b.size()) {
            Term term1 = this.get(i);
            Term term2 = b.get(j);
            if(term1.getExpon() > term2.getExpon()) {
                result.addTerm(this.get(i));
                i++;
            } else if(term1.getExpon() == term2.getExpon()) {
                Term newTerm = new Term(term1.getCoeff() + term2.getCoeff(), term1.getExpon());
                result.addTerm(newTerm);
                i++;
                j++;
            } else {
                result.addTerm(b.get(j));
                j++;

            }
        }

        while(i < this.size()){
            result.addTerm(this.get(i));
            i++;
        }

        while(j < b.size()){
            result.addTerm(b.get(j));
            j++;
        }


        assert isValidPolynomial();   // call it on "this"-- the left operand of the add
        assert b.isValidPolynomial();  // call it on the right operand of the add
        assert result.isValidPolynomial();    // call it on the poly created in add
        return result;

    }



    /**
       Returns the value of the poly at a given value of x.
     */
    public double eval(double x) {

        //return 0;         // dummy code.  just to get stub to compile

        double result = 0;

        for(int i = 0; i < polyterms.size(); i++) {
            double coeff = polyterms.get(i).getCoeff();
            int expon = polyterms.get(i).getExpon();

            double termResult = coeff * Math.pow(x, expon);

            result = result + termResult;
        }

        return result;


    }


    /**
       Return a String version of the polynomial with the 
       following format, shown by example:
       zero poly:   "0.0"
       1-term poly: "3.2x^2"
       4-term poly: "3.0x^5 + -x^2 + x + -7.9"

       Polynomial is in a simplified form (only one term for any exponent),
       with no zero-coefficient terms, and terms are shown in
       decreasing order by exponent.
    */
    public String toFormattedString() {

        //return "";        // dummy code.  just to get stub to compile

        // FIRST need to reorder poly?
        String out = "";
        if(polyterms.size() == 0) {
            out = out.concat("0.0");
            return(out);
        }
        for(int i = 0; i < polyterms.size(); i++){
            Term term = polyterms.get(i); // is this valid?

            double coeff = term.getCoeff();
            if(coeff == 0){
                continue;
            }
            out = out.concat(coeff + "");

            int expon = term.getExpon();
            if(expon > 1){
                out = out.concat("x^" + expon);
            } else if (expon == 1) {
                out = out.concat("x");
            }

            if( i < (polyterms.size() - 1)) {
                out = out.concat(" + ");
            }

        }

        assert isValidPolynomial();

        return(out);
    }


    // **************************************************************
    //  PRIVATE METHOD(S)

    /**
       Returns true iff the poly data is in a valid state.
    */
    private boolean isValidPolynomial() {
	    //return false;     // dummy code.  just to get stub to compile

        // Length of Polynomial can't be negative
        if (polyterms.size() < 0) {
            return false;
        }


        // All elements must be Term objects
        for(int i = 0; i < polyterms.size(); i++) {
            if(polyterms.get(i).getClass().getName() != "Term") {
                return false;
            }
        }

        // Elements must be ordered in decreasing exponents

        // Elements are unique


        return true;
    }

    private Term get(int index) {
        return(polyterms.get(index));
    }

    private int size() {
        return(polyterms.size());
    }

    private void addTerm(Term term) {
        polyterms.add(term);
    }


    // **************************************************************
    //  PRIVATE INSTANCE VARIABLE(S)

    private ArrayList<Term> polyterms;

    /**

     REPRESENTATION INVARIANT:
     * polyterms is the ArrayList of Terms that make up the polynomial
     * 0 < polyterms.size()
     * if polyterms.size() > 0, all items in polyterms are Terms
     * Terms are ordered by decreasing exponent
     * Terms are unique
     */


}
