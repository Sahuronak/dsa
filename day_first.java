import java.util.Scanner;
public class day_first{
    public static void main(String args[]){
        // variable in java
        int a=10;
        int b=20;
        int sum= a+b;
        System.out.println(sum);
        //here a and b are the variable in java

        // Datatype in java 
        // byte - 1byte
        // short - 2 byte
        // char - 2 byte
        // boolean - 1 byte
        // int - 4 byte
        // long - 8 byte
        // float - 4 byte
        // double - 8 byte
        //conversion happen when
        // byte >short > int > float > long > double
         
        //sub of c and d 
        int c = 30;
        int d = 40;
        int sub = d-c;
        System.out.println(sub);
         
        //product of a and b
        float product = a*b;
        System.out.println(product);
        //divide of a and d
        long divide = c/d;
        System.out.println(divide);


        try (// taking in from user using scanner class
        Scanner input = new Scanner(System.in)) {
            int e= input.nextInt();
             System.out.println(e);
             byte f = input.nextByte();
             System.out.println(f);
             short g = input.nextShort();
             System.out.println(g);
             System.out.println("print string");
             String h = input.next();
             System.out.println(h);
             double i = input.nextDouble();
             System.out.println(i);
             long j = input.nextLong();
             System.out.println(j);
              
             // sum of two number by taking input from user:
             int num1 = input.nextInt();
             int num2 = input.nextInt();
            int add = num1+ num2;
            System.out.println(add);

            // area of cicle
            float radius = input.nextFloat();
            float area = 3.14f* (radius)*(radius);
            System.out.println(area);

            // area of square:
            double sides =  input.nextDouble();
            double area_square = sides* sides;
            System.out.println(area_square);
        }




    }
}