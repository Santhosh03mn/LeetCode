class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        ArrayList<Integer>list=new ArrayList<>(set);
        for(int num:list){
            int rev=0,n=num;
            while(n!=0){
                rev=rev*10+n%10;
                n/=10;
            }
            set.add(rev);
        }   
        return set.size();
    }
}