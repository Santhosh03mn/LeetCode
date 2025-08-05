class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer>map=new HashMap<>();
        for(char ch : chars.toCharArray()){
            map.put(ch,1+map.getOrDefault(ch,0));
        }
        int sum=0;
        for(String a : words){
            Map<Character,Integer>m=new HashMap<>(map);
            for(char ch : a.toCharArray()){
                if(m.containsKey(ch)&&m.get(ch)!=0){
                    m.put(ch,m.get(ch)-1);
                }
                else{
                    sum-=a.length();
                    break;
                }
            }
            sum+=a.length();
        }
        return sum;
    }
}