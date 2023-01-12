
public class pattern_question {
    public static void main (String[] args){
        /*
         print the pattern
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        
        int a = 4;
        int b = 5;

        for( int i=1; i<=4; i++){
            for( int j=1; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //ques:2- print the pattern
        /*
         * * * * *
         *       *
         *       *
         * * * * *
         */
        System.out.println("here is the second patern");
         int c = 4;
         int d = 5;
         for(int i=1; i<=c; i++){
            for(int j=1; j<=d; j++){
                if (i==1||j==1||i==c||j==d){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
         }
         System.out.println("this is the third question");
         /*ques-3 print the following pattern
          * 
          * *
          * * *
          * * * *
          */
          int e = 4;
          //outer loop
          for (int i = 1; i<=e; i++){
            //inner loop
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
          }
          System.out.println("print the fouth pattern that given below");
          /* print
           * * * *
           * * *
           * *
           * 
           */
          int f= 4;
          //outer loop
          for( int i=4; i<=1; i--){
            //inner loop
            for( int j=4; j<=1; j++){
                System.out.print("*");

            }
            System.out.println();

          }
          System.out.println("print the fifth question pattern");
          /*
                *
              * *
            * * *
          * * * *    
           */
          int g= 4;
          for( int i= 1; i<=4; i++){
            //inner loop for space
            for( int j=1; j<=g-1; j++){
                System.out.print(" ");

            }
            //for stars
            for(int j=1; j<=g; j++){
                System.out.print("*");
            }
            System.out.println();
          }
          System.out.println("print the sixth question");
          /*
           1
           1 2
           1 2 3
           1 2 3 4
           1 2 3 4 5
           */
          int h = 5;
        
          for(int i =1; i<=5; i++){
            //inner loop
            for (int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
          }
          System.out.println("print another seventh que pattern given below");
        /*
        * 1 2 3 4 5
        * 1 2 3 4
        * 1 2 3 
        * 1 2 
        * 1
        */
        int k= 5;
        //outer loop
          for(int i=1; i<=k; i++){
            //inner loop
            for(int j= 1; j<=k-i+1; j++){
                System.out.print(j+" ");
            
            }
            System.out.println();
          }
          System.out.println("here is the eighth question ");
          /*
           * 1
           * 2  3
           * 4  5  6
           * 7  8  9  10
           * 11 12 13 14 15
           */int l= 5;
           int number= 1;
           //outer loop 
          for (int i= 1; i<=l; i++){
            //inner loop
            for( int j = 1; j<=i; j++){
                System.out.print(number+"  ");
               number++; // number +1
            }
            System.out.println();
           }
           System.out.println("print the nineth pattern:");
           /*
             0
             0 1
             1 0 1 
             0 1 0 1
             1 0 1 0 1
            */
            int m = 5;
            //outer loop
            for(int i= 1; i<=m; i++){
              for (int j= 1; j<=i; j++){
                int sum =i+j;
                //even number
                if (sum%2==0){
                  System.out.print("1 ");
                }
                //odd number
                else{
                  System.out.print("0 ");
                }
              }
              System.out.println();
            }
        //advance pattern
        System.out.println("print the tenth advance pattern"); 
        /*
            1 2 3 4 5 6 7 8 9
                    * * * * *     i=1 4-space  5-star 
                  * * * * *       i=2 3-space  5-star
                * * * * *         i=3 2-space  5-star
              * * * * *           i=4 1-space  5-star
            * * * * *             i= 5 0-space 5-star 
         */
        int n=5;

        for(int i =1; i<=n; i++){
          //space
          for(int j=1; j<=n-i; j++){
            System.out.print(" ");
          }
          //star
          for(int j =1; j<=5; j++){
            System.out.print("*");
          }
          System.out.println();

        }


        
    }
}
