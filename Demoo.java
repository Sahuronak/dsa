import java.util.*;
public class Demoo {
    static Scanner sc = new Scanner(System.in);
    
	 int ary[]= new int[10];// intilizing the size
	void array() {

		System.out.println("please enter the value");


		for (int i = 0; i<10; i++) {
		    ary[i]=sc.nextInt();

		}
		System.out.println("enter array list");
	}
    void print() {
        for (int i = 0; i<10; i++) {
        System.out.println("ary"+" index is-"+" " +ary[i]);
    }

}
public static void main(String[] args) {
    Demoo obj= new Demoo();
    obj.array();
    obj.print();
    

}

}



