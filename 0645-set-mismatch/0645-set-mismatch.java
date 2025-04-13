class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        Set<Integer> seen = new HashSet<>();
        int dup = -1;
        int actualSum = 0;
        for (int num : nums) {
            if (seen.contains(num)) {
                dup = num;
            }
            seen.add(num);
            actualSum += num;
        }
        int miss = expectedSum - (actualSum - dup);
        return new int[]{dup, miss};
    }
}