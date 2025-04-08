class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=nums.length-1;i>=0;i--){
            if(!set.add(nums[i])){
                return(i+1+2)/3;
            }
        }
        return 0;
    }
}