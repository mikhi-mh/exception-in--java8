package tryWithResource;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

public class TryWith {

    public static void main(String[] args) {

        System.out.println("start");
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            System.out.println(10/5);
            /*
            The try-with-resources statement only works with objects that implement the AutoCloseable interface.

             */
        }
        catch (Exception e){

        }
        System.out.println("end");
    }
}
