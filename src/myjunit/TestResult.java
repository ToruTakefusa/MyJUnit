package myjunit;

public class TestResult {
    private final String name;
    private int num;
    private int fail;
    private StringBuilder failedMessage;

    public TestResult(String name) {
        this.name = name;
        this.num = 0;
        this.fail = 0;
        this.failedMessage = new StringBuilder();
    }

    public void addResult(Test test) {
        this.num++;
        if (test.isFailed()) {
            this.failedMessage.append(test.getFailedMessage());
            this.fail++;
        }
    }

    public String toString() {
        return "Test " +
                this.name +
                System.lineSeparator() +
                "Num of tests : " +
                this.num +
                System.lineSeparator() +
                "Succeed : " +
                (this.num - this.fail) +
                System.lineSeparator() +
                "Failed : " +
                this.fail +
                System.lineSeparator() +
                "Failed details : " +
                System.lineSeparator() +
                this.failedMessage;
    }
}
