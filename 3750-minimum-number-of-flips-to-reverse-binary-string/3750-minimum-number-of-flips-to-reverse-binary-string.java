class Solution {
    public int minimumFlips(int x) {
        String s=Integer.toBinaryString(x);
        int n=s.length();
        int a=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                a++;
            }
        }
        return a;
    }
}