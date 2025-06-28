class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n=nums.length;
        int[][]ans=new int[n][2];
        for(int i=0;i<n;i++){
            ans[i][0]=nums[i];
            ans[i][1]=i;
        }
        Arrays.sort(ans,(a,b)->b[0]-a[0]);
        int[][]val=Arrays.copyOfRange(ans,0,k);
        Arrays.sort(val,Comparator.comparingInt(a->a[1]));
        int[]res=new int[k];
        for (int i=0;i<k;i++) {
            res[i]=val[i][0];
        }
        return res;
    }
}