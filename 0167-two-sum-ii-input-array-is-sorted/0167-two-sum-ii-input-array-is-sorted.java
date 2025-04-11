class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[]res=new int[2];
        while(i<j){
            int x=numbers[i]+numbers[j];
            if(x<target){
                i++;
            }
            if(x>target){
                j--;
            }
            if(x==target){
                res[0]=i+1;
                res[1]=j+1;
                break;
            }
        }
        return res;
    }
}