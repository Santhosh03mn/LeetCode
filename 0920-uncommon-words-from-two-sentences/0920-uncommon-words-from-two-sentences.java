class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String []str1 = s1.split(" ");
        String []str2 = s2.split(" ");
        HashMap<String , Integer> map = new HashMap<>();
        for(String s : str1){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(String s : str2){
            map.put(s,map.getOrDefault(s, 0)+1);
        }
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue()==1) list.add(entry.getKey());
        }
        String res[] = new String[list.size()];
        list.toArray(res);
        return res;
    }
}