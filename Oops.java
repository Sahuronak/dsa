
public class Oops {
     /* concept of oops
     1. Class
     2. Object
     3. Inheritance
     4. Polymorphism
     5. Encapsulation
     6. Abstraction
    */

    // class and objects
     public static void main(String args[] ){
        //constructor
        pen p1 =new pen();
    //created a pen object called p1
    p1.setColor("blue");
    System.out.println(p1.getcolor());
    p1.setTip(3);
    System.out.println(p1.tip);

         // inheritance 
         // Fish shark =  new Fish();
        //  shark.eat();
    //multilevel inheritance 
        Dogs dobby = new Dogs();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);

    // polymorphism
    Calculator calc = new Calculator();
    System.out.println(calc.sum(3, 6));
    System.out.println(calc.sum(1.45,5.73));
    System.out.println(calc.sum(6,5));
    System.out.println(calc.sum(9,8, 7));
    
    Thar t = new Thar();
    t.fuel();


     }
}
//object
class pen{
    //private
     private String color;
     //public
    int tip;
    //getter
    String getcolor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    //setter
    void setColor(String newcolor){
        color= newcolor; 
    }
    void setTip(int newTip){
        tip = newTip;
        //this tip = tip;
    }
}
class student{
    String name ;
    int age;
    float percentage;//cgpa
    void calcPercentage(int phy, int chem, int maths){
        percentage =(phy+chem +maths)/3;
    } 
}
// inheritance
//type- 1.single level inheritance--->animal --fish
//         2. multilevel inheritance----->animal---mammles----dogs
//          3. hierarchial inheritance--->animal---fish,bird,mammles
//          4.hybrid inheritance---->animal-->fish, bird, mammal--->fish---tuna,shark--->>bird--- peacock, crow--->>mammal--dogs ,cats, human
//          5. Multiple inheritance---cats , dogs----> 
//mammals although its not possible by class. we use interface for this inheritance

// base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");

    }
}
// derive class /subclass
// class Fish extends Animal{
//     int  fins;
//     void swim(){
//        System.out.println("swim"); 
//     }
// }
class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("mammles can walks  ");
    }

}
class fish extends Animal{
    int fins;
    void walk(){
        System.out.println("fish can swim  ");
    }

}
class bird extends Animal{
    int feather;
    void walk(){
        System.out.println("birds can fly ");
    }

}
class Dogs extends Mammals{
    String breed;
}
// polymorphism - multiple form with a one form
//1. compile time -- method overloading(static)>>multiple function with the same name with different parameter.

class Calculator{
    int sum (int a,int b){
        return a+b;
    }
    double sum(double d, double e) {
        return d+e;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a ,int b, int c){
        return a+b+c;
    }
}
//2. run time--------method overriding(dynamic)>>parent and child classes both contain the same function with a different definition.
class Car{
    void fuel(){
        System.out.println(" I required fuel for running");
    }
}
class Thar extends Car{
    void high_fuel(){
        System.out.println(" I'm legend will use more fuel");
    } 
}


/* abstraction: Hiding all the unnecessary  details and showing only the important parts to the user.
--->abstract classes  ---->interface

*/

