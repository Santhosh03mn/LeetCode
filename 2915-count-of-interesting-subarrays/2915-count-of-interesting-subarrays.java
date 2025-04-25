import java.util.*;

public class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        long result = 0L;
        int prefixMod = 0;
        Map<Integer, Long> freq = new HashMap<>(nums.size() * 2);
        freq.put(0, 1L);
        for (int x : nums) {
            if (x % modulo == k) {
                prefixMod = (prefixMod + 1) % modulo;
            }
            int target = (prefixMod - k + modulo) % modulo;
            result += freq.getOrDefault(target, 0L);
            freq.put(prefixMod, freq.getOrDefault(prefixMod, 0L) + 1);
        }
        return result;
    }
}