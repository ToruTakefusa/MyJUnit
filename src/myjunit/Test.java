package myjunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * This class contain the information of each test methods.
 */
public class Test {
    /** Name of the test method. */
    private final String name;
    /** The test method that will be invoked. */
    private Method method;
    /** The test method failed or not. */
    private boolean failed;
    /** The failed message */
    private String message;

    /**
     * Constructor.
     * @param method the test method that will be invoked.
     */
    public Test(Method method) {
        this.name = method.getName();
        this.method = method;
    }

    /**
     * Invoke the test method.
     * @param object The instance of test method's class.
     */
    public void run(Object object) {
        try {
            this.method.invoke(object);
        } catch (InvocationTargetException exception) {
            this.failed = true;
            message = exception.getCause().getMessage();
        } catch (Exception exception) {
            this.failed = true;
            message = exception.getMessage();
        }
    }

    /**
     * Is the test method failed?
     * @return If test is failed, return true.
     */
    public boolean isFailed() {
        return this.failed;
    }

    /**
     * Get failed message.
     * If it's not failed, it will return empty string.
     * @return failed message or empty string.
     */
    public String getFailedMessage() {
        if (!failed) return "";
        return this.name + " failed." + System.lineSeparator() + this.message;
    }
}
