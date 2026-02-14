class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        long[]arr=new long[n];
        long max=0;
        long score=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            long val=nums[i]+max;
            score+=val;
            arr[i]=score;
        }
        return arr;
    }
}