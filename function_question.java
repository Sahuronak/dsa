import java.util.Scanner;
public class function_question{
    public static void main(String[] args) {

 Scanner  input = new Scanner(System.in);
 System.out.println("product of two number");
    int s=input.nextInt();
    int t=input.nextInt();
    int pro=product(s, t);
    System.out.println(pro);

    System.out.println("the factorial of number is :");
    int fact_num=input.nextInt();
    System.out.println(factorial(fact_num));

    System.out.println("the binomial cofficient of the given number is :");
        int n_num=input.nextInt();
        int r_num=input.nextInt();
        System.out.println(biono_coffie(n_num, r_num));

    System.out.println("prime or not");
        int isnum= input.nextInt();
     System.out.println((isprime(isnum)));

    System.out.println("prime number in range: ");
       int is_num= input.nextInt();
       primeinrange(is_num);


    System.out.println("the average is");
            int a= input.nextInt();
            int b= input.nextInt();
            int c = input.nextInt();
            int avg= aveg(a,b,c);
        System.out.println(avg);

    System.out.println("the odd number are");
    int n = input.nextInt();
    int odd= odd_number(n);
    System.out.println(odd);

    System.out.println("the greater number is");
    int x = input.nextInt();
    int y= input.nextInt();
    great_number(x, y); 

    System.out.println("the circumference of circle");
    int radius= input.nextInt();
    int circumference = circle(radius);
    System.out.println(circumference);

    System.out.println("the entry of party is: ");
    int age = input.nextInt();
    System.out.println(party(age));
    }


     //product of a and b
     public static int product(int a ,int b){
        return a*b;
     }
     // factorial of the number
     public static int factorial(int fact_num){
        int fact=1;
        for(int i =1; i<=fact_num; i++){
            fact=fact*i;
        }
        return fact;
     }
     // binomial of the function
     public static int biono_coffie(int n_num, int r_num){
        int n_coffie =factorial(n_num);
        int r_coffie = factorial(r_num);
        int nmr_coffie = factorial(n_num-r_coffie);
        int result_coffie =(n_coffie)/(r_coffie)*(nmr_coffie);
        return result_coffie;
     }
     // wheather the number is prime or not
     public static boolean isprime (int isnum){
        for (int i=2; i <=Math.sqrt(isnum); i++){
            if(isnum % i==0){
                return false;
            }
        }
        return true;
     }
     // prime number in the range
     public static void primeinrange(int is_num){
        for(int i=2; i<=is_num; i++){
            if(isprime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
     }

    //enter 3 number from the user and make a funtion to print their average?
    public static int aveg(int a, int b, int c){
        int average= (a+b+c)/3;
        return average;
    }
    //write a function to print sum of all odd number from 1 to n

    public static int odd_number(int n){
        int sum=0;
        for (int i=1; i<=n;i++){
            if(i%2!=0){
             sum +=i;
                System.out.println("the sum:"+sum);
            }
        }
      return sum;
    }
    // write a function that takes 2 number and returns the greater of those two
    public static void great_number(int x, int y){

        if(x<y){
            System.out.println("x is less than y");
        }else{
            System.out.println("y is less x");
        }
        return ;
    }
    // write a radius as an input and return circunference of the circle.
    public static int circle(int radius){
        int radii= 2 *(22/7) * radius;
        return radii;

    }
    // taking age and if the person is eligible for attentding the party or not?
    public static int party(int age){
        if (age<18){
            System.out.println("you are not eligible");
        }
        else{
            System.out.println("you are welcome to party");
        }
        if (age==18){
            System.out.println("this is your first party");
        }
        return age;

    }
    // two no. are entered by the user x and n ,write a function to find the value of onr number raised to the power of another e^x

}