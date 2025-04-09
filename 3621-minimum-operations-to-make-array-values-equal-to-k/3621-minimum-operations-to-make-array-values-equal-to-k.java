class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if( set.contains(nums[i])){}
                else{
                    set.add(nums[i]);
                    if(nums[i]>k){
                    count++;
                    }
                else if(nums[i]==k){}
                else{
                    return -1;
                }
            }
        }
        return count;
    }
}