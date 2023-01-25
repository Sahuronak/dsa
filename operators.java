public class operators {
    public static void main(String args[]){
        // typecasting : forcefully conversion of one datatype to another is called typecasting
        // typecasting : forcefully conversion of one datatype to another is called typecasting
        System.out.println("sum of int and float integer");
        float a = 10.56f;
        int n = 20;
        int b = (int)(a+n);
        System.out.println(b);

        System.out.println("product of long and short");
        long f=45;
        short g = 564;
        float i=(int)(f*g);
        System.out.println(i);

        System.out.println("the subtraction of float and char");
        float s = 90.4f;
        char q = 'n';
        float r = (char)(q-s);
        System.out.println((int)(q));
        System.out.println(r);


        /*typepromotion in expression
        1. java automatically promotes each byte short or char operand to int when evaluting an expression
        2. if onr operand is long , float , double the whole expression promoted to long float or double respectively.*/ 
        System.out.println("typepromotion of elements");
        char z ='r';
        char x = 'n';
        System.out.println((int)(z));
        System.out.println((float)(x));
        System.out.println(x/z);

        // operators in java:
        /* symbol that tell compiler to perform some operation on operands 
         * type of operator are:*/
        
         // 1. arthimetic operator:
        //  binary operator
        int v  = 22;
        int w = 33;
        System.out.println("add: "+v+w);
        System.out.println("sub: "+ (w-v));
        System.out.println("product: "+(w*v));
        System.out.println("divide: "+(w/v));
        System.out.println("modulo: "+ (w%v));
        
        // unary operator:
        System.out.println("pre increment");
        System.out.println(++v);    //pre increment-value change then value use.
        System.out.println(++w);
        System.out.println("post increment:");
        System.out.println(v++);    // post increment- value use then use
        System.out.println(w++);

        System.out.println("pre decrement: ");
        System.out.println(--v);
        System.out.println(--w);    //pre decrement-value change then value use.
        System.out.println("post decrement: ");
        System.out.println(v--);
        System.out.println(w--);    //post decrement-value change then value use.
        
        //relational operator
        System.out.println(v==w);
        System.out.println(v!=w);
        System.out.println(v>w);
        System.out.println(v<w);
        System.out.println(v>=w);
        System.out.println(v<=w);
       
        // assignment operator
        v+=w;
        System.out.println(v);
        v-=w;
        System.out.println(v);
        v*=w;
        System.out.println(v);
        v/=w;
        System.out.println(v);
        // bitwise operator: these are also exit in the  operator.

        //que1: in a program input 3 number : A,B and C ypu have to output the average these 3 number 
        int m= 34;
        int p = 45;
        int c = 99;
        int avg= (m+p+c)/3;
        System.out.println("average:"+avg);

        //ques2: in program ,input the side of square you have to output the area of the square 
         int side= 5;
         int area= side*side;
         System.out.println("area:"+area);

         //ques3: enter cost of 3 iteam from the user  in a float a pencil, a pen ,ans an eraser. you have to output the total cost of the iteam back to the user as the bill.
         float pen =5.0f;
         float pencil=4.0f;
         float eraser = 6.0f;
         int sumation = (int)(pen + pencil + eraser);
         System.out.println("sum of stationary:"+sumation);
        
         // find the area of the triangle
         int B= 10;
         float h =20.8f;
         float areaOfTriangle = (B*h)/2;
         System.out.println("area of triangle: "+areaOfTriangle);
        int sideA= 5;
        int sideB =6;
        int sideC= 8;
        int parameterside=(sideA+sideB+sideC)/2;
        double areaoftriangle =Math.sqrt(parameterside*(parameterside - sideA)*( parameterside - side)*(parameterside - sideC));
        System.out.println("area of anothe triangle"+areaoftriangle);

        // this is the root of the quadratic equation:
        int a1, b1,c1;
        a1=1;
        b1=-4;
        c1=4;
        double r1,r2;

        r1 =((-b1)+Math.sqrt((b1*b1)-4*a1*c1))/(2*a1);
        r2=((-b1)-Math.sqrt((b1*b1)-4*a1*c1))/(2*a1);
        System.out.println("the root of quadratic equation is: "+r1+" "+r2);

        // printing the cuboid
        int length=2;
        int breadth =3;
        int height =4;
        int areaOfRectangle =length*breadth;
        System.out.println("area of rectangle: "+ areaOfRectangle);
        int parameterOfrectangle =2*(length*breadth);
        System.out.println("parameter of rectangle: "+ parameterOfrectangle);
        int volumeOfCuboid =length*breadth*height;
        System.out.println("volume of cuboid: "+ volumeOfCuboid);

        

    }
}
