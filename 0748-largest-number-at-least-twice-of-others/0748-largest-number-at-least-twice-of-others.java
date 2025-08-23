class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                a=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=a&&2*nums[i]>max){
                return -1;
            }
        }
        return a;
    }
}