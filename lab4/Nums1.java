/**
 * Name: Nicole Fronda
 * USC loginid: nfronda
 * CSCI 455 Lab4
 * Fall 2016
 */

import java.util.*;

/**
   Stores a sequence of integer data values and supports some computations
   with it.

   CS 455 Lab 4.
*/
public class Nums {

    private ArrayList nums;

    /**
       Create an empty sequence of nums.
     */
    public Nums () {
        nums = new ArrayList();
    }

    /**
       Add a value to the end of the sequence.
     */
    public void add(int value) {
        nums.add(value);
    }


    /**
       Return the minimum value in the sequence.
       If the sequence is empty, returns Integer.MAX_VALUE
     */
    public int minVal() {

	return 0;    // stub code to get it to compile

    }

    /**
       Prints out the sequence of values as a space-separated list 
       on one line surrounded by parentheses.
       Does not print a newline.
       E.g., "(3 7 4 10 2 7)", for empty sequence: "()"
    */
    public void printVals() {
        String out = "(";
        for(int i = 0; i < nums.size(); i++){
            String s = nums.get(i) + "";
            out = out.concat(s);
            if (i < (nums.size() - 1)){
               out = out.concat(" ");
            }
        }
        out = out.concat(")");
        System.out.print(out);

    }

    /**
       Returns a new Nums object with all the values from this Nums
       object that are above the given threshold.  The values in the
       new object are in the same order as in this one.
       E.g.: call to myNums.valuesGT(10) where myNums = (3 7 19 4 21 19 10)
             returns      (19 21 19)
             myNums after call:  (3 7 19 4 21 19 10)
       This method does not modify the object the method is called on.
     */
    public Nums valuesGT(int threshold) {

	return new Nums();  // stub code to get it to compile

    }


    
}
