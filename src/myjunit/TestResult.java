package myjunit;

public class TestResult {
    /** The name of tests. */
    private final String name;
    /** The number of test methods. */
    private int num;
    /** The number of failed test methods. */
    private int fail;
    /** The message of failed test methods. */
    private StringBuilder failedMessage;

    /**
     * Constructor.
     * @param name The name of tests.
     */
    public TestResult(String name) {
        this.name = name;
        this.num = 0;
        this.fail = 0;
        this.failedMessage = new StringBuilder();
    }

    /**
     * Add result of test.
     * @param test The test which will be added.
     */
    public void addResult(Test test) {
        this.num++;
        if (test.isFailed()) {
            this.failedMessage.append(test.getFailedMessage());
            this.fail++;
        }
    }

    /**
     * Show summary of tests.
     * @return return summary of tests.
     */
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
