class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> hm = new HashMap<>();
        int minEle = Integer.MAX_VALUE;
        for(int b1 : basket1){
            hm.put(b1, hm.getOrDefault(b1, 0)+1);
            minEle = Math.min(minEle, b1);
        }
        for(int b2 : basket2){
            hm.put(b2, hm.getOrDefault(b2, 0)-1);
            minEle = Math.min(minEle, b2);
        }
        List<Integer> arr = new ArrayList<>();
        for(int keys : hm.keySet()){
            int cost = keys;
            int count = hm.get(keys);
            if(count == 0) continue;
            if(count%2 != 0) return -1;
            for(int c=1;c<=Math.abs(count)/2;c++){
                arr.add(cost);
            }
        }
        Collections.sort(arr);
        long res = 0;
        for(int i=0;i<arr.size()/2;i++){
            res += Math.min(arr.get(i), minEle * 2);
        }
        return res;
    }
}