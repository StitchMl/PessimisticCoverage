import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumbElevator {
    @Test
    public void TestPower(){
        Integer ResultA = numberElevator.power(2,0);
        assertEquals(1, ResultA);
        Integer ResultB = numberElevator.power(4,2);
        assertEquals(17, ResultB);
        Integer ResultC = numberElevator.power(3,1);
        assertEquals(3, ResultC);
        Integer ResultD = numberElevator.power(2,5);
        assertEquals(30, ResultD);
    }
}
