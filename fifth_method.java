import java.util.Scanner;
public class fifth_method {
    // funtions and method
    /*function :its a block of code which perform some work we can call fi=unction to execute the work
     * method : function which are written under the  classes to execute some of the work is called methods
     * syntax eith parameter 
     * return type name (type para1 , type para2){
     * body
     * return statement;
     * }
     */
    //ques1. find the product of a and b
    public static int product(int a ,int b){
        int product=a*b;
        return product;
    }
    // find factorial of numerical n
    public static int factorial(int d){
        int factorial = d*(d-1);
        return factorial;
    }
   
    // form a calculator using switch case
   
   public static int calculator(int number1 , int number2, int operation){
        
    
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
    return operation;
    }
    
    public static int binomial(int n , int r){
        System.out.println("enter binomial number6");
        int fact_n = factorial(n);
        int fact_r =factorial(r);
        int fact_nmr  = factorial(n-r);

        int bin_coeff = fact_n/(fact_r * fact_nmr);
            return bin_coeff;
    }
        
    
    public static void main (String args[]){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("product of two number are:");
            int a =input.nextInt();
            int b=input.nextInt();
            int cal=product(a, b);
            System.out.println(cal);

            System.out.println("factorial of number is:");
            int d = input.nextInt();
            int fac =factorial(d);
            System.out.println(fac);

            
            System.out.println("enter number1");
            int number1 = input.nextInt();
            System.out.println("enter number2");
            int number2 = input.nextInt();
            System.out.println("enter operation");
            char operation = input.next().charAt(0);
            int calci= calculator(number1, number2, operation) ;
            System.out.println(calci);
            
            int n = input.nextInt();
            int r = input.nextInt();
            int bino = binomial(n, r);
            System.out.println(bino);
        }

               
        

    }
}
