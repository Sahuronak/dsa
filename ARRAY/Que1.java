import java.util.*;
// maximum and minimum element in  array
public class Que1{
    public  static int  getLargest(int number[]){
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(Largest<number[i]){
                Largest= number[i];
            }
            if(Smallest>number[i]){
                Smallest=number[i];
            }
        }
        System.out.println("smallest  value is :"+Smallest);
        return Largest;

    }
    public static void main(String args[]){
        int number[] = {5,6,3,56,74,3,2};
        
        System.out.println(" the largest number is: "+getLargest(number));
    }

}