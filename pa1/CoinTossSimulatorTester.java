/**
 * Name: Nicole Fronda
 * USC loginid: nfronda
 * CSCI 455 PA1
 * Fall 2016
 */

/**
 * class CoinTossSimulatorTester
 *
 * Creates a CoinTossSimulator object and runs trial simulations with that object.
 * Then prints trial results using printTrialResults after each run/reset.
 */

public class CoinTossSimulatorTester {
    public static final int[] TRIALS = {1, 10, 100}; //Constant for number of trials to run

    private static void printTrialResults(CoinTossSimulator coin){
        System.out.println("Number of trials: " + coin.getNumTrials());
        System.out.println("Two-head tosses: " + coin.getTwoHeads());
        System.out.println("Two-tail tosses: " + coin.getTwoTails());
        System.out.println("Two-head tosses: " + coin.getHeadTails());
        if(coin.getNumTrials() == coin.getTwoHeads() + coin.getTwoTails() + coin.getHeadTails()){
            System.out.println("Tosses add up correctly? true");
        } else {
            System.out.println("Tosses add up correctly? false");
        }
    }

    public static void main(String[] args){
        /**
         * Creates CoinTossSumulator object
         */

        CoinTossSimulator coin = new CoinTossSimulator();

        /**
         * Prints state after constructor
         */

        printTrialResults(coin);

        /**
         * Runs some trials and prints results
         */

        for(int element: TRIALS){
            coin.run(element);
            System.out.println("After run(" + element + "):");
            printTrialResults(coin);
        }

        /**
         * Resets
         */

        coin.reset();
        System.out.println("After reset:");
        printTrialResults(coin);

        /**
         * Attempt to run trials <= 0
         */
        coin.run(-1);
        coin.run(0);
        coin.run(-100);
        System.out.println("After zero or negative number of trials:");
        printTrialResults(coin);

        /**
         * Runs 1000 trials
         */

        coin.run(1000);
        System.out.println("After run(1000):");
        printTrialResults(coin);

    }
}