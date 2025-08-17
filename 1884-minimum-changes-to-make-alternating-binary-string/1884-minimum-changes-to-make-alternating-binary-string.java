class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int a = 0; 
        int b = 0; 
        for (int i = 0; i < n; i++) {
            char ch1 = (i % 2 == 0) ? '0' : '1';
            char ch2 = (i % 2 == 0) ? '1' : '0';
            if (s.charAt(i) != ch1) a++;
            if (s.charAt(i) != ch2) b++;
        }
        return Math.min(a, b);
    }
}
