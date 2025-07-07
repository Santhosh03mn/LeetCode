class Solution {
    public int countHillValley(int[] nums) {
        int a=0;
        int ans=nums[0];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]||nums[i]==ans){
                continue;
            }
            if((nums[i]>ans&&nums[i]>nums[i+1])||(nums[i]<ans&&nums[i]<nums[i+1])){
                a++;
            }
            ans=nums[i];
        }
        return a;
    }
}