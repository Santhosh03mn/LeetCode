import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        Map<Integer, Integer> m = new HashMap<>();
        int l2 = nums2.length;
        for (int j = l2 - 1; j >= 0; j--) {
            while (!s.isEmpty() && s.peek() <= nums2[j]) {
                s.pop();
            }
            if (s.isEmpty()) {
                m.put(nums2[j], -1);
            } else {
                m.put(nums2[j], s.peek());
            }
            s.push(nums2[j]);
        }
        int l1 = nums1.length;
        int[] ans = new int[l1];
        for (int i = 0; i < l1; i++) {
            ans[i] = m.get(nums1[i]);
        }
        return ans;
    }
}