class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.size();i++){
            String t=words.get(i);
            sb.append(t.charAt(0));
        }
        String x=sb.toString();
        if(s.equals(x)){
            return true;
        }
        return false;
    }
}