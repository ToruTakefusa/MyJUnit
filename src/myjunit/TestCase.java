package myjunit;

import java.lang.reflect.Method;

public class TestCase {
    public TestResult run() {
        TestResult testResult = new TestResult(this.getClass().getName());
        Method[] methods = this.getClass().getMethods();

        for (Method method : methods) {
            try {
                if (!method.getName().endsWith("Test")) continue;
                testResult.run();
                method.invoke(this);
            } catch (Exception ex) {
                testResult.failed();
            }
        }

        return testResult;
    }
}
