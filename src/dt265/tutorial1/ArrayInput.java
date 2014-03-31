package dt265.tutorial1;

/**
 * Created by brian on 31/03/2014.
 */

import java.util.Scanner;

public class ArrayInput {

    // A list of real numbers
    private float[] list = new float[2];

    /*
     * Demonstrating the use of a class variable to count the number
     * instances of this class (i.e. objects) that are created
     */
    private static int count = 0;
    public ArrayInput() {
        count++;
    }

    /*
     * Prompt the user for each number in turn
     */
    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.print("List[" + i + "]: ");
            list[i] = scanner.nextFloat();
        }
    }

    /*
     * Getter to return the number of numbers
     */
    public int count() {
        return list.length;
    }

    /*
     * Getter to return the list
     */
    public float[] getList() {
        return list;
    }

    public static void main(String args[]) {
        ArrayInput holder = new ArrayInput();

        holder.readNumbers();

        float[] list = holder.getList();
        for (int i = 0; i < holder.count(); i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println(ArrayInput.count + " instances");
    }
}
