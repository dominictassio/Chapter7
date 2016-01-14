package ga.galactic.chapter7;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by Dominic Tassio on 1/14/2016.
 *
 * @author Dominic Tassio
 * @version 1.0
 */
public class Exercise8Test {

    @Test
    public void intAverage() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int average = Exercise8.average(array);

        assertEquals(5, average);

    }

    @Test
    public void doubleAverage() {

        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};

        double average = Exercise8.average(array);

        assertEquals(5.5, average, 0.1);

    }

}
