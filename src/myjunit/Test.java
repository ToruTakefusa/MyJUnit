package myjunit;

import java.lang.reflect.Method;

public class Test {
    private final String name;
    private Method method;
    private boolean failed;

    public Test(Method method) {
        this.name = method.getName();
        this.method = method;
    }

    public void run(Object object) {
        try {
            boolean isSucceed = (boolean)this.method.invoke(object);
            if (!isSucceed) this.failed = true;
        } catch (Exception exception) {
            this.failed = true;
        }
    }

    public boolean isFailed() {
        return this.failed;
    }

    public String getFailedMessage() {
        if (!failed) return "";
        return this.name + " failed." + System.lineSeparator();
    }
}
