class Solution {
    public int countWords(String[] words1, String[] words2) {
       HashMap<String,Integer>map1=new HashMap<>();
       HashMap<String,Integer>map2=new HashMap<>();
       for(String num : words1){
        map1.put(num,map1.getOrDefault(num,0)+1);
       }
       for(String num : words2){
        map2.put(num,map2.getOrDefault(num,0)+1);
       }
       int result = 0;
        for (String num: map1.keySet()) {
            if (map1.get(num) == 1 && map2.getOrDefault(num, 0) == 1) {
                result++;
            }
        }
        return result;
    }
}