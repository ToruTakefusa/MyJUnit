package myjunit;

import java.lang.reflect.Method;

/**
 * Test class should implement this class.
 * It's just run test methods, and collect TestResult.
 */
public class TestCase {
    /**
     * Run test method.
     * @return Result of the test.
     */
    public TestResult run() {
        TestResult testResult = new TestResult(this.getClass().getName());
        Method[] methods = this.getClass().getMethods();

        for (Method method : methods) {
            if (!method.getName().startsWith("test")) continue;
            if (!method.getReturnType().equals(void.class)) continue;
            Test test = new Test(method);
            test.run(this);
            testResult.addResult(test);
        }
        return testResult;
    }
}
