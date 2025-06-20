class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>min){
                min=nums[i];
            }
            if(nums[i]<max){
                max=nums[i];
            }
        }
        int num1=min;
        int num2=max;
        ArrayList<Integer>list=new ArrayList<>();
        int a=Math.min(num1,num2);
        int digit=1;
        for(int i=1;i<=a;i++){
            if(num1%i==0&&num2%i==0){
                digit=i;
            }
        }
        return digit;
    }
}