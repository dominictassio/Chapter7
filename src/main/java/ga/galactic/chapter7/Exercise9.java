package ga.galactic.chapter7;

/**
 * Created by Dominic Tassio on 1/14/2016.
 *
 * @author Dominic Tassio
 * @version 1.0
 */
public class Exercise9 {

    /**
     * Minimum
     *
     * <p>
     *     Find the minimum value in a double[];
     * </p>
     *
     * @param array a double[] of values
     * @return the minimum double value
     */
    public static double min(double[] array) {

        double minimum = Double.MAX_VALUE;

        for (double element: array) {

            if (element < minimum) {

                minimum = element;

            }

        }

        return minimum;

    }

}
