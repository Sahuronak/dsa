import java.util.Scanner; 
public class conditional {
    public static void main (String args[]){
         // // condition statement
            //1. if else
            //2. else if
            //3.switch

            //syntax of if-else condition
            // if (condition){
            //     //code
            // }

         Scanner input = new Scanner(System.in); {
        //ques:1- ellgible for vote and driving after 18 using if -else:
        System.out.println("tell me your age");
        int age = input.nextInt();
        if((age>=18)&&(age<100)){
            System.out.println("hey \n you are above 18 \n eligible for vote and driving");
        }
        else{
            System.out.println("you are not eligible yet");
        }
        //ques 2. print the largest of 2number:
        System.out.println("give me two number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1==num2){
            System.out.println("num1 is equal to num2");
        }
        else if(num1 >=num2){
            System.out.println("num1 is greater than num2");
        }
        else{
            System.out.println("num2 is greater than num1");
        }
        //ques1: write a java program to get number from the user and print whether it is positive or negative

        System.out.println(" whether the number is positive or negative");
        int n=input.nextInt();
        if(n<0){
        System.out.println("negative");

        }
         else{
        System.out.println("positive");
         }

        // ques 3: print if the number is odd or even
        System.out.println("your number for odd or even for");
        int number= input.nextInt();
               if(number%2==0){
            System.out.println("this is a even number");
        }
        else{
            System.out.println(" this is odd number");
        }
        //syntax of else if statement:
        // if(condition){
        //     //code
        // }
        // else if(condition){
        //     //code
        // }
        // else{
        //     //code
        // }

        //ques 4:income tax of calculate income<5l have to pay tax, income > 10l have to pay 20% tax, income more than 20L have to pay 30% taxes
        System.out.println("will you please enter income for tax");
            float tax = 0;
        System.out.println("enter your income");
        float income = input.nextFloat();
        if (income<2.5){
                tax = tax +0;
            System.out.println("tax is not impose on you");

        }else if(income>2.5f && income<5f){
            tax = tax + 0.05f * (income - 2.5f);
        }else if(income>5f && income<10.0f) {
            tax = tax + 0.05f * (5.0f -2.5f);
            tax = tax + 0.05f * (income - 5.0f);
         }else if (income>10.0f){
            tax = tax + 0.05f * (5.0f -2.5f);
            tax = tax + 0.05f * (10.0f -5.0f);
            tax = tax + 0.05f * (income - 10.0f);

        }
         System.out.println("the total tax Paid to the system is :"+ tax);


         }
        // ques 5: print largest of 3 number
        System.out.println("enter threee number");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if((a>=b)&&(a>=c)){
            System.out.println("print a: "+ a);
        }
        else if(b>=c){
            System.out.println("print b:"+ b);
        }
        else{
            System.out.println("print c: "+ c);
        }

        //ques 6: whether the student is pass or fail
        System.out.println("insert your marks");
        int marks=input.nextInt();
        String reportcard =((marks>=33)&&(marks<100))?"pass":"fail";
        System.out.println(reportcard);


        //ques 7: Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
        System.out.println(" here is the fever temperature");
        double temp = input.nextInt();
        if(temp>100){
            System.out.println("suffering from fever ");
        }else{
            System.out.println(" I don't  have fever");
        }
        }
        }



