class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s : strs){
            char[]ch=s.toCharArray();
            Arrays.sort(ch);
            String a=new String(ch);
            if(!map.containsKey(a)){
                map.put(a,new ArrayList<>());
            }
            map.get(a).add(s);
        }
        return new ArrayList<>(map.values());
    }
}