package developer.application;

/**
 * StackTraceElement Class
 */
public class StackTraceApp {
    public static void main(String[] args) {
        try{
            sampleError();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /**
     * printStackTrace
     */
    public static void errorThowable() {
        try {
            String [] alphabethNameList = {"A","B","C","D","E","F","G","H"};

            System.out.println(alphabethNameList[100]);
        } catch (Throwable errorThowable) {
            errorThowable.printStackTrace();
        }
    }

    /**
     * runtimeException
     */
    public static void sampleError() {
        try {
            String [] alphabethNameList = {"A","B","C","D","E","F","G","H"};

            System.out.println(alphabethNameList[100]);
        } catch (Throwable errorThowable) {
            throw new RuntimeException(errorThowable);
        }
    }
}
