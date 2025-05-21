class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n=points.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=points[i][0];
        }
        Arrays.sort(ans);
        int num=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if((ans[i]-ans[i-1])>num){
                num=ans[i]-ans[i-1];
            }
        }
        return num;
    }
}