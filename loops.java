import java.util.Scanner;
public class loops {
public static void main(String args[]){
    
    // form a calculator using switch case
    Scanner input = new Scanner(System.in); {
        System.out.println("this is calculator");
        System.out.println("enter number1");
        int number1 = input.nextInt();
        System.out.println("enter number2");
        int number2 = input.nextInt();
        System.out.println("enter operation");
        char operation = input.next().charAt(0);
   
        switch(operation){
            case ('+'):
            System.out.println(number1+number2);
            break;
            case ('-'):
            System.out.println(number1-number2);
            break;
            case ('*'):
            System.out.println(number1*number2);
            break;
            case ('/'):
            System.out.println(number1/number2);
            break;
            case ('%'):
            System.out.println(number1%number2);
            break;
            default:
            System.out.println("you have not put valid input");

        }
        //Write a Java program to input week number(1-7) and print day of week name using switch case
        System.out.println("input the day number");
        int day = input.nextInt();
        switch(day){
            case(1):
            System.out.println("Monday");
            break;
            case(2):
            System.out.println("tuesday");
            break;
            case(3):
            System.out.println("wednesday");
            break;
            case(4):
            System.out.println("thursday");
            break;
            case(5):
            System.out.println("friday");
            break;
            case(6):
            System.out.println("saturday");
            break;
            default:
            System.out.println("this is not");
        }
        /*loops : these are the statements through which we can put our work on repeat
        //there are three type of loop 1.> while loop 2.> for loop 3.> do while loop
        //while loop
        //while(condition){
            //code
        }*/
        //1. print value of 10 times:
        System.out.println("print the value ten times");
        int value1=input.nextInt();
        while(value1<=100){
            System.out.println("hello , everyone");
            value1++;
        }
        //print number from 1 to n
        System.out.println("print the number from 1 to n :");
        int n = input.nextInt();
        while(n<=100){
            System.out.println(n);
            n++;
        }
        int m = input.nextInt(); 
        for(int i = 1; i<=m; i++){
            System.out.println(i);
            i++;
        }
      }
        for( int i=1; i<=4; i++){
            for( int j=1; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // sum of first n natural number
        System.out.println("THE sum of n natural number are:");
            int number1= input.nextInt();
            int sum = 0;
            int i=1;
            while(i<=number1){
                sum+=i;
                i++;
            }
            System.out.println("the sum of n number is: "+sum);

        // print the reverse of number 
        System.out.println("enter the number for the reverse print :");
        int rev1 = input.nextInt();
        while(rev1>0){
            int lastDigit= rev1%10;
            System.out.println(lastDigit);
            rev1 =rev1/10;
        }
        System.out.println("rev1:"+rev1);

        System.out.println(" this is the star pattern :");
        //print star pattern
       /**
         * *
         * * *
         * * * *
        */
        for(int line =1; line<=5; line++){
            for(int star =1; star<=line; star++ ){
                System.out.print("*");

            }
            System.out.println();
        }
        // print star pattern
        // * * * *
        // * * *
        // * *
        // *

        for(int  line =1; line <=4; line++){
            for (int star = 1; star<=(4-line+1); star++){
                System.out.print("*");
            }
            System.out.println();
         }
        // print the pattern
        /*1
          1 2
          1 2 3
          1 2 3 4 
         */

        for (int line = 1; line<=5; line++){
            for(int number =1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
        // print the pattern
        /* A
           B C 
           D E F 
           G H I J
           K L M N O
         */
        char ch='A';
        for(int line = 1; line<=5; line++){
            for(int chars = 1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
}

}

