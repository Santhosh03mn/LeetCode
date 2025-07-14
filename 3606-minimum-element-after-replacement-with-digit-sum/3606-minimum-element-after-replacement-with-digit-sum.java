class Solution {
    public int minElement(int[] nums) {
        int ans=0;
        for(int num : nums){
            int sum=0;
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            nums[ans++]=sum;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}