/**
 * Name: Nicole Fronda
 * USC loginid: nfronda
 * CSCI 455 PA1
 * Fall 2016
 */

/**
 * class CoinSimComponent
 *
 *
 * Extends JComponent
 * Runs a simulation using CoinTossSimulator
 * Uses results of simulation to create and draw bars using Bar class
 */

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Color;
import java.lang.Math;


public class CoinSimComponent extends JComponent {


    public static final double BUFFER = 0.1; //10% of the window height is proportioned for white space
    public static final int FIRST_BAR_LEFT_FACTOR = 4; // For finding position for first (left-most_ bar
    public static final int SECOND_BAR_LEFT_FACTOR = 2; // For finding position for middle bar
    public static final int BAR_HALF_WIDTH_FACTOR = 32; // Divide window width by this factor for half a bar width
    public static final int BAR_WIDTH_DIVIDER = 16; // Divide window width by this factor for a bar width
    public static final double BAR_LABEL_OFFSET = 0.05; // Offset factor between bottom of bar and label
    public static final int HUNDRED_PERCENT = 100; // Multiply by 100 to get percent figure
    public static final Color TWOHEADSBAR_COLOR = Color.RED;
    public static final Color HEADTAILS_COLOR = Color.GREEN;
    public static final Color TWOTAILSSBAR_COLOR = Color.BLUE;

    private CoinTossSimulator coin;

    /**
     * Constructor initializes a CoinTossSimulator runs a simulation on the object for given numTrials number of trials
     */
    public CoinSimComponent(int numTrials){
        coin = new CoinTossSimulator();
        coin.run(numTrials);

    }


    // Override paintComponent to draw bar graphs with Bar.java
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Gets results of simulation
        int numTrials = coin.getNumTrials();
        int twoHeads = coin.getTwoHeads();
        int twoTails = coin.getTwoTails();
        int headTails = coin.getHeadTails();


        //Used for all Bars
        double unitsPerPixel = numTrials / (getHeight() - (getHeight() * BUFFER));
        int BarBottom = getHeight() - (int) (getHeight() * BAR_LABEL_OFFSET);
        int BarWidth = (getWidth() / BAR_WIDTH_DIVIDER);

        //Two Heads Bar
        int TwoHeadsLeft = (getWidth() / FIRST_BAR_LEFT_FACTOR) - (getWidth() / BAR_HALF_WIDTH_FACTOR);
        int TwoHeadsPercent = (int) Math.round((((double) (twoHeads) / numTrials) * HUNDRED_PERCENT));
        String TwoHeadsResult = "Two Heads: " + twoHeads + " (" + TwoHeadsPercent + "%)";
        Bar TwoHeadsBar = new Bar(BarBottom, TwoHeadsLeft, BarWidth, twoHeads, unitsPerPixel, TWOHEADSBAR_COLOR, TwoHeadsResult);

        //Head Tails Bar
        int HeadTailLeft = (getWidth() / SECOND_BAR_LEFT_FACTOR) - (getWidth() / BAR_HALF_WIDTH_FACTOR);
        int HeadTailPercent = (int) Math.round((((double) (headTails) / numTrials) * HUNDRED_PERCENT));
        String HeadTailResult = "A Head and a Tail: " + headTails + " (" + HeadTailPercent + "%)";
        Bar HeadTailBar = new Bar(BarBottom, HeadTailLeft, BarWidth, headTails, unitsPerPixel, HEADTAILS_COLOR, HeadTailResult);

        //Two Tails Bar
        int TwoTailsLeft = (getWidth() - (getWidth() / FIRST_BAR_LEFT_FACTOR)) - (getWidth() / BAR_HALF_WIDTH_FACTOR);
        int TwoTailsPercent = (int) Math.round((((double) (twoTails) / numTrials) * HUNDRED_PERCENT));
        String TwoTailsResult = "Two Tails: " + twoTails + " (" + TwoTailsPercent + "%)";
        Bar TwoTailsBar = new Bar(BarBottom, TwoTailsLeft, BarWidth, twoTails, unitsPerPixel, TWOTAILSSBAR_COLOR, TwoTailsResult);

        TwoHeadsBar.draw(g2);
        HeadTailBar.draw(g2);
        TwoTailsBar.draw(g2);

    }


}

