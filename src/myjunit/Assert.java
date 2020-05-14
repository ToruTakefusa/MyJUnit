package myjunit;

import java.util.Objects;

public class Assert {
    public Assert() {
    }

    public static boolean assertEquals (Object expected, Object actual) {
        if (Objects.isNull(expected) && Objects.isNull(actual)) return true;
        if (!Objects.isNull(expected) && !Objects.isNull(actual) && expected.equals(actual)) return true;
        return false;
    }

    public static boolean assertEquals (long expected, long actual) {
        if (expected == actual) return true;
        return false;
    }

    public static boolean assertEquals (int expected, int actual) {
        return assertEquals(expected, (long)actual);
    }

    public static boolean assertEquals(double expected, double actual, double error) {
        return assertEquals((float)expected, (float)actual, (float)error);
    }

    public static boolean assertEquals(float expected, float actual, float error) {
        if (Math.abs(expected - actual) < error) return true;
        return false;
    }
    
    public static boolean assertEquals(boolean expected, boolean actual) {
        if (expected == actual) return true;
        return false;
    }
}
