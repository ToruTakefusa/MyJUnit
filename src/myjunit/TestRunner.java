package myjunit;

import java.lang.reflect.InvocationTargetException;

/**
 * Runs test class.
 */
public class TestRunner {
    /**
     * Runs the test class
     * @param args The test class which you want to run.
     */
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName(args[0]);
            TestCase testCase = (TestCase)clazz.getConstructor().newInstance();
            TestResult testResult = testCase.run();
            System.out.println(testResult.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println("Can not find test class.");
            ex.printStackTrace();
        } catch (NoSuchMethodException ex) {
            System.out.println("Can not find test method.");
            ex.printStackTrace();
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
