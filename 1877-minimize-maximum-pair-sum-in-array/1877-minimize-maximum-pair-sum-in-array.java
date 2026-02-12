class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int maxsum=0;
        int left=0,right=n-1;
        while(left<right){
            int minsum=nums[left]+nums[right];
            maxsum=Math.max(maxsum,minsum);
            left++;
            right--;
        }
        return maxsum;
    }
}