class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n=nums.size();
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums.get(i);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ans[i]+ans[j]<target){
                    sum++;
                }
            }
        }
        return sum;
    }
}