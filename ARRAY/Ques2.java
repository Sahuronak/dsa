public class Ques2 {
    // reverse the array
    public static void reverse(int number[]){
        int first =0, last=number.length-1;
        while(first<last){
            int temp = number[first];
            number[first]= number[last];
            number[last]=temp;
            first++;
            last--;
        }
      
    }
    public static void main(String args[]){
        int  number[]={34,2,5,33,56,98,78,55};
        reverse(number);
        for(int i =0; i<number.length; i++){
            System.out.print((number[i])+" ");
        }

    }
}
