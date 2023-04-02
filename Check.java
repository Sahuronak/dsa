public class Check {
    /*find the subarray with largest sum and return its sum */
    public static int maxArray(int []nums){
        int n= nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            max=Math.max(sum, max);
            if (sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static int[] twoSum(int []nums , int target){
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }

            }
        }
        return new int [] {};
    }
    public static void main(String args[]){
        int nums[]={2,3,4,6,8};

        System.out.println( maxArray(nums));
        System.out.println(twoSum(nums, 9));
       
    }
}
