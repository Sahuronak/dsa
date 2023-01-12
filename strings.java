import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import javax.xml.transform.Source;

import java.util.Scanner;
public class strings {
    public static void main (String args[]){
        // Scanner sc = new Scanner(System.in);
        // String name = "sakshi";
        // String fullname="sakshi sahu";
        // String names = sc.nextLine();
        // System.out.println("your name is "+ name);
        // System.out.println(fullname);
        // System.out.println(fullname.length());
        // // length of string
        // System.out.println(names.length());
        // // charat
        // for(int i=0; i<fullname.length(); i++){
        //     System.out.println(fullname.charAt(i));

        // }
        String name1 = "sakshi";
        String name2 = "sakshi";
        //s1>s2 : +ve value
        //s1 == s2 :0
        //s1<s2 :-ve value
        // if(name1.compareTo(name2)==0){
        //     System.out.println("string are equal");

        // }else{
        //     System.out.println("strings are not equal");
        // }
        // if(new String("sakshi")== new String("Sakshi")){
        //     System.out.println("strings are equals");

        // }else{
        // System.out.println("strings are not equals");
        // }
        // String sentences = "MY NAME IS SAKSHI";
        // String name = sentences.substring(4, sentences.length());
        // System.out.println(name);
        StringBuilder sb = new StringBuilder("sak");

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 't');
        System.out.println(sb);

        // insert function
        sb.insert(2,'h');
        System.out.println(sb);

        //delete function 
        sb.delete(2, 3);
        System.out.println(sb);

        //append :last mai jodna
        sb.append("q");
        sb.append("u");
        sb.append("e");
        sb.append("e");
        sb.append("n");
        System.out.println(sb.length());
        System.out.println(sb);

        //reverse string
        for(int i=0; i<sb.length()/2; i++){
            int front =i;
            int back = sb.length()-1-i;// 5-1-0 =>4

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            //set char at -at any character
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }
        System.out.println(sb);



    }
}
