public class array_ques {
    public static void main(String[] args){
 // problem :1  create an array of 5 float and calculate their sum
         
        float [] marks = {56.9f ,76.5f ,87.6f ,65.7f};
        float sum = 0;
        for(float  element:marks){
            sum = sum + element;
        
        }
        System.out.println("the value of sum is:  "+ sum);
        
        // write a program to find out whether a given integers is present in an array or not .
        int  [] number = {56 ,76 ,88 ,65};
        float num = 76;
        boolean isInArray = false;
        for(int element:number){
            if(num==element){
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
        
        //3- calculate the array marks from an array containing  marks of all students in the physics using the for each loop
        int [] point ={45,56,67,78,45};
        int sum1 = 0;
        for(int element:point){
            sum1 = sum1 +element;
        } 
        System.out.println("the value of avg marks is: "+sum/point.length);
        
        // 4- create a java program to add two matrices of sign 2x3
        int [][] mat1 ={{1, 2, 3},{4, 5, 6}};
        int [][] mat2 = {{22 ,33, 44},{99, 88, 77}};
        int [][] result = {{0, 0, 0},{0, 0, 0}};

        for(int i=0; i<mat1.length; i++){//row number of times
            for(int j=0; j<mat1[i].length; j++){//column number of times
                System.out.print(result[i][j] );

                result[i][j]= mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        } 
        //5- to reverse an array with the help of java program:
    //     int[] arr = {1,2,3,4,5,6,7,8};
    //     int l = arr.length;
        
    //     int n = Math.floorDiv(l, 2);
    //     int tem;
    //     for(int i=0; i<n; i++){
    //         //swap a[i] and a[l-1-i]
    //         //a b temp
    //         tem = arr[i];
    //         arr[i] = arr[l-1-i];
    //         arr[l-1-i]= tem;
    //     }
    //    for(int element:arr){
    //     System.out.println(element);

       
      // }
       //ques-6 write a java program to find the maximum element in the array.
    //         int [] arr = {1,3,4,5,6,8,7,9};
    //         int max =0;
    //         for(int e:arr){
    //             if(e>max){
    //                 max =e;
    //             }
    //         }
    //         System.out.println("the value of maximum in array is: "+ max);
    // }
    //     int[] arr = {645,643,656,243,543};
    //     int min = (Integer.MAX_VALUE);
    // for(int e:arr){
    //     if(e<min){
    //         min =e;
            
    //     }
    // }
    // System.out.println("the minimum value in array is: "+ min);
    // }
        //que-7 - write a java program to find  whether an array is sorted or not
    boolean isSorted = true;
    int[] a = {43,98,65,76,87,99};
    for(int i =0; i<a.length-1; i++){
        if(a[i]> a[i+1]){
        isSorted = false;
        break;
        }
       
    }
    if(isSorted){
        System.out.println("the array is sorted " );

    }
    else{
        System.out.println("the array is not sorted");
    }
    }  
    
}
