package developer.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadApp {
    public static void main(String[] args) {
        bufferReaderTryWithResource();
    }
    /**
     * BufferedReader tryWithResource auto close
     */
    public static void bufferReaderTryWithResource() {
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))){
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (Throwable throwable) {
            System.out.println("Error Reading File: " + throwable.getMessage());
        }
    }

    /**
     * BufferedReader Manual Close
     */
    public static void bufferReader() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("README.md"));
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (Throwable throwable) {
            System.out.println("Error Reading File: " + throwable.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("Successfully Closed");
                } catch (IOException ioException) {
                    System.out.println("Error Close Reader " + ioException.getMessage());
                }
            }
        }
    }
}
