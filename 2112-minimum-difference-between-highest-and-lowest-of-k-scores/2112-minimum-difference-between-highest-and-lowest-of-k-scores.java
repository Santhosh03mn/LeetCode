class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=0;
        int m=k-1;
        int min=Integer.MAX_VALUE;
        while(m<nums.length){
            int diff=nums[m]-nums[n];
            min=Math.min(min,diff);
            n++;
            m++;
        }
        return min;
    }
}