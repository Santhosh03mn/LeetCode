class Solution {
    public int countElements(int[] nums) {
        int n=nums.length;
        if(n<3) return 0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int x : nums){
            if(x<min) min=x;
            if(x>max) max=x;
        }
        int count=0;
        for(int x : nums){
            if(x>min&&x<max){
                count++;
            }
        }
        return count;
    }
}