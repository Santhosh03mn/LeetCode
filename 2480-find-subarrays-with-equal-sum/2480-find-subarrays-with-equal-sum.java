class Solution {
    public boolean findSubarrays(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=1;i<n;i++){
            int sum=nums[i]+nums[i-1];
            if(set.contains(sum)) return true;
            set.add(sum);
        }
        return false;
    }
}