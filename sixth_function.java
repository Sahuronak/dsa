import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class sixth_function {
    public static void main (String args[]){
        // whether the number isprime or not 
        
         System.out.println(isprime(8)); 
        inrangeprime(100);

        }
        public static boolean isprime(int n){
            //corner case:
            // for value of 2
            // if(n==2){
            //     return true;
            // }
            for (int i = 2; i<= n-1; i++ ){  //i<=math.sqrt(n)
                if(n% 1==0){
                    return false;
                } 
               
            }
            return true;
    }
    public static void inrangeprime(int n){
        for(int i =2; i<=n; i++){
           if( isprime(i)){ //true
            System.out.println(i+" ");
           }
        }
        System.out.println();
}


    }
    //convert from binary to decimal
//binary number sestem-bitwise operator{0,1}

        
