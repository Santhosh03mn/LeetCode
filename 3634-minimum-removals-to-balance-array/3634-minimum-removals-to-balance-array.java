class Solution {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        if(n<=1) return 0;
        Arrays.sort(nums);
        int left=0;
        int max=1;
        for(int i=0;i<n;i++){
            if(left<=i&&(long)nums[i]>(long)nums[left]*(long)k){
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return n-max;
    }
}