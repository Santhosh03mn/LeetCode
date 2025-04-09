class Solution {
    public int removeElement(int[] nums, int val) {
        int slowPointer = 0;
        
        for (int fastPointer = 0; fastPointer < nums.length; fastPointer++) {
            if (nums[fastPointer] != val) {
                nums[slowPointer] = nums[fastPointer];
                slowPointer++;
            }
        }
        
        return slowPointer;
    }
}
