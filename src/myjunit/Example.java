package myjunit;

public class Example extends  TestCase{
    public boolean testSample() {
        return Assert.assertEquals(true, true);
    }

    public boolean testFailed1() {
        return Assert.assertEquals(true, false);
    }

    public boolean testFailed2() {
        return Assert.assertEquals(1, 2);
    }
}
