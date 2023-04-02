import javax.xml.transform.Source;

public class Recursion {
    /*Recursion: recursion is a method of solving a computation problem where the solution depends on solution to smaller instances of the same problem. 
     * >>base case
     * >> work
     * >> inner function call f(n-1)
    */
    public static void printDec(int n){
        //base case
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDec(n-1);
    }
    public static void printincre(int m){
        //base case
        if(m== 1){
            System.out.println(m+" ");
            return;
        }
        printincre(m-1);
        System.out.println(m+" ");
    }
    public static int factorial(int f){
        if(f==0){
            return 1;
        }
        int fnm1=factorial(f-1);
        int fn = f*factorial(f-1);
        return fn;

    }
    public static int sumNatural(int num1){
        if(num1==1){
            return 1;
        }
        int snm1= sumNatural(num1-1);
        int Sn = num1+snm1;
        return Sn;
    }
     public static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
       
        int fnm1=fib(n-1);
        int fnm2 = fib(n-2);
        int fibn=fnm1+fnm2;
        return fibn;    
        
     }
    //  public static int sorted(int n){
         
        
    //  }
    public static void main (String arg[]){
        //printing number from n to 1
        System.out.println("this is decreasing order");
          int n = 3;
          printDec(n);
        // print number from n to 1 (increasing order)
        System.out.println("this is increasing order");
        int m=10;
        printincre(m);
        //print factorial of a number n
        System.out.println("this is a factorial");
        int f = 5;
       System.out.println(factorial(f)); 
       //print sum of first n natural numbers.
       System.out.println("sum of natural number");
       int num1 =5;
       System.out.println(sumNatural(num1));
       //fibonacci number
       System.out.println("this is fibonacci number");
       System.out.println(fib(n));
       //print sorted array
       System.out.println("sorted array");  
       
    }
}
