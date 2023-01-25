import java.util.*;
public class array {
    public static void main(String args[]){
        //linear search
        int mark[]={2,4,6,8,10,12,14,16};
        int key =14;
        int index=linearSearch(mark, key);
        if (index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("the key is at index:"+index);
        }
        //maximum and minimum printing
        int num[] ={23,34,45,56};
        System.out.println(" the largest number is : "+largestNumber(num));

    }
     // linear search
     public static int linearSearch(int mark[],int key){
        for(int i=0; i<=mark.length; i++)
         if(mark[i]==key){
             return i;
         }
         return -1;
 
     }
     //maximum and minimum value
     public static int largestNumber(int num[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0; i<=num.length; i++)
        if(largest< num[i]){
            largest=num[i];

        }

        return largest;

     }
     // binary search value
    public static int binarySearch(int number1[],int key1){
        int start=0; int end=number1.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(number1[mid]==key1){
                return mid;
            }
            if(number1[mid]<key1){
                start =mid+1;

            }else{
                end =mid-1;
            }
        }
        return -1;
    }
}
