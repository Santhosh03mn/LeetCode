class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int a=0;
        int b=0;
        int max=0;
        while(a<s.length&&b<g.length){
            if(s[a]>=g[b]){
                max++;
                a++;
                b++;
            }
            else{
                a++;
            }
        }
        return max;
    }
}