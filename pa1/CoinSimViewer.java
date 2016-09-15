/**
 * Name: Nicole Fronda
 * USC loginid: nfronda
 * CSCI 455 PA1
 * Fall 2016
 */

/**
 * class CoinSimViewer
 *
 *
 * Prompts the user for a number of trials to run
 * Creates CoinSimComponent to run simulation and draw results of simulation
 * Creates JFrame to contain CoinSimComponent
 * Displays JFrame
 */


import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Dimension;


public class CoinSimViewer {

    public static final int WIDTH = 800; // Width of JFrame
    public static final int HEIGHT = 500; // Height of JFrame


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of trials: ");
        int numTrials = in.nextInt();
        while (numTrials <= 0) {
            System.out.println("ERROR: Number entered must be greater than 0.");
            System.out.print("Enter number of trials: ");
            numTrials = in.nextInt();
        }

        // Creates CoinSimComponent given numTrials given by user
        CoinSimComponent cscomp = new CoinSimComponent(numTrials);

        // Creates JFrame to cointain CoinSimComponent
        JFrame f = new JFrame();

        // Sets size of JFrame
        f.setSize(WIDTH,HEIGHT);

        // Sets JFrame to exit on close
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add cscomp to JFrame f
        f.add(cscomp);

        // Displays the JFrame
        f.setVisible(true);


    }
}