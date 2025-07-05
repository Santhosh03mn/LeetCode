class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int ans=-1;
        for(int num : map.keySet()){
            if(map.get(num)==num){
                ans=num;
            }
        }
        return ans;
    }
}