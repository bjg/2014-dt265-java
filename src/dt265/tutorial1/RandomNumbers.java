package dt265.tutorial1;

import java.util.Scanner;

/*
 * Created by brian on 31/03/2014.
 */

public class RandomNumbers {
    // Assume these default size and range values if not otherwise specified
    static private final int MAX = 10;
    static private final int RANGE = 100;
    private int[] randomNumbers;

    @SuppressWarnings("unused")
    public RandomNumbers() {
        // Example of a constructor calling another constructor using "this"
        this(MAX, RANGE);
    }

    /*
     * Allocate and populate an array of random numbers of the specified size
     * having the specified range
     */
    public RandomNumbers(int len, int range) {
        randomNumbers = new int[len];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * range);
        }
    }

    /*
     * Return a string representation of the random list
     */
    @Override
    public String toString() {
        // Use a string-builder to build up a string
        StringBuilder sb = new StringBuilder();
        // Showing an example of Java's foreach() loop structure
        for (int n : randomNumbers) {
            // An example of call-chaining
            sb.append(n).append(", ");
        }
        // Convert the string-builder back to a string
        return sb.toString();
    }

    public static void main(String args[]) {
        /*
         * XXX The use of the scanner here is very brittle in
         * that no error checking on the input is performed
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        int len = scanner.nextInt();

        System.out.print("Enter range: ");
        int range = scanner.nextInt();

        /*
         * Because there is a toString() method defined for
         * our object instances, we can do the following
         */
        System.out.println(new RandomNumbers(len, range));
    }
}
