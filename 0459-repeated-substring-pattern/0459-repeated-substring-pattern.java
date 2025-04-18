class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String ans = doubled.substring(1, doubled.length() - 1);
        return ans.contains(s);
    }
}