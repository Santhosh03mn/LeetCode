class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int total=0;
        for(int num : nums){
            total+=num;
        }
        List<Integer>list=new ArrayList<>();
        int ans=0;
        for(int i=nums.length-1;i>=0;i--){
            ans+=nums[i];
            list.add(nums[i]);
            total-=nums[i];
            if(ans>total){
                break;
            }
        }
        return list;
    }
}