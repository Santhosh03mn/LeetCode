class Solution {
    public int maximumLength(int[] nums) {
        int even=0,odd=0;
        int aeven=0,aodd=0;
        for(int num : nums){
            int a=num%2;
            if(a==0){
                even++;
                aeven=aodd+1;
            }
            else{
                odd++;
                aodd=aeven+1;
            }
        }
        return Math.max(Math.max(even,odd),Math.max(aeven,aodd));
    }
}