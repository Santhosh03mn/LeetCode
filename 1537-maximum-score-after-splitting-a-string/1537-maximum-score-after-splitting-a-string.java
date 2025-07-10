class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++)
        if(s.charAt(i)=='1')
        ans++;
        int sum=0;
        int max=0;
        for(int i=0;i<n-1;i++){
        if(s.charAt(i)=='0')
        sum++;
        else
        ans--;
        max=Math.max(max,sum+ans);
        }
        return max;
    }
}