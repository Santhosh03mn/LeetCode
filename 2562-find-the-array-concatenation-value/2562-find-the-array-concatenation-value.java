class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i=0,j=nums.length-1;
        long res=0;
        while(i<j){
            int first=nums[i];
            int last=nums[j];
            int fact=1;
            int temp=last;
            while(temp!=0){
                fact*=10;
                temp/=10;
            }
            long cat=(long)first*fact+last;
            res+=cat;
            i++;
            j--;
        }
        if(i==j){
            res+=nums[i];
        }
        return res;
    }
}