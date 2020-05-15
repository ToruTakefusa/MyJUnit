package myjunit;

public class Example extends  TestCase{
    public void testSample() {
        Assert.assertEquals(true, true);
    }

    public void testFailed1() {
        Assert.assertEquals(true, false);
    }

    public void testFailed2() {
        Assert.assertEquals(1, 2);
    }
}
