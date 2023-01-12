import java.util.Scanner;
public class tables {
    //write a table of n even number 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of table");
        int t = input.nextInt();
        int i = 1;
        for(i=1; i<=10; i++){
            System.out.printf(" %d * %d = %d \n " ,t,i,t*i);
        }
    }
}
