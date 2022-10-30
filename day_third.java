import java.util.Scanner; 
public class day_third {
    public static void main (String args[]){

    try (Scanner input = new Scanner(System.in)) {
        //ques:1- elegible for vote and driving after 18 using if -else:
        System.out.println("tell me your age");
        int age = input.nextInt();
            
        if(age>=18){
            System.out.println("hey \n you are above 18 \n eligible for vote and driving");
        }
        else{
            System.out.println("you are not eligible yet");
        }
        //ques 2. print the largest of 2number:
        System.out.println("give me two number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 >=num2){
            System.out.println("num1 is greater than num2");
        }
        else{
            System.out.println("num2 is greater than num1");
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
        // if(consition){
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
        int income = input.nextInt();
        if( income < 500000){
            System.out.println(" there is no charges for your income");
        }
        else if(income >= 500000 && income<=100000){
            System.out.println("your tax is:"+ (income*0.2));
        }
        else{
            System.out.println("your income tax is :"+ (income*0.3));
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
        String reportcard =(marks>=33)?"pass":"fail";
        System.out.println(reportcard);
    }

    
    // // condition statement
    // //1. if else
    // //2. else if 
    // //3.switch
    
    // //syntex of if-else condition
    // if (condition){
    //     //code
    // }

    
    }
}

