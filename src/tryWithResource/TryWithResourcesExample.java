package tryWithResource;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesExample {

    public static void main(String[] args) throws IOException {
        // Try-with-resources statement
        try (FileInputStream fis = new FileInputStream(new File("test.txt"))) {
            byte[] data = new byte[fis.available()];
            fis.read(data);
            System.out.println(new String(data));
        }

         /*
            The try-with-resources statement only works with objects that implement the AutoCloseable interface.

             */
    }
}