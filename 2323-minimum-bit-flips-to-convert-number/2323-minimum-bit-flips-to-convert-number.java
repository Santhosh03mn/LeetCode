class Solution {
    public int minBitFlips(int start, int goal) {
       int a=start^goal;
       return Integer.bitCount(a);
    }
}