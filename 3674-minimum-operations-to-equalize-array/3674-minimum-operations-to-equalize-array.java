class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        if(n<=1) return 0;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[0]){
                return 1;
            }
        }
        return 0;
    }
}