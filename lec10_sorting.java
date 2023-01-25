public class lec10_sorting {
    //bubble :large element come to the end of array by swapping with adjcent elements.
     public static void main(String args[]) {
        int arr[] = {4,6,7,3,2,1};
        System.out.print(bubbleSort(arr));
     }
     public static boolean bubbleSort(int arr[]){
        //outer loop
        for(int turn=0; turn<arr.length; turn++){
            for(int j =0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return false;

}
public static void printArr(int arr[]){
    for(int i =0; i<arr.length; i++ ){
        System.out.println(arr[i]+" ");
    }
}
    
     
}
