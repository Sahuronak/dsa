import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class Propertydemo {
    public static void main (String[]args){
        Properties p = new Properties();
        p.setProperty("brand: ", "hp");
        p.setProperty("processor: ", "i3");
        p.setProperty("os: ", "window 11");
        p.setProperty("generation: ", "11");

        System.out.println(p);
        try {
            p.store(new FileOutputStream("/Users/sakshi sahu/OneDrive/Desktop/cosistency/demo.txt"), "laptop");
            p.storeToXML(new FileOutputStream("/Users/sakshi sahu/OneDrive/Desktop/cosistency/demos.xml"), "laptop");
            // p.load(new FileInputStream("/Users/sakshi sahu/OneDrive/Desktop/cosistency/demos.xml"));
            // System.out.println(p);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
