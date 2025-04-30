class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int leftsum=0;
        for(int num : nums){
            sum+=num;
        }
        for(int i=0;i<nums.length;leftsum+=nums[i++]){
            if(leftsum*2==sum-nums[i])
            return i;
        }
        return -1;
    }
}