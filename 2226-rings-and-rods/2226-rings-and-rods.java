class Solution {
    public int countPoints(String rings) {
        int[] masks = new int[10];
        int n = rings.length();
        for (int i = 0; i < n; i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';
            int maskValue = 0;
            if (color == 'R') {
                maskValue = 1;  
            } else if (color == 'G') {
                maskValue = 2; 
            } else if (color == 'B') {
                maskValue = 4;  
            }
            masks[rod] |= maskValue;
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (masks[i] == 7) {
                count++; 
            }
        }
        return count;
    }
}