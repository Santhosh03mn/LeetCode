class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int[]ans=new int[index.length];
        for(int i=0;i<index.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}