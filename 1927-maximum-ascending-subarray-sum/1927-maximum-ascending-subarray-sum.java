class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length==0)
        return 0;
        int max=nums[0];
        int currentsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                currentsum+=nums[i];
            }
            else{
                currentsum=nums[i];
            }
            if(currentsum>max){
            max=currentsum;
            }
        }
        return max;
    }
}