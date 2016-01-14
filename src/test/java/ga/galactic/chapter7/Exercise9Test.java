package ga.galactic.chapter7;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by Dominic Tassio on 1/14/2016.
 *
 * @author Dominic Tassio
 * @version 1.0
 */
public class Exercise9Test {

    @Test
    public void min() {

        double[] array = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.1, 10.2};

        double minimum = Exercise9.min(array);

        assertEquals(1.2, minimum, 0.0);

    }

}
