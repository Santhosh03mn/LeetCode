class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=Findfirst(nums,target);
        int last=Findlast(nums,target);
        return new int[]{first,last};
    }
    private int Findfirst(int[] nums, int target){
        int left=0,right=nums.length-1;
        int idx=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            if(nums[mid]==target){
                idx=mid;
            }
        }
        return idx;
    }
    private int Findlast(int[] nums, int target){
        int left=0,right=nums.length-1;
        int idx=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
            if(nums[mid]==target){
                idx=mid;
            }
        }
        return idx;
    }
}