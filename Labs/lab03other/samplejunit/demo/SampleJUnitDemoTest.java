package samplejunit.demo;

/*...

    This file demonstrates a typical use case of JUnit testing
    of methods that take user input at runtime. In this lab, you
    have several such methods to design and test using JUnit. You
    were told to collect user input in the main method of the class
    as opposed to the method itself because the test cases should run
    autonomously without the need for user input. Assuming you are
    reading the user input properly, of course, there will be no difference
    between calling the method with a value given at runtime or calling it
    with a value predefined as part of your test cases.

    You can use this as a template for designing JUnit test cases for
    each method you create on this or future labs. You can run test cases
    independently of each other to better organize your testing. You should
    use different test methods for each method you write. Make sure when you
    design test cases you demonstrate that the program is working as intended
    and always pay special attention to edge cases in testing.

    In lab we will go over adding JUnit to your project. Typically this
    simply involves adding it to the project's classpath -- a process that most
    IDEs make fairly straightforward.
 */

import org.junit.jupiter.api.Test; // this allows the JUnit testing framework, like methods preceded by @Test
import static org.junit.jupiter.api.Assertions.*; // this gives you assertEquals(), assertTrue(), etc.

public class SampleJUnitDemoTest {
    @Test
    public void testingAMethod() {
        assertEquals(SampleJUnitDemo.add(2, 2), 4);
        assertEquals(SampleJUnitDemo.add(0, 0), 0);
        assertEquals(SampleJUnitDemo.add(-400, 200), -200);
    }

    @Test
    public void testingAnotherMethod() {
        assertTrue(SampleJUnitDemo.sumStringByCharValues("Hello World") > 500);
        assertEquals(SampleJUnitDemo.sumStringByCharValues("Hello World"), SampleJUnitDemo.sumStringByCharValues("Hello") + SampleJUnitDemo.sumStringByCharValues("World"));
    }

    @Test
    public void testingMultipleMethods() {
        assertNotEquals(SampleJUnitDemo.add(SampleJUnitDemo.sumStringByCharValues("Hello World"), SampleJUnitDemo.sumStringByCharValues("Computer Science")), 513);
        assertEquals(SampleJUnitDemo.add(SampleJUnitDemo.sumStringByCharValues("Hello"), SampleJUnitDemo.sumStringByCharValues("World")), SampleJUnitDemo.sumStringByCharValues("Hello World"));;
    }

    @Test public void failTestCase() {
        assertEquals(SampleJUnitDemo.add(2, 2), 5);
    }
}
