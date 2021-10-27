import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Generic class to make JUnit testing easier.
 * Input and Expected Output can be of different types.
 * Example:
 *      `new TestCase<String, String>("horse", "orse-hay")`
 *      `new TestCase<Integer, String>(2, "Ambulance, Red Minivan, ")`
 * @param <T> Input of the test case.
 * @param <E> Expected Output of the test case.
 */
class TestCase<T, E> {
    T input;
    E expectedOutput;

    public TestCase(T input, E expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }
}

/**
 * Lab3ExercisesTest executes JUnit tests for 1A, 1B, 1D in the PDF.
 */
public class Lab3ExercisesTest {
    @Test
    public void pigLatinEncoderTests() {
        ArrayList<TestCase<String, String>> testCases = new ArrayList<>(Arrays.asList(
                new TestCase<>("horse", "orse-hay"),
                new TestCase<>("programmer", "ogrammer-pray"),
                new TestCase<>("Eclipse", "Eclipse-way"),
                new TestCase<>("yesterday", "esterday-yay"),
                new TestCase<>("rhythm", "ythm-rhay"),
                new TestCase<>("Yggdrasil", "asil-Yggdray"),
                new TestCase<>("You must love using Java", "ou-Yay ust-may ove-lay using-way ava-Jay")
        ));

        for (TestCase<String, String> testCase: testCases) {
            assertEquals(Lab3Exercises.pigLatinEncoder(testCase.input), testCase.expectedOutput);
        }
    }

    @Test
    public void pigLatinDecoderTests() {
        ArrayList<TestCase<String, String>> testCases = new ArrayList<>(Arrays.asList(
                new TestCase<>("orse-hay", "horse"),
                new TestCase<>("e-Way", "We"),
                new TestCase<>("e-Hay as-way e-thay inner-way", "He (was/as) the (winner/inner)"),
                new TestCase<>("e-Way are-way inners-way", "We (ware/are) (winners/inners)")
        ));

        for (TestCase<String, String> testCase: testCases) {
            assertEquals(Lab3Exercises.pigLatinDecoder(testCase.input), testCase.expectedOutput);
        }
    }

    @Test
    public void hexToIntNBinTests() {
        ArrayList<TestCase<String, String>> testCases = new ArrayList<>(Arrays.asList(
                new TestCase<>("0x000A", "Your number is 10 (in decimal) and 1010 (in binary)"),
                new TestCase<>("0x000B", "Your number is 11 (in decimal) and 1011 (in binary)"),
                new TestCase<>("0x000C", "Your number is 11 (in decimal) and 1100 (in binary)")
        ));

        for (TestCase<String, String> testCase: testCases) {
            assertEquals(Lab3Exercises.hexToIntNBin(testCase.input), testCase.expectedOutput);
        }
    }
}
