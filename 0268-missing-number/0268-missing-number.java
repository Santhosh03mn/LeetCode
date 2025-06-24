class Solution {
    public int missingNumber(int[] nums) {
    int n=nums.length;
    int sum1=0;
    int sum2=(n*(n+1))/2;
    for(int num: nums){
        sum1+=num;
    }
    return sum2-sum1;
    }
}
