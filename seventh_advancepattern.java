public class seventh_advancepattern {
    // advance pattern of java
    public static void main(String args[]) {
        System.out.println("this is hollowrectangle");
        hollowRectangle(5, 7);
        System.out.println("this is inverted rotated half pramid");
        invertedRotatedHalfPyramid(8);
        System.out.println("this is a half pyramid");
        invertedHalfPyramid(5);
        System.out.println("this is FLOYD'S triangle");
        floysTriangle(5);
        System.out.println("this is zero triangle");
        zeroOneTriangle(7);
        System.out.println("this is solid rhombus");
        solidRhombus(5);
        System.out.println("this is hollow rhombus");
        hollowRhombus(5);
        System.out.println("this is a diamond");
        diamond(5);
        
    }
    public static void hollowRectangle( int row , int col){
        //outer loop-rows
        for (int i = 1; i<=row; i++){
            //inner loop 
            for(int j =1; j<=col; j++ ){
                if(i == 1 || i== row || j==1 ||j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void invertedRotatedHalfPyramid(int n) {
        for(int i= 1; i<=n; i++){
            //inner loop 
            //space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for( int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

    }
        
    }
    public static void invertedHalfPyramid(int n) {
        //outer loop
        for (int i = 1; i<=n; i++){
            //inner loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
        
    }
    public static void floysTriangle(int n) {
      int counter =1;
      for(int i= 1; i<=n; i++){
        //inner loop
        for(int j=1; j<=i; j++){
        System.out.print(counter + " "); 
        counter++;
        }
        System.out.println();
      }  
       
    }
    public static void zeroOneTriangle(int n) {
        //outer loop
        for (int i = 1; i<=n; i++){
            //inner loop
            for (int j= 1; j<=i; j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        
    }
    public static void solidRhombus(int n){
        //outer loop 
        for (int i=1; i<=n; i++){
            //inner loop
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowRhombus(int n){
        //outer loop 
        for(int i = 1; i<=n; i++){
            //inner loop for spaces
            for(int j=1; j<=n-i; j++ ){
                System.out.print(" ");
            }
            //for starsand there boundary
            for(int j=1; j<=n; j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        //outer loop
        for(int i = 1; i<=n; i++){
            //inner loop
            //spaces
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*n-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    } 
}
