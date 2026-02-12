class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length;
        if(n<=1) return 0;
        int start=n-1;
        while(start>0&&nums[start-1]<nums[start]){
            start--;
        }
        return start;
    }
}