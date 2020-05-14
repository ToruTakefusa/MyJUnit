package myjunit;

import java.util.ArrayList;
import java.util.List;

public class TestResult {
    private String name;
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
        StringBuilder stringBuilder = new StringBuilder(this.name);
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Num of tests : " + this.num);
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Succeed : " + (this.num - this.fail));
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Failed : " + this.fail);
        return stringBuilder.toString();
    }
}
