import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    public void testNegativeIllegalArgument() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.add("-1, 3");
        }, "java.lang.IllegalArgumentException");
        assertEquals("java.lang.IllegalArgumentException: Negatives not allowed", thrown.toString());
    }

    @Test
    public void testBigNumbers() {
        assertEquals(3, StringCalculator.add("1000, 3"));
    }

}
