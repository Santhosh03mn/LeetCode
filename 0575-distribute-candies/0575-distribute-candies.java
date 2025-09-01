class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer>set=new HashSet<>();
        int a=candyType.length/2;
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        return Math.min(set.size(),a);
    }
}