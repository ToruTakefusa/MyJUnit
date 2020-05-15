package myjunit;

import java.util.Objects;

public class Assert {
    public Assert() {
    }

    public static void assertEquals (Object expected, Object actual) {
        if (Objects.isNull(expected) && Objects.isNull(actual)) return;
        if (!Objects.isNull(expected) && !Objects.isNull(actual) && expected.equals(actual)) return;
        String message = "expect " + expected + ", but was " + actual + System.lineSeparator();
        fail(message);
    }

    public static void assertEquals (long expected, long actual) {
        if (expected == actual) return;
        String message = "expect " + expected + ", but was " + actual + System.lineSeparator();
        fail(message);
    }

    public static void assertEquals (int expected, int actual) {
        assertEquals(expected, (long)actual);
    }

    public static void assertEquals(double expected, double actual, double error) {
        assertEquals((float)expected, (float)actual, (float)error);
    }

    public static void assertEquals(float expected, float actual, float error) {
        if (Math.abs(expected - actual) < error) return;
        String message = "expect " + expected + " and error is " + error + ", but was " + actual + System.lineSeparator();
        fail(message);
    }
    
    public static void assertEquals(boolean expected, boolean actual) {
        if (expected == actual) return;
        String message = "expect " + expected + ", but was " + actual + System.lineSeparator();
        fail(message);
    }

    private static void fail(String message) {
        throw new AssertionError(message);
    }
}
