
public class Bitwise_operator {
    public static void main(String args[]) {
        int x = 0b1010;
        int y = 0b0110;
        int a = x<<1;
        System.out.println("x left shift: "+a);
        int b =y<<1;
        System.out.println("y left shift of y: "+b);
        int c = x>>1;
        System.out.println("x right shift by: "+c);
        int d = y>>1;
        System.out.println("y right shift y :"+d);
        int z = x&y;
        System.out.println("x and y is:"+z);
        int r=x|y;
        System.out.println("x or y is:"+r);
        int s=x^y;
        System.out.println("x not y is"+s);
       
       
        
    }
}
