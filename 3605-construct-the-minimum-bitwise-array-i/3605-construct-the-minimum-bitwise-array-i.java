class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=nums.get(i);j++){
                if((j|(j+1))==nums.get(i)){
                    ans[i]=j;
                    break;
                }
            }
            if(ans[i]==0){
                ans[i]=-1;
            }
        }
        return ans;
    }
}