import java.util.Scanner;
public class number_display {
    public static void main(String args[]){
        //enter the number number till the  user want to give input
    // and end should be display the count of positive negative and zero
    int positive = 0 ,negative=0 ,zero=0;
    System.out.println("press 1 to continue and 0 to stop");
    Scanner sc= new Scanner(System.in);
    int input= sc.nextInt();
    while(input == 1){
        System.out.println("enter your your number");
        int number=sc.nextInt();
        if (number>0){
            positive++;
        }
        else if(number<0){
        negative++;
        }
        else{
        zero++;
        }
    System.out.println("press 1 to confirm or 0 to stop");
    input =sc.nextInt();
    System.out.println("positive:"+ positive );
    System.out.println("negative:"+ negative);
    System.out.println("zeros"+zero);
    }
    System.out.println("enter number for series"); 
    int c=sc.nextInt();
    int a = 0 , b=1;
    System.out.println(a + " ");
    if(c>1){
        for (int i =2; i<=c; i++){
            System.out.println(b+" ");
            int temp =b;
            b = a+b;
            a = temp;
        }
        System.out.println();
    }
}
}
