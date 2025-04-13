class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list1.add(nums1[i]);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(list1.contains(nums2[i])){
                list2.add(nums2[i]);
                list1.remove(Integer.valueOf(nums2[i]));
            }
        }
        int[] res = new int[list2.size()];
        for(int i=0;i<list2.size();i++){
            res[i]=list2.get(i);
        }
        return res;
    }
}