package myjunit;

/**
 * This class used when test failed.
 * It's message used to tell the information of test method.
 */
public class AssertFailedException extends Exception{

    public AssertFailedException(String message) {
        super(message);
    }
}
