import java.util.Scanner;
public class varAndDType{
    public static void main(String[] args){
    //java is an objective oriented programming language developed by sum microsystem of USA in 1991
    //it was originally called Oak by james gasline(he is the one of inventer of java )
    //Java - it is a purely objective oriented programming
              
       System.out.println("here is java 2 folder for practice");
     // type of data type :
    //1.primitive data type                 2. non- primitive data type
    int num12 = 78;
    int num24= 45;
    System.out.println(num12+num24 );
    //application of java
    //1. mobile application - for mobile
    //2. desktop GUI application
     //3. web based application
     //4. interprise application -run time enviroment
    //5. scientific application - mathamatical application and scientific application 
    //6. gaming application - perform games 
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


        // taking in from user using scanner class
        Scanner input = new Scanner(System.in); {
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

            // area of circle
            float radius = input.nextFloat();
            float area = 3.14f* (radius)*(radius);
            System.out.println(area);

            // area of square:
            double sides =  input.nextDouble();
            double area_square = sides* sides;
            System.out.println(area_square);

            // factorial of the number
            System.out.println("enter the number");
            int n = input.nextInt();
            long factorial = 1;
            int z = 1;
            for(i=1; i<=n; i++){
               factorial*=i;
            }
            System.out.printf("factorial of %d = %d",n ,factorial);
            }
        }
    }
