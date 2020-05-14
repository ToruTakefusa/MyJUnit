package myjunit;

import java.util.Objects;

public class Assert {
    public Assert() {
    }

    public static void assertEquals (Object expected, Object actual) {
        if (Objects.isNull(expected) && Objects.isNull(actual)) return;
        if (!Objects.isNull(expected) && !Objects.isNull(actual) && expected.equals(actual)) return;
        failed();
    }

    public static void assertEquals (long expected, long actual) {
        if (expected == actual) return;
        failed();
    }

    public static void assertEquals (int expected, int actual) {
        assertEquals(expected, actual);
    }

    public static void assertEquals(double expected, double actual, double error) {
        if (Math.abs(expected - actual) < error) return;
        failed();
    }

    public static void assertEquals(float expected, float actual, float error) {
        assertEquals(expected, actual, error);
    }

    public static void assertEquals(boolean expected, boolean actual) {
        if (expected == actual) return;
        failed();
    }

    private static void failed() {
        throw new AssertionError();
    }

}
