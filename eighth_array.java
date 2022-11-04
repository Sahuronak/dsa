import java.util.concurrent.ConcurrentHashMap;

import javax.sound.sampled.SourceDataLine;

public class eighth_array {
    public static void main(String args[]){
    //operation:
    System.out.println("operation array");
        int marks[]={1, 2, 3, 4, 5};
        arrayOperation(marks);
        //print our marks
        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

    //linear:number 
    System.out.println("liner search");
        int number[] ={2 ,4 ,6 ,8 ,10};
        int key =10;
        int index = linearSearch(number, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("key is at index: "+ index);
        }
        // //linear: string
        // String stringlist[] = {"munch", "kit-kat", "dailymilk","five-star"};
        // String keys="munch";

    //binary Search :with the time complexity O(log n)
            System.out.println("binary search");
                    int[] num1={3 ,6 ,9 ,12 ,15 ,18 ,21};
                    System.out.println("index for key  is : "+binarySearch(num1, 12));

     //reverse number 
     System.out.println("reverse array");
        int num2[]= {4, 8 ,12 ,16 ,20 ,24 ,28};
        reverseArray(num2);
        //print 
        for (int i=0; i<num2.length; i++){
            System.out.print(num2[i]+" ");
        }
        System.out.println();
        
        //print Pairs in an array
        System.out.println("print pair in an arrays");
        int num3[]={1,2,3,4,5,6,7};
        PrintPairs(num3);

        //printing subarray :kidanas algo
        System.out.println("subarray by kindanas by time complexity: O(n)");
        int num4[]={9,8,7,6,5,4,3};
        kadanasSubarray(num4);


        
        }

    // array operation
    public static void arrayOperation(int marks[]){
        for (int i = 0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    //linear search - using int retue=rn type
    public static int linearSearch(int number[] ,int key){
        for (int i =0; i<number.length; i++){
            if(number[i]==key){
                return 1;
            }
        }
        return -1;
    }
    //linear search - using string 
    // public static String linearString(String stringlist,String keys ) {
    //     for(int i = 0; i<stringlist.length(); i++){
    //         if(stringlist[i]==keys){
    //             return keys;
    //         }
    //     }
    //     return keys;    
    
    //binary search 
    public static int binarySearch(int num1[] , int keybin){
        int start = 0 ;
        int end = num1.length - 1;
        while(start<=end){
            int mid = (start+end)/2;
            //comparision
            if (num1[mid]==keybin){
                return mid;
            }
            if (num1[mid]<keybin){
                //right
                start = mid +1;
            }else{
                //left
                end=mid-1;
            }
        }
        return -1;
    }
    //reverse in array:
    public static void reverseArray(int num2[]){
        int first =0;
        int last = num2.length-1;
        while(first<last){
            //swap
            int temp = num2[last];
            num2[last]=num2[first];
            num2[first]=temp;
            first++;
            last--;
        }
    }
    //pairs in an array
    public static void PrintPairs(int num3[]){
        int tp=0;
        //outer loop
        for(int i=0; i<num3.length; i++){
            int current = num3[i];
       
        //current loop
        for(int j=0; j<num3.length; j++){
            System.out.println("pair os number i,j are ("+current+","+num3[j]+")");
            tp++;
        }
        System.out.println();
        
    }
    System.out.println("total pairs are: "+tp);
}
//printing subarray: continous part of array
// by kidanes algorithm:
public static void kadanasSubarray(int num4[]){
    int MaxSub =Integer.MIN_VALUE;
    int currSub = 0;
    for (int i=0; i<num4.length; i++){
        currSub = currSub + num4[i];
        if (currSub<0){
            currSub=0;
        }
        MaxSub=Math.max(currSub,MaxSub);
    }
    System.out.println("our maximum subarray sum is : "+MaxSub);
}
}

    