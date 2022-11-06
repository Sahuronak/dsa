public class DSA_ques {
    public static void main(String args[]){
        System.out.println("trappedwater ques:");
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("the height of trapped water is: "+trappedWater(height));
        
        System.out.println("buy and sell stock");
        int price[]= {7,1,5,3,6,4};
        System.out.println(BuySellStock(price));
    }
    public static int trappedWater(int height[]){
        int n = height.length;
            //auxiliary array :the helper array are called auxiliary array
            //left max boun.- |4|4|4|6|6|6|6|
            //right max boun.-|6|6|6|6|5|5|5|
        //calulate left maximum boundary array
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for (int i =1; i<n; i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        // calculate right max boundary array
        int rightMax[]=new int[n];
        rightMax[n-1]= height[n-1];
        for(int i=n-2; i>=0; i--){
              rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater=0;
        //loop
        for(int i=0; i<n; i++){
            //waterlevel=min (leftboundary, ri{ghtmaxboundary)
          int  waterlevel=Math.max(leftMax[i], rightMax[i]);
          //trappedwater = waterlevel-height[i]
          trappedWater +=waterlevel-height[i];
        }
        return trappedWater;
    }
    public static int BuySellStock(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit =0;
        for (int i=0; i<price.length; i++){

            if(buyprice<price[i]){
              int profit =price[i] - buyprice;//todays profit
              maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyprice=price[i];
            }
        }
        return maxProfit;

    }
}
