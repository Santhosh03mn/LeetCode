class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer>set=new HashSet<>();
        int left=0,csum=0,msum=0;
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[left]);
                csum-=nums[left];
                left++;
            }
            set.add(nums[i]);
            csum+=nums[i];
            msum=Math.max(msum,csum);
        }
        return msum;
    }
}