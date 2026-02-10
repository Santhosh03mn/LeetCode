class Solution {
    public int longestBalanced(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(n-i<=max) break;
            Set<Integer>set=new HashSet<>();
            int even=0;
            int odd=0;
            for(int j=i;j<n;j++){
                int x=nums[j];
                if(set.add(x)){
                    if((x&1)==0){
                        even++;
                    }
                    else{
                        odd++;
                    }
                }
                if(even==odd){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}