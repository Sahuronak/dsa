public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        // Student s2 = new Student(" sakshi");
        // Student s3 = new Student(123);
        s1.name= "sahu";
        s1.roll = 423;
        s1.password ="sdfsf";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2 = new Student(s1);//copy
        s2.password = "fds";
        s1.marks[2]=100;
        // reference copy 
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
    class Student{
        String name;
        int  roll;
        String password;
        int marks[];
        // shallow copy constructor
        // Student(Student s1){
        //     marks= new int[3];
        //     this.name = s1.name;
        //     this.roll = s1.roll;
        //     this.marks=s1.marks;

        // }
        //deep copy constructor
        Student (Student s1){
            marks = new int [3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i=0; i<marks.length; i++){
                this.marks[i]=s1.marks[i];
            }
        }

        // non parametrized
        Student() {
            marks= new int[3];
            System.out.println("sakshi"); 
        }
        // parametrized 
        Student(String name){
            marks= new int[3];
            this.name = name;
        }
        Student(int roll){
            marks= new int[3];
            this.roll = roll;
        }


    }

    //type of constructor
    //1. non parameterized
    //2. parameterized
    //3. copy constructor

    
    //default  constructor gets called during the time of object creation and its job is to intialse  the member variables with the default value of their datatype.
    // default constructor is a special method that has the same name as the class name it can have parameter list , it can also have return type but we don't specify the return type .
    //in the default constructor JVM intialize the default value of the datatype.
// destructor: there is a garbage collector so there is no need to destructor any code.

