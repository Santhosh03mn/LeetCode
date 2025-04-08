class Solution {
    public int findPermutationDifference(String s, String t) {
       HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), i);
        }
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), i);
        }
        int diff = 0;
        for (char c : s.toCharArray()) {
            diff += Math.abs(sMap.get(c) - tMap.get(c));
        }
        return diff;
    }
}