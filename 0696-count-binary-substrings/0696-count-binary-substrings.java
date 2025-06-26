class Solution {
    public int countBinarySubstrings(String s) {
        int prev=0;
        int curren=1;
        int ans=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                curren++;
            }
            else{
                ans+=Math.min(prev,curren);
                prev=curren;
                curren=1;
            }
        }
        ans+=Math.min(prev,curren);
        return ans;
    }
}