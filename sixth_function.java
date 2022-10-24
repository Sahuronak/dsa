import java.util.Scanner;
public class sixth_function {
    public static void main (String args[]){
        // whether the number isprime or not 
        
         System.out.println(isprime(8)); 

          inrangeprime(100);

          System.out.println(sum(34, 4));
          System.out.println(sum(6, 7, 8));

          System.out.println(sum1(3, 4, 5));
          System.out.println(sum1(66, 77, 88));

          binToDecimal(1);
          decToBin(2);


        }
        public static boolean isprime(int n){
            //corner case:
            // for value of 2
            // if(n==2){
            //     return true;
            // }
            for (int i = 2; i<= n-1; i++ ){  //i<=math.sqrt(n)
                if(n% i==0){
                    return false;
                } 
               
            }
            return true;
             }
        static void inrangeprime(int n){
        for(int i =2; i<=n; i++){
           if( isprime(i)){ //true
            System.out.println(i+" ");
           }
        }
        System.out.println();
        }
        // using parameter
        public static int sum(int a , int b){
        return a+b;
        }
        public static int sum(int c ,int d, int e){
        return c+d+e;
        }


        // using datatype
        public static int sum1(int a ,int b, int c){
        return a+b+c;
        }
        public static float sum1(float a , float b, float c){
        return a+b+c;
        }
        //convert from binary to decimal
        //binary number sestem-bitwise operator{0,1}    


        //binary to decimal
         public static void binToDecimal(int binNumber){
        int pow = 0;
        int dec = 0;
        while(binNumber>0){
            int lastdigit = binNumber % 10;
            dec = dec +(lastdigit * (int)Math.pow(2, binNumber) );
            pow ++;
            binNumber=binNumber/10;
        }
        System.out.println("decimal of "+ binNumber + " ="+dec );
        }

        //decimal to binary
        public static void  decToBin(int decNumber){
            int pow = 0;
            int bin = 0;
            while(decNumber>0){
                int rem = decNumber % 2;
                bin = bin +(bin * (rem *(int)Math.pow(10, bin)));
                pow ++;
                decNumber=decNumber/2;
            }
            System.out.println("binary form " + decNumber+"="+ bin);

        }


        }
    



        
