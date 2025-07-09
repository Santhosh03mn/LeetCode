class Solution {
    public int largestCombination(int[] candidates) {
        int sum=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int ans : candidates){
                if((ans&(1<<i))!=0){
                    count++;
                }
            }
            sum=Math.max(sum,count);
        }
        return sum;
    }
}