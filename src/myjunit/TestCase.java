package myjunit;

import java.lang.reflect.Method;

public class TestCase {
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
