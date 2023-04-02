import java.io.FileInputStream;
import java.util.Scanner;
import java.io.*;

public class FileHandling {
    static FileInputStream fi;
    static Scanner sc;
   
    static void Divide() throws Exception{
        fi= new FileInputStream("C:/Users/sakshi sahu/OneDrive/Desktop/cosistency/test.txt");
        sc= new Scanner(fi);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a/c);
        fi.close();
        sc.close();
    }
    public static void main (String [] args)throws Exception{
        Divide();
        int x = sc.nextInt();
        System.out.println(x);
    }
}
