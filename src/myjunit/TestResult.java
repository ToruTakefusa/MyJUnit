package myjunit;

public class TestResult {
    private final String name;
    private int num;
    private int fail;

    public TestResult(String name) {
        this.name = name;
        this.num = 0;
        this.fail = 0;
    }

    public void run() {
        this.num++;
    }

    public void failed() {
        this.fail++;
    }

    public String toString() {
        return this.name + System.lineSeparator() +
                "Num of tests : " +
                this.num +
                System.lineSeparator() +
                "Succeed : " +
                (this.num - this.fail) +
                System.lineSeparator() +
                "Failed : " +
                this.fail;
    }
}
