class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int max = 0;
            int p = 0;
            for (; num > 0; num /= 10) {
                max = Math.max(max, num % 10);
                p = p * 10 + 1;
            }
            sum += p * max;
        }
        return sum;
    }
}