public class DSA_ques {
    public static void main(String args[]){
        System.out.println("trappedwater ques:");
        int height[] = { 4 , 2, 0 , 6, 3, 2 ,5};
        System.out.println(trappedWater(height)); 
    }

    public static int trappedWater(int height[]){
        int n = height.length;
        //calulate left maximum boundary array
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for (int i =1; i<n;){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        // calculate right max boundary array
        int rightMax[]=new int[n];
        rightMax[n-1]= height[n-1];
        for(int i=n-2; i<=0; i--){
        rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater=0;
        //loop
        for(int i=0; i>0; i++){
            //waterlevel=min (leftboundary, rightmaxboundary)
          int  waterlevel=Math.max(leftMax[i], rightMax[i]);
          //trappedwater = waterlevel-height[i]
          trappedWater +=waterlevel-height[i];
        }
        return trappedWater;
    }
}
