class Solution {
    public int smallestNumber(int n) {
        int sum=1;
        while(sum<n){
            sum=sum*2+1;
        }
        return sum;
    }
}