import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @ParameterizedTest(name="{0}! should be {1}")
    @CsvSource({"0,1","1,1","2,2","3,6","4,24","5,120"})
    void testFaculty(int given, int expected) {
        int actual = Factorial.calculate(given);

        assertEquals(expected, actual);
    }
}
