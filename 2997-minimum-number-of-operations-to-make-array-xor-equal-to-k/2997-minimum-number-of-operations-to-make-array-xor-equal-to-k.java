class Solution {
    public int minOperations(int[] nums, int k) {
        int a=0;
        for(int num : nums){
            a^=num;
        }
        return Integer.bitCount(a^k);
    }
}