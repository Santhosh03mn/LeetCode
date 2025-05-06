class Solution {
    public int[] shortestToChar(String s, char c) {
        int[]ans=new int[s.length()];
        int a=-s.length();
        for(int i=0;i<s.length();i++){
            if(c==s.charAt(i))
            a=i;
            ans[i]=Math.abs(i-a);
        }
        for(int i=a-1;i>=0;i--){
            if(c==s.charAt(i))
            a=i;
            ans[i]=Math.min(ans[i],a-i);
        }
        return ans;
    }
}