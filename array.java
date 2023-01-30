public class array {
    public static void main(String args[]){
        
        // create an array of 5 float and calculate their sum

        float numbers_again[] = {56.9f ,76.5f ,87.6f ,65.7f};
        float add = 0;
        for(float  element:numbers_again){
            add = add + element;
        }
        System.out.println("the value of sum is:  "+ add);

        // write a program to find out whether a given integers is present in an array or not .
        int number[] = {56 ,76 ,88 ,65};
        float numb = 76;
        boolean isInArray = false;
        for(int element:number){
            if(numb==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("the value is present in the array");
        }
        else{
            System.out.println("the value is not present in the array");
        }
        

        //operation:
         System.out.println("operation array");
        int mark[]={1, 2, 3, 4, 5};
        arrayOperation(mark);
        //print our marks
        for (int i=0; i<mark.length; i++){
        System.out.print(mark[i]+" ");
        }
        System.out.println();

        //binary Search :with the time complexity O(log n)
        System.out.println("binary search");
        int[] num1={3 ,6 ,9 ,12 ,15 ,18 ,21};
        System.out.println("index for key  is : "+binarySearch(num1, 12));

          //print Pairs in an array
          System.out.println("print pair in an arrays");
          int num3[]={1,2,3,4,5,6,7};
          PrintPairs(num3);

         //reverse number
         System.out.println("reverse array");
         int num2[]= {4, 8 ,12 ,16 ,20 ,24 ,28};
         reverseArray(num2);

         //printing subarray :kidanas algo
        System.out.println("subarray by kindanas by time complexity: O(n)");
        int num4[]={9,8,7,6,5,4,3};
        kadanasSubarray(num4);

        // create an array of 5 float and calculate their sum

        float [] marks = {56.9f ,76.5f ,87.6f ,65.7f};
        float sum = 0;
        for(float  element:marks){
            sum = sum + element;
        }
        System.out.println("the value of sum is:  "+ sum);

         //3- calculate the array marks from an array containing  marks of all students in the physics using the for each loop
         int [] point ={45,56,67,78,45};
         int sum1 = 0;
         for(int element:point){
             sum1 = sum1 +element;
         } 
         System.out.println("the value of avg marks is: "+(sum1/point.length));

        //linear search
        int mar[]={2,4,6,8,10,12,14,16};
        int key =14;
        int index=linearSearch(mar, key);
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
 // array operation
 public static void arrayOperation(int mark[]){
    for (int i = 0; i<mark.length; i++){
        mark[i]=mark[i]+1;
    }
}

}
