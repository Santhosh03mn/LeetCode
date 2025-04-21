class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long sum=0;
        long min=0;
        long max=0;
        for(int num : differences){
            sum+=num;
            if(sum<min){
                min=sum;
            }
            else if(sum>max){
                max=sum;
            }
        }
        long range=(long)upper-lower;
        long ans=(long)range-(max-min)+1;
        return ans>0 ? (int) ans:0;
    }
}