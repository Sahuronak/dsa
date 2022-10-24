public class seventh_advancepattern {
    // advance pattern of java
    public static void main(String args[]) {
        hollowRectangle(5, 7);
        invertedRotatedHalfPyramid(8);
        invertedHalfPyramid(5);
        floysTriangle(5);
        zeroOneTriangle(7);
        
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
}
