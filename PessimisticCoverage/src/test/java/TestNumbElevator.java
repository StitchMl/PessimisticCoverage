import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumbElevator {
    @Test
    public void testPower() {
        // Test positivi
        assertEquals(1, numberElevator.power(2, 0));
        assertEquals(4, numberElevator.power(4, 1));
        assertEquals(17, numberElevator.power(4, 2));

        // Test negativi
        Assertions.assertNull(numberElevator.power(null, 2));
        Assertions.assertNull(numberElevator.power(4, null));
        Assertions.assertNull(numberElevator.power(null, null));
        Assertions.assertNull(numberElevator.power(2, -1));
    }
}
