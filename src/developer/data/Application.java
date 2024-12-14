package developer.data;

public class Application {
    public static final int PROCECCORS;

    static {
        System.out.println("Application loaded");
        PROCECCORS = Runtime.getRuntime().availableProcessors();
    }

}
