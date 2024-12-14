package developer.error;

/**
 * runtimmeException
 */
public class BlankException extends RuntimeException {
    public BlankException(String message) {
        System.out.println(message);
    }
}
