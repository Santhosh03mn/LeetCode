class Solution {
    public int maxSubArray(int[] nums) {
       int sum=nums[0];
       int num=0;
       for(int n : nums){
        if(num<0){
            num=0;
        }
        num+=n;
        sum=Math.max(sum,num);
       }
       return sum;
    }
}