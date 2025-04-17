class Solution {
    public boolean hasSameDigits(String s) {
        int n=s.length();
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=s.charAt(i)-'0';
        }
        while(n>2){
            for(int i=0;i<n-1;i++){
                ans[i]=(ans[i]+ans[i+1])%10;
            }
            n--;
        }
        return ans[0]==ans[1];
    }
}