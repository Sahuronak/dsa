public class Oops {
    // class and objects
     public static void main(String args[] ){
        //constructor
        pen p1 =new pen();
    //created a pen object called p1
    p1.setColor("blue");
    System.out.println(p1.getcolor());
    p1.setTip(3);
    System.out.println(p1.tip);




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
