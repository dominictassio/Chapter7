package ga.galactic.chapter7;

/**
 * Created by Dominic Tassio on 1/14/2016.
 *
 * @author Dominic Tassio
 * @verion 1.0
 */
public class Exercise8 {

    /**
     * Average
     *
     * <p>
     *     This method accepts an int[] and returns the average of them
     * </p>
     *
     * @param array an int[] of values
     * @return the average of the Array
     */
    public static int average(int[] array) {

        int total = 0;

        for (int element: array) {

            total += element;

        }

        total /= array.length;

        return total;

    }

    /**
     * Average
     *
     * <p>
     *     This method accepts a double[] and returns the average of them
     * </p>
     *
     * @param array a double[] of values
     * @return the average of the Array
     */
    public static double average(double[] array) {

        double total = 0;

        for (double element: array) {

            total += element;

        }

        total /= array.length;

        return total;

    }

}
