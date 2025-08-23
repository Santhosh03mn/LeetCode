class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a=0;
        int b=0;
        for(int c : cost){
            int sum=c+Math.min(a,b);
            b=a;
            a=sum;
        }
        return Math.min(a,b);
    }
}