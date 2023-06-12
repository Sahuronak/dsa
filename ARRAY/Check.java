import java.util.* ;
import java.io.*; 
class Check {
	
	public static void main(String args[]) {
		
		int P;
		 float R;
		 int T;
		Scanner input = new Scanner(System.in);
		P = input.nextInt();
		R = input.nextFloat();
		T = input.nextInt();
		float SI= (P*R*T)/100;
		System.out.print(SI);
		
		
	}
} 
