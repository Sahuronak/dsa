
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
            System.out.println("key is at index"+ index);
        }
        // //linear: string
        // String stringlist[] = {"munch", "kit-kat", "dailymilk","five-star"};
        // String keys="munch";

    //binary Search :with the time complexity O(log n)
            System.out.println("binary search");
                    int[] num1={3 ,6 ,9 ,12 ,15 ,18 ,21};
                    System.out.println("index for key  is: "+binarySearch(num1, 12));

     //reverse number 
     System.out.println("reverse array");
        int num2[]= {4, 8 ,12 ,16 ,20 ,24 ,28};
        reverseArray(num2);
        //print 
        for (int i=0; i<num2.length; i++){
            System.out.println(num2[i]+" ");
        }
        System.out.println();
        
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
    
    
}

    