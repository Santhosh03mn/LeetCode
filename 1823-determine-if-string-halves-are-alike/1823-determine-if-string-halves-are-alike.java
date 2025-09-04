class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int n = s.length() / 2;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) count++;
            if (vowels.indexOf(s.charAt(i + n)) != -1) count--;
        }
        return count == 0;
    }
}
