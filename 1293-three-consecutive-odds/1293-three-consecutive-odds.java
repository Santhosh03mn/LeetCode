class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int oddcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                oddcount++;
            }
            else{
                oddcount=0;
            }
            if(oddcount==3){
                return true;
            }
        }
        return false;
    }
}