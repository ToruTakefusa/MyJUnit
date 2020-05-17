package myjunit;

import java.util.Objects;

/**
 * This class check the value of test method.
 * Test class should use assertEquals() method.
 * Test class should use assertEquals() method.
 */
public class Assert {
    public Assert() {
    }

    /**
     * Confirm the difference of expected, and actual.
     * @param expected expected value
     * @param actual actual value
     */
    public static void assertEquals (Object expected, Object actual) {
        if (Objects.isNull(expected) && Objects.isNull(actual)) return;
        if (!Objects.isNull(expected) && !Objects.isNull(actual) && expected.equals(actual)) return;
        String message = "expect " + expected + ", but was " + actual + System.lineSeparator();
        fail(message);
    }

    /**
     * Confirm the difference of expected, and actual.
     * @param expected expected value
     * @param actual actual value
     */
    public static void assertEquals (long expected, long actual) {
        if (expected == actual) return;
        String message = "expect " + expected + ", but was " + actual + System.lineSeparator();
        fail(message);
    }

    /**
     * Confirm the difference of expected, and actual.
     * @param expected expected value
     * @param actual actual value
     */
    public static void assertEquals (int expected, int actual) {
        assertEquals(expected, (long)actual);
    }

    /**
     * Confirm the difference of expected, and actual.
     * @param expected expected value
     * @param actual actual value
     * @param error the error of actual value
     */
    public static void assertEquals(double expected, double actual, double error) {
        assertEquals((float)expected, (float)actual, (float)error);
    }

    /**
     * Confirm the difference of expected, and actual.
     * It tests under the equation.
     * | expected - actual | < error.
     * @param expected expected value
     * @param actual actual value
     * @param error the error of actual value
     */
    public static void assertEquals(float expected, float actual, float error) {
        if (Math.abs(expected - actual) < error) return;
        String message = "expect " + expected + " and error is " + error + ", but was " + actual + System.lineSeparator();
        fail(message);
    }

    /**
     * Confirm the difference of expected, and actual.
     * It tests under the equation.
     * @param expected expected value
     * @param actual acutal value
     */
    public static void assertEquals(boolean expected, boolean actual) {
        if (expected == actual) return;
        String message = "expect " + expected + ", but was " + actual + System.lineSeparator();
        fail(message);
    }

    /**
     * When test should fail, call this method.
     * @param message failed information
     */
    private static void fail(String message) {
        throw new AssertionError(message);
    }
}
