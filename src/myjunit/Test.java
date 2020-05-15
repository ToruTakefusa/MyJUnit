package myjunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    private final String name;
    private Method method;
    private boolean failed;
    private String message;

    public Test(Method method) {
        this.name = method.getName();
        this.method = method;
    }

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

    public boolean isFailed() {
        return this.failed;
    }

    public String getFailedMessage() {
        if (!failed) return "";
        return this.name + " failed." + System.lineSeparator() + this.message;
    }
}
