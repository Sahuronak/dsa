import java.util.*;

import javax.print.event.PrintEvent;
public class Basic_ques {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("reverse string : ");
        String d=sc.next();
        System.out.println(reverse_string(d));

        int i= sc.nextInt();
        int j= sc.nextInt();
        int k= sc.nextInt();

        System.out.println("sum of two number ");
        System.out.println(two_sum(i, j));

        System.out.println(" print largest number: ");
        largest_num(i, j, k);

        System.out.println("fabnacci series");
        System.out.println(factorial_number(i));

        System.out.println("swaping two number without third number");
        System.out.println(swap_number(i,j));

        System.out.println("reverse number: ");
        System.out.println(reverse_number(k));
        
        System.out.println("prime number are");
        prime_num(k);
        System.out.println("palindrone number");
        palindrone_number(i);
        System.out.println(" armstrong number: ");
        armstrong_number(k);


        }
    //1. write a function to swap two number without using 3rd variable
    public static int swap_number(int x,int y){
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.print("after swap: "+x+" ");
        return y;
        
    }
    //2. print the reverse of the given number 
    public static int reverse_number(int x) {
        int reverse=0;
        while(x>0){
            int rem= x%10;
            reverse=reverse*10+rem;
            x=x/10;

        }
        return reverse;
        
    }
    //3. print the reverse of the string
    public static String reverse_string(String x){
        StringBuilder sb=new StringBuilder(x);
        sb.reverse();
        return sb.toString();


    }
    //4. print first five prime number
    public static void  prime_num(int x){
        
        for(int i=1; i<=x; i++){
            int counter =0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    counter++;
                }
               
            }
          if(counter==2){
                System.out.println(i);
            }
        }
           
    
    }
    //5. what is palindrone number
    public static void palindrone_number(int x){
        int sum=0;
        int temp=x;
        int rem;
        while(x>0){
            rem=x%10;
            sum = sum*10+rem;
            System.out.println(sum);
            x=x/10;
        }
        if(temp==sum){
            System.out.println("its palindrone");
        }else{
          System.out.println("not palindron");
        }

        

    }
    //6. what is armstrong number
    public static void armstrong_number(int x){
        int temp = x;
        int r;
        int sum=0;
        while(x>0){
            r=x%10;
            x=x/10;
            sum=sum+r*r*r;
            System.out.println(sum);
            if(temp==sum){
                System.out.println(" its armstrong number ");
            }
            else{
                System.out.println(" its not a armstrong number");
            }


        }
    }
    //7. print binary search.
    //8. sum of two number enter by user
    public static int  two_sum(int x, int y){
        return(x+y);
    }
    //9. java program to check if the number is odd or even
    public static boolean odd_or_even(int x){
        if(x%2==0)
            return true;
        else
            return false;
    }
    //10. check if the number is prime or not
    public static boolean is_prime(int x) {
        for(int i=1; i<=x; i++){
            int count=0;
            for (int j=1; j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                return true;
            }
        }
        return false;
    }
    //11. calculate factorial
    public static int factorial_number(int x){
        int c;
        int a =0;
        int b= 1;
        for(int i=2; i<=x;i++){
        c=a+b;
        System.out.println(" "+c);
        a=b;
        b=c;
    }
        return(x);
    }
    //12. largest among three number
    public static void largest_num(int x, int y , int z){
        if(x>y && x>z){
            System.out.println(x);
        }
        else if(y>x && y>z){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }
    }
    
}
