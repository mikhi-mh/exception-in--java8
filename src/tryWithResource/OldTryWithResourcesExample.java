package tryWithResource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class OldTryWithResourcesExample {

    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("test.txt"));
            byte[] data = new byte[fis.available()];
            fis.read(data);
            System.out.println(new String(data));
        } catch (IOException e) {
            e.printStackTrace();
            } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
