class Solution {
    public int minSteps(String s, String t) {
        int[]a=new int[26];
        int[]b=new int[26];
        for(char c : s.toCharArray()){
            a[c-'a']++;
        }
        for(char c : t.toCharArray()){
            b[c-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            count+=Math.abs(a[i]-b[i]);
        }
        return count/2;
    }
}