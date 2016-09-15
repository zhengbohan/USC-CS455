/**
 * Name: Nicole Fronda
 * USC loginid: nfronda
 * CSCI 455 PA1
 * Fall 2016
 */

/**
 * class CoinTossSimulator
 * 
 * Simulates trials of tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */

import java.util.Random;

public class CoinTossSimulator {


   public static final int RAND_CHOICES = 2; //To simulate a coin flip
   public static final int HEADS = 0; // Value for Heads

   private int numTrials;
   private int twoHeads;
   private int twoTails;
   private int headTails;

   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator() {
      numTrials = 0;
      twoHeads = 0;
      twoTails = 0;
      headTails = 0;

   }


   /**
      Runs the simulation for numTrials more trials. Multiple calls to this
      without a reset() between them add these trials to the simulation
      already completed.
      
      @param numTrials  number of trials to for simulation; must be >= 0
    */
   public void run(int numTrials) {
      if(numTrials > 0) {
         Random rnd = new Random();
         for (int i = 0; i < numTrials; i++) {
            int first = rnd.nextInt(RAND_CHOICES);
            int second = rnd.nextInt(RAND_CHOICES);

            if (first == second) {
               if (first == HEADS) {
                  twoHeads = twoHeads + 1;
               } else {
                  twoTails = twoTails + 1;
               }
            } else {
               headTails = headTails + 1;
            }
         }
         this.numTrials = this.numTrials + numTrials;
      }
 
   }


   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
       return numTrials;
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
       return twoHeads;
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
       return twoTails;
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
      return headTails;
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
      numTrials = 0;
      twoHeads = 0;
      twoTails = 0;
      headTails = 0;
   }


}
